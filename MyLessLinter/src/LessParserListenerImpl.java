import java.util.List;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class LessParserListenerImpl extends MyLessParserBaseListener
{
    private CommonTokenStream tokens;
    private int depth = 2;
    
    public LessParserListenerImpl(CommonTokenStream tokens)
    {
        this.tokens = tokens;
    }
    
    @Override
    public void enterSelectors(MyLessParser.SelectorsContext ctx)
    {
        //super.enterSelectors(ctx);
        
        //System.out.println("Selectors: " + ctx.getText());
    }
    
	@Override
	public void enterSelector(MyLessParser.SelectorContext ctx) {
		super.enterSelector(ctx);
		
		System.out.println("Selector: " + ctx.getText());
		
		// check if selectors use all lowercase letters
		if (!GeneralHelper.IsLowerCase(ctx.getText()))
		{
		    WarningHelper.ShowWarningString(ctx, tokens, "Ni lowercase");
		}
		
		// check the selector nesting depth		
		if (GeneralHelper.IsSelectorDepthOverThanLimit(ctx.getText(), depth))
		{
		    WarningHelper.ShowWarningString(ctx, tokens, "Globina selektorja ja veè kot " + depth);
		}
	}
	
	@Override
	public void enterProperty(MyLessParser.PropertyContext ctx) {
		super.enterProperty(ctx);
		
		System.out.println("Property: " + ctx.getText());
		
		// check if selectors use all lowercase letters
		if (!GeneralHelper.IsLowerCase(ctx.getText()))
		{
			WarningHelper.ShowWarningString(ctx, tokens, "Ni lowercase");
		}
	}
	
	@Override
	public void enterBlock(MyLessParser.BlockContext ctx)
	{
	    super.enterBlock(ctx);
	    
	    // check if selectors use all lowercase letters
        //if (!GeneralHelper.IsLowerCase(ctx.getText()))
        //{
	    
	    int blockStart = ctx.getStart().getTokenIndex();
        List<Token> leftTokens = tokens.getHiddenTokensToLeft(blockStart);
        
        if (leftTokens.size() > 0)
        {
            Token white = leftTokens.get(0);
            if (white.getType() == MyLessParser.WS)
            {
                String text = white.getText();
                if (text.length() != 1)
                    WarningHelper.ShowWarningString(ctx, tokens, "Ni toèno enega presledka pred zavitim oklepajem");
            }
        }
	}
	
	@Override
	public void enterRuleStatement(MyLessParser.RuleStatementContext ctx)
	{
	    super.enterRuleStatement(ctx);
	    
	    MyLessParser.BlockContext blockCtx = ctx.block();
	    if (blockCtx != null)
	    {
	        if (blockCtx.children.size()-2 == 1 && !GeneralHelper.IsRuleSingleLine(ctx))
	        {
	            WarningHelper.ShowWarningString(ctx, tokens, "Rule bi moral biti single-line pa ni.");
	        }
	        else if (blockCtx.children.size()-2 > 1 && GeneralHelper.IsRuleSingleLine(ctx))
	        {
	            WarningHelper.ShowWarningString(ctx, tokens, "Rule bi moral biti multi-line pa ni.");
	        }
	    }
	    
	    System.out.println(GeneralHelper.IsRuleSingleLine(ctx));
	}
	
	@Override
	public void enterColor(MyLessParser.ColorContext ctx)
	{
	    super.enterColor(ctx);
	    
	    if (!ColorHelper.IsLowerCase(ctx.getText()))
	        WarningHelper.ShowWarningString(ctx, tokens, "Barva ni lowercase.");
	    
	    if (!ColorHelper.IsSixFigureHexColor(ctx.getText()))
	        WarningHelper.ShowWarningString(ctx, tokens, "Barva ni v šestmestnem HEX formatu.");
	}	
}