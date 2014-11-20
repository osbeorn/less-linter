package si.osbeorn.lesslinter.main;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;

import javax.swing.JDialog;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import si.osbeorn.lesslinter.antlr.LessLexer;
import si.osbeorn.lesslinter.antlr.LessParser;
import si.osbeorn.lesslinter.antlr.LessParser.StylesheetContext;
import si.osbeorn.lesslinter.antlr.LessParserErrorListenerImpl;
import si.osbeorn.lesslinter.antlr.LessParserListenerImpl;
import si.osbeorn.lesslinter.helpers.ConfigHelper;
import si.osbeorn.lesslinter.helpers.CountHelper;
import si.osbeorn.lesslinter.helpers.FormattingHelper;
import si.osbeorn.lesslinter.library.ConfigParams;

/**
 * 
 * @author Benjamin
 *
 */
public class Main
{
    /**
     * Main entry point for the application.
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args)
    {
        //testRun();
        performAnalysis(args);
    }
    
    /**
     * Performs an analysis of the provided LESS files.
     * 
     * @param args Command line arguments
     */
    public static void performAnalysis(String[] args)
    {
        try
        {
            Map<String, Object> config = ConfigHelper.parseArgs(args);
            if (config == null)
            {
                throw new Exception("No input source defined (raw string or file).");
            }
            
            ANTLRInputStream source;
            if (config.containsKey(ConfigParams.RAW_INPUT))
            {
                String rawInput = (String) config.get(ConfigParams.RAW_INPUT);
                source = new ANTLRInputStream(rawInput);
            }
            else if (config.containsKey(ConfigParams.FILE_INPUT))
            {
                String filePath = (String) config.get(ConfigParams.FILE_INPUT);
                File file = new File(filePath);
                FileReader reader = new FileReader(file);
                source = new ANTLRInputStream(reader);
            }
            else
            {
                throw new Exception("No input source defined (raw string or file).");
            }
            
            // lexer initialization
            LessLexer lexer = new LessLexer(source);
            
            // token stream
            CommonTokenStream tokenStream = new CommonTokenStream(lexer, Token.DEFAULT_CHANNEL);
            
            // parser initialization
            LessParser parser = new LessParser(tokenStream);
            parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
            parser.setBuildParseTree(true);
            
            // get the root context
            StylesheetContext stylesheet = parser.stylesheet();
            
            // traverse the parser tree and check the formatting
            ParseTreeWalker walker = new ParseTreeWalker();
            
            FormattingHelper formattingHelper = new FormattingHelper(tokenStream);
            CountHelper countHelper = new CountHelper();
            
            LessParserListenerImpl listener =
                new LessParserListenerImpl(formattingHelper, countHelper, config);
            walker.walk(listener, stylesheet);
            
            // output results (if necessary)
            if (ConfigParams.containsFormattingParams(config))
                System.out.print(formattingHelper.getWarnings());
            
            if (ConfigParams.containsCountingParams(config))
                System.out.print(countHelper.getCountReport());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    /**
     * For development and testing purposes only 
     */
    public static void testRun()
    {
        try
        {           
            // read the test file ...
            File file = new File("E:\\Development\\Eclipse\\FRICeltraChallenge_2014\\project\\LessLinter\\test\\test.less");
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
            
            Map<String, Object> config = new HashMap<String, Object>();
            config.put(ConfigParams.ALL_PARAMS, null);
            
            LessParserListenerImpl listener =
                new LessParserListenerImpl(formattingHelper, countHelper, config);
            walker.walk(listener, stylesheet);
            
            System.out.println(formattingHelper.getWarnings());
            System.out.println();
            System.out.println(countHelper.getCountReport());
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.exit(1);
        }
    }
}