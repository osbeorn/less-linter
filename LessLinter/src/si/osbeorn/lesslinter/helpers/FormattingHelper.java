package si.osbeorn.lesslinter.helpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.TerminalNode;

import si.osbeorn.lesslinter.antlr.LessParser;
import si.osbeorn.lesslinter.antlr.LessParser.BlockContext;
import si.osbeorn.lesslinter.antlr.LessParser.ColorContext;
import si.osbeorn.lesslinter.antlr.LessParser.ElementContext;
import si.osbeorn.lesslinter.antlr.LessParser.PropertyContext;
import si.osbeorn.lesslinter.antlr.LessParser.PropertyIdentContext;
import si.osbeorn.lesslinter.antlr.LessParser.PropertyStatementContext;
import si.osbeorn.lesslinter.antlr.LessParser.RuleStatementContext;
import si.osbeorn.lesslinter.antlr.LessParser.SelectorContext;
import si.osbeorn.lesslinter.antlr.LessParser.SelectorGroupContext;
import si.osbeorn.lesslinter.antlr.LessParser.SelectorsContext;
import si.osbeorn.lesslinter.antlr.LessParser.StatementContext;
import si.osbeorn.lesslinter.antlr.LessParser.StylesheetContext;
import si.osbeorn.lesslinter.library.Messages;
import si.osbeorn.lesslinter.library.PropertyGroups;
import si.osbeorn.lesslinter.library.Warning;
import si.osbeorn.lesslinter.library.WarningOrderComparator;

/**
 * @author Benjamin
 *
 */
public class FormattingHelper
{
    /**
     * All collected tokens from all channels (hidden and normal)
     */
    private CommonTokenStream tokens;
    
    /**
     * A set of gathered warnings (to avoid possible duplicate warnings).
     */
    private Set<Warning> warnings;
    
    /**
     * Constructor.
     * 
     * @param tokens Tokens collected by the LessLexer.
     */
    public FormattingHelper(CommonTokenStream tokens) {
        this.tokens = tokens;
        
        this.warnings = new TreeSet<Warning>(new WarningOrderComparator());
    }
    
    /**
     * Checks if the property in a single line rule statement is preceded and followed by a white space. 
     *  
     * @param ctx The property context.
     */
    public void checkSingleLinePropertySpaces(PropertyContext ctx, int size)
    {
        BlockContext blockCtx = (BlockContext) ctx.getParent();
        
        if (!GeneralHelper.isBlockSingleLine(blockCtx))
            return;
        
        int propertyStartIndex = ctx.getStart().getTokenIndex();
        int propertyEndIndex = ctx.getStop().getTokenIndex();
        
        List<Token> leftTokens = tokens.getHiddenTokensToLeft(propertyStartIndex);
        List<Token> rightTokens = tokens.getHiddenTokensToRight(propertyEndIndex);
        
        if (leftTokens == null || leftTokens.size() < 1)
        {
            addWarning(WarningHelper.getWarning(ctx,
                                                tokens,
                                                Messages.WARN_PROPERTY_SPACE_BEFORE));
        }
        else
        {
            Token tok = leftTokens.get(leftTokens.size() - 1);
            if (leftTokens.size() > 0)
            {
                if (tok.getType() != LessParser.WS)
                {
                    addWarning(WarningHelper.getWarning(ctx,
                                                        tokens,
                                                        Messages.WARN_PROPERTY_SPACE_BEFORE));
                }
                else
                {
                    if (tok.getText().length() != size)
                        addWarning(WarningHelper.getWarning(ctx,
                                                            tokens,
                                                            String.format(Messages.WARN_PROPERTY_SPACE_WIDTH_BEFORE, size)));
                }
            }
        }
        
        if (rightTokens == null || rightTokens.size() < 1)
        {
            addWarning(WarningHelper.getWarning(ctx,
                                                tokens,
                                                Messages.WARN_PROPERTY_SPACE_AFTER));
        }
        else
        {
            Token tok = rightTokens.get(0);
            if (rightTokens.size() > 0)
            {
                if (tok.getType() != LessParser.WS)
                {
                    addWarning(WarningHelper.getWarning(ctx,
                                                        tokens,
                                                        Messages.WARN_PROPERTY_SPACE_AFTER));
                }
                else
                {
                    if (tok.getText().length() != size)
                        addWarning(WarningHelper.getWarning(ctx,
                                                            tokens,
                                                            String.format(Messages.WARN_PROPERTY_SPACE_WIDTH_AFTER, size)));
                }
            }
        }
    }
    
