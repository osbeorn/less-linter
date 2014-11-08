import org.antlr.v4.runtime.CommonTokenStream;

public class LessParserVisitorImpl extends MyLessParserBaseVisitor
{
    private CommonTokenStream tokens;
    
    public LessParserVisitorImpl(CommonTokenStream tokens)
    {
        this.tokens = tokens;
    }
    
	@Override
	public Object visitSelector(MyLessParser.SelectorContext ctx)
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
	public Object visitProperty(MyLessParser.PropertyContext ctx) {
		super.visitProperty(ctx);
		
		return null;
	}
}