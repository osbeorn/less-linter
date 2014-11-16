package si.osbeorn.lesslinter.library;
/**
 * 
 * @author Benjamin
 *
 */
public class Warning
{
    private Integer line;
    private Integer positionInLine;
    private String target;
    private String description;
    
    public Warning(int line, int positionInLine, String target, String description)
    {
        this.line = line;
        this.positionInLine = positionInLine;
        this.target = target;
        this.description = description;
    }
    
    public Integer getLine()
    {
        return line;
    }
    
    public void setLine(int line)
    {
        this.line = line;
    }
    
    public Integer getPositionInLine()
    {
        return positionInLine;
    }
    
    public void setPositionInLine(int positionInLine)
    {
        this.positionInLine = positionInLine;
    }
    
    public String getTarget()
    {
        return target;
    }
    
    public void setTarget(String target)
    {
        this.target = target;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    @Override
    public String toString()
    {
        return String.format("[%d:%d]: %s", line, positionInLine, description);
    }
}
