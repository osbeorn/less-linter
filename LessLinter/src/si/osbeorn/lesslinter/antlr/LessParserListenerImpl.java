package si.osbeorn.lesslinter.antlr;

import java.util.Map;

import si.osbeorn.lesslinter.antlr.LessParser.BlockContext;
import si.osbeorn.lesslinter.antlr.LessParser.ColorContext;
import si.osbeorn.lesslinter.antlr.LessParser.ElementContext;
import si.osbeorn.lesslinter.antlr.LessParser.PropertyContext;
import si.osbeorn.lesslinter.antlr.LessParser.PropertyIdentContext;
import si.osbeorn.lesslinter.antlr.LessParser.RuleStatementContext;
import si.osbeorn.lesslinter.antlr.LessParser.SelectorContext;
import si.osbeorn.lesslinter.antlr.LessParser.SelectorsContext;
import si.osbeorn.lesslinter.antlr.LessParser.VariableNameContext;
import si.osbeorn.lesslinter.helpers.CountHelper;
import si.osbeorn.lesslinter.helpers.FormattingHelper;
import si.osbeorn.lesslinter.library.ConfigParams;

/**
 * An extended implementation of the {@link si.osbeorn.lesslinter.antlr.LessParserBaseListener} class. 
 * 
 * @author Benjamin
 */
public class LessParserListenerImpl extends LessParserBaseListener
{  
    private FormattingHelper formattingHelper;
    private CountHelper countHelper;
    private Map<String, Object> config;
    
    public LessParserListenerImpl(FormattingHelper formattingHelper,
                                  CountHelper countHelper,
                                  Map<String, Object> config)
    {
        this.formattingHelper = formattingHelper;
        this.countHelper = countHelper;
        this.config = config;
    }
    
    @Override
    public void enterSelectors(SelectorsContext ctx)
    {
        if (config.containsKey(ConfigParams.ALL_PARAMS) ||
            config.containsKey(ConfigParams.SELECTOR_DEPTH))
        {
            int depth = (Integer) config.get(ConfigParams.SELECTOR_DEPTH);
            
            // check the selector nesting depth     
            formattingHelper.checkSelectorDepth(ctx, depth);
        }
    }
    
	@Override
	public void enterSelector(SelectorContext ctx)
	{	
	    if (config.containsKey(ConfigParams.ALL_PARAMS) ||
            config.containsKey(ConfigParams.ID_STYLING))
        {
    	    // ID styling
            formattingHelper.checkIDStyling(ctx);
        }
    	 
	    if (config.containsKey(ConfigParams.COUNT_SELECTORS))
	    {
            // count selectors
    		countHelper.countSelectors(ctx);
        }
	}
	
	@Override
	public void enterElement(ElementContext ctx)
	{
	    if (ctx.IDENT() == null)
	        return;
	    
	    if (config.containsKey(ConfigParams.ALL_PARAMS) ||
            config.containsKey(ConfigParams.LOWERCASE))
        {
	        formattingHelper.checkLowerCase(ctx.IDENT());
	        formattingHelper.checkCamelCase(ctx.IDENT());
        }
	    
	    if (config.containsKey(ConfigParams.ALL_PARAMS) ||
            config.containsKey(ConfigParams.UNDERSCORES))
        {
	        formattingHelper.checkUnderScore(ctx.IDENT());
        }
	}
	
	@Override
	public void enterProperty(PropertyContext ctx)
	{
	    if (config.containsKey(ConfigParams.ALL_PARAMS) ||
            config.containsKey(ConfigParams.DECL_SPACES_MULTI))
        {
	        int indent = (Integer) config.get(ConfigParams.DECL_SPACES_MULTI);
	        
	        formattingHelper.checkPropertyIndentation(ctx, indent);
        }
	    
	    if (config.containsKey(ConfigParams.ALL_PARAMS) ||
            config.containsKey(ConfigParams.DECL_SPACES_SINGLE))
        {
	        int size = (Integer) config.get(ConfigParams.DECL_SPACES_SINGLE);
	        
	        formattingHelper.checkSingleLinePropertySpaces(ctx, size);
        }
	}
	
