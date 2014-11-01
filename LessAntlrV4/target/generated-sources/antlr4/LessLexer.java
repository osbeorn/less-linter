// Generated from LessLexer.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LessLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NULL=1, IN=2, Unit=3, COMBINE_COMPARE=4, Ellipsis=5, InterpolationStart=6, 
		LPAREN=7, RPAREN=8, BlockStart=9, BlockEnd=10, LBRACK=11, RBRACK=12, GT=13, 
		TIL=14, LT=15, COLON=16, SEMI=17, COMMA=18, DOT=19, DOLLAR=20, AT=21, 
		AND=22, HASH=23, COLONCOLON=24, PLUS=25, TIMES=26, DIV=27, MINUS=28, PERC=29, 
		UrlStart=30, EQEQ=31, NOTEQ=32, EQ=33, PIPE_EQ=34, TILD_EQ=35, WHEN=36, 
		IMPORT=37, FONTFACE=38, Identifier=39, StringLiteral=40, Number=41, Color=42, 
		WS=43, SL_COMMENT=44, COMMENT=45, UrlEnd=46, Url=47, SPACE=48, InterpolationStartAfter=49, 
		IdentifierAfter=50;
	public static final int URL_STARTED = 1;
	public static final int IDENTIFY = 2;
	public static String[] modeNames = {
		"DEFAULT_MODE", "URL_STARTED", "IDENTIFY"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'", 
		"'2'"
	};
	public static final String[] ruleNames = {
		"NULL", "IN", "Unit", "COMBINE_COMPARE", "Ellipsis", "InterpolationStart", 
		"LPAREN", "RPAREN", "BlockStart", "BlockEnd", "LBRACK", "RBRACK", "GT", 
		"TIL", "LT", "COLON", "SEMI", "COMMA", "DOT", "DOLLAR", "AT", "AND", "HASH", 
		"COLONCOLON", "PLUS", "TIMES", "DIV", "MINUS", "PERC", "UrlStart", "EQEQ", 
		"NOTEQ", "EQ", "PIPE_EQ", "TILD_EQ", "WHEN", "IMPORT", "FONTFACE", "Identifier", 
		"STRING", "StringLiteral", "Number", "Color", "WS", "SL_COMMENT", "COMMENT", 
		"UrlEnd", "Url", "SPACE", "DOLLAR_ID", "InterpolationStartAfter", "InterpolationEnd_ID", 
		"IdentifierAfter", "Ellipsis_ID", "DOT_ID", "LPAREN_ID", "RPAREN_ID", 
		"COLON_ID", "COMMA_ID", "SEMI_ID"
	};


	public LessLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LessLexer.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\64\u01cb\b\1\b\1"+
		"\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4"+
		"\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t"+
		"\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t"+
		"\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t"+
		"\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4"+
		"*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;"+
		"\4<\t<\4=\t=\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00a9\n\4\3\5\3\5\3\5"+
		"\3\5\5\5\u00af\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3#"+
		"\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\7(\u0119\n(\f(\16(\u011c\13(\3(\3("+
		"\3(\7(\u0121\n(\f(\16(\u0124\13(\5(\u0126\n(\3(\3(\3)\3)\7)\u012c\n)\f"+
		")\16)\u012f\13)\3)\3)\3)\7)\u0134\n)\f)\16)\u0137\13)\3)\5)\u013a\n)\3"+
		"*\3*\3+\3+\7+\u0140\n+\f+\16+\u0143\13+\3+\5+\u0146\n+\3+\6+\u0149\n+"+
		"\r+\16+\u014a\3+\7+\u014e\n+\f+\16+\u0151\13+\3+\5+\u0154\n+\3+\6+\u0157"+
		"\n+\r+\16+\u0158\5+\u015b\n+\3,\3,\6,\u015f\n,\r,\16,\u0160\3-\3-\3-\6"+
		"-\u0166\n-\r-\16-\u0167\3-\3-\3.\3.\3.\3.\7.\u0170\n.\f.\16.\u0173\13"+
		".\3.\3.\3.\5.\u0178\n.\5.\u017a\n.\3.\3.\3/\3/\3/\3/\7/\u0182\n/\f/\16"+
		"/\u0185\13/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\6\61\u0192\n"+
		"\61\r\61\16\61\u0193\5\61\u0196\n\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3\67"+
		"\3\67\38\38\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3"+
		"<\3<\3<\3<\3=\3=\3=\3=\3=\3\u0183\2>\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23"+
		"\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30"+
		"\61\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S\2U*W+Y,[-"+
		"]._/a\60c\61e\62g\2i\63k\2m\64o\2q\2s\2u\2w\2y\2{\2\5\2\3\4\n\6\2C\\a"+
		"ac|\u0102\0\b\2//\62;C\\aac|\u0102\0\5\2\f\f\17\17$$\5\2\f\f\17\17))\5"+
		"\2\62;CHch\5\2\13\f\17\17\"\"\4\2\f\f\17\17\6\2\f\f\17\17++==\u01ed\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\3c\3\2\2\2\4e\3\2\2"+
		"\2\4g\3\2\2\2\4i\3\2\2\2\4k\3\2\2\2\4m\3\2\2\2\4o\3\2\2\2\4q\3\2\2\2\4"+
		"s\3\2\2\2\4u\3\2\2\2\4w\3\2\2\2\4y\3\2\2\2\4{\3\2\2\2\5}\3\2\2\2\7\u0082"+
		"\3\2\2\2\t\u00a8\3\2\2\2\13\u00ae\3\2\2\2\r\u00b0\3\2\2\2\17\u00b4\3\2"+
		"\2\2\21\u00b9\3\2\2\2\23\u00bb\3\2\2\2\25\u00bd\3\2\2\2\27\u00bf\3\2\2"+
		"\2\31\u00c1\3\2\2\2\33\u00c3\3\2\2\2\35\u00c5\3\2\2\2\37\u00c7\3\2\2\2"+
		"!\u00c9\3\2\2\2#\u00cb\3\2\2\2%\u00cd\3\2\2\2\'\u00cf\3\2\2\2)\u00d1\3"+
		"\2\2\2+\u00d3\3\2\2\2-\u00d5\3\2\2\2/\u00d7\3\2\2\2\61\u00d9\3\2\2\2\63"+
		"\u00db\3\2\2\2\65\u00de\3\2\2\2\67\u00e0\3\2\2\29\u00e2\3\2\2\2;\u00e4"+
		"\3\2\2\2=\u00e6\3\2\2\2?\u00e8\3\2\2\2A\u00f0\3\2\2\2C\u00f3\3\2\2\2E"+
		"\u00f6\3\2\2\2G\u00f8\3\2\2\2I\u00fb\3\2\2\2K\u00fe\3\2\2\2M\u0103\3\2"+
		"\2\2O\u010b\3\2\2\2Q\u0125\3\2\2\2S\u0139\3\2\2\2U\u013b\3\2\2\2W\u015a"+
		"\3\2\2\2Y\u015c\3\2\2\2[\u0165\3\2\2\2]\u016b\3\2\2\2_\u017d\3\2\2\2a"+
		"\u018b\3\2\2\2c\u0195\3\2\2\2e\u0197\3\2\2\2g\u019c\3\2\2\2i\u01a0\3\2"+
		"\2\2k\u01a2\3\2\2\2m\u01a6\3\2\2\2o\u01a8\3\2\2\2q\u01ad\3\2\2\2s\u01b2"+
		"\3\2\2\2u\u01b7\3\2\2\2w\u01bc\3\2\2\2y\u01c1\3\2\2\2{\u01c6\3\2\2\2}"+
		"~\7p\2\2~\177\7w\2\2\177\u0080\7n\2\2\u0080\u0081\7n\2\2\u0081\6\3\2\2"+
		"\2\u0082\u0083\7k\2\2\u0083\u0084\7p\2\2\u0084\b\3\2\2\2\u0085\u00a9\7"+
		"\'\2\2\u0086\u0087\7r\2\2\u0087\u00a9\7z\2\2\u0088\u0089\7e\2\2\u0089"+
		"\u00a9\7o\2\2\u008a\u008b\7o\2\2\u008b\u00a9\7o\2\2\u008c\u008d\7k\2\2"+
		"\u008d\u00a9\7p\2\2\u008e\u008f\7r\2\2\u008f\u00a9\7v\2\2\u0090\u0091"+
		"\7r\2\2\u0091\u00a9\7e\2\2\u0092\u0093\7g\2\2\u0093\u00a9\7o\2\2\u0094"+
		"\u0095\7g\2\2\u0095\u00a9\7z\2\2\u0096\u0097\7f\2\2\u0097\u0098\7g\2\2"+
		"\u0098\u00a9\7i\2\2\u0099\u009a\7t\2\2\u009a\u009b\7c\2\2\u009b\u00a9"+
		"\7f\2\2\u009c\u009d\7i\2\2\u009d\u009e\7t\2\2\u009e\u009f\7c\2\2\u009f"+
		"\u00a9\7f\2\2\u00a0\u00a1\7o\2\2\u00a1\u00a9\7u\2\2\u00a2\u00a9\7u\2\2"+
		"\u00a3\u00a4\7j\2\2\u00a4\u00a9\7|\2\2\u00a5\u00a6\7m\2\2\u00a6\u00a7"+
		"\7j\2\2\u00a7\u00a9\7|\2\2\u00a8\u0085\3\2\2\2\u00a8\u0086\3\2\2\2\u00a8"+
		"\u0088\3\2\2\2\u00a8\u008a\3\2\2\2\u00a8\u008c\3\2\2\2\u00a8\u008e\3\2"+
		"\2\2\u00a8\u0090\3\2\2\2\u00a8\u0092\3\2\2\2\u00a8\u0094\3\2\2\2\u00a8"+
		"\u0096\3\2\2\2\u00a8\u0099\3\2\2\2\u00a8\u009c\3\2\2\2\u00a8\u00a0\3\2"+
		"\2\2\u00a8\u00a2\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a9"+
		"\n\3\2\2\2\u00aa\u00ab\7(\2\2\u00ab\u00af\7(\2\2\u00ac\u00ad\7~\2\2\u00ad"+
		"\u00af\7~\2\2\u00ae\u00aa\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\f\3\2\2\2"+
		"\u00b0\u00b1\7\60\2\2\u00b1\u00b2\7\60\2\2\u00b2\u00b3\7\60\2\2\u00b3"+
		"\16\3\2\2\2\u00b4\u00b5\5\61\30\2\u00b5\u00b6\5\25\n\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b8\b\7\2\2\u00b8\20\3\2\2\2\u00b9\u00ba\7*\2\2\u00ba\22"+
		"\3\2\2\2\u00bb\u00bc\7+\2\2\u00bc\24\3\2\2\2\u00bd\u00be\7}\2\2\u00be"+
		"\26\3\2\2\2\u00bf\u00c0\7\177\2\2\u00c0\30\3\2\2\2\u00c1\u00c2\7]\2\2"+
		"\u00c2\32\3\2\2\2\u00c3\u00c4\7_\2\2\u00c4\34\3\2\2\2\u00c5\u00c6\7@\2"+
		"\2\u00c6\36\3\2\2\2\u00c7\u00c8\7\u0080\2\2\u00c8 \3\2\2\2\u00c9\u00ca"+
		"\7>\2\2\u00ca\"\3\2\2\2\u00cb\u00cc\7<\2\2\u00cc$\3\2\2\2\u00cd\u00ce"+
		"\7=\2\2\u00ce&\3\2\2\2\u00cf\u00d0\7.\2\2\u00d0(\3\2\2\2\u00d1\u00d2\7"+
		"\60\2\2\u00d2*\3\2\2\2\u00d3\u00d4\7&\2\2\u00d4,\3\2\2\2\u00d5\u00d6\7"+
		"B\2\2\u00d6.\3\2\2\2\u00d7\u00d8\7(\2\2\u00d8\60\3\2\2\2\u00d9\u00da\7"+
		"%\2\2\u00da\62\3\2\2\2\u00db\u00dc\7<\2\2\u00dc\u00dd\7<\2\2\u00dd\64"+
		"\3\2\2\2\u00de\u00df\7-\2\2\u00df\66\3\2\2\2\u00e0\u00e1\7,\2\2\u00e1"+
		"8\3\2\2\2\u00e2\u00e3\7\61\2\2\u00e3:\3\2\2\2\u00e4\u00e5\7/\2\2\u00e5"+
		"<\3\2\2\2\u00e6\u00e7\7\'\2\2\u00e7>\3\2\2\2\u00e8\u00e9\7w\2\2\u00e9"+
		"\u00ea\7t\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\5\21"+
		"\b\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\b\37\3\2\u00ef@\3\2\2\2\u00f0\u00f1"+
		"\7?\2\2\u00f1\u00f2\7?\2\2\u00f2B\3\2\2\2\u00f3\u00f4\7#\2\2\u00f4\u00f5"+
		"\7?\2\2\u00f5D\3\2\2\2\u00f6\u00f7\7?\2\2\u00f7F\3\2\2\2\u00f8\u00f9\7"+
		"~\2\2\u00f9\u00fa\7?\2\2\u00faH\3\2\2\2\u00fb\u00fc\7\u0080\2\2\u00fc"+
		"\u00fd\7?\2\2\u00fdJ\3\2\2\2\u00fe\u00ff\7y\2\2\u00ff\u0100\7j\2\2\u0100"+
		"\u0101\7g\2\2\u0101\u0102\7p\2\2\u0102L\3\2\2\2\u0103\u0104\7B\2\2\u0104"+
		"\u0105\7k\2\2\u0105\u0106\7o\2\2\u0106\u0107\7r\2\2\u0107\u0108\7q\2\2"+
		"\u0108\u0109\7t\2\2\u0109\u010a\7v\2\2\u010aN\3\2\2\2\u010b\u010c\7B\2"+
		"\2\u010c\u010d\7h\2\2\u010d\u010e\7q\2\2\u010e\u010f\7p\2\2\u010f\u0110"+
		"\7v\2\2\u0110\u0111\7/\2\2\u0111\u0112\7h\2\2\u0112\u0113\7c\2\2\u0113"+
		"\u0114\7e\2\2\u0114\u0115\7g\2\2\u0115P\3\2\2\2\u0116\u011a\t\2\2\2\u0117"+
		"\u0119\t\3\2\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2"+
		"\2\2\u011a\u011b\3\2\2\2\u011b\u0126\3\2\2\2\u011c\u011a\3\2\2\2\u011d"+
		"\u011e\7/\2\2\u011e\u0122\t\2\2\2\u011f\u0121\t\3\2\2\u0120\u011f\3\2"+
		"\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0116\3\2\2\2\u0125\u011d\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\u0128\b(\2\2\u0128R\3\2\2\2\u0129\u012d"+
		"\7$\2\2\u012a\u012c\n\4\2\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u012d\3\2"+
		"\2\2\u0130\u013a\7$\2\2\u0131\u0135\7)\2\2\u0132\u0134\n\5\2\2\u0133\u0132"+
		"\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013a\7)\2\2\u0139\u0129\3\2"+
		"\2\2\u0139\u0131\3\2\2\2\u013aT\3\2\2\2\u013b\u013c\5S)\2\u013cV\3\2\2"+
		"\2\u013d\u0145\7/\2\2\u013e\u0140\4\62;\2\u013f\u013e\3\2\2\2\u0140\u0143"+
		"\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0144\u0146\7\60\2\2\u0145\u0141\3\2\2\2\u0145\u0146\3"+
		"\2\2\2\u0146\u0148\3\2\2\2\u0147\u0149\4\62;\2\u0148\u0147\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u015b\3\2"+
		"\2\2\u014c\u014e\4\62;\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2"+
		"\2\2\u0152\u0154\7\60\2\2\u0153\u014f\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u0156\3\2\2\2\u0155\u0157\4\62;\2\u0156\u0155\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\3\2\2\2\u015a"+
		"\u013d\3\2\2\2\u015a\u0153\3\2\2\2\u015bX\3\2\2\2\u015c\u015e\7%\2\2\u015d"+
		"\u015f\t\6\2\2\u015e\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u015e\3\2"+
		"\2\2\u0160\u0161\3\2\2\2\u0161Z\3\2\2\2\u0162\u0166\t\7\2\2\u0163\u0164"+
		"\7\17\2\2\u0164\u0166\7\f\2\2\u0165\u0162\3\2\2\2\u0165\u0163\3\2\2\2"+
		"\u0166\u0167\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169"+
		"\3\2\2\2\u0169\u016a\b-\4\2\u016a\\\3\2\2\2\u016b\u016c\7\61\2\2\u016c"+
		"\u016d\7\61\2\2\u016d\u0171\3\2\2\2\u016e\u0170\n\b\2\2\u016f\u016e\3"+
		"\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\u0179\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u017a\7\f\2\2\u0175\u0177\7\17"+
		"\2\2\u0176\u0178\7\f\2\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u017a\3\2\2\2\u0179\u0174\3\2\2\2\u0179\u0175\3\2\2\2\u017a\u017b\3\2"+
		"\2\2\u017b\u017c\b.\4\2\u017c^\3\2\2\2\u017d\u017e\7\61\2\2\u017e\u017f"+
		"\7,\2\2\u017f\u0183\3\2\2\2\u0180\u0182\13\2\2\2\u0181\u0180\3\2\2\2\u0182"+
		"\u0185\3\2\2\2\u0183\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0186\3\2"+
		"\2\2\u0185\u0183\3\2\2\2\u0186\u0187\7,\2\2\u0187\u0188\7\61\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u018a\b/\4\2\u018a`\3\2\2\2\u018b\u018c\5\23\t\2"+
		"\u018c\u018d\3\2\2\2\u018d\u018e\b\60\5\2\u018eb\3\2\2\2\u018f\u0196\5"+
		"S)\2\u0190\u0192\n\t\2\2\u0191\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u018f\3\2"+
		"\2\2\u0195\u0191\3\2\2\2\u0196d\3\2\2\2\u0197\u0198\5[-\2\u0198\u0199"+
		"\3\2\2\2\u0199\u019a\b\62\5\2\u019a\u019b\b\62\4\2\u019bf\3\2\2\2\u019c"+
		"\u019d\5+\25\2\u019d\u019e\3\2\2\2\u019e\u019f\b\63\6\2\u019fh\3\2\2\2"+
		"\u01a0\u01a1\5\17\7\2\u01a1j\3\2\2\2\u01a2\u01a3\5\27\13\2\u01a3\u01a4"+
		"\3\2\2\2\u01a4\u01a5\b\65\7\2\u01a5l\3\2\2\2\u01a6\u01a7\5Q(\2\u01a7n"+
		"\3\2\2\2\u01a8\u01a9\5\r\6\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\b\67\5\2"+
		"\u01ab\u01ac\b\67\b\2\u01acp\3\2\2\2\u01ad\u01ae\5)\24\2\u01ae\u01af\3"+
		"\2\2\2\u01af\u01b0\b8\5\2\u01b0\u01b1\b8\t\2\u01b1r\3\2\2\2\u01b2\u01b3"+
		"\5\21\b\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\b9\5\2\u01b5\u01b6\b9\n\2\u01b6"+
		"t\3\2\2\2\u01b7\u01b8\5\23\t\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\b:\5\2"+
		"\u01ba\u01bb\b:\13\2\u01bbv\3\2\2\2\u01bc\u01bd\5#\21\2\u01bd\u01be\3"+
		"\2\2\2\u01be\u01bf\b;\5\2\u01bf\u01c0\b;\f\2\u01c0x\3\2\2\2\u01c1\u01c2"+
		"\5\'\23\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\b<\5\2\u01c4\u01c5\b<\r\2\u01c5"+
		"z\3\2\2\2\u01c6\u01c7\5%\22\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\b=\5\2\u01c9"+
		"\u01ca\b=\16\2\u01ca|\3\2\2\2\35\2\3\4\u00a8\u00ae\u011a\u0122\u0125\u012d"+
		"\u0135\u0139\u0141\u0145\u014a\u014f\u0153\u0158\u015a\u0160\u0165\u0167"+
		"\u0171\u0177\u0179\u0183\u0193\u0195\17\7\4\2\7\3\2\b\2\2\6\2\2\t\26\2"+
		"\t\f\2\t\7\2\t\25\2\t\t\2\t\n\2\t\22\2\t\24\2\t\23\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}