    /**
     * Check if a property is properly indented:<br />
     * - indentation width must equal <code>indent</code>*depth<br />
     * - only white spaces are allowed (no tabs)
     * 
     * @param ctx Property context.
     * @param indent The indentation width on the first level.
     */
    public void checkPropertyIndentation(PropertyContext ctx, int indent)
    {
        if (!GeneralHelper.isBlockMultiLine((BlockContext) ctx.getParent()))
            return;
        
        int depth = getPropertyDepth(ctx);
        int propertyStartIndex = ctx.getStart().getTokenIndex();
        List<Token> rightTokens = tokens.getHiddenTokensToLeft(propertyStartIndex);
        
        if (rightTokens == null || rightTokens.size() < 1)
            return;
        
        Token tok = rightTokens.get(rightTokens.size() - 1);
        if (tok.getType() == LessParser.WS)
        {
            if (tok.getText().length() != indent*depth)
                addWarning(WarningHelper.getWarning(ctx,
                                                    tokens,
                                                    String.format(Messages.WARN_PROPERTY_INDENT, tok.getText().length(), indent, depth, indent*depth)));
        }
        else
        {
            addWarning(WarningHelper.getWarning(ctx,
                                                tokens,
                                                Messages.WARN_PROPERTY_INDENT_SPACES));
        }
    }
    
    /**
     * Get the nesting depth of a property.<br />
     * For now, used only by the {@link #checkPropertyIndentation(PropertyContext, int)} method.
     * 
     * @param ctx PropertContext context
     * @return The depth of the property in terms of nesting depth.
     */
    private int getPropertyDepth(PropertyContext ctx)
    {
        int depth = 0;
        ParserRuleContext parent = ctx;
        do
        {
            parent = parent.getParent();
            if (parent != null && parent instanceof BlockContext)
                depth++;
        }
        while (parent != null);
       
        return depth;
    }
    
