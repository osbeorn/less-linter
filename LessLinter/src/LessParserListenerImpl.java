import java.util.List;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class LessParserListenerImpl extends LessParserBaseListener
{
    private CommonTokenStream tokens;
    
    public LessParserListenerImpl(CommonTokenStream tokens)
    {
        this.tokens = tokens;
    }
    
	@Override
	public void enterSelector(LessParser.SelectorContext ctx) {
		super.enterSelector(ctx);
		
		// check if selectors use all lowercase letters
		if (!GeneralHelper.IsLowerCase(ctx.getText()))
		{
		    System.out.println(GeneralHelper.GetWarningString(ctx.getStart(), ctx.getText(), "Ni lowercase"));
		}
	}
	
	@Override
	public void enterProperty(LessParser.PropertyContext ctx) {
		super.enterProperty(ctx);
		
		// check if selectors use all lowercase letters
		if (!GeneralHelper.IsLowerCase(ctx.getText()))
		{
			System.out.println(GeneralHelper.GetWarningString(ctx.getStart(), ctx.getText(), "Ni lowercase"));
		}
	}
	
	@Override
	public void enterBlock(LessParser.BlockContext ctx)
	{
	    super.enterBlock(ctx);
	    
	    // check if selectors use all lowercase letters
        //if (!GeneralHelper.IsLowerCase(ctx.getText()))
        //{
	    
	    int blockStart = ctx.getStart().getTokenIndex();
        List<Token> leftTokens = tokens.getHiddenTokensToLeft(blockStart);
        
        if (leftTokens.size() > 0)
        {
            Token white = leftTokens.get(0);
            if (white.getType() == LessParser.WS)
            {
                String text = white.getText();
                if (text.length() != 1)
                    System.out.println(GeneralHelper.GetWarningString(ctx.getStart(), ctx.getText(), "Ni toèno enega presledka pred zavitim oklepajem"));
            }
        }
	}
}