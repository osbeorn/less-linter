package si.osbeorn.lesslinter.helpers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
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
import si.osbeorn.lesslinter.library.Messages;
import si.osbeorn.lesslinter.library.Warning;
import si.osbeorn.lesslinter.library.WarningComparator;

/**
 * @author Benjamin
 *
 */
public class FormattingHelper
{
    private static List<String> positionGroup =
        Arrays.asList("position", "top", "right", "left", "bottom", "z-index");
    
    private static List<String> displayAndBoxGroup =
        Arrays.asList("display", "box-sizing", "width", "height", "padding",
                      "margin", "overflow");
    
    private static List<String> borderGroup =
        Arrays.asList("border", "border-bottom", "border-bottom-color", "border-bottom-left-radius",
                      "border-bottom-right-radius", "border-bottom-style", "border-bottom-width",
                      "border-collapse", "border-color", "border-image", "border-image-outset",
                      "border-image-repeat", "border-image-slice", "border-image-source", "border-image-width",
                      "border-left", "border-left-color", "border-left-style", "border-left-width",
                      "border-radius", "border-right", "border-right-color", "border-right-style",
                      "border-right-width", "border-spacing", "border-style", "border-top", "border-top-color",
                      "border-top-left-radius", "border-top-right-radius", "border-top-style", "border-top-width",
                      "border-width");
    
    private static List<String> backgroundAndColorGroup =
        Arrays.asList("background", "background-attachment", "background-clip", "background-color",
                      "background-image", "background-origin", "background-position", "background-repeat",
                      "background-size", "color");
    
    private static List<String> textGroup =
        Arrays.asList("font-family", "font-size", "line-height", "text-align",
                      "text-transform", "letter-spacing");
    
    private static final int POSITION_GRP_INDEX = 1;
    private static final int DISP_AND_BOX_GRP_INDEX = 2;
    private static final int BORDER_GRP_INDEX = 3;
    private static final int BG_AND_COLOR_GRP_INDEX = 4;
    private static final int TEXT_GRP_INDEX = 5;
    private static final int OTHER_GRP_INDEX = 6;

    // all tokens (hidden and normal)
    private CommonTokenStream tokens;
    
    // all gathered warnings
    private List<Warning> warnings;
    
