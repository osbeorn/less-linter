package si.fri.celtra.lesslinter.main;

import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.BitSet;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.misc.Nullable;
import org.antlr.v4.runtime.tree.gui.TreeViewer;

import si.fri.celtra.lesslinter.antlr.LessLexer;
import si.fri.celtra.lesslinter.antlr.LessParser;
import si.fri.celtra.lesslinter.antlr.LessParser.StylesheetContext;

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
		    TokenStream stream = new BufferedTokenStream(lexer);
		    //lexer.addErrorListener(new FailOnErrorListener());
		    
		    System.out.println(stream.getText());
		    for (int i = 0; i < stream.size(); i++) {
		    	System.out.println(stream.get(i).getText());
		    }
		    stream.seek(0);
		    
		    LessParser par = new LessParser(stream);
	      	par.getInterpreter().setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);

		    par.addErrorListener(new FailOnErrorListener());
		    
		    StylesheetContext stylesheet = par.stylesheet();
		    
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