	@Override
	public void enterPropertyIdent(PropertyIdentContext ctx)
	{
	    if (ctx.IDENT() == null)
	        return;
	        
	    if (config.containsKey(ConfigParams.ALL_PARAMS) ||
            config.containsKey(ConfigParams.LOWERCASE))
        {
            formattingHelper.checkLowerCase(ctx.IDENT());
            formattingHelper.checkCamelCase(ctx.IDENT());
        }
        
        if (config.containsKey(ConfigParams.ALL_PARAMS) ||
            config.containsKey(ConfigParams.UNDERSCORES))
        {
            formattingHelper.checkUnderScore(ctx.IDENT());
        }
	}
	
	@Override
	public void enterBlock(BlockContext ctx)
	{
	    if (config.containsKey(ConfigParams.ALL_PARAMS) ||
            config.containsKey(ConfigParams.BLOCK_START))
        {
	        int size = (Integer) config.get(ConfigParams.BLOCK_START);
	        
	        formattingHelper.checkBlockOpeningBracketWhiteSpace(ctx, size);
        }
	    
	    //if (config.containsKey(ConfigParams.ALL_PARAMS) ||
        //    config.containsKey(ConfigParams.BLOCK_END))
        //{            
        //    formattingHelper.checkBlockOpeningBracketWhiteSpace(ctx, size);
        //}
	    
	    if (config.containsKey(ConfigParams.ALL_PARAMS) ||
            config.containsKey(ConfigParams.PROP_GROUPS))
        {
	        formattingHelper.checkPropertiesGroupOrder(ctx);
        }
	}
	
	@Override
	public void enterRuleStatement(RuleStatementContext ctx)
	{   	        
        // Multi- and single-line checks
	    if (config.containsKey(ConfigParams.ALL_PARAMS) ||
            config.containsKey(ConfigParams.LINE_SPAN))
        {
	        formattingHelper.checkRuleLineSpan(ctx);
        }
	    
	    if (config.containsKey(ConfigParams.ALL_PARAMS) ||
            config.containsKey(ConfigParams.BLOCK_START))
        {
            formattingHelper.checkRuleLinePosition(ctx);
        }
	    
	    if (config.containsKey(ConfigParams.ALL_PARAMS) ||
            config.containsKey(ConfigParams.BLOCK_END))
        {
	        formattingHelper.checkBlockClosingBracketLocation(ctx);
        }
	    
	    if (config.containsKey(ConfigParams.ALL_PARAMS) ||
            config.containsKey(ConfigParams.MULTI_NEW_LINE))
        {
	        formattingHelper.checkNewLineAfterMultiLineStatement(ctx);
        }
	    
	    if (config.containsKey(ConfigParams.ALL_PARAMS) ||
            config.containsKey(ConfigParams.COLON_SPACES))
        {
	        formattingHelper.checkPropertyColonSpace(ctx);
        }
	}
	
	@Override
	public void enterColor(ColorContext ctx)
	{	
	    if (config.containsKey(ConfigParams.ALL_PARAMS) ||
            config.containsKey(ConfigParams.COLOR_FORMAT))
        {
	        // lowercase and format check
	        formattingHelper.checkColorFormat(ctx);
        }
	}
	
    @Override
    public void enterVariableName(VariableNameContext ctx)
    {
        if (config.containsKey(ConfigParams.ALL_PARAMS) ||
            config.containsKey(ConfigParams.LOWERCASE))
        {
            formattingHelper.checkLowerCase(ctx.IDENT());
            formattingHelper.checkCamelCase(ctx.IDENT());
        }
            
        if (config.containsKey(ConfigParams.ALL_PARAMS) ||
            config.containsKey(ConfigParams.UNDERSCORES))
        {
            formattingHelper.checkUnderScore(ctx.IDENT());
        }
    }
}