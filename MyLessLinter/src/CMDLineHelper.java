import java.util.HashMap;
import java.util.Map;


/**
 * 
 * @author Benjamin
 *
 */
public class CMDLineHelper
{
    public static Object parseArgs(String[] args)
    {
        Map<String, Object> ruleParams = new HashMap<String, Object>();
        
        if (args == null || args.length == 0)
            return null; // all rules
        
        int i = 0;
        while (i < args.length)
        {
            int skip = 0;
            String param = args[i];
            
            switch (param)
            {
            case "-nd":
                skip = 1;
                
                if (i + 1 < args.length)
                {
                    Integer d = tryParseInteger(args[i + 1]);
                    if (d == null)
                    {
                        
                    }
                    
                    ruleParams.put("SELECTOR_DEPTH", d);
                }
                
                break;
            }
            
            i = i + skip + 1;
        }
        
        return null;
    }
    
    private static Integer tryParseInteger(String s) {
        Integer retVal;
        try
        {
          retVal = Integer.parseInt(s);
        }
        catch (NumberFormatException nfe)
        {
          retVal = null; // or null if that is your preference
        }
        return retVal;
    }
}