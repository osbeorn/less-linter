/**
 * 
 */
package si.osbeorn.lesslinter.library;

import java.util.Arrays;
import java.util.List;

/**
 * @author Benjamin
 *
 */
public class PropertyGroups
{
    public static List<String> positionGroup =
        Arrays.asList("position", "top", "right", "left", "bottom", "z-index");
        
    public static List<String> displayAndBoxGroup =
        Arrays.asList("display", "box-sizing", "width", "height", "padding",
                      "margin", "overflow");
    
    public static List<String> borderGroup =
        Arrays.asList("border", "border-bottom", "border-bottom-color", "border-bottom-left-radius",
                      "border-bottom-right-radius", "border-bottom-style", "border-bottom-width",
                      "border-collapse", "border-color", "border-image", "border-image-outset",
                      "border-image-repeat", "border-image-slice", "border-image-source", "border-image-width",
                      "border-left", "border-left-color", "border-left-style", "border-left-width",
                      "border-radius", "border-right", "border-right-color", "border-right-style",
                      "border-right-width", "border-spacing", "border-style", "border-top", "border-top-color",
                      "border-top-left-radius", "border-top-right-radius", "border-top-style", "border-top-width",
                      "border-width");
    
    public static List<String> backgroundAndColorGroup =
        Arrays.asList("background", "background-attachment", "background-clip", "background-color",
                      "background-image", "background-origin", "background-position", "background-repeat",
                      "background-size", "color");
    
    public static List<String> textGroup =
        Arrays.asList("font-family", "font-size", "line-height", "text-align",
                      "text-transform", "letter-spacing");
    
    public static final int POSITION_GRP_INDEX = 1;
    public static final int DISP_AND_BOX_GRP_INDEX = 2;
    public static final int BORDER_GRP_INDEX = 3;
    public static final int BG_AND_COLOR_GRP_INDEX = 4;
    public static final int TEXT_GRP_INDEX = 5;
    public static final int OTHER_GRP_INDEX = 6;
}