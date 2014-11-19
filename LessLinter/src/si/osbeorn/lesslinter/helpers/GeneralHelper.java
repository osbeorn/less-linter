package si.osbeorn.lesslinter.helpers;

import si.osbeorn.lesslinter.antlr.LessParser.BlockContext;
import si.osbeorn.lesslinter.antlr.LessParser.RuleStatementContext;

/**
 * 
 * @author Benjamin
 *
 */
public class GeneralHelper
{
	public static boolean isLowerCase(String word) 
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
	
	public static boolean isRuleSingleLine(RuleStatementContext rule)
	{
	    return rule.start.getLine() == rule.stop.getLine();
	}
	
	public static boolean isBlockSingleLine(BlockContext block)
	{
	    return
            block.getParent() != null
                ? isRuleSingleLine((RuleStatementContext) block.getParent())
                : false; 
	}
	
	public static boolean isRuleMultiLine(RuleStatementContext rule)
    {
        return rule.start.getLine() < rule.stop.getLine();
    }
	
	public static boolean isBlockMultiLine(BlockContext block)
    {
        return
            block.getParent() != null
                ? isRuleMultiLine((RuleStatementContext) block.getParent())
                : false; 
    }
}