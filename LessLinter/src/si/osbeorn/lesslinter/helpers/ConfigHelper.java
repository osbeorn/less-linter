package si.osbeorn.lesslinter.helpers;

import java.util.HashMap;
import java.util.Map;

import si.osbeorn.lesslinter.library.ConfigParams;


/**
 * 
 * @author Benjamin
 *
 */
public class ConfigHelper
{
    public static Map<String, Object> parseArgs(String[] args)
    {
        Map<String, Object> config = new HashMap<String, Object>();
        
        if (args == null || args.length == 0)
            return null; // default -- all rules, read from file
        
        int i = 0;
        while (i < args.length)
        {
            int skip = 0;
            String param = args[i];
            
            switch (param)
            {
                case "-h":
                case "--help":
                    showUsageInformation();
                    break;
                    
                case "-r":
                case "--raw":
                    skip = 1;
                    
                    if (i + 1 < args.length)
                    {
                        config.put(ConfigParams.RAW_INPUT, args[i + 1]);
                    }
                    
                    break;
                    
                case "-D":
                case "--selector-depth":
                    skip = 1;
                    
                    if (i + 1 < args.length)
                    {
                        Integer d = tryParseInteger(args[i + 1]);                    
                        config.put(ConfigParams.SELECTOR_DEPTH, d);
                    }
                    
                    break;
                
                case "-s":
                case "--decl-spaces":
                    skip = 1;
                    
                    if (i + 1 < args.length)
                    {
                        Integer d = tryParseInteger(args[i + 1]);                    
                        config.put(ConfigParams.DECL_SPACES, d);
                    }
                    
                    break;
                    
                default:
                    config.put(ConfigParams.FILE_INPUT, args[i]);
            }
            
            i = i + skip + 1;
        }
        
        return config;
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
    
    private static void showUsageInformation()
    {
        System.out.println(
            String.format("\n%s\n%s\n\n%s\n\n%-35s%s\n%-35s%s\n%-35s%s\n%-35s%s",
                          "Usage: java -jar less-linter [options] <file>",
                          "       e.g. java -jar less-linter something.less",
                          "Options:",
                          
                          "-h, --help",
                          "Output usage information",
                          
                          "-r, --raw <string>",
                          "Pass in a raw string of LESS",
                          
                          "-D, --selector-depth <integer>",
                          "Show warning where selector depth is over the specified limit, default is 4",
                          
                          "-s, --decl-spaces <integer>",
                          "Specify how many spaces should there be preceeding every declaration, default is 4")
        );
        
        System.exit(0);
    }
}