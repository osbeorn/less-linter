
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.stringtemplate.v4.compiler.CodeGenerator.conditional_return;

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
    
    private List<Warning> warnings;
    
    public FormattingHelper(CommonTokenStream tokens) {
        this.tokens = tokens;
        
        this.warnings = new ArrayList<Warning>();
    }
    
    /**
     * Finds all ID related styles and creates a warning for the user.
     * 
     * @param ctx The RuleStatementContext.
     */
    public void checkIDStyling(MyLessParser.RuleStatementContext ctx) {
        /*
        MyLessParser.SelectorsContext selectorsCtx = ctx.selectors();
        if (selectorsCtx == null)
            return;
        
        List<MyLessParser.SelectorContext> selectorCtxList = selectorsCtx.selector();
        if (selectorCtxList == null)
            return;
        
        for (MyLessParser.SelectorContext selectorCtx : selectorCtxList)
        {
            List<MyLessParser.ElementContext> elementCtxList = selectorCtx.element();
            if (elementCtxList == null)
                continue;
            
            for (MyLessParser.ElementContext elementCtx : elementCtxList)
            {
                if (elementCtx.HASH() != null)
                {
                    addWarning(WarningHelper.getWarning(elementCtx,
                                                        tokens,
                                                        "Avoid styling ID's and use a class instead."));
                }
            }
        }
        */
    }
    
    /**
     * 
     * @param ctx
     */
    public void checkBlockClosingBracketLocation(MyLessParser.RuleStatementContext ctx)
    {
        MyLessParser.SelectorsContext selectorsCtx = ctx.selectors();
        if (selectorsCtx == null)
            return;
        
        MyLessParser.BlockContext blockCtx = ctx.block();
        if (blockCtx == null)
            return;
        
        List<MyLessParser.PropertyContext> propertyCtxList = blockCtx.property();
        List<MyLessParser.StatementContext> statementCtxList = blockCtx.statement();
        
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
                                                    "Closing bracket should appear on its own line after the final property."));
            }
        }
    }
    
    public void checkPropertyColonSpace(MyLessParser.RuleStatementContext ctx){
        MyLessParser.SelectorsContext selectorsCtx = ctx.selectors();
        if (selectorsCtx == null)
            return;
        
        MyLessParser.BlockContext blockCtx = ctx.block();
        if (blockCtx == null)
            return;
        
        List<MyLessParser.PropertyContext> propertyCtxList = blockCtx.property();
        
        if (GeneralHelper.IsRuleSingleLine(ctx))
        {
            for (MyLessParser.PropertyContext propertyCtx : propertyCtxList)
                checkPropertyStatementColonSpaceAfter(propertyCtx.propertyStatement());
        }
        else if (GeneralHelper.IsRuleMultiLine(ctx))
        {
            for (MyLessParser.PropertyContext propertyCtx : propertyCtxList)
                checkPropertyStatementColonSpaceBeforeAndAfter(propertyCtx.propertyStatement());
        }
    }
    
    private void checkPropertyStatementColonSpaceAfter(MyLessParser.PropertyStatementContext ctx)
    {
        if (ctx == null)
            return;
        
        int colonIndex = ctx.COLON().getSymbol().getTokenIndex();
        List<Token> rightTokens = tokens.getHiddenTokensToRight(colonIndex);
        
        if (rightTokens == null || rightTokens.size() < 1)
        {
            addWarning(WarningHelper.getWarning(ctx,
                                                tokens,
                                                "Colon is not followed by a white space."));
            return;
        }
            
        Token tok = rightTokens.get(0);
        if (tok.getType() != MyLessParser.WS)
        {
            addWarning(WarningHelper.getWarning(ctx,
                    tokens,
                    "Colon is not followed by a white space."));
        }
    }
    
    private void checkPropertyStatementColonSpaceBeforeAndAfter(MyLessParser.PropertyStatementContext ctx)
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
                                                "Colon is not preceded by a white space."));
            return;
        }
        
        if (rightTokens == null || rightTokens.size() < 1)
        {
            addWarning(WarningHelper.getWarning(ctx,
                                                tokens,
                                                "Colon is not followed by a white space."));
            return;
        }
            
        Token tok = leftTokens.get(0);
        if (tok.getType() != MyLessParser.WS)
        {
            addWarning(WarningHelper.getWarning(ctx,
                    tokens,
                    "Colon is not preceded by a white space."));
        }
        
        tok = rightTokens.get(0);
        if (tok.getType() != MyLessParser.WS)
        {
            addWarning(WarningHelper.getWarning(ctx,
                    tokens,
                    "Colon is not followed by a white space."));
        }
    }
    
    /**
     * Checks if there is a new line following a multi line statement.
     * 
     * @param ctx
     */
    public void checkNewLineAfterMultiLineStatement(MyLessParser.RuleStatementContext ctx)
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
        
        if (rightVisibleTokens != null && rightVisibleTokens.size() > 0 && rightVisibleTokens.get(0).getType() == MyLessParser.EOF)
            return;
        
        if (rightHiddenTokens == null || rightHiddenTokens.size() < 1)
        {
            addWarning(WarningHelper.getWarning(ctx,
                                                tokens,
                                                "Multi line rule statement is not followed by an empty line."));
            return;
        }
        
        boolean existNL = false;
        for (Token t : rightHiddenTokens)
        {
            if (t.getType() == MyLessParser.NL)
            {
                existNL = true;
                break;
            }
        }
        
        if (!existNL)
        {
            addWarning(WarningHelper.getWarning(ctx,
                       tokens,
                       "Multi line rule statement is not followed by an empty line."));
        }
    }
    
    /**
     * 
     * @param ctx
     */
    public void checkRuleLinePosition(MyLessParser.RuleStatementContext ctx)
    {
        MyLessParser.SelectorsContext selectorsCtx = ctx.selectors();
        if (selectorsCtx == null)
            return;
        
        MyLessParser.BlockContext blockCtx = ctx.block();
        if (blockCtx == null)
            return;
        
        int selectorsEndLine = selectorsCtx.getStop().getLine();
        int blockStartLine = blockCtx.getStart().getLine();
        
        if (selectorsEndLine != blockStartLine)
        {
            addWarning(WarningHelper.getWarning(ctx,
                                                tokens,
                                                "Opening bracket is not on the same line as the rule set selector."));
        }
    }
    
    /**
     * 
     * @param ctx
     */
    public void checkRuleLineSpan(MyLessParser.RuleStatementContext ctx)
    {
        MyLessParser.SelectorsContext selectorsCtx = ctx.selectors();
        if (selectorsCtx == null)
            return;
        
        MyLessParser.BlockContext blockCtx = ctx.block();
        if (blockCtx == null)
            return;
        
        List<MyLessParser.PropertyContext> propertyCtxList = blockCtx.property();
        if (propertyCtxList == null || propertyCtxList.size() < 1)
            return;
        
        if (propertyCtxList.size() == 1 && !GeneralHelper.IsRuleSingleLine(ctx))
        {
            addWarning(WarningHelper.getWarning(ctx,
                                                tokens,
                                                "Rule bi moral biti single-line pa ni."));
        }
        else if (propertyCtxList.size() > 1 && GeneralHelper.IsRuleSingleLine(ctx))
        {
            addWarning(WarningHelper.getWarning(ctx,
                                                tokens,
                                                "Rule bi moral biti multi-line pa ni."));
        }
    }
    
    /**
     * Checks if color declaration of form "color: #code" is lowercase and using the 6 digit hex format. 
     * 
     * @param ctx The ColorContext.
     */
    public void checkColorFormat(MyLessParser.ColorContext ctx)
    {
        if (!ColorHelper.IsLowerCase(ctx.getText()))
            addWarning(WarningHelper.getWarning(ctx,
                                                tokens,
                                                "Colour declaration is not lowercase."));
        
        if (!ColorHelper.IsSixFigureHexColor(ctx.getText()))
            addWarning(WarningHelper.getWarning(ctx,
                                                tokens,
                                                "Colour declaration is not using the 6 digit hex format."));
    }
    
    /**
     * 
     * @param ctx
     */
    public void checkBlockOpeningBracketWhiteSpace(MyLessParser.BlockContext ctx)
    {
        int blockStart = ctx.getStart().getTokenIndex();
        List<Token> leftTokens = tokens.getHiddenTokensToLeft(blockStart);
        
        if (leftTokens == null || leftTokens.size() < 1)
        {
            addWarning(WarningHelper.getWarning(ctx,
                                                tokens,
                                                "Opening bracket { is not preceeded by exactly one space."));
            return;
        }
        
        Token white = leftTokens.get(leftTokens.size()-1);
        if (white.getType() == MyLessParser.WS)
        {
            String text = white.getText();
            if (text.length() != 1)
            {
                addWarning(WarningHelper.getWarning(ctx,
                                                    tokens,
                                                    "Opening bracket { is not preceeded by exactly one space."));
            }
        }
        else
        {
            addWarning(WarningHelper.getWarning(ctx,
                                                tokens,
                                                "Opening bracket { is not preceeded by exactly one space."));
        }
    }
    
    /**
     * Checks if the selector depth is greater than the <code>depth</code> limit.
     * 
     * @param ctx
     * @param depth
     */
    public void checkSelectorDepth(MyLessParser.SelectorsContext ctx, int depth)
    {
        List<MyLessParser.SelectorGroupContext> selectorGroupCtxList = ctx.selectorGroup();
        if (selectorGroupCtxList == null || selectorGroupCtxList.size() < 1)
            return;
        
        for (MyLessParser.SelectorGroupContext selectorGroupCtx : selectorGroupCtxList)
        {
            List<MyLessParser.SelectorContext> selectorCtxList = selectorGroupCtx.selector();
            if (selectorCtxList == null || selectorCtxList.size() < 1)
                continue;
            
            int d = 1;
            for (MyLessParser.SelectorContext selectorCtx : selectorCtxList)
            {
                int selectorStop = selectorCtx.getStop().getTokenIndex();
                List<Token> rightHiddenTokens = tokens.getHiddenTokensToRight(selectorStop);
                List<Token> rightAllTokens = tokens.getTokens(selectorStop+1, tokens.size()-1);
                
                if (rightHiddenTokens == null || rightHiddenTokens.size() < 1)
                    continue;
                
                boolean wsSeparator = false;
                for (Token tok : rightHiddenTokens)
                {
                    if (tok.getType() == MyLessParser.WS || tok.getType() == MyLessParser.NL)
                        wsSeparator = true;
                }
                
                boolean followedByCommaOrBracket = false;
                for (Token tok : rightAllTokens)
                {
                    if (tok.getChannel() == Token.HIDDEN_CHANNEL)
                        continue;
                    
                    if (tok.getType() == MyLessParser.COMMA || tok.getType() == MyLessParser.LCURLY)
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
                                                    String.format("The selector depth is over %d.", depth)));
            }
            
            d = 1;
        }
    }
    
    /**
     * Checks if properties within a block are grouped and order according to the rules.
     * 
     * @param ctx
     */
    public void checkPropertiesGroupOrder(MyLessParser.BlockContext ctx)
    {
        List<MyLessParser.PropertyContext> propertyCtxList = ctx.property();
        if (propertyCtxList == null || propertyCtxList.size() < 1)
            return;
        
        List<Integer> indices = new ArrayList<Integer>();
        for (MyLessParser.PropertyContext propertyCtx : propertyCtxList)
        {
            MyLessParser.PropertyStatementContext propStmtCtx = propertyCtx.propertyStatement();
            if (propStmtCtx == null)
                continue;
            
            MyLessParser.PropertyIdentContext propIdentCtx = propStmtCtx.propertyIdent();
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
                           "The order of property groups is not correct."));
            }
        }
    }
    
    /**
     * A helper method used by {@link #checkPropertiesGroupOrder(MyLessParser.BlockContext) checkPropertiesGroupOrder} method.
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
                                                    "Try to use lower case words if possible."));
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
                                                "Avoid using camelCase style to separate words and use hypens instead."));
        }
    }
    
    public void checkUnderScore(TerminalNode ident)
    {
        if (ident.getText().contains("_"))
        {
            addWarning(WarningHelper.getWarning(ident,
                                                tokens,
                                                "Avoid using underscores to separate words and use hypens instead."));
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