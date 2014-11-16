package si.osbeorn.lesslint.helpers;
import si.osbeorn.lesslint.antlr.LessParser.ElementContext;
import si.osbeorn.lesslint.antlr.LessParser.SelectorContext;

/**
 * @author Benjamin
 *
 */
public class CountHelper
{
    private int allSelectorsCount;
    private int uniSelectorsCount;
    private int idSelectorsCount;
    private int classSelectorsCount;
    private int tagSelectorsCount;
    
    public void countSelectors(SelectorContext ctx)
    {
        ElementContext elementCtx = ctx.element();
        if (elementCtx == null)
            return;
        
        if (elementCtx.AND() != null)
            return;
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
    
    public String getCountReport()
    {
        StringBuilder builder = new StringBuilder();
        
        builder.append("Selectors count report:\n");
        builder.append(String.format("# of universal selectors: %d\n", uniSelectorsCount));
        builder.append(String.format("# of ID selectors: %d\n", idSelectorsCount));
        builder.append(String.format("# of class selecors: %d\n", classSelectorsCount));
        builder.append(String.format("# of tag selectors: %d\n", tagSelectorsCount));
        builder.append("-------------------------------\n");
        builder.append(String.format("# of all selectors: %d\n", allSelectorsCount));
        
        return builder.toString();
    }
}