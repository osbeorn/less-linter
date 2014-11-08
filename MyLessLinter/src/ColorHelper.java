public class ColorHelper
{
	public static boolean IsLowerCase(String word)
	{
	    String hexNumber = word.replace("#", "");
		for(int i = 0; i < hexNumber.length(); i++)
		{
			if (Character.isAlphabetic(hexNumber.charAt(i)) &&
				!Character.isLowerCase(hexNumber.charAt(i)))
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean IsSixFigureHexColor(String text)
    {
        return text.matches("#[0-9A-Fa-f]{6}");
    }
}