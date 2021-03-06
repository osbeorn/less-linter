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
    /**
     * Parse the command line arguments. 
     * 
     * @param args Command line arguments.
     * @return A HashMap containing configuration key value pairs. 
     */
    public static Map<String, Object> parseArgs(String[] args)
    {
        Map<String, Object> config = new HashMap<String, Object>();
        
        // no arguments specified
        if (args == null || args.length == 0)
            return null;
        
        // only input file specified -> all and default configParams
        if (args.length == 1 && !existAnySwitch(args))
        {
            config.put(ConfigParams.FILE_INPUT, args[0]);
            config.put(ConfigParams.ALL_PARAMS, null);
            ConfigParams.setDefaultParams(config);
            
            return config;
        }
        
        // only -r/--raw switch present, assume next argument is input
        // string and all and default configParams requested
        if (existOnlySwitch(args, "-r") || existOnlySwitch(args, "--raw"))
        {
            config.put(ConfigParams.RAW_INPUT, args[1]);
            config.put(ConfigParams.ALL_PARAMS, null);
            ConfigParams.setDefaultParams(config);
            
            return config;
        }
        
        // help switch present
        if (usageInformationRequested(args))
            showUsageInformation();
        
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
                    
                case "-a":
                case "--all":
                    config.put(ConfigParams.ALL_PARAMS, null);
                    break;
                    
                case "-D":
                case "--selector-depth":
                    skip = 1;
                                        
                    config.put(ConfigParams.SELECTOR_DEPTH, tryParseInteger(args, i + 1));
                    
                    break;
                
                case "-s":
                case "--decl-spaces-multi":
                    skip = 1;
                    
                    config.put(ConfigParams.DECL_SPACES_MULTI, tryParseInteger(args, i + 1));
                    
                    break;
                
                case "-p":
                case "--decl-spaces-single":
                    skip = 1;
                                        
                    config.put(ConfigParams.DECL_SPACES_SINGLE, tryParseInteger(args, i + 1));
                    
                    break;
                    
                case "-S":
                case "--line-span":
                    config.put(ConfigParams.LINE_SPAN, null);
                    
                case "-m":
                case "--multi-new-linr":
                    config.put(ConfigParams.MULTI_NEW_LINE, null);
                    
                case "-l":
                case "--lowercase":
                    config.put(ConfigParams.LOWERCASE, null);
                    
                case "-c":
                case "--colon-spaces":
                    config.put(ConfigParams.COLON_SPACES, null);
                
                case "-b":
                case "--block-start":
                    skip = 1;
                    
                    config.put(ConfigParams.BLOCK_START, tryParseInteger(args, i + 1));
                    
                    break;
                
                case "-k":
                case "--block-end":
                    config.put(ConfigParams.BLOCK_END, null);
                    
                case "-g":
                case "--prop-groups":
                    config.put(ConfigParams.PROP_GROUPS, null);
                    
                case "-i":
                case "--id-styling":
                    config.put(ConfigParams.ID_STYLING, null);
                    
                case "-u":
                case "--underscores":
                    config.put(ConfigParams.UNDERSCORES, null);
                    
                case "-C":
                case "--color-format":
                    config.put(ConfigParams.COLOR_FORMAT, null);
                
                case "-A":
                case "--prop-align":
                    config.put(ConfigParams.PROP_ALIGN, null);
                
                //case "-P":
                //case "--selector-perf":
                //    config.put(ConfigParams.SELECTOR_PERF, null);

                case "-R":
                case "--rule-related":
                    skip = 1;
                    
                    config.put(ConfigParams.RULE_RELATED, tryParseInteger(args, i + 1));
                    
                    break;
                    
                case "-N":
                case "--count-selectors":
                    config.put(ConfigParams.COUNT_SELECTORS, null);
                    
                default:
                    config.put(ConfigParams.FILE_INPUT, args[i]);
            }
            
            i = i + skip + 1;
        }
        
        if (config.containsKey(ConfigParams.ALL_PARAMS))
            ConfigParams.setDefaultParams(config);
        
        return config;
    }
    
    private static boolean usageInformationRequested(String[] args)
    {
        for (String arg : args)
        {
            if (arg == "-h" || arg == "--help")
                return true;
        }
        
        return false;
    }
    
    private static boolean existOnlySwitch(String[] args, String s)
    {
        int count = 0;
        boolean found = false;
        for (String arg : args)
        {
            if (arg.startsWith("-"))
                count++;
            
            if (arg.equals(s))
                found = true;
        }
        
        return count == 1 && found;
    }
    
    private static boolean existSwitch(String[] args, String s)
    {
        for (String arg : args)
        {
            if (arg.equals(s))
                return true;
        }
        
        return false;
    }
    
    private static boolean existAnySwitch(String[] args)
    {
        for (String arg : args)
        {
            if (arg.startsWith("-"))
                return true;
        }
        
        return false;
    }
    
    /**
     * Parse an integer argument from a string array at the pos location.
     * 
     * @param s String array input
     * @param pos Position
     * @return Parsed integer
     */
    private static Integer tryParseInteger(String[] s, int pos)
    {
        Integer retVal = null;
        
        try
        {
            if (pos >= s.length)
                throw new Exception("Error in parsing input arguments.");
            
            retVal = Integer.parseInt(s[pos]);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.exit(1);
        }
        
        return retVal;
    }
    
    private static void showUsageInformation()
    {
        System.out.println(
            String.format(
                "\n" + 
                "%s\n" +
                "%s\n\n" +
                "%s\n\n" +
                "%s\n\n" +
                "%-35s%s\n" + // -h
                "%-35s%s\n" + // -r
                "%-35s%s\n" + // -a
                "%-35s%s\n" + // -D
                "%-35s%s\n" + // -s
                "%-35s%s\n" + // -p
                "%-35s%s\n" + // -S
                "%-35s%s\n" + // -m
                "%-35s%s\n" + // -l
                "%-35s%s\n" + // -c
                "%-35s%s\n" + // -b
                "%-35s%s\n" + // -k
                "%-35s%s\n" + // -g
                "%-35s%s\n" + // -i
                "%-35s%s\n" + // -u
                "%-35s%s\n" + // -C
                "%-35s%s\n",  // -N
                  
                "Usage: java -jar less-linter [options] <file>",
                "       e.g. java -jar less-linter something.less",
                "If only the file is specified, the program will run as if the -a switch had been used.",
                "Options:",
                  
                "-h, --help",
                "Output usage information.",
                  
                "-r, --raw <string>",
                "Pass in a raw string of LESS (use with caution - better to read from a file).",
                  
                "-a, -all",
                "When used, all checks will be performed using their default values. To use a different value use the appropriate switch followed by the value.",
                  
                "-D, --selector-depth <integer>",
                "Show warning where selector depth is over the specified limit, default is 4.",
                 
                "-s, --decl-spaces-multi <integer>",
                "Check and specify how many spaces should there be preceeding every property declaration, default is 4 (4 on 1st level, 8 on 2nd level, etc.).",
                
                "-p, --decl-spaces-single <integer>",
                "Check and specify how many spaces should there be preceeding and following every property declaration in a single line rule statement, default is 1.",
                
                "-S, --line-span",
                "Check ruleset line span based on the property count inside the block.",
                
                "-m, --multi-new-line",
                "Check if multi line ruleset is followed by a new line.",
                
                "-l, --lowercase",
                "Check if selectors, properties, etc. are written in lowercase and camel-case format.",
                
                "-c, --colon-spaces",
                "Check if there is a space after the : in single line rulesets, and if there is a space before and after the : in multi line rulesets.",
                
                "-b, --block-start <integer>",
                "Check if the { bracket is on the same line as the ruleset and preceeded by spaces (1 space by default).",
                
                "-k, --block-end",
                "Check if the } is on it's own line after the final property.",
                
                "-g, --prop-groups",
                "Check if properties are grouped by type and in correct order.",
                
                "-i, --id-styling",
                "Check if ID selectors are used.",
                
                "-u, --underscores",
                "Check if underscores are used in selector names.",
                
                "-C, --color-format",
                "Check if colors are written using the hex 6-digit lowercase format.",
                
                "-A, --prop-align",
                "Check if properties within a block are aligned (if colons of each property are aligned).",
                
                //"-P, --selector-perf",
                //"Check if a selector could have a high impact on performace.",
                
                "-R, --rule-related <integer>",
                "Check for related rules. If they exist check if they are already grouped - if not, show a warning. The integer parameter denotes the minimum length of a common prefix in order for two rules to be considered related (default is 5).",
                
                "-N, --count-selectors",
                "Counts the following selectors: universal, parent, ID, class, and tag selectors."
            )
        );
        
        System.exit(0);
    }
}