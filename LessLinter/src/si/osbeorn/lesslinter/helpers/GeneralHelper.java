package si.osbeorn.lesslinter.helpers;

import si.osbeorn.lesslinter.antlr.LessParser.RuleStatementContext;

/**
 * 
 * @author Benjamin
 *
 */
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
	
	public static boolean IsRuleSingleLine(RuleStatementContext rule)
	{
	    return rule.start.getLine() == rule.stop.getLine();
	}
	
	public static boolean IsRuleMultiLine(RuleStatementContext rule)
    {
        return rule.start.getLine() < rule.stop.getLine();
    }
}