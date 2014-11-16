package si.osbeorn.lesslinter.main;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileReader;
import java.util.concurrent.Future;

import javax.swing.JDialog;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import si.osbeorn.lesslint.antlr.LessLexer;
import si.osbeorn.lesslint.antlr.LessParser;
import si.osbeorn.lesslint.antlr.LessParserErrorListenerImpl;
import si.osbeorn.lesslint.antlr.LessParserListenerImpl;
import si.osbeorn.lesslint.helpers.CountHelper;
import si.osbeorn.lesslint.helpers.FormattingHelper;

public class Main
{

    public static void main(String[] args)
    {
        try
        {           
            // read the test file ...
            File file = new File("E:\\Development\\Eclipse\\FRICeltraChallenge_2014\\project\\MyLessLinter\\test\\test.less");
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
                System.out.println("Type: " + stream.get(i).getType() + ", Channel: " + stream.get(i).getChannel() + " --> " + stream.get(i).getText());
            }
            stream.seek(0);
            
            LessParser par = new LessParser(stream);
            par.getInterpreter().setPredictionMode(PredictionMode.SLL);
            par.setBuildParseTree(true);

            par.addErrorListener(new LessParserErrorListenerImpl());
            
            LessParser.StylesheetContext stylesheet = par.stylesheet();
            
            Future<JDialog> dialog = stylesheet.inspect(par); // show in gui
            
            Toolkit kit = Toolkit.getDefaultToolkit();
            Dimension screenSize = kit.getScreenSize();
            int screenHeight = screenSize.height;
            int screenWidth = screenSize.width;

            dialog.get().setSize(screenWidth, screenHeight);
            dialog.get().setLocationRelativeTo(null);
            
            System.out.println();
            System.out.println();
            
            System.out.println("Listening and visiting:");
            
            ParseTreeWalker walker = new ParseTreeWalker();
            FormattingHelper formattingHelper = new FormattingHelper(stream);
            CountHelper countHelper = new CountHelper();
            LessParserListenerImpl listener = new LessParserListenerImpl(stream, formattingHelper, countHelper);
            walker.walk(listener, stylesheet);
            
            System.out.println(formattingHelper.getWarnings());
            System.out.println();
            System.out.println(countHelper.getCountReport());
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}