    // constructor
    public FormattingHelper(CommonTokenStream tokens) {
        this.tokens = tokens;
        
        this.warnings = new ArrayList<Warning>();
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
        
        if (GeneralHelper.IsRuleMultiLine(ctx))
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
            
            if (Math.max(lastPropertyEndLine, lastStatementEndLine) + 1 != blockEndLine)
            {
                addWarning(WarningHelper.getWarning(blockCtx,
                                                    blockCtx.getStop(),
                                                    tokens,
                                                    Messages.WARN_BRACKET_OWN_LINE));
            }
        }
    }
    
    public void checkPropertyColonSpace(RuleStatementContext ctx){
        SelectorsContext selectorsCtx = ctx.selectors();
        if (selectorsCtx == null)
            return;
        
        BlockContext blockCtx = ctx.block();
        if (blockCtx == null)
            return;
        
        List<PropertyContext> propertyCtxList = blockCtx.property();
        
        if (GeneralHelper.IsRuleSingleLine(ctx))
        {
            for (PropertyContext propertyCtx : propertyCtxList)
                checkPropertyStatementColonSpaceAfter(propertyCtx.propertyStatement());
        }
        else if (GeneralHelper.IsRuleMultiLine(ctx))
        {
            for (PropertyContext propertyCtx : propertyCtxList)
                checkPropertyStatementColonSpaceBeforeAndAfter(propertyCtx.propertyStatement());
        }
    }
    
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
     * Checks if there is a new line following a multi line statement.
     * 
     * @param ctx
     */
    public void checkNewLineAfterMultiLineStatement(RuleStatementContext ctx)
    {
        if (!GeneralHelper.IsRuleMultiLine(ctx))
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
        for (Token t : rightHiddenTokens)
        {
            if (t.getType() == LessParser.NL)
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
     * 
     * @param ctx
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
     * 
     * @param ctx
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
        
        if (propertyCtxList.size() == 1 && !GeneralHelper.IsRuleSingleLine(ctx))
        {
            addWarning(WarningHelper.getWarning(ctx,
                                                tokens,
                                                Messages.WARN_RULE_SINLE_LINE));
        }
        else if (propertyCtxList.size() > 1 && GeneralHelper.IsRuleSingleLine(ctx))
        {
            addWarning(WarningHelper.getWarning(ctx,
                                                tokens,
                                                Messages.WARN_RULE_MULTI_LINE));
        }
    }
    
    /**
     * Checks if color declaration of form "color: #code" is lowercase and using the 6 digit hex format. 
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
     * 
     * @param ctx
     */
    public void checkBlockOpeningBracketWhiteSpace(BlockContext ctx)
    {
        int blockStart = ctx.getStart().getTokenIndex();
        List<Token> leftTokens = tokens.getHiddenTokensToLeft(blockStart);
        
        if (leftTokens == null || leftTokens.size() < 1)
        {
            addWarning(WarningHelper.getWarning(ctx,
                                                tokens,
                                                Messages.WARN_WS_BEFORE_BRACKET));
            return;
        }
        
        Token white = leftTokens.get(leftTokens.size()-1);
        if (white.getType() == LessParser.WS)
        {
            String text = white.getText();
            if (text.length() != 1)
            {
                addWarning(WarningHelper.getWarning(ctx,
                                                    tokens,
                                                    Messages.WARN_WS_BEFORE_BRACKET));
            }
        }
        else
        {
            addWarning(WarningHelper.getWarning(ctx,
                                                tokens,
                                                Messages.WARN_WS_BEFORE_BRACKET));
        }
    }
    
    /**
     * Checks if the selector depth is greater than the <code>depth</code> limit.
     * 
     * @param ctx
     * @param depth
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
     * @param ctx
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
            
            if (positionGroup.contains(ident.getText()))
            {
                addGroupOrderIndex(indices, POSITION_GRP_INDEX);
            }
            else if (displayAndBoxGroup.contains(ident.getText()))
            {
                addGroupOrderIndex(indices, DISP_AND_BOX_GRP_INDEX);
            }
            else if (borderGroup.contains(ident.getText()))
            {
                addGroupOrderIndex(indices, BORDER_GRP_INDEX);
            }
            else if (backgroundAndColorGroup.contains(ident.getText()))
            {
                addGroupOrderIndex(indices, BG_AND_COLOR_GRP_INDEX);
            }
            else if (textGroup.contains(ident.getText()))
            {
                addGroupOrderIndex(indices, TEXT_GRP_INDEX);
            }
            else
            {
                addGroupOrderIndex(indices, OTHER_GRP_INDEX); // other group
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
     * A helper method used by {@link #checkPropertiesGroupOrder(BlockContext) checkPropertiesGroupOrder} method.
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
    
    public void checkCamelCase(TerminalNode ident)
    {
        if (ident.getText().matches("[a-z0-9_]+([A-Z][a-z0-9_]+)+"))
        {
            addWarning(WarningHelper.getWarning(ident,
                                                tokens,
                                                Messages.WARN_CAMELCASE));
        }
    }
    
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
     * Adds the supplied warning to the {@link #warnings warnings} list.
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
     * 
     * @return
     */
    public String getWarnings()
    {
        if (warnings == null || warnings.size() == 0)
            return "No warnings. Good job!";
        
        Collections.sort(warnings, new WarningComparator());
        
        StringBuilder builder = new StringBuilder();
        for (Warning warning : warnings)
        {
            builder.append(warning);
            builder.append(System.lineSeparator());
        }
        
        return builder.toString();
    }
}