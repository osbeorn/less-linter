package si.osbeorn.lesslinter.antlr;

import java.util.Map;

import org.antlr.v4.runtime.CommonTokenStream;

import si.osbeorn.lesslinter.antlr.LessParser.BlockContext;
import si.osbeorn.lesslinter.antlr.LessParser.ColorContext;
import si.osbeorn.lesslinter.antlr.LessParser.ElementContext;
import si.osbeorn.lesslinter.antlr.LessParser.PropertyContext;
import si.osbeorn.lesslinter.antlr.LessParser.PropertyIdentContext;
import si.osbeorn.lesslinter.antlr.LessParser.RuleStatementContext;
import si.osbeorn.lesslinter.antlr.LessParser.SelectorContext;
import si.osbeorn.lesslinter.antlr.LessParser.SelectorsContext;
import si.osbeorn.lesslinter.helpers.CountHelper;
import si.osbeorn.lesslinter.helpers.FormattingHelper;

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
    private Map<String, Object> config;
    
    public LessParserListenerImpl(CommonTokenStream tokens,
                                  FormattingHelper formattingHelper,
                                  CountHelper countHelper,
                                  Map<String, Object> config)
    {
        this.tokens = tokens;
        this.formattingHelper = formattingHelper;
        this.countHelper = countHelper;
        this.config = config;
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
	    // ID styling
        formattingHelper.checkIDStyling(ctx);
	    
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