package si.osbeorn.lesslinter.library;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * A class containing all possible config parameters.
 * 
 * @author Benjamin
 */
public class ConfigParams
{
    /**
     * Use all parameters with their default values (if present).
     */
    public static final String ALL_PARAMS = "ALL_PARAMS";
    /**
     * Perform the "max selector depth" check.
     */
    public static final String SELECTOR_DEPTH = "SELECTOR_DEPTH";
    /**
     * Use a string as the source stylesheet.
     */
    public static final String RAW_INPUT = "RAW_INPUT";
    /**
     * Use a file as the source stylesheet. 
     */
    public static final String FILE_INPUT = "FILE_INPUT";
    /**
     * Perform the "declaration indentation size" check.
     */
    public static final String DECL_SPACES_MULTI = "DECL_SPACES_MULTI";
    /**
     * Perform the "single line rule statement property whitespace before and after" check.
     */
    public static final String DECL_SPACES_SINGLE = "DECL_SPACES_SINGLE";
    /**
     * Perform the "" check.
     */
    public static final String LINE_SPAN = "LINE_SPAN";
    /**
     * Perform the "multi line statement followed by a new line" check.
     */
    public static final String MULTI_NEW_LINE = "MULTI_NEW_LINE";
    /**
     * Perform the "selector/property lower case format" check.
     */
    public static final String LOWERCASE = "LOWERCASE";
    /**
     * Perform the "spaces before/after property colon" check;
     */
    public static final String COLON_SPACES = "COLON_SPACES";
    /**
     * Perform the "rule statement opening/closing bracket location" check;
     */
    public static final String BRACKET_LOCATION = "BRACKET_LOCATION";
    /**
     * Perform the "property groping and order" check;
     */
    public static final String PROP_GROUPS = "PROP_GROUPS";
    /**
     * Perform the "ID styling" check.
     */
    public static final String ID_STYLING = "ID_SYLING";
    /**
     * Perform the "selectors contain underscore" check.
     */
    public static final String UNDERSCORES = "UNDERSCORES";
    /**
     * Perform the "color format" check.
     */
    public static final String COLOR_FORMAT = "COLOR_FORMAT";
    /**
     * Count the selectors in the stylesheet.
     */
    public static final String COUNT_SELECTORS = "COUNT_SELECTORS";
    
    /**
     * Config parameters with their default values.
     */
    public static Map<String, Object> defaultParams;
    
    static
    {
        defaultParams = new HashMap<String, Object>();
        defaultParams.put(SELECTOR_DEPTH, 4);
        defaultParams.put(DECL_SPACES_MULTI, 4);
        defaultParams.put(DECL_SPACES_SINGLE, 1);
    }
    
    /**
     * Set default parameters to the <code>config</code> object.
     * 
     * @param config The config object.
     */
    public static void setDefaultParams(Map<String, Object> config)
    {
        for (Entry<String, Object> param : defaultParams.entrySet())
        {
            if (!config.containsKey(param.getKey()))
                config.put(param.getKey(), param.getValue());
        }
    }
    
    public static boolean containsFormattingParams(Map<String, Object> config)
    {
        if (config.containsKey(ConfigParams.ALL_PARAMS) ||
            config.containsKey(ConfigParams.SELECTOR_DEPTH) ||
            config.containsKey(ConfigParams.DECL_SPACES_MULTI) ||
            config.containsKey(ConfigParams.DECL_SPACES_SINGLE) ||
            config.containsKey(ConfigParams.LINE_SPAN) ||
            config.containsKey(ConfigParams.MULTI_NEW_LINE) ||
            config.containsKey(ConfigParams.LOWERCASE) ||
            config.containsKey(ConfigParams.COLON_SPACES) ||
            config.containsKey(ConfigParams.BRACKET_LOCATION) ||
            config.containsKey(ConfigParams.PROP_GROUPS) ||
            config.containsKey(ConfigParams.ID_STYLING) ||
            config.containsKey(ConfigParams.UNDERSCORES) ||
            config.containsKey(ConfigParams.COLOR_FORMAT))
        {
            return true;
        }
        
        return false;
    }
    
    public static boolean containsCountingParams(Map<String, Object> config)
    {
        if (config.containsKey(ConfigParams.COUNT_SELECTORS))
            return true;
        
        return false;
    }
}