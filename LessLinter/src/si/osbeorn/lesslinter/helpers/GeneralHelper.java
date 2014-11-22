package si.osbeorn.lesslinter.helpers;

import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

import si.osbeorn.lesslinter.antlr.LessParser.BlockContext;
import si.osbeorn.lesslinter.antlr.LessParser.RuleStatementContext;
import si.osbeorn.lesslinter.antlr.LessParser.StatementContext;
import si.osbeorn.lesslinter.antlr.LessParser.StylesheetContext;

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
	
	public static boolean isLastRule(RuleStatementContext ctx)
	{
	    StatementContext stmntCtx = (StatementContext) ctx.getParent();
	    ParserRuleContext parentCtx = stmntCtx.getParent();
	    if (parentCtx instanceof StylesheetContext)
	        return true;
	    
	    if (parentCtx instanceof BlockContext)
	    {
	        BlockContext blockCtx = (BlockContext) parentCtx;
	        List<StatementContext> stmnts = blockCtx.statement();
	        
	        int ind = stmnts.indexOf(stmntCtx);
	        if (ind == stmnts.size()-1)
	            return true;
	    }
	    
	    return false;
	}
}