import org.antlr.v4.runtime.CommonTokenStream;

public class LessParserListenerImpl extends MyLessParserBaseListener
{
    private CommonTokenStream tokens;
    private int depth = 2;
    
    private FormattingHelper formattingHelper;
    
    public LessParserListenerImpl(CommonTokenStream tokens, FormattingHelper formattingHelper)
    {
        this.tokens = tokens;
        this.formattingHelper = formattingHelper;
    }
    
    @Override
    public void enterSelectors(MyLessParser.SelectorsContext ctx)
    {
    }
    
	@Override
	public void enterSelector(MyLessParser.SelectorContext ctx)
	{		
		// check if selectors use all lowercase letters
		if (!GeneralHelper.IsLowerCase(ctx.getText()))
		{
		    WarningHelper.getWarningString(ctx, tokens, "Ni lowercase");
		}
		
		// check the selector nesting depth		
		formattingHelper.checkSelectorDepth(ctx, depth);
	}
	
	@Override
	public void enterProperty(MyLessParser.PropertyContext ctx)
	{		    
		// check if selectors use all lowercase letters
		if (!GeneralHelper.IsLowerCase(ctx.getText()))
		{
			WarningHelper.getWarningString(ctx, tokens, "Ni lowercase");
		}
	}
	
	@Override
	public void enterBlock(MyLessParser.BlockContext ctx)
	{
	    formattingHelper.checkBlockOpeningBracketWhiteSpace(ctx);
	    
	    formattingHelper.checkPropertiesGroupOrder(ctx);
	}
	
	@Override
	public void enterRuleStatement(MyLessParser.RuleStatementContext ctx)
	{   
	    // ID styling
	    formattingHelper.checkIDStyling(ctx);
	        
        // Multi- and single-line checks
	    formattingHelper.checkRuleLineSpan(ctx);
	    
	    formattingHelper.checkRuleLinePosition(ctx);
	    
	    formattingHelper.checkBlockClosingBracketLocation(ctx);
	    
	    formattingHelper.checkNewLineAfterMultiLineStatement(ctx);
	}
	
	@Override
	public void enterColor(MyLessParser.ColorContext ctx)
	{	 
	    //
	    formattingHelper.checkColorFormat(ctx);
	}	
}