package si.osbeorn.lesslint.helpers;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import si.osbeorn.lesslint.antlr.LessParser.RuleStatementContext;

public class GeneralHelper
{
	public static boolean IsLowerCase(String word) 
	{
		for(int i = 0; i < word.length(); i++)
		{
			if (Character.isAlphabetic(word.charAt(i)) &&
				!Character.isLowerCase(word.charAt(i)))
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static String GetWarningString(ParserRuleContext ctx, CommonTokenStream tokens, String warning)
	{
	    String text = tokens.getText(ctx.getSourceInterval());
	    Token posToken = ctx.start;
	    
	    return String.format("%s - %s - [%d:%d]", warning, text, posToken.getLine(), posToken.getCharPositionInLine());
	}
	
	public static boolean IsSelectorDepthOverThanLimit(String word, int depth)
	{
	    if (word == null || word.isEmpty())
	        return false;
	    
	    String[] splits = word.split("\\.");
	    return splits.length-1 > depth;
	}
	
	public static boolean IsRuleSingleLine(RuleStatementContext rule)
	{
	    return rule.start.getLine() == rule.stop.getLine();
	}
	
	public static boolean IsRuleMultiLine(RuleStatementContext rule)
    {
        return rule.start.getLine() < rule.stop.getLine();
    }
}