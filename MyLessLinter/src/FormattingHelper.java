
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

/**
 * @author Benjamin
 *
 */
public class FormattingHelper
{
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
        
        List<MyLessParser.SelectorContext> selectorCtxList = selectorsCtx.selector();
        if (selectorCtxList == null)
            return;
        
        MyLessParser.BlockContext blockCtx = ctx.block();
        if (blockCtx == null)
            return;
        
        List<MyLessParser.PropertyContext> propertyCtxList = blockCtx.property();
        if (propertyCtxList == null || propertyCtxList.size() < 1)
            return;
            
        if (GeneralHelper.IsRuleMultiLine(ctx))
        {
            int blockEndLine = blockCtx.getStop().getLine();
            int lastPropertyEndLine = propertyCtxList.get(propertyCtxList.size()-1).getStop().getLine();
            
            if (lastPropertyEndLine + 1 != blockEndLine)
            {
                addWarning(WarningHelper.getWarning(blockCtx,
                                                    blockCtx.getStop(),
                                                    tokens,
                                                    "Closing bracket should appear on its own line after the final property."));
            }
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
        
        List<MyLessParser.SelectorContext> selectorCtxList = selectorsCtx.selector();
        if (selectorCtxList == null)
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
        
        List<MyLessParser.SelectorContext> selectorCtxList = selectorsCtx.selector();
        if (selectorCtxList == null)
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
    
    public void checkSelectorDepth(MyLessParser.SelectorContext ctx, int depth)
    {
        List<MyLessParser.ElementContext> elementCtxList = ctx.element();
        if (elementCtxList == null || elementCtxList.size() < 1)
            return;
        
        if (elementCtxList.size() > depth)
            addWarning(WarningHelper.getWarning(ctx,
                                                tokens,
                                                String.format("The selector depth is over %d.", depth)));
    }
    
    private boolean addWarning(Warning warning)
    {
        if (warnings == null)
            return false;
        
        warnings.add(warning);
        return false;
    }
    
    public String getWarnings()
    {
        if (warnings == null)
            return "";
        
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