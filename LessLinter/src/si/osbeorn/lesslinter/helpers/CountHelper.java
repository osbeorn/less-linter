package si.osbeorn.lesslinter.helpers;

import si.osbeorn.lesslinter.antlr.LessParser.ElementContext;
import si.osbeorn.lesslinter.antlr.LessParser.SelectorContext;

/**
 * @author Benjamin
 */
public class CountHelper
{
    private int allSelectorsCount;
    private int uniSelectorsCount;
    private int parentSelectorsCount;
    private int idSelectorsCount;
    private int classSelectorsCount;
    private int tagSelectorsCount;
    
    /**
     * Identify the selector and increment the count.
     * 
     * @param ctx Selector context.
     */
    public void countSelectors(SelectorContext ctx)
    {
        ElementContext elementCtx = ctx.element();
        if (elementCtx == null)
            return;
        
        if (elementCtx.AND() != null)
            parentSelectorsCount++;
        else if (elementCtx.HASH() != null)
            idSelectorsCount++;
        else if (elementCtx.DOT() != null)
            classSelectorsCount++;
        else if (elementCtx.TIMES() != null)
            uniSelectorsCount++;
        else
            tagSelectorsCount++;
        
        allSelectorsCount += 1;
    }
    
    /**
     * @return A string representation of the counter. 
     */
    public String getCountReport()
    {
        StringBuilder builder = new StringBuilder();
        
        builder.append("Selectors count report:\n");
        builder.append("-------------------------------\n");
        builder.append(String.format("# of universal selectors: %d\n", uniSelectorsCount));
        builder.append(String.format("# of parent selectors: %d\n", parentSelectorsCount));
        builder.append(String.format("# of ID selectors: %d\n", idSelectorsCount));
        builder.append(String.format("# of class selecors: %d\n", classSelectorsCount));
        builder.append(String.format("# of tag selectors: %d\n", tagSelectorsCount));
        builder.append("-------------------------------\n");
        builder.append(String.format("# of all selectors: %d\n", allSelectorsCount));
        
        return builder.toString();
    }
}