    /**
     * Get the parent of the PropertyContext, the BlockContext. 
     * 
     * @param ctx The property context
     * @return The block context.
     */
    private BlockContext getBlockContext(PropertyContext ctx)
    {
        BlockContext blockContext = null;
        try
        {
            if (ctx == null)
                throw new Exception("Error in retrieving RuleStatementContext.");
            
            BlockContext blockCtx = (BlockContext) ctx.getParent();
            if (blockCtx == null)
                throw new Exception("Error in retrieving RuleStatementContext.");
            
            return blockContext;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        return blockContext;
    }
    
    /**
     * Finds all ID related styles and creates a warning for the user.
     * 
     * @param ctx The RuleStatementContext.
     */
    public void checkIDStyling(SelectorContext ctx) {
        ElementContext elementCtx = ctx.element();
        if (elementCtx == null)
            return;
        
        if (elementCtx.HASH() != null)
        {
            addWarning(WarningHelper.getWarning(elementCtx,
                                                tokens,
                                                Messages.WARN_ID_STYLING));            
        }
    }
    
    /**
     * Check if the closing bracket of a multi line rule is on it's own line after the final
     * property.
     * 
     * @param ctx
     */
    public void checkBlockClosingBracketLocation(RuleStatementContext ctx)
    {
        SelectorsContext selectorsCtx = ctx.selectors();
        if (selectorsCtx == null)
            return;
        
        BlockContext blockCtx = ctx.block();
        if (blockCtx == null)
            return;
        
        List<PropertyContext> propertyCtxList = blockCtx.property();
        List<StatementContext> statementCtxList = blockCtx.statement();
        
        if (GeneralHelper.isRuleMultiLine(ctx))
        {
            int blockEndLine = blockCtx.getStop().getLine();
            int lastPropertyEndLine =
                propertyCtxList != null && propertyCtxList.size() > 0
                    ? propertyCtxList.get(propertyCtxList.size()-1).getStop().getLine()
                    : -1;
            int lastStatementEndLine =
                statementCtxList != null && statementCtxList.size() > 0
                    ? statementCtxList.get(statementCtxList.size()-1).getStop().getLine()
                    : -1;
            
            int endLine = Math.max(lastPropertyEndLine, lastStatementEndLine);
            
            if (endLine == blockEndLine)
            {
                addWarning(WarningHelper.getWarning(blockCtx,
                                                    blockCtx.getStop(),
                                                    tokens,
                                                    Messages.WARN_BRACKET_OWN_LINE));
            }
        }
    }
    
    /**
     * Checks if property declarations conform to the following rules about colon
     * and white space placement:<br />
     * - single line rule sets should have a space following the colon<br />
     * - multi line rule sets should have a space preceding and following the colon. 
     * 
     * @param ctx Rule statement context
     */
    public void checkPropertyColonSpace(RuleStatementContext ctx)
    {
        SelectorsContext selectorsCtx = ctx.selectors();
        if (selectorsCtx == null)
            return;
        
        BlockContext blockCtx = ctx.block();
        if (blockCtx == null)
            return;
        
        List<PropertyContext> propertyCtxList = blockCtx.property();
        
        if (GeneralHelper.isRuleSingleLine(ctx))
        {
            for (PropertyContext propertyCtx : propertyCtxList)
                checkPropertyStatementColonSpaceAfter(propertyCtx.propertyStatement());
        }
        else if (GeneralHelper.isRuleMultiLine(ctx))
        {
            for (PropertyContext propertyCtx : propertyCtxList)
                checkPropertyStatementColonSpaceBeforeAndAfter(propertyCtx.propertyStatement());
        }
    }
    
    /**
     * Checks if property declarations are followed by a whitespace.
     * 
     * @param ctx Property statement context
     */
    private void checkPropertyStatementColonSpaceAfter(PropertyStatementContext ctx)
    {
        if (ctx == null)
            return;
        
        int colonIndex = ctx.COLON().getSymbol().getTokenIndex();
        List<Token> rightTokens = tokens.getHiddenTokensToRight(colonIndex);
        
        if (rightTokens == null || rightTokens.size() < 1)
        {
            addWarning(WarningHelper.getWarning(ctx,
                                                tokens,
                                                Messages.WARN_WS_AFTER_COLON));
            return;
        }
            
        Token tok = rightTokens.get(0);
        if (tok.getType() != LessParser.WS)
        {
            addWarning(WarningHelper.getWarning(ctx,
                                                tokens,
                                                Messages.WARN_WS_AFTER_COLON));
        }
    }
    
    /**
     * Checks if property declarations are preceded and followed by a whitespace.
     * 
     * @param ctx Property statement context
     */
    private void checkPropertyStatementColonSpaceBeforeAndAfter(PropertyStatementContext ctx)
    {
        if (ctx == null)
            return;
        
        int colonIndex = ctx.COLON().getSymbol().getTokenIndex();
        List<Token> leftTokens = tokens.getHiddenTokensToLeft(colonIndex);
        List<Token> rightTokens = tokens.getHiddenTokensToRight(colonIndex);
        
        if (leftTokens == null || leftTokens.size() < 1)
        {
            addWarning(WarningHelper.getWarning(ctx,
                                                tokens,
                                                Messages.WARN_WS_BEFORE_COLON));
            return;
        }
        
        if (rightTokens == null || rightTokens.size() < 1)
        {
            addWarning(WarningHelper.getWarning(ctx,
                                                tokens,
                                                Messages.WARN_WS_AFTER_COLON));
            return;
        }
            
        Token tok = leftTokens.get(0);
        if (tok.getType() != LessParser.WS)
        {
            addWarning(WarningHelper.getWarning(ctx,
                                                tokens,
                                                Messages.WARN_WS_BEFORE_COLON));
        }
        
        tok = rightTokens.get(0);
        if (tok.getType() != LessParser.WS)
        {
            addWarning(WarningHelper.getWarning(ctx,
                                                tokens,
                                                Messages.WARN_WS_AFTER_COLON));
        }
    }
    
    /**
     * Checks if there is a new line following a multi line statement closing bracket.
     * 
     * @param ctx Rule statement context
     */
    public void checkNewLineAfterMultiLineStatement(RuleStatementContext ctx)
    {
        if (!GeneralHelper.isRuleMultiLine(ctx) || GeneralHelper.isLastRule(ctx))
            return;       
        
        int statementStop = ctx.getStop().getTokenIndex();
        List<Token> rightHiddenTokens = tokens.getHiddenTokensToRight(statementStop);
        List<Token> rightAllTokens = tokens.getTokens(statementStop+1, tokens.size()-1);
        
        List<Token> rightVisibleTokens = new ArrayList<Token>();
        for (Token t : rightAllTokens)
        {
            if (t.getChannel() == Token.DEFAULT_CHANNEL)
                rightVisibleTokens.add(t);
        }
        
        if (rightVisibleTokens != null && rightVisibleTokens.size() > 0 && rightVisibleTokens.get(0).getType() == LessParser.EOF)
            return;
        
        if (rightHiddenTokens == null || rightHiddenTokens.size() < 1)
        {
            addWarning(WarningHelper.getWarning(ctx,
                                                tokens,
                                                Messages.WARN_NL_AFTER_MULTI_LINE_STMT));
            return;
        }
        
        boolean existNL = false;
        int countNL = 0;
        for (Token t : rightHiddenTokens)
        {
            if (t.getType() == LessParser.WS || t.getType() == LessParser.TAB)
                continue;
            
            if (t.getType() != LessParser.NL && t.getType() != LessParser.WS && t.getType() != LessParser.TAB)
                break;
            
            if (t.getType() == LessParser.NL)
            {
                countNL++;
            }
            
            if (countNL == 2)
            {
                existNL = true;
                break;
            }
        }
        
        if (!existNL)
        {
            addWarning(WarningHelper.getWarning(ctx,
                                                tokens,
                                                Messages.WARN_NL_AFTER_MULTI_LINE_STMT));
        }
    }
    
    /**
     * Checks if the rule statement opening bracket is on the same line as the selectors.
     * 
     * @param ctx Rule statement context
     */
    public void checkRuleLinePosition(RuleStatementContext ctx)
    {
        SelectorsContext selectorsCtx = ctx.selectors();
        if (selectorsCtx == null)
            return;
        
        BlockContext blockCtx = ctx.block();
        if (blockCtx == null)
            return;
        
        int selectorsEndLine = selectorsCtx.getStop().getLine();
        int blockStartLine = blockCtx.getStart().getLine();
        
        if (selectorsEndLine != blockStartLine)
        {
            addWarning(WarningHelper.getWarning(ctx,
                                                tokens,
                                                Messages.WARN_SAME_LINE_OPEN_BRACKET));
        }
    }
    
    /**
     * Checks if the <code>ctx</code> rule statement is properly formatted:<br />
     * - rule statement with a single property should be written in a single line<br />
     * - rule statement with multiple properties should be written multiple lines.
     * 
     * @param ctx Rule statement context
     */
    public void checkRuleLineSpan(RuleStatementContext ctx)
    {
        SelectorsContext selectorsCtx = ctx.selectors();
        if (selectorsCtx == null)
            return;
        
        BlockContext blockCtx = ctx.block();
        if (blockCtx == null)
            return;
        
        List<PropertyContext> propertyCtxList = blockCtx.property();
        if (propertyCtxList == null || propertyCtxList.size() < 1)
            return;
        
        if (propertyCtxList.size() == 1 && !GeneralHelper.isRuleSingleLine(ctx))
        {
            addWarning(WarningHelper.getWarning(ctx,
                                                tokens,
                                                Messages.WARN_RULE_SINLE_LINE));
        }
        else if (propertyCtxList.size() > 1 && GeneralHelper.isRuleSingleLine(ctx))
        {
            addWarning(WarningHelper.getWarning(ctx,
                                                tokens,
                                                Messages.WARN_RULE_MULTI_LINE));
        }
    }
    
    /**
     * Checks if color declaration of form "color: #code" is lower case and using the 6 digit hex format. 
     * 
     * @param ctx The ColorContext.
     */
    public void checkColorFormat(ColorContext ctx)
    {
        if (!ColorHelper.IsLowerCase(ctx.getText()))
            addWarning(WarningHelper.getWarning(ctx,
                                                tokens,
                                                Messages.WARN_COLOUR_LOWERCASE));
        
        if (!ColorHelper.IsSixFigureHexColor(ctx.getText()))
            addWarning(WarningHelper.getWarning(ctx,
                                                tokens,
                                                Messages.WARN_COLOUR_FORMAT));
    }
    
    /**
     * Checks if the opening bracket of a block is preceded by a white space.
     * 
     * @param ctx Block context
     */
    public void checkBlockOpeningBracketWhiteSpace(BlockContext ctx, int size)
    {
        int blockStart = ctx.getStart().getTokenIndex();
        List<Token> leftTokens = tokens.getHiddenTokensToLeft(blockStart);
        
        if (leftTokens == null || leftTokens.size() < 1)
        {
            addWarning(WarningHelper.getWarning(ctx,
                                                tokens,
                                                String.format(Messages.WARN_WS_BEFORE_BRACKET, size)));
            return;
        }
        
        Token white = leftTokens.get(leftTokens.size()-1);
        if (white.getType() == LessParser.WS)
        {
            String text = white.getText();
            if (text.length() != size)
            {
                addWarning(WarningHelper.getWarning(ctx,
                                                    tokens,
                                                    String.format(Messages.WARN_WS_BEFORE_BRACKET, size)));
            }
        }
        else
        {
            addWarning(WarningHelper.getWarning(ctx,
                                                tokens,
                                                String.format(Messages.WARN_WS_BEFORE_BRACKET, size)));
        }
    }
    
    /**
     * Checks if the selector depth is greater than the <code>depth</code> limit.
     * 
     * @param ctx Selector context
     * @param depth Depth
     */
    public void checkSelectorDepth(SelectorsContext ctx, int depth)
    {
        List<SelectorGroupContext> selectorGroupCtxList = ctx.selectorGroup();
        if (selectorGroupCtxList == null || selectorGroupCtxList.size() < 1)
            return;
        
        for (SelectorGroupContext selectorGroupCtx : selectorGroupCtxList)
        {
            List<SelectorContext> selectorCtxList = selectorGroupCtx.selector();
            if (selectorCtxList == null || selectorCtxList.size() < 1)
                continue;
            
            int d = 1;
            for (SelectorContext selectorCtx : selectorCtxList)
            {
                int selectorStop = selectorCtx.getStop().getTokenIndex();
                List<Token> rightHiddenTokens = tokens.getHiddenTokensToRight(selectorStop);
                List<Token> rightAllTokens = tokens.getTokens(selectorStop+1, tokens.size()-1);
                
                if (rightHiddenTokens == null || rightHiddenTokens.size() < 1)
                    continue;
                
                boolean wsSeparator = false;
                for (Token tok : rightHiddenTokens)
                {
                    if (tok.getType() == LessParser.WS || tok.getType() == LessParser.NL)
                        wsSeparator = true;
                }
                
                boolean followedByCommaOrBracket = false;
                for (Token tok : rightAllTokens)
                {
                    if (tok.getChannel() == Token.HIDDEN_CHANNEL)
                        continue;
                    
                    if (tok.getType() == LessParser.COMMA || tok.getType() == LessParser.LCURLY)
                    {
                        followedByCommaOrBracket = true;
                    }
                    
                    break;
                }
                
                
                if (wsSeparator && !followedByCommaOrBracket)
                    d++;
            }
            
            if (d > depth)
            {
                addWarning(WarningHelper.getWarning(selectorGroupCtx,
                                                    tokens,
                                                    String.format(Messages.WARN_SELECTOR_DEPTH, depth)));
            }
            
            d = 1;
        }
    }
    
    /**
     * Checks if properties within a block are grouped and order according to the rules.
     * 
     * @param ctx Block context
     */
    public void checkPropertiesGroupOrder(BlockContext ctx)
    {
        List<PropertyContext> propertyCtxList = ctx.property();
        if (propertyCtxList == null || propertyCtxList.size() < 1)
            return;
        
        List<Integer> indices = new ArrayList<Integer>();
        for (PropertyContext propertyCtx : propertyCtxList)
        {
            PropertyStatementContext propStmtCtx = propertyCtx.propertyStatement();
            if (propStmtCtx == null)
                continue;
            
            PropertyIdentContext propIdentCtx = propStmtCtx.propertyIdent();
            if (propIdentCtx == null)
                continue;
            
            TerminalNode ident = propIdentCtx.IDENT();
            if (ident == null)
                return;
            
            if (PropertyGroups.positionGroup.contains(ident.getText()))
            {
                addGroupOrderIndex(indices, PropertyGroups.POSITION_GRP_INDEX);
            }
            else if (PropertyGroups.displayAndBoxGroup.contains(ident.getText()))
            {
                addGroupOrderIndex(indices, PropertyGroups.DISP_AND_BOX_GRP_INDEX);
            }
            else if (PropertyGroups.borderGroup.contains(ident.getText()))
            {
                addGroupOrderIndex(indices, PropertyGroups.BORDER_GRP_INDEX);
            }
            else if (PropertyGroups.backgroundAndColorGroup.contains(ident.getText()))
            {
                addGroupOrderIndex(indices, PropertyGroups.BG_AND_COLOR_GRP_INDEX);
            }
            else if (PropertyGroups.textGroup.contains(ident.getText()))
            {
                addGroupOrderIndex(indices, PropertyGroups.TEXT_GRP_INDEX);
            }
            else
            {
                addGroupOrderIndex(indices, PropertyGroups.OTHER_GRP_INDEX); // other group
            }
        }
        
        if (indices.size() <= 1)
            return;
        
        for (int i = 1; i < indices.size()-1; i++)
        {
            if (indices.get(i-1) > indices.get(i))
            {
                addWarning(WarningHelper.getWarning(ctx,
                                                    tokens,
                                                    Messages.WARN_PROPERTY_GROUP_ORDER));
            }
        }
    }
    
    /**
     * A helper method used only by {@link #checkPropertiesGroupOrder(BlockContext) checkPropertiesGroupOrder} method.
     * If the index to be added is the same as the current last item of the list, the index is not added, otherwise it is.
     * 
     * @param list A list of integer indices.
     * @param index The index to add to the list.
     */
    private void addGroupOrderIndex(List<Integer> list, int index)
    {
        if (list.size() == 0)
            list.add(index);
        else
        {
            int last = list.get(list.size()-1);
            if (last != index)
                list.add(index);
        }
    }
    
    /**
     * Check if the <code>ident</code> is written in lower case format.
     * 
     * @param ident The selector or property name.
     */
    public void checkLowerCase(TerminalNode ident)
    {
        String word = ident.getText();
        
        for(int i = 0; i < word.length(); i++)
        {
            if (Character.isAlphabetic(word.charAt(i)) &&
                !Character.isLowerCase(word.charAt(i)))
            {
                addWarning(WarningHelper.getWarning(ident,
                                                    tokens,
                                                    Messages.WARN_LOWERCASE));
                return;
            }
        }
    }
    
    /**
     * Check if the <code>ident</code> is written in camel case format.
     * 
     * @param ident The selector name.
     */
    public void checkCamelCase(TerminalNode ident)
    {
        if (ident.getText().matches("[a-z0-9_]+([A-Z][a-z0-9_]+)+"))
        {
            addWarning(WarningHelper.getWarning(ident,
                                                tokens,
                                                Messages.WARN_CAMELCASE));
        }
    }
    
    /**
     * Check if the <code>ident</code> contains underscores.
     * 
     * @param ident The selector name.
     */
    public void checkUnderScore(TerminalNode ident)
    {
        if (ident.getText().contains("_"))
        {
            addWarning(WarningHelper.getWarning(ident,
                                                tokens,
                                                Messages.WARN_UNDERSCORE));
        }
    }
    
    /**
     * 
     * @param ctx
     */
    public void checkPropertiesAlignment(BlockContext ctx)
    {
        List<PropertyContext> propertyCtxList = ctx.property();
        
        int colonPosition = Integer.MIN_VALUE;
        for (PropertyContext propertyCtx : propertyCtxList)
        {
            PropertyStatementContext propertyStmtCtx = propertyCtx.propertyStatement();
            if (propertyStmtCtx == null)
                continue;
            
            if (colonPosition == Integer.MIN_VALUE)
                colonPosition = propertyStmtCtx.COLON().getSymbol().getCharPositionInLine();
            else if (colonPosition != propertyStmtCtx.COLON().getSymbol().getCharPositionInLine())
            {
                addWarning(WarningHelper.getWarning(ctx,
                                                    tokens,
                                                    Messages.WARN_PROPERTIES_NOT_ALIGNED));    
                return;
            }
        }
    }
    
    /**
     * 
     * @param ctx
     */
    public void checkRuleStatementRelated(StylesheetContext ctx, int prefixLen)
    {
        List<StatementContext> stmtnList = ctx.statement();
        
        if (stmtnList == null || stmtnList.size() < 1)
            return;
        
        List<RuleStatementContext> ruleStmntCtxList = new ArrayList<RuleStatementContext>();
        for (StatementContext stmntCtx : stmtnList)
        {
            RuleStatementContext ruleStmntCtx = stmntCtx.ruleStatement();
            
            if (ruleStmntCtx != null)
                ruleStmntCtxList.add(ruleStmntCtx);
        }
        
        if (ruleStmntCtxList.size() < 1)
            return;
        
        checkRuleStatementRelated(ruleStmntCtxList, prefixLen);
    }
    
    /**
     * 
     * @param ctx
     */
    public void checkRuleStatementRelated(BlockContext ctx, int prefixLen)
    {
        List<StatementContext> stmtnList = ctx.statement();
        
        if (stmtnList == null || stmtnList.size() < 1)
            return;
        
        List<RuleStatementContext> ruleStmntCtxList = new ArrayList<RuleStatementContext>();
        for (StatementContext stmntCtx : stmtnList)
        {
            RuleStatementContext ruleStmntCtx = stmntCtx.ruleStatement();
            
            if (ruleStmntCtx != null)
                ruleStmntCtxList.add(ruleStmntCtx);
        }
        
        if (ruleStmntCtxList.size() < 1)
            return;
        
        checkRuleStatementRelated(ruleStmntCtxList, prefixLen);
    }
    
    /**
     * 
     * @param ctx
     */
    private void checkRuleStatementRelated(List<RuleStatementContext> ruleStmntCtxList, int prefixLen)
    {
        Map<RuleStatementContext, Pair<Integer, Integer>> selectorLineMap = new HashMap<RuleStatementContext, Pair<Integer, Integer>>(); 
        
        for (RuleStatementContext ruleStmntCtx : ruleStmntCtxList)
        {
            if (GeneralHelper.isRuleSingleLine(ruleStmntCtx))
                selectorLineMap.put(ruleStmntCtx,
                                    new Pair<Integer, Integer>(ruleStmntCtx.getStart().getLine(),
                                                               ruleStmntCtx.getStop().getLine()));
        }
        
        for (Entry<RuleStatementContext, Pair<Integer, Integer>> entry1 : selectorLineMap.entrySet())
        {
            //Entry<RuleStatementContext, Pair<Integer, Integer>> closestTop = null, closestBottom = null;            
            for (Entry<RuleStatementContext, Pair<Integer, Integer>> entry2 : selectorLineMap.entrySet())
            {
                if (entry1 == entry2)
                    continue;
                
                if (isRelatedToStatement(entry1.getKey().selectors().getText(),
                                         entry2.getKey().selectors().getText(),
                                         prefixLen))
                {
                    if (entry2.getValue().a < entry1.getValue().a && entry2.getValue().b + 1 != entry1.getValue().a)
                    {
                        // warning
                        addWarning(WarningHelper.getWarning(entry2.getKey(),
                                                            tokens,
                                                            String.format(Messages.WARN_STATEMENTS_RELATED,
                                                                          entry1.getKey().getStart().getLine(),
                                                                          entry1.getKey().getStart().getCharPositionInLine())));
                    }
                    else if (entry2.getValue().a > entry1.getValue().a && entry2.getValue().a - 1 != entry1.getValue().a)
                    {
                        // warning
                        addWarning(WarningHelper.getWarning(entry2.getKey(),
                                                            tokens,
                                                            String.format(Messages.WARN_STATEMENTS_RELATED,
                                                                          entry1.getKey().getStart().getLine(),
                                                                          entry1.getKey().getStart().getCharPositionInLine())));                        
                    }
                }
            }
        }
    }
    
    /**
     * Two statements are related, if they have a common prefix length in selectors of at least prefixLen
     * 
     * @param orig Selectors string 1
     * @param test Selectors string 2
     * @param prefixLen
     * @return
     */
    private boolean isRelatedToStatement(String s1, String s2, int prefixLen)
    {
        String prefix = greatestCommonPrefix(s1, s2);
        return prefix.length() >= prefixLen;
    }
    
    /**
     * Get the greatest common prefix.
     * 
     * @param a
     * @param b
     * @return
     */
    private String greatestCommonPrefix(String a, String b)
    {
        int minLength = Math.min(a.length(), b.length());
        
        for (int i = 0; i < minLength; i++)
        {
            if (a.charAt(i) != b.charAt(i))
                return a.substring(0, i);
        }
        
        return a.substring(0, minLength);
    }
    
    /**
     * Adds the supplied warning to the {@link #warnings warnings} set.
     * 
     * @param warning The warning to add.
     */
    private void addWarning(Warning warning)
    {
        if (warnings == null)
            return;

        warnings.add(warning);
    }
    
    /**
     * Get a formatted string of collected warnings.
     * 
     * @return Warnings in a string.
     */
    public String getWarnings()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("LessLinter report:\n");
        builder.append("-------------------------------\n");
        
        if (warnings == null || warnings.size() == 0)
        {
            builder.append("No warnings. Good job!");
            return builder.toString();
        }
        
        for (Warning warning : warnings)
        {
            builder.append(warning + "\n");
        }
        builder.append("\n");
        
        return builder.toString();
    }
}