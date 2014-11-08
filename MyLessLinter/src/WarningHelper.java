import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

public class WarningHelper
{	
	public static void ShowWarningString(ParserRuleContext ctx, CommonTokenStream tokens, String warning)
	{
	    String text = tokens.getText(ctx.getSourceInterval());
	    Token posToken = ctx.start;
	    
	    System.out.println(String.format("%s - %s - [%d:%d]",
	                                     warning, 
	                                     text,
	                                     posToken.getLine(),
	                                     posToken.getCharPositionInLine()));
	}
}