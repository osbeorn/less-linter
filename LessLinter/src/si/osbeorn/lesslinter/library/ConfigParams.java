package si.osbeorn.lesslinter.library;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Benjamin
 *
 */
public class ConfigParams
{
    public static final String SELECTOR_DEPTH = "SELECTOR_DEPTH";
    public static final String RAW_INPUT = "RAW_INPUT";
    public static final String FILE_INPUT = "FILE_INPUT";
    public static final String DECL_SPACES = "DECL_SPACES";
    
    public static Map<String, Object> defaultParams;
    
    static
    {
        defaultParams = new HashMap<String, Object>();
        defaultParams.put(SELECTOR_DEPTH, 4);
        defaultParams.put(DECL_SPACES, 4);
    }
}