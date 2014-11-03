import org.antlr.v4.runtime.CommonTokenStream;

public class LessParserVisitorImpl extends LessParserBaseVisitor
{
    private CommonTokenStream tokens;
    
    public LessParserVisitorImpl(CommonTokenStream tokens)
    {
        this.tokens = tokens;
    }
    
	@Override
	public Object visitSelector(LessParser.SelectorContext ctx)
	{
		super.visitSelector(ctx);
		
		// check if selectors use all lowercase letters
		if (!GeneralHelper.IsLowerCase(ctx.getText()))
		{
			System.out.println(ctx.getText() + " - ni lowercase!");
		}
		
		return null;
	}
	
	@Override
	public Object visitProperty(LessParser.PropertyContext ctx) {
		super.visitProperty(ctx);
		
		return null;
	}
}