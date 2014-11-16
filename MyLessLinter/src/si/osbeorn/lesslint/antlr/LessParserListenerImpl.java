package si.osbeorn.lesslint.antlr;

import org.antlr.v4.runtime.CommonTokenStream;

import si.osbeorn.lesslint.antlr.LessParser.BlockContext;
import si.osbeorn.lesslint.antlr.LessParser.ColorContext;
import si.osbeorn.lesslint.antlr.LessParser.ElementContext;
import si.osbeorn.lesslint.antlr.LessParser.PropertyContext;
import si.osbeorn.lesslint.antlr.LessParser.PropertyIdentContext;
import si.osbeorn.lesslint.antlr.LessParser.RuleStatementContext;
import si.osbeorn.lesslint.antlr.LessParser.SelectorContext;
import si.osbeorn.lesslint.antlr.LessParser.SelectorsContext;
import si.osbeorn.lesslint.helpers.CountHelper;
import si.osbeorn.lesslint.helpers.FormattingHelper;

/**
 * 
 * @author Benjamin
 *
 */
public class LessParserListenerImpl extends LessParserBaseListener
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
    public void enterSelectors(SelectorsContext ctx)
    {
        // check the selector nesting depth     
        formattingHelper.checkSelectorDepth(ctx, depth);
    }
    
	@Override
	public void enterSelector(SelectorContext ctx)
	{		
		// check if selectors use all lowercase letters
		//if (!GeneralHelper.IsLowerCase(ctx.getText()))
		//{
		//    WarningHelper.getWarningString(ctx, tokens, "Ni lowercase");
		//}
		
		countHelper.countSelectors(ctx);
	}
	
	@Override
	public void enterElement(ElementContext ctx)
	{
	    if (ctx.IDENT() == null)
	        return;
	    
	    formattingHelper.checkLowerCase(ctx.IDENT());
	    formattingHelper.checkCamelCase(ctx.IDENT());
	    formattingHelper.checkUnderScore(ctx.IDENT());
	}
	
	@Override
	public void enterProperty(PropertyContext ctx)
	{		    
		// check if selectors use all lowercase letters
		//if (!GeneralHelper.IsLowerCase(ctx.getText()))
		//{
		//	WarningHelper.getWarningString(ctx, tokens, "Ni lowercase");
		//}
	}
	
	@Override
	public void enterPropertyIdent(PropertyIdentContext ctx)
	{
	    if (ctx.IDENT() == null)
	        return;
	        
	    formattingHelper.checkLowerCase(ctx.IDENT());
        formattingHelper.checkCamelCase(ctx.IDENT());
        formattingHelper.checkUnderScore(ctx.IDENT());
	}
	
	@Override
	public void enterBlock(BlockContext ctx)
	{
	    formattingHelper.checkBlockOpeningBracketWhiteSpace(ctx);
	    formattingHelper.checkPropertiesGroupOrder(ctx);
	}
	
	@Override
	public void enterRuleStatement(RuleStatementContext ctx)
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
	public void enterColor(ColorContext ctx)
	{	 
	    // lowercase and format check
	    formattingHelper.checkColorFormat(ctx);
	}	
}