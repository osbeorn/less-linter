package si.osbeorn.lesslint.helpers;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import si.osbeorn.lesslint.library.Warning;

public class WarningHelper
{	
    public static Warning getWarning(ParserRuleContext ctx, CommonTokenStream tokens, String warning)
    {
        String text = tokens.getText(ctx.getSourceInterval());
        Token posToken = ctx.getStart();
        
        return new Warning(posToken.getLine(),
                           posToken.getCharPositionInLine(),
                           text,
                           warning);
    }
    
    public static Warning getWarning(TerminalNode node, CommonTokenStream tokens, String warning)
    {
        Token posToken = node.getSymbol();
        
        return new Warning(posToken.getLine(),
                           posToken.getCharPositionInLine(),
                           node.getText(),
                           warning);
    }
    
    public static Warning getWarning(ParserRuleContext ctx, Token startToken, CommonTokenStream tokens, String warning)
    {
        String text = tokens.getText(ctx.getSourceInterval());
        
        return new Warning(startToken.getLine(),
                           startToken.getCharPositionInLine(),
                           text,
                           warning);
    }
    
	public static String getWarningString(ParserRuleContext ctx, CommonTokenStream tokens, String warning)
	{
	    String text = tokens.getText(ctx.getSourceInterval());
	    Token posToken = ctx.getStart();
	    
	    return String.format("[%d:%d]: %s",
	                         posToken.getLine(),
                             posToken.getCharPositionInLine(),
	                         warning, 
	                         text);
	}
	
	public static String getWarningString(ParserRuleContext ctx, Token startToken, CommonTokenStream tokens, String warning)
    {
        String text = tokens.getText(ctx.getSourceInterval());
        
        return String.format("[%d:%d]: %s",
                             startToken.getLine(),
                             startToken.getCharPositionInLine(),
                             warning, 
                             text);
    }
}