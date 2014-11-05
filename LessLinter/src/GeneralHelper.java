


import org.antlr.v4.runtime.Token;

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
	
	public static String GetWarningString(Token posToken, String desc, String warning)
	{
	    return String.format("%s - %s - [%d:%d]", warning, desc, posToken.getLine(), posToken.getCharPositionInLine());
	}
	
	public static boolean IsSelectorDepthOverThanLimit(String word, int depth)
	{
	    if (word == null || word.isEmpty())
	        return false;
	    
	    String[] splits = word.split("\\.");
	    return splits.length-1 > depth;
	}
}
