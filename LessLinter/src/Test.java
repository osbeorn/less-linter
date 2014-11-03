import java.io.File;
import java.io.FileReader;
import java.util.BitSet;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.misc.Nullable;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * 
 * @author Benjamin
 *
 */
public class Test
{
	public static void main(String[] args)
	{
		try
		{		    
			// read the test file ...
			File file = new File("E:\\Development\\Eclipse\\FRICeltraChallenge_2014\\project\\LessLinter\\test\\grid.less");
			FileReader reader = new FileReader(file);
		
			// create an ANTLRInputStream
			ANTLRInputStream source = new ANTLRInputStream(reader);
			
			// lex it
			LessLexer lexer = new LessLexer(source);
		    //BufferedTokenStream stream = new BufferedTokenStream(lexer);
		    CommonTokenStream stream = new CommonTokenStream(lexer, Token.DEFAULT_CHANNEL);
			//lexer.addErrorListener(new FailOnErrorListener());
		    
		    System.out.println(stream.getText());
		    System.out.println();
		    System.out.println();
		    
		    for (int i = 0; i < stream.size(); i++) {
		    	System.out.println("Type: " + stream.get(i).getType() + ", Channel: " + stream.get(i).getChannel() + " " + stream.get(i).getText());
		    }
		    stream.seek(0);
		    
		    LessParser par = new LessParser(stream);
	      	par.getInterpreter().setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);

		    par.addErrorListener(new FailOnErrorListener());
		    
		    LessParser.StylesheetContext stylesheet = par.stylesheet();
		    
		    System.out.println();
		    System.out.println();
		    
		    System.out.println("Listening and visiting:");
		    
		    ParseTreeWalker walker = new ParseTreeWalker();
		    LessParserListenerImpl listener = new LessParserListenerImpl(stream);
		    walker.walk(listener, stylesheet);
		    		
		    LessParserVisitorImpl visitor = new LessParserVisitorImpl(stream);
		    visitor.visit(stylesheet);
		    
		    System.out.println("bla");
		    //  return par.stylesheet();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class FailOnErrorListener implements ANTLRErrorListener
{
	
    @Override
    public void syntaxError(@NotNull Recognizer<?, ?> recognizer,
                            @Nullable Object o,
                            int i,
                            int i2,
                            @NotNull String s,
                            @Nullable RecognitionException e)
    {
        String sourceName = recognizer.getInputStream().getSourceName();
        if (!sourceName.isEmpty()) {
            sourceName = String.format("%s:%d:%d: ", sourceName, i, i2);
        }

        System.err.println(sourceName+"line "+i+":"+i2+" "+s + ", " + o.toString());
	  
        System.err.println("Syntax error in detection.");
    }

    @Override
    public void reportAmbiguity(@NotNull Parser parser,
                                @NotNull DFA dfa,
                                int i,
                                int i2,
                                boolean b,
                                @Nullable BitSet bitSet,
                                @NotNull ATNConfigSet atnConfigs)
    {
        System.err.println("line "+i+":"+i2);
        System.err.println("Ambiguity error in detection.");
    }

    @Override
    public void reportAttemptingFullContext(@NotNull Parser parser,
                                            @NotNull DFA dfa,
                                            int i,
                                            int i2,
                                            @Nullable BitSet bitSet,
                                            @NotNull ATNConfigSet atnConfigs)
    {
        System.err.println("line "+i+":"+i2);
        System.err.println("Attempting full context error in detection.");
    }

    @Override
    public void reportContextSensitivity(@NotNull Parser parser,
                                         @NotNull DFA dfa,
                                         int i,
                                         int i2,
                                         int i3,
                                         @NotNull ATNConfigSet atnConfigs)
    {
        System.err.println("line "+i+":"+i2);
        System.err.println("Context sensitivity error in detection.");
    }
}