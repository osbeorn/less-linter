package si.osbeorn.lesslinter.antlr;

import java.util.BitSet;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.misc.Nullable;

/**
 * 
 * @author Benjamin
 *
 */
public class LessParserErrorListenerImpl implements ANTLRErrorListener
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
        //if (!sourceName.isEmpty()) {
        //    sourceName = String.format("%s:%d:%d: ", sourceName, i, i2);
        //}

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
        Token tok = parser.getCurrentToken();
        System.err.println("line "+ tok.getLine() +":"+ tok.getCharPositionInLine() + " --> " + tok.getText());
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