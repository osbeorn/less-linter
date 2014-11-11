// Generated from MyLessLexer.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyLessLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NULL=1, IN=2, UNIT=3, COMBINE_COMPARE=4, ELLIPSIS=5, LPAREN=6, RPAREN=7, 
		LCURLY=8, RCURLY=9, LBRACK=10, RBRACK=11, GT=12, TIL=13, LT=14, COLON=15, 
		SEMI=16, COMMA=17, DOT=18, DOLLAR=19, AT=20, AND=21, HASH=22, COLONCOLON=23, 
		PLUS=24, TIMES=25, DIV=26, MINUS=27, PERC=28, QUOT=29, INTERPOLATION_START=30, 
		EQEQ=31, NOTEQ=32, GTEQ=33, LTEQ=34, ANDW=35, NOTW=36, EQ=37, PIPE_EQ=38, 
		TILD_EQ=39, WHEN=40, IMPORT=41, MEDIA=42, ONLY=43, IMPORTANT=44, IDENT=45, 
		STRING_LITERAL=46, NUMBER=47, WS=48, NL=49, SL_COMMENT=50, ML_COMMENT=51, 
		INTERPOLATION_END=52, INTERPOLATION=53;
	public static final int INTERPOLATION_STARTED = 1;
	public static String[] modeNames = {
		"DEFAULT_MODE", "INTERPOLATION_STARTED"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'null'", "'in'", "UNIT", "COMBINE_COMPARE", "'...'", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "'>'", "'~'", "'<'", "':'", "';'", "','", "'.'", 
		"'$'", "'@'", "'&'", "'#'", "'::'", "'+'", "'*'", "'/'", "'-'", "'%'", 
		"'\"'", "'@{'", "'=='", "'!='", "'>='", "'<='", "'and'", "'not'", "'='", 
		"'|='", "'~='", "'when'", "'@import'", "'@media'", "'only'", "'!important'", 
		"IDENT", "STRING_LITERAL", "NUMBER", "WS", "NL", "SL_COMMENT", "ML_COMMENT", 
		"INTERPOLATION_END", "INTERPOLATION"
	};
	public static final String[] ruleNames = {
		"NULL", "IN", "UNIT", "COMBINE_COMPARE", "ELLIPSIS", "LPAREN", "RPAREN", 
		"LCURLY", "RCURLY", "LBRACK", "RBRACK", "GT", "TIL", "LT", "COLON", "SEMI", 
		"COMMA", "DOT", "DOLLAR", "AT", "AND", "HASH", "COLONCOLON", "PLUS", "TIMES", 
		"DIV", "MINUS", "PERC", "QUOT", "INTERPOLATION_START", "EQEQ", "NOTEQ", 
		"GTEQ", "LTEQ", "ANDW", "NOTW", "EQ", "PIPE_EQ", "TILD_EQ", "WHEN", "IMPORT", 
		"MEDIA", "ONLY", "IMPORTANT", "IDENT", "STRING", "STRING_LITERAL", "NUMBER", 
		"WS", "NL", "SL_COMMENT", "ML_COMMENT", "INTERPOLATION_END", "INTERPOLATION"
	};


	public MyLessLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyLessLexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\67\u0197\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4"+
		"\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4"+
		" \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4"+
		"+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4"+
		"\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4\u009c\n\4\3\5\3\5\3\5\3\5\5\5\u00a2\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3"+
		"#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3"+
		")\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\7.\u0120\n.\f.\16.\u0123\13.\3.\3."+
		"\3.\7.\u0128\n.\f.\16.\u012b\13.\5.\u012d\n.\3/\3/\7/\u0131\n/\f/\16/"+
		"\u0134\13/\3/\3/\3/\7/\u0139\n/\f/\16/\u013c\13/\3/\5/\u013f\n/\3\60\3"+
		"\60\3\61\3\61\7\61\u0145\n\61\f\61\16\61\u0148\13\61\3\61\5\61\u014b\n"+
		"\61\3\61\6\61\u014e\n\61\r\61\16\61\u014f\3\61\7\61\u0153\n\61\f\61\16"+
		"\61\u0156\13\61\3\61\5\61\u0159\n\61\3\61\6\61\u015c\n\61\r\61\16\61\u015d"+
		"\5\61\u0160\n\61\3\62\6\62\u0163\n\62\r\62\16\62\u0164\3\62\3\62\3\63"+
		"\3\63\3\63\6\63\u016c\n\63\r\63\16\63\u016d\3\63\3\63\3\64\3\64\3\64\3"+
		"\64\7\64\u0176\n\64\f\64\16\64\u0179\13\64\3\64\3\64\3\64\5\64\u017e\n"+
		"\64\5\64\u0180\n\64\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u0188\n\65\f\65"+
		"\16\65\u018b\13\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3"+
		"\67\3\u0189\28\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f\30\r\32\16"+
		"\34\17\36\20 \21\"\22$\23&\24(\25*\26,\27.\30\60\31\62\32\64\33\66\34"+
		"8\35:\36<\37> @!B\"D#F$H%J&L\'N(P)R*T+V,X-Z.\\/^\2`\60b\61d\62f\63h\64"+
		"j\65l\66n\67\4\2\3\b\6\2C\\aac|\u0102\0\b\2//\62;C\\aac|\u0102\0\5\2\f"+
		"\f\17\17$$\5\2\f\f\17\17))\4\2\13\13\"\"\4\2\f\f\17\17\u01b8\2\4\3\2\2"+
		"\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3"+
		"\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2"+
		"\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2"+
		"\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2"+
		"\2\2\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2"+
		"\2\2\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2"+
		"\2L\3\2\2\2\2N\3\2\2\2\2P\3\2\2\2\2R\3\2\2\2\2T\3\2\2\2\2V\3\2\2\2\2X"+
		"\3\2\2\2\2Z\3\2\2\2\2\\\3\2\2\2\2`\3\2\2\2\2b\3\2\2\2\2d\3\2\2\2\2f\3"+
		"\2\2\2\2h\3\2\2\2\2j\3\2\2\2\3l\3\2\2\2\3n\3\2\2\2\4p\3\2\2\2\6u\3\2\2"+
		"\2\b\u009b\3\2\2\2\n\u00a1\3\2\2\2\f\u00a3\3\2\2\2\16\u00a7\3\2\2\2\20"+
		"\u00a9\3\2\2\2\22\u00ab\3\2\2\2\24\u00ad\3\2\2\2\26\u00af\3\2\2\2\30\u00b1"+
		"\3\2\2\2\32\u00b3\3\2\2\2\34\u00b5\3\2\2\2\36\u00b7\3\2\2\2 \u00b9\3\2"+
		"\2\2\"\u00bb\3\2\2\2$\u00bd\3\2\2\2&\u00bf\3\2\2\2(\u00c1\3\2\2\2*\u00c3"+
		"\3\2\2\2,\u00c5\3\2\2\2.\u00c7\3\2\2\2\60\u00c9\3\2\2\2\62\u00cc\3\2\2"+
		"\2\64\u00ce\3\2\2\2\66\u00d0\3\2\2\28\u00d2\3\2\2\2:\u00d4\3\2\2\2<\u00d6"+
		"\3\2\2\2>\u00d8\3\2\2\2@\u00dd\3\2\2\2B\u00e0\3\2\2\2D\u00e3\3\2\2\2F"+
		"\u00e6\3\2\2\2H\u00e9\3\2\2\2J\u00ed\3\2\2\2L\u00f1\3\2\2\2N\u00f3\3\2"+
		"\2\2P\u00f6\3\2\2\2R\u00f9\3\2\2\2T\u00fe\3\2\2\2V\u0106\3\2\2\2X\u010d"+
		"\3\2\2\2Z\u0112\3\2\2\2\\\u012c\3\2\2\2^\u013e\3\2\2\2`\u0140\3\2\2\2"+
		"b\u015f\3\2\2\2d\u0162\3\2\2\2f\u016b\3\2\2\2h\u0171\3\2\2\2j\u0183\3"+
		"\2\2\2l\u0191\3\2\2\2n\u0195\3\2\2\2pq\7p\2\2qr\7w\2\2rs\7n\2\2st\7n\2"+
		"\2t\5\3\2\2\2uv\7k\2\2vw\7p\2\2w\7\3\2\2\2x\u009c\7\'\2\2yz\7r\2\2z\u009c"+
		"\7z\2\2{|\7e\2\2|\u009c\7o\2\2}~\7o\2\2~\u009c\7o\2\2\177\u0080\7k\2\2"+
		"\u0080\u009c\7p\2\2\u0081\u0082\7r\2\2\u0082\u009c\7v\2\2\u0083\u0084"+
		"\7r\2\2\u0084\u009c\7e\2\2\u0085\u0086\7g\2\2\u0086\u009c\7o\2\2\u0087"+
		"\u0088\7g\2\2\u0088\u009c\7z\2\2\u0089\u008a\7f\2\2\u008a\u008b\7g\2\2"+
		"\u008b\u009c\7i\2\2\u008c\u008d\7t\2\2\u008d\u008e\7c\2\2\u008e\u009c"+
		"\7f\2\2\u008f\u0090\7i\2\2\u0090\u0091\7t\2\2\u0091\u0092\7c\2\2\u0092"+
		"\u009c\7f\2\2\u0093\u0094\7o\2\2\u0094\u009c\7u\2\2\u0095\u009c\7u\2\2"+
		"\u0096\u0097\7j\2\2\u0097\u009c\7|\2\2\u0098\u0099\7m\2\2\u0099\u009a"+
		"\7j\2\2\u009a\u009c\7|\2\2\u009bx\3\2\2\2\u009by\3\2\2\2\u009b{\3\2\2"+
		"\2\u009b}\3\2\2\2\u009b\177\3\2\2\2\u009b\u0081\3\2\2\2\u009b\u0083\3"+
		"\2\2\2\u009b\u0085\3\2\2\2\u009b\u0087\3\2\2\2\u009b\u0089\3\2\2\2\u009b"+
		"\u008c\3\2\2\2\u009b\u008f\3\2\2\2\u009b\u0093\3\2\2\2\u009b\u0095\3\2"+
		"\2\2\u009b\u0096\3\2\2\2\u009b\u0098\3\2\2\2\u009c\t\3\2\2\2\u009d\u009e"+
		"\7(\2\2\u009e\u00a2\7(\2\2\u009f\u00a0\7~\2\2\u00a0\u00a2\7~\2\2\u00a1"+
		"\u009d\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\13\3\2\2\2\u00a3\u00a4\7\60\2"+
		"\2\u00a4\u00a5\7\60\2\2\u00a5\u00a6\7\60\2\2\u00a6\r\3\2\2\2\u00a7\u00a8"+
		"\7*\2\2\u00a8\17\3\2\2\2\u00a9\u00aa\7+\2\2\u00aa\21\3\2\2\2\u00ab\u00ac"+
		"\7}\2\2\u00ac\23\3\2\2\2\u00ad\u00ae\7\177\2\2\u00ae\25\3\2\2\2\u00af"+
		"\u00b0\7]\2\2\u00b0\27\3\2\2\2\u00b1\u00b2\7_\2\2\u00b2\31\3\2\2\2\u00b3"+
		"\u00b4\7@\2\2\u00b4\33\3\2\2\2\u00b5\u00b6\7\u0080\2\2\u00b6\35\3\2\2"+
		"\2\u00b7\u00b8\7>\2\2\u00b8\37\3\2\2\2\u00b9\u00ba\7<\2\2\u00ba!\3\2\2"+
		"\2\u00bb\u00bc\7=\2\2\u00bc#\3\2\2\2\u00bd\u00be\7.\2\2\u00be%\3\2\2\2"+
		"\u00bf\u00c0\7\60\2\2\u00c0\'\3\2\2\2\u00c1\u00c2\7&\2\2\u00c2)\3\2\2"+
		"\2\u00c3\u00c4\7B\2\2\u00c4+\3\2\2\2\u00c5\u00c6\7(\2\2\u00c6-\3\2\2\2"+
		"\u00c7\u00c8\7%\2\2\u00c8/\3\2\2\2\u00c9\u00ca\7<\2\2\u00ca\u00cb\7<\2"+
		"\2\u00cb\61\3\2\2\2\u00cc\u00cd\7-\2\2\u00cd\63\3\2\2\2\u00ce\u00cf\7"+
		",\2\2\u00cf\65\3\2\2\2\u00d0\u00d1\7\61\2\2\u00d1\67\3\2\2\2\u00d2\u00d3"+
		"\7/\2\2\u00d39\3\2\2\2\u00d4\u00d5\7\'\2\2\u00d5;\3\2\2\2\u00d6\u00d7"+
		"\7$\2\2\u00d7=\3\2\2\2\u00d8\u00d9\7B\2\2\u00d9\u00da\7}\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\u00dc\b\37\2\2\u00dc?\3\2\2\2\u00dd\u00de\7?\2\2\u00de"+
		"\u00df\7?\2\2\u00dfA\3\2\2\2\u00e0\u00e1\7#\2\2\u00e1\u00e2\7?\2\2\u00e2"+
		"C\3\2\2\2\u00e3\u00e4\7@\2\2\u00e4\u00e5\7?\2\2\u00e5E\3\2\2\2\u00e6\u00e7"+
		"\7>\2\2\u00e7\u00e8\7?\2\2\u00e8G\3\2\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb"+
		"\7p\2\2\u00eb\u00ec\7f\2\2\u00ecI\3\2\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef"+
		"\7q\2\2\u00ef\u00f0\7v\2\2\u00f0K\3\2\2\2\u00f1\u00f2\7?\2\2\u00f2M\3"+
		"\2\2\2\u00f3\u00f4\7~\2\2\u00f4\u00f5\7?\2\2\u00f5O\3\2\2\2\u00f6\u00f7"+
		"\7\u0080\2\2\u00f7\u00f8\7?\2\2\u00f8Q\3\2\2\2\u00f9\u00fa\7y\2\2\u00fa"+
		"\u00fb\7j\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7p\2\2\u00fdS\3\2\2\2\u00fe"+
		"\u00ff\7B\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7o\2\2\u0101\u0102\7r\2\2"+
		"\u0102\u0103\7q\2\2\u0103\u0104\7t\2\2\u0104\u0105\7v\2\2\u0105U\3\2\2"+
		"\2\u0106\u0107\7B\2\2\u0107\u0108\7o\2\2\u0108\u0109\7g\2\2\u0109\u010a"+
		"\7f\2\2\u010a\u010b\7k\2\2\u010b\u010c\7c\2\2\u010cW\3\2\2\2\u010d\u010e"+
		"\7q\2\2\u010e\u010f\7p\2\2\u010f\u0110\7n\2\2\u0110\u0111\7{\2\2\u0111"+
		"Y\3\2\2\2\u0112\u0113\7#\2\2\u0113\u0114\7k\2\2\u0114\u0115\7o\2\2\u0115"+
		"\u0116\7r\2\2\u0116\u0117\7q\2\2\u0117\u0118\7t\2\2\u0118\u0119\7v\2\2"+
		"\u0119\u011a\7c\2\2\u011a\u011b\7p\2\2\u011b\u011c\7v\2\2\u011c[\3\2\2"+
		"\2\u011d\u0121\t\2\2\2\u011e\u0120\t\3\2\2\u011f\u011e\3\2\2\2\u0120\u0123"+
		"\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u012d\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0124\u0125\7/\2\2\u0125\u0129\t\2\2\2\u0126\u0128\t\3"+
		"\2\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u011d\3\2"+
		"\2\2\u012c\u0124\3\2\2\2\u012d]\3\2\2\2\u012e\u0132\7$\2\2\u012f\u0131"+
		"\n\4\2\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u013f\7$"+
		"\2\2\u0136\u013a\7)\2\2\u0137\u0139\n\5\2\2\u0138\u0137\3\2\2\2\u0139"+
		"\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2"+
		"\2\2\u013c\u013a\3\2\2\2\u013d\u013f\7)\2\2\u013e\u012e\3\2\2\2\u013e"+
		"\u0136\3\2\2\2\u013f_\3\2\2\2\u0140\u0141\5^/\2\u0141a\3\2\2\2\u0142\u014a"+
		"\7/\2\2\u0143\u0145\4\62;\2\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146"+
		"\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u0146\3\2"+
		"\2\2\u0149\u014b\7\60\2\2\u014a\u0146\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u014d\3\2\2\2\u014c\u014e\4\62;\2\u014d\u014c\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0160\3\2\2\2\u0151"+
		"\u0153\4\62;\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2"+
		"\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157"+
		"\u0159\7\60\2\2\u0158\u0154\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\3"+
		"\2\2\2\u015a\u015c\4\62;\2\u015b\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u0142\3\2"+
		"\2\2\u015f\u0158\3\2\2\2\u0160c\3\2\2\2\u0161\u0163\t\6\2\2\u0162\u0161"+
		"\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0167\b\62\3\2\u0167e\3\2\2\2\u0168\u016c\t\7\2\2"+
		"\u0169\u016a\7\17\2\2\u016a\u016c\7\f\2\2\u016b\u0168\3\2\2\2\u016b\u0169"+
		"\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0170\b\63\3\2\u0170g\3\2\2\2\u0171\u0172\7\61\2"+
		"\2\u0172\u0173\7\61\2\2\u0173\u0177\3\2\2\2\u0174\u0176\n\7\2\2\u0175"+
		"\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2"+
		"\2\2\u0178\u017f\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u0180\7\f\2\2\u017b"+
		"\u017d\7\17\2\2\u017c\u017e\7\f\2\2\u017d\u017c\3\2\2\2\u017d\u017e\3"+
		"\2\2\2\u017e\u0180\3\2\2\2\u017f\u017a\3\2\2\2\u017f\u017b\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0182\b\64\4\2\u0182i\3\2\2\2\u0183\u0184\7\61\2"+
		"\2\u0184\u0185\7,\2\2\u0185\u0189\3\2\2\2\u0186\u0188\13\2\2\2\u0187\u0186"+
		"\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u018a\3\2\2\2\u0189\u0187\3\2\2\2\u018a"+
		"\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018d\7,\2\2\u018d\u018e\7\61"+
		"\2\2\u018e\u018f\3\2\2\2\u018f\u0190\b\65\4\2\u0190k\3\2\2\2\u0191\u0192"+
		"\5\24\n\2\u0192\u0193\3\2\2\2\u0193\u0194\b\66\5\2\u0194m\3\2\2\2\u0195"+
		"\u0196\5\\.\2\u0196o\3\2\2\2\32\2\3\u009b\u00a1\u0121\u0129\u012c\u0132"+
		"\u013a\u013e\u0146\u014a\u014f\u0154\u0158\u015d\u015f\u0164\u016b\u016d"+
		"\u0177\u017d\u017f\u0189\6\7\3\2\2\3\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}