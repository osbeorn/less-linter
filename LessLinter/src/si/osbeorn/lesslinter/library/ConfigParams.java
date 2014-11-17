package si.osbeorn.lesslinter.library;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * @author Benjamin
 *
 */
public class ConfigParams
{
    public static final String ALL_PARAMS = "ALL_PARAMS";
    public static final String SELECTOR_DEPTH = "SELECTOR_DEPTH";
    public static final String RAW_INPUT = "RAW_INPUT";
    public static final String FILE_INPUT = "FILE_INPUT";
    public static final String DECL_SPACES = "DECL_SPACES";
    public static final String LINE_SPAN = "LINE_SPAN";
    public static final String MULTI_NEW_LINE = "MULTI_NEW_LINE";
    public static final String LOWERCASE = "LOWERCASE";
    public static final String COLON_SPACES = "COLON_SPACES";
    public static final String BRACKET_LOCATION = "BRACKET_LOCATION";
    public static final String PROP_GROUPS = "PROP_GROUPS";
    public static final String ID_STYLING = "ID_SYLING";
    public static final String UNDERSCORES = "UNDERSCORES";
    public static final String COLOR_FORMAT = "COLOR_FORMAT";
    public static final String COUNT_SELECTORS = "COUNT_SELECTORS";
    
    public static Map<String, Object> defaultParams;
    
    static
    {
        defaultParams = new HashMap<String, Object>();
        defaultParams.put(SELECTOR_DEPTH, 4);
        defaultParams.put(DECL_SPACES, 4);
    }
    
    public static void setDefaultParams(Map<String, Object> config)
    {
        for (Entry<String, Object> param : defaultParams.entrySet())
        {
            if (!config.containsKey(param.getKey()))
                config.put(param.getKey(), param.getValue());
        }
    }
}