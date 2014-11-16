package si.osbeorn.lesslint.library;

/**
 * 
 * @author Benjamin
 *
 */
public class Messages
{
    // formatting messages
    public static final String WARN_BRACKET_OWN_LINE = "Closing bracket } should appear on its own line agter the final property";
    public static final String WARN_WS_AFTER_COLON = "Colon is not followed by a white space.";
    public static final String WARN_WS_BEFORE_COLON = "Colon is not preceded by a white space.";
    public static final String WARN_NL_AFTER_MULTI_LINE_STMT = "Multi line rule statement is not followed by an empty line.";
    public static final String WARN_SAME_LINE_OPEN_BRACKET = "Opening bracket { is not on the same line as the rule set selector.";
    public static final String WARN_RULE_SINLE_LINE = "Rule statement should be written in a single line.";
    public static final String WARN_RULE_MULTI_LINE = "Rule statement should be written in multiple lines.";
    public static final String WARN_COLOUR_LOWERCASE = "Colour declaration is not lowercase.";
    public static final String WARN_COLOUR_FORMAT = "Colour declaration is not using the 6 digit hex format.";
    public static final String WARN_WS_BEFORE_BRACKET = "Opening bracket { is not preceeded by exactly one space.";
    public static final String WARN_SELECTOR_DEPTH = "The selector depth is over %d.";
    public static final String WARN_PROPERTY_GROUP_ORDER = "The order of property groups is not correct;";
    public static final String WARN_LOWERCASE = "Try to use lower case words if possible.";
    public static final String WARN_CAMELCASE = "Avoid using camelCase style to separate words and use hypens instead.";
    public static final String WARN_UNDERSCORE = "Avoid using underscores to separate words and use hypens instead.";
    
    // error listener messages
    public static final String SYNTAX_ERROR = "Syntax error in detection.";
    public static final String AMBUGUITY_ERROR = "Ambuiguity error in detection.";
    public static final String CONTEXT_ERROR = "Attempting full context erro in detection";
    public static final String CONTEXT_SENSITIVITY_ERROR = "Context sensitivity error in detection";
}