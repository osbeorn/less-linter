package si.osbeorn.lesslinter.library;
import java.util.Comparator;

/**
 * 
 * @author Benjamin
 *
 */
public class WarningOrderComparator implements Comparator<Warning>
{
    @Override
    public int compare(Warning w1, Warning w2)
    {
        int c = w1.getLine().compareTo(w2.getLine());
        if (c == 0)
            c = w1.getPositionInLine().compareTo(w2.getPositionInLine());
        
        return c;
    }
   
}
