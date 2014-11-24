package si.osbeorn.lesslinter.library;

/**
 * Just a class of string constants.
 * 
 * @author Benjamin
 */
public class Messages
{
    // warning messages about formating mismatches
    public static final String WARN_ID_STYLING = "Avoid styling ID's and use a class instead.";
    
    public static final String WARN_BRACKET_OWN_LINE = "Closing bracket } should appear on its own line after the final property";
    
    public static final String WARN_WS_AFTER_COLON = "Colon is not followed by a white space.";
    public static final String WARN_WS_BEFORE_COLON = "Colon is not preceded by a white space.";
    
    public static final String WARN_NL_AFTER_MULTI_LINE_STMT = "Multi line rule statement is not followed by an empty line.";
    
    public static final String WARN_SAME_LINE_OPEN_BRACKET = "Opening bracket { is not on the same line as the rule set selector.";
    
    public static final String WARN_RULE_SINLE_LINE = "Rule statement should be written in a single line.";
    
    public static final String WARN_RULE_MULTI_LINE = "Rule statement should be written in multiple lines.";
    
    public static final String WARN_COLOUR_LOWERCASE = "Colour declaration is not written in lowercase.";
    public static final String WARN_COLOUR_FORMAT = "Colour declaration is not writen using the 6 digit hex format.";
    
    public static final String WARN_WS_BEFORE_BRACKET = "Opening bracket { is not preceeded by exactly %d space/s.";
    
    public static final String WARN_SELECTOR_DEPTH = "The selector depth is over %d.";
    
    public static final String WARN_PROPERTY_GROUP_ORDER = "The order of property groups is not correct.";
    
    public static final String WARN_LOWERCASE = "Try to use lower case words if possible.";
    public static final String WARN_CAMELCASE = "Avoid using camelCase style to separate words and use hypens instead.";
    public static final String WARN_UNDERSCORE = "Avoid using underscores to separate words and use hypens instead.";
    
    public static final String WARN_PROPERTY_INDENT = "There is not enough indentation preceeding the property declaration (%d instead of %dx%d=%d)";
    public static final String WARN_PROPERTY_INDENT_SPACES = "Only spaces (e.g. no tabs) are allowed for indentation.";
    
    public static final String WARN_PROPERTY_SPACE_BEFORE = "There is no whitespace before the property declaration.";
    public static final String WARN_PROPERTY_SPACE_WIDTH_BEFORE = "There is not enough whitespace (%d) before the property declaration.";
    public static final String WARN_PROPERTY_SPACE_AFTER = "There is no whitespace after the property declaration.";
    public static final String WARN_PROPERTY_SPACE_WIDTH_AFTER = "There is not enough whitespace (%d) after the property declaration.";
    
    public static final String WARN_PROPERTIES_NOT_ALIGNED = "Properties within the block are not aligned (align the colons).";
    
    public static final String WARN_STATEMENTS_RELATED = "This rule appears to be related to the rule at [%d:%d]. If that is the case, bring the rules together to increase readibility.";
    
    // error listener messages
    public static final String SYNTAX_ERROR = "Syntax error in detection.";
    public static final String AMBUGUITY_ERROR = "Ambuiguity error in detection.";
    public static final String CONTEXT_ERROR = "Attempting full context error in detection";
    public static final String CONTEXT_SENSITIVITY_ERROR = "Context sensitivity error in detection";
}