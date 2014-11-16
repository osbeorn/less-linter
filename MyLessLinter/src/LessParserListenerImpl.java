import org.antlr.v4.runtime.CommonTokenStream;

public class LessParserListenerImpl extends MyLessParserBaseListener
{
    private CommonTokenStream tokens;
    private int depth = 2;
    
    private FormattingHelper formattingHelper;
    private CountHelper countHelper;
    
    public LessParserListenerImpl(CommonTokenStream tokens, FormattingHelper formattingHelper, CountHelper countHelper)
    {
        this.tokens = tokens;
        this.formattingHelper = formattingHelper;
        this.countHelper = countHelper;
    }
    
    @Override
    public void enterSelectors(MyLessParser.SelectorsContext ctx)
    {
        // check the selector nesting depth     
        formattingHelper.checkSelectorDepth(ctx, depth);
    }
    
	@Override
	public void enterSelector(MyLessParser.SelectorContext ctx)
	{		
		// check if selectors use all lowercase letters
		//if (!GeneralHelper.IsLowerCase(ctx.getText()))
		//{
		//    WarningHelper.getWarningString(ctx, tokens, "Ni lowercase");
		//}
		
		countHelper.countSelectors(ctx);
	}
	
	@Override
	public void enterElement(MyLessParser.ElementContext ctx)
	{
	    if (ctx.IDENT() == null)
	        return;
	    
	    formattingHelper.checkLowerCase(ctx.IDENT());
	    formattingHelper.checkCamelCase(ctx.IDENT());
	    formattingHelper.checkUnderScore(ctx.IDENT());
	}
	
	@Override
	public void enterProperty(MyLessParser.PropertyContext ctx)
	{		    
		// check if selectors use all lowercase letters
		//if (!GeneralHelper.IsLowerCase(ctx.getText()))
		//{
		//	WarningHelper.getWarningString(ctx, tokens, "Ni lowercase");
		//}
	}
	
	@Override
	public void enterPropertyIdent(MyLessParser.PropertyIdentContext ctx)
	{
	    if (ctx.IDENT() == null)
	        return;
	        
	    formattingHelper.checkLowerCase(ctx.IDENT());
        formattingHelper.checkCamelCase(ctx.IDENT());
        formattingHelper.checkUnderScore(ctx.IDENT());
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
	    formattingHelper.checkPropertyColonSpace(ctx);
	}
	
	@Override
	public void enterColor(MyLessParser.ColorContext ctx)
	{	 
	    // lowercase and format check
	    formattingHelper.checkColorFormat(ctx);
	}	
}