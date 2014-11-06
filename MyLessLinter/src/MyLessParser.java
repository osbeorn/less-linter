// Generated from MyLessParser.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyLessParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOLLAR=19, LT=14, LBRACK=10, AND=21, LPAREN=6, AT=20, ML_COMMENT=47, RPAREN=7, 
		IMPORT=38, STRING_LITERAL=42, IN=2, COMMA=17, TIL=13, TILD_EQ=36, IDENT=41, 
		PLUS=24, NL=45, EQ=34, DOT=18, PIPE_EQ=35, URL_END=48, EQEQ=32, RBRACK=11, 
		FORMAT_END=50, URL_START=30, NULL=1, QUOT=29, SRC=40, NUMBER=43, HASH=22, 
		ELLIPSIS=5, LCURLY=8, FONTFACE=39, MINUS=27, SEMI=16, FORMAT_START=31, 
		URL=49, COLON=15, COLONCOLON=23, UNIT=3, NOTEQ=33, WS=44, PERC=28, WHEN=37, 
		RCURLY=9, SL_COMMENT=46, GT=12, FORMAT=51, DIV=26, TIMES=25, COMBINE_COMPARE=4;
	public static final String[] tokenNames = {
		"<INVALID>", "'null'", "'in'", "UNIT", "COMBINE_COMPARE", "'...'", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "'>'", "'~'", "'<'", "':'", "';'", 
		"','", "'.'", "'$'", "'@'", "'&'", "'#'", "'::'", "'+'", "'*'", "'/'", 
		"'-'", "'%'", "'\"'", "URL_START", "FORMAT_START", "'=='", "'!='", "'='", 
		"'|='", "'~='", "'when'", "'@import'", "'@font-face'", "'src'", "IDENT", 
		"STRING_LITERAL", "NUMBER", "WS", "NL", "SL_COMMENT", "ML_COMMENT", "URL_END", 
		"URL", "FORMAT_END", "FORMAT"
	};
	public static final int
		RULE_stylesheet = 0, RULE_statement = 1, RULE_importStatement = 2, RULE_variableStatement = 3, 
		RULE_variableName = 4, RULE_measurement = 5, RULE_expression = 6, RULE_expressionStatement = 7, 
		RULE_mathCharacter = 8, RULE_mathPrefixCharacter = 9, RULE_ruleStatement = 10, 
		RULE_selectors = 11, RULE_selector = 12, RULE_mixin = 13, RULE_mixinParams = 14, 
		RULE_mixinParam = 15, RULE_mixinParamName = 16, RULE_selectorPrefix = 17, 
		RULE_element = 18, RULE_pseudo = 19, RULE_attrib = 20, RULE_attribRelate = 21, 
		RULE_block = 22, RULE_property = 23, RULE_functionCall = 24, RULE_functionCallParams = 25, 
		RULE_functionCallParam = 26, RULE_commaValues = 27, RULE_values = 28, 
		RULE_url_format = 29, RULE_url = 30, RULE_format = 31, RULE_color = 32;
	public static final String[] ruleNames = {
		"stylesheet", "statement", "importStatement", "variableStatement", "variableName", 
		"measurement", "expression", "expressionStatement", "mathCharacter", "mathPrefixCharacter", 
		"ruleStatement", "selectors", "selector", "mixin", "mixinParams", "mixinParam", 
		"mixinParamName", "selectorPrefix", "element", "pseudo", "attrib", "attribRelate", 
		"block", "property", "functionCall", "functionCallParams", "functionCallParam", 
		"commaValues", "values", "url_format", "url", "format", "color"
	};

	@Override
	public String getGrammarFileName() { return "MyLessParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyLessParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StylesheetContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitStylesheet(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT) | (1L << AT) | (1L << AND) | (1L << HASH) | (1L << TIMES) | (1L << IMPORT) | (1L << FONTFACE) | (1L << IDENT))) != 0)) {
				{
				{
				setState(66); statement();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public RuleStatementContext ruleStatement() {
			return getRuleContext(RuleStatementContext.class,0);
		}
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(75);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(72); importStatement();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(73); variableStatement();
				}
				break;
			case DOT:
			case AND:
			case HASH:
			case TIMES:
			case FONTFACE:
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(74); ruleStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(MyLessParser.IMPORT, 0); }
		public TerminalNode SEMI() { return getToken(MyLessParser.SEMI, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(MyLessParser.STRING_LITERAL, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitImportStatement(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); match(IMPORT);
			setState(78); match(STRING_LITERAL);
			setState(79); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableStatementContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MyLessParser.SEMI, 0); }
		public CommaValuesContext commaValues() {
			return getRuleContext(CommaValuesContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MyLessParser.COLON, 0); }
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitVariableStatement(this);
		}
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); variableName();
			setState(82); match(COLON);
			setState(83); commaValues();
			setState(84); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(MyLessParser.AT, 0); }
		public TerminalNode IDENT() { return getToken(MyLessParser.IDENT, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitVariableName(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(AT);
			setState(87); match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeasurementContext extends ParserRuleContext {
		public TerminalNode UNIT() { return getToken(MyLessParser.UNIT, 0); }
		public TerminalNode NUMBER() { return getToken(MyLessParser.NUMBER, 0); }
		public MeasurementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measurement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterMeasurement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitMeasurement(this);
		}
	}

	public final MeasurementContext measurement() throws RecognitionException {
		MeasurementContext _localctx = new MeasurementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_measurement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); match(NUMBER);
			setState(91);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(90); match(UNIT);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(MyLessParser.STRING_LITERAL, 0); }
		public MeasurementContext measurement() {
			return getRuleContext(MeasurementContext.class,0);
		}
		public TerminalNode NULL() { return getToken(MyLessParser.NULL, 0); }
		public TerminalNode IDENT() { return getToken(MyLessParser.IDENT, 0); }
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		try {
			setState(101);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93); variableName();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94); functionCall();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95); measurement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(96); color();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(97); url();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(98); match(IDENT);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(99); match(STRING_LITERAL);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(100); match(NULL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement(int i) {
			return getRuleContext(ExpressionStatementContext.class,i);
		}
		public MathCharacterContext mathCharacter() {
			return getRuleContext(MathCharacterContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MyLessParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MyLessParser.LPAREN, 0); }
		public List<ExpressionStatementContext> expressionStatement() {
			return getRuleContexts(ExpressionStatementContext.class);
		}
		public MathPrefixCharacterContext mathPrefixCharacter() {
			return getRuleContext(MathPrefixCharacterContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		return expressionStatement(0);
	}

	private ExpressionStatementContext expressionStatement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, _parentState);
		ExpressionStatementContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expressionStatement, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				{
				setState(104); mathPrefixCharacter();
				setState(105); expressionStatement(2);
				}
				break;
			case LPAREN:
				{
				setState(107); match(LPAREN);
				setState(108); expressionStatement(0);
				setState(109); match(RPAREN);
				}
				break;
			case NULL:
			case AT:
			case HASH:
			case URL_START:
			case IDENT:
			case STRING_LITERAL:
			case NUMBER:
				{
				setState(111); expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionStatementContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressionStatement);
					setState(114);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(115); mathCharacter();
					setState(116); expressionStatement(5);
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MathCharacterContext extends ParserRuleContext {
		public TerminalNode TIMES() { return getToken(MyLessParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(MyLessParser.DIV, 0); }
		public TerminalNode MINUS() { return getToken(MyLessParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(MyLessParser.PLUS, 0); }
		public MathCharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathCharacter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterMathCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitMathCharacter(this);
		}
	}

	public final MathCharacterContext mathCharacter() throws RecognitionException {
		MathCharacterContext _localctx = new MathCharacterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mathCharacter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << TIMES) | (1L << DIV) | (1L << MINUS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MathPrefixCharacterContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(MyLessParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(MyLessParser.PLUS, 0); }
		public MathPrefixCharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathPrefixCharacter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterMathPrefixCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitMathPrefixCharacter(this);
		}
	}

	public final MathPrefixCharacterContext mathPrefixCharacter() throws RecognitionException {
		MathPrefixCharacterContext _localctx = new MathPrefixCharacterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mathPrefixCharacter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleStatementContext extends ParserRuleContext {
		public SelectorsContext selectors() {
			return getRuleContext(SelectorsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public RuleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterRuleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitRuleStatement(this);
		}
	}

	public final RuleStatementContext ruleStatement() throws RecognitionException {
		RuleStatementContext _localctx = new RuleStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ruleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); selectors();
			setState(128); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectorsContext extends ParserRuleContext {
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MyLessParser.COMMA); }
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(MyLessParser.COMMA, i);
		}
		public SelectorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectors; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterSelectors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitSelectors(this);
		}
	}

	public final SelectorsContext selectors() throws RecognitionException {
		SelectorsContext _localctx = new SelectorsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_selectors);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); selector();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(131); match(COMMA);
				setState(132); selector();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectorContext extends ParserRuleContext {
		public List<SelectorPrefixContext> selectorPrefix() {
			return getRuleContexts(SelectorPrefixContext.class);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public AttribContext attrib(int i) {
			return getRuleContext(AttribContext.class,i);
		}
		public PseudoContext pseudo(int i) {
			return getRuleContext(PseudoContext.class,i);
		}
		public List<PseudoContext> pseudo() {
			return getRuleContexts(PseudoContext.class);
		}
		public List<AttribContext> attrib() {
			return getRuleContexts(AttribContext.class);
		}
		public SelectorPrefixContext selectorPrefix(int i) {
			return getRuleContext(SelectorPrefixContext.class,i);
		}
		public MixinContext mixin() {
			return getRuleContext(MixinContext.class,0);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitSelector(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(138); element();
				}
				}
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT) | (1L << AND) | (1L << HASH) | (1L << TIMES) | (1L << FONTFACE) | (1L << IDENT))) != 0) );
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << TIL) | (1L << PLUS))) != 0)) {
				{
				{
				setState(143); selectorPrefix();
				setState(144); element();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(151); attrib();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON || _la==COLONCOLON) {
				{
				{
				setState(157); pseudo();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(163); mixin();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MixinContext extends ParserRuleContext {
		public MixinParamsContext mixinParams() {
			return getRuleContext(MixinParamsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MyLessParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(MyLessParser.LPAREN, 0); }
		public MixinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mixin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterMixin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitMixin(this);
		}
	}

	public final MixinContext mixin() throws RecognitionException {
		MixinContext _localctx = new MixinContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mixin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); match(LPAREN);
			setState(168);
			_la = _input.LA(1);
			if (_la==AT || _la==IDENT) {
				{
				setState(167); mixinParams();
				}
			}

			setState(170); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MixinParamsContext extends ParserRuleContext {
		public MixinParamContext mixinParam(int i) {
			return getRuleContext(MixinParamContext.class,i);
		}
		public List<MixinParamContext> mixinParam() {
			return getRuleContexts(MixinParamContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(MyLessParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyLessParser.COMMA, i);
		}
		public MixinParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mixinParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterMixinParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitMixinParams(this);
		}
	}

	public final MixinParamsContext mixinParams() throws RecognitionException {
		MixinParamsContext _localctx = new MixinParamsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mixinParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172); mixinParam();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(173); match(COMMA);
				setState(174); mixinParam();
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MixinParamContext extends ParserRuleContext {
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public MixinParamNameContext mixinParamName() {
			return getRuleContext(MixinParamNameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MyLessParser.COLON, 0); }
		public MixinParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mixinParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterMixinParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitMixinParam(this);
		}
	}

	public final MixinParamContext mixinParam() throws RecognitionException {
		MixinParamContext _localctx = new MixinParamContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mixinParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180); mixinParamName();
			setState(183);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(181); match(COLON);
				setState(182); values();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MixinParamNameContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MyLessParser.IDENT, 0); }
		public MixinParamNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mixinParamName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterMixinParamName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitMixinParamName(this);
		}
	}

	public final MixinParamNameContext mixinParamName() throws RecognitionException {
		MixinParamNameContext _localctx = new MixinParamNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mixinParamName);
		try {
			setState(187);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(185); match(IDENT);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(186); variableName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectorPrefixContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(MyLessParser.PLUS, 0); }
		public TerminalNode GT() { return getToken(MyLessParser.GT, 0); }
		public TerminalNode TIL() { return getToken(MyLessParser.TIL, 0); }
		public SelectorPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorPrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterSelectorPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitSelectorPrefix(this);
		}
	}

	public final SelectorPrefixContext selectorPrefix() throws RecognitionException {
		SelectorPrefixContext _localctx = new SelectorPrefixContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_selectorPrefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << TIL) | (1L << PLUS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode TIMES() { return getToken(MyLessParser.TIMES, 0); }
		public TerminalNode DOT() { return getToken(MyLessParser.DOT, 0); }
		public TerminalNode FONTFACE() { return getToken(MyLessParser.FONTFACE, 0); }
		public TerminalNode AND() { return getToken(MyLessParser.AND, 0); }
		public TerminalNode HASH() { return getToken(MyLessParser.HASH, 0); }
		public TerminalNode IDENT() { return getToken(MyLessParser.IDENT, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_element);
		try {
			setState(199);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(191); match(IDENT);
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(192); match(HASH);
				setState(193); match(IDENT);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(194); match(DOT);
				setState(195); match(IDENT);
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 4);
				{
				setState(196); match(AND);
				}
				break;
			case TIMES:
				enterOuterAlt(_localctx, 5);
				{
				setState(197); match(TIMES);
				}
				break;
			case FONTFACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(198); match(FONTFACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PseudoContext extends ParserRuleContext {
		public TerminalNode COLONCOLON() { return getToken(MyLessParser.COLONCOLON, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MyLessParser.COLON, 0); }
		public TerminalNode IDENT() { return getToken(MyLessParser.IDENT, 0); }
		public PseudoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterPseudo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitPseudo(this);
		}
	}

	public final PseudoContext pseudo() throws RecognitionException {
		PseudoContext _localctx = new PseudoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pseudo);
		int _la;
		try {
			setState(205);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==COLONCOLON) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(202); match(IDENT);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==COLONCOLON) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(204); functionCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttribContext extends ParserRuleContext {
		public TerminalNode RBRACK() { return getToken(MyLessParser.RBRACK, 0); }
		public AttribRelateContext attribRelate() {
			return getRuleContext(AttribRelateContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(MyLessParser.STRING_LITERAL, 0); }
		public List<TerminalNode> IDENT() { return getTokens(MyLessParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(MyLessParser.IDENT, i);
		}
		public TerminalNode LBRACK() { return getToken(MyLessParser.LBRACK, 0); }
		public AttribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterAttrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitAttrib(this);
		}
	}

	public final AttribContext attrib() throws RecognitionException {
		AttribContext _localctx = new AttribContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_attrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); match(LBRACK);
			setState(208); match(IDENT);
			setState(212);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << PIPE_EQ) | (1L << TILD_EQ))) != 0)) {
				{
				setState(209); attribRelate();
				setState(210);
				_la = _input.LA(1);
				if ( !(_la==IDENT || _la==STRING_LITERAL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(214); match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttribRelateContext extends ParserRuleContext {
		public TerminalNode PIPE_EQ() { return getToken(MyLessParser.PIPE_EQ, 0); }
		public TerminalNode TILD_EQ() { return getToken(MyLessParser.TILD_EQ, 0); }
		public TerminalNode EQ() { return getToken(MyLessParser.EQ, 0); }
		public AttribRelateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribRelate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterAttribRelate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitAttribRelate(this);
		}
	}

	public final AttribRelateContext attribRelate() throws RecognitionException {
		AttribRelateContext _localctx = new AttribRelateContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_attribRelate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << PIPE_EQ) | (1L << TILD_EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode LCURLY() { return getToken(MyLessParser.LCURLY, 0); }
		public List<TerminalNode> SEMI() { return getTokens(MyLessParser.SEMI); }
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode SEMI(int i) {
			return getToken(MyLessParser.SEMI, i);
		}
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public TerminalNode RCURLY() { return getToken(MyLessParser.RCURLY, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218); match(LCURLY);
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(223);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						setState(219); property();
						setState(220); match(SEMI);
						}
						break;

					case 2:
						{
						setState(222); statement();
						}
						break;
					}
					} 
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(229);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT) | (1L << AND) | (1L << HASH) | (1L << TIMES) | (1L << FONTFACE) | (1L << IDENT))) != 0)) {
				{
				setState(228); property();
				}
			}

			setState(231); match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MyLessParser.COLON, 0); }
		public TerminalNode IDENT() { return getToken(MyLessParser.IDENT, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitProperty(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_property);
		try {
			setState(237);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233); element();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234); match(IDENT);
				setState(235); match(COLON);
				setState(236); values();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallParamsContext functionCallParams() {
			return getRuleContext(FunctionCallParamsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MyLessParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(MyLessParser.LPAREN, 0); }
		public TerminalNode IDENT() { return getToken(MyLessParser.IDENT, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239); match(IDENT);
			setState(240); match(LPAREN);
			setState(242);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << LPAREN) | (1L << AT) | (1L << HASH) | (1L << PLUS) | (1L << MINUS) | (1L << URL_START) | (1L << IDENT) | (1L << STRING_LITERAL) | (1L << NUMBER))) != 0)) {
				{
				setState(241); functionCallParams();
				}
			}

			setState(244); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallParamsContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(MyLessParser.COMMA); }
		public List<FunctionCallParamContext> functionCallParam() {
			return getRuleContexts(FunctionCallParamContext.class);
		}
		public FunctionCallParamContext functionCallParam(int i) {
			return getRuleContext(FunctionCallParamContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(MyLessParser.COMMA, i);
		}
		public FunctionCallParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterFunctionCallParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitFunctionCallParams(this);
		}
	}

	public final FunctionCallParamsContext functionCallParams() throws RecognitionException {
		FunctionCallParamsContext _localctx = new FunctionCallParamsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_functionCallParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246); functionCallParam();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(247); match(COMMA);
				setState(248); functionCallParam();
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallParamContext extends ParserRuleContext {
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public FunctionCallParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterFunctionCallParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitFunctionCallParam(this);
		}
	}

	public final FunctionCallParamContext functionCallParam() throws RecognitionException {
		FunctionCallParamContext _localctx = new FunctionCallParamContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_functionCallParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254); values();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommaValuesContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement(int i) {
			return getRuleContext(ExpressionStatementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MyLessParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyLessParser.COMMA, i);
		}
		public List<ExpressionStatementContext> expressionStatement() {
			return getRuleContexts(ExpressionStatementContext.class);
		}
		public CommaValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterCommaValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitCommaValues(this);
		}
	}

	public final CommaValuesContext commaValues() throws RecognitionException {
		CommaValuesContext _localctx = new CommaValuesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_commaValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256); expressionStatement(0);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(257); match(COMMA);
				setState(258); expressionStatement(0);
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValuesContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement(int i) {
			return getRuleContext(ExpressionStatementContext.class,i);
		}
		public List<ExpressionStatementContext> expressionStatement() {
			return getRuleContexts(ExpressionStatementContext.class);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitValues(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264); expressionStatement(0);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << LPAREN) | (1L << AT) | (1L << HASH) | (1L << PLUS) | (1L << MINUS) | (1L << URL_START) | (1L << IDENT) | (1L << STRING_LITERAL) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(265); expressionStatement(0);
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Url_formatContext extends ParserRuleContext {
		public TerminalNode URL(int i) {
			return getToken(MyLessParser.URL, i);
		}
		public List<TerminalNode> FORMAT() { return getTokens(MyLessParser.FORMAT); }
		public TerminalNode FORMAT(int i) {
			return getToken(MyLessParser.FORMAT, i);
		}
		public List<TerminalNode> URL() { return getTokens(MyLessParser.URL); }
		public List<TerminalNode> COMMA() { return getTokens(MyLessParser.COMMA); }
		public TerminalNode SEMI() { return getToken(MyLessParser.SEMI, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(MyLessParser.COMMA, i);
		}
		public Url_formatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterUrl_format(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitUrl_format(this);
		}
	}

	public final Url_formatContext url_format() throws RecognitionException {
		Url_formatContext _localctx = new Url_formatContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_url_format);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271); match(URL);
			setState(272); match(FORMAT);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(273); match(COMMA);
				setState(274); match(URL);
				setState(275); match(FORMAT);
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UrlContext extends ParserRuleContext {
		public TerminalNode URL_START() { return getToken(MyLessParser.URL_START, 0); }
		public TerminalNode URL_END() { return getToken(MyLessParser.URL_END, 0); }
		public TerminalNode URL() { return getToken(MyLessParser.URL, 0); }
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitUrl(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_url);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283); match(URL_START);
			setState(284); match(URL);
			setState(285); match(URL_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormatContext extends ParserRuleContext {
		public TerminalNode FORMAT() { return getToken(MyLessParser.FORMAT, 0); }
		public TerminalNode FORMAT_END() { return getToken(MyLessParser.FORMAT_END, 0); }
		public TerminalNode FORMAT_START() { return getToken(MyLessParser.FORMAT_START, 0); }
		public FormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitFormat(this);
		}
	}

	public final FormatContext format() throws RecognitionException {
		FormatContext _localctx = new FormatContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_format);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287); match(FORMAT_START);
			setState(288); match(FORMAT);
			setState(289); match(FORMAT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColorContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(MyLessParser.NUMBER, 0); }
		public TerminalNode HASH() { return getToken(MyLessParser.HASH, 0); }
		public TerminalNode IDENT() { return getToken(MyLessParser.IDENT, 0); }
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitColor(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_color);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291); match(HASH);
			setState(292);
			_la = _input.LA(1);
			if ( !(_la==IDENT || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7: return expressionStatement_sempred((ExpressionStatementContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressionStatement_sempred(ExpressionStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\65\u0129\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\7\2F\n\2\f\2\16\2I\13\2\3\3\3\3\3\3\5\3N\n\3\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\5\7^\n\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\bh\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\ts\n"+
		"\t\3\t\3\t\3\t\3\t\7\ty\n\t\f\t\16\t|\13\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\7\r\u0088\n\r\f\r\16\r\u008b\13\r\3\16\6\16\u008e\n\16"+
		"\r\16\16\16\u008f\3\16\3\16\3\16\7\16\u0095\n\16\f\16\16\16\u0098\13\16"+
		"\3\16\7\16\u009b\n\16\f\16\16\16\u009e\13\16\3\16\7\16\u00a1\n\16\f\16"+
		"\16\16\u00a4\13\16\3\16\5\16\u00a7\n\16\3\17\3\17\5\17\u00ab\n\17\3\17"+
		"\3\17\3\20\3\20\3\20\7\20\u00b2\n\20\f\20\16\20\u00b5\13\20\3\21\3\21"+
		"\3\21\5\21\u00ba\n\21\3\22\3\22\5\22\u00be\n\22\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\5\24\u00ca\n\24\3\25\3\25\3\25\3\25\5\25"+
		"\u00d0\n\25\3\26\3\26\3\26\3\26\3\26\5\26\u00d7\n\26\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\7\30\u00e2\n\30\f\30\16\30\u00e5\13\30\3"+
		"\30\5\30\u00e8\n\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u00f0\n\31\3\32"+
		"\3\32\3\32\5\32\u00f5\n\32\3\32\3\32\3\33\3\33\3\33\7\33\u00fc\n\33\f"+
		"\33\16\33\u00ff\13\33\3\34\3\34\3\35\3\35\3\35\7\35\u0106\n\35\f\35\16"+
		"\35\u0109\13\35\3\36\3\36\7\36\u010d\n\36\f\36\16\36\u0110\13\36\3\37"+
		"\3\37\3\37\3\37\3\37\7\37\u0117\n\37\f\37\16\37\u011a\13\37\3\37\3\37"+
		"\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\2\3\20#\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\t\3\2\32\35\4\2\32\32"+
		"\35\35\4\2\16\17\32\32\4\2\21\21\31\31\3\2+,\3\2$&\4\2++--\u012f\2G\3"+
		"\2\2\2\4M\3\2\2\2\6O\3\2\2\2\bS\3\2\2\2\nX\3\2\2\2\f[\3\2\2\2\16g\3\2"+
		"\2\2\20r\3\2\2\2\22}\3\2\2\2\24\177\3\2\2\2\26\u0081\3\2\2\2\30\u0084"+
		"\3\2\2\2\32\u008d\3\2\2\2\34\u00a8\3\2\2\2\36\u00ae\3\2\2\2 \u00b6\3\2"+
		"\2\2\"\u00bd\3\2\2\2$\u00bf\3\2\2\2&\u00c9\3\2\2\2(\u00cf\3\2\2\2*\u00d1"+
		"\3\2\2\2,\u00da\3\2\2\2.\u00dc\3\2\2\2\60\u00ef\3\2\2\2\62\u00f1\3\2\2"+
		"\2\64\u00f8\3\2\2\2\66\u0100\3\2\2\28\u0102\3\2\2\2:\u010a\3\2\2\2<\u0111"+
		"\3\2\2\2>\u011d\3\2\2\2@\u0121\3\2\2\2B\u0125\3\2\2\2DF\5\4\3\2ED\3\2"+
		"\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\3\3\2\2\2IG\3\2\2\2JN\5\6\4\2KN\5"+
		"\b\5\2LN\5\26\f\2MJ\3\2\2\2MK\3\2\2\2ML\3\2\2\2N\5\3\2\2\2OP\7(\2\2PQ"+
		"\7,\2\2QR\7\22\2\2R\7\3\2\2\2ST\5\n\6\2TU\7\21\2\2UV\58\35\2VW\7\22\2"+
		"\2W\t\3\2\2\2XY\7\26\2\2YZ\7+\2\2Z\13\3\2\2\2[]\7-\2\2\\^\7\5\2\2]\\\3"+
		"\2\2\2]^\3\2\2\2^\r\3\2\2\2_h\5\n\6\2`h\5\62\32\2ah\5\f\7\2bh\5B\"\2c"+
		"h\5> \2dh\7+\2\2eh\7,\2\2fh\7\3\2\2g_\3\2\2\2g`\3\2\2\2ga\3\2\2\2gb\3"+
		"\2\2\2gc\3\2\2\2gd\3\2\2\2ge\3\2\2\2gf\3\2\2\2h\17\3\2\2\2ij\b\t\1\2j"+
		"k\5\24\13\2kl\5\20\t\4ls\3\2\2\2mn\7\b\2\2no\5\20\t\2op\7\t\2\2ps\3\2"+
		"\2\2qs\5\16\b\2ri\3\2\2\2rm\3\2\2\2rq\3\2\2\2sz\3\2\2\2tu\f\6\2\2uv\5"+
		"\22\n\2vw\5\20\t\7wy\3\2\2\2xt\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{"+
		"\21\3\2\2\2|z\3\2\2\2}~\t\2\2\2~\23\3\2\2\2\177\u0080\t\3\2\2\u0080\25"+
		"\3\2\2\2\u0081\u0082\5\30\r\2\u0082\u0083\5.\30\2\u0083\27\3\2\2\2\u0084"+
		"\u0089\5\32\16\2\u0085\u0086\7\23\2\2\u0086\u0088\5\32\16\2\u0087\u0085"+
		"\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\31\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008e\5&\24\2\u008d\u008c\3\2\2"+
		"\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0096"+
		"\3\2\2\2\u0091\u0092\5$\23\2\u0092\u0093\5&\24\2\u0093\u0095\3\2\2\2\u0094"+
		"\u0091\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u009c\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009b\5*\26\2\u009a"+
		"\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u00a2\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a1\5(\25\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a7\5\34\17\2\u00a6"+
		"\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\33\3\2\2\2\u00a8\u00aa\7\b\2"+
		"\2\u00a9\u00ab\5\36\20\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ad\7\t\2\2\u00ad\35\3\2\2\2\u00ae\u00b3\5 \21"+
		"\2\u00af\u00b0\7\23\2\2\u00b0\u00b2\5 \21\2\u00b1\u00af\3\2\2\2\u00b2"+
		"\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\37\3\2\2"+
		"\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9\5\"\22\2\u00b7\u00b8\7\21\2\2\u00b8"+
		"\u00ba\5:\36\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba!\3\2\2\2"+
		"\u00bb\u00be\7+\2\2\u00bc\u00be\5\n\6\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc"+
		"\3\2\2\2\u00be#\3\2\2\2\u00bf\u00c0\t\4\2\2\u00c0%\3\2\2\2\u00c1\u00ca"+
		"\7+\2\2\u00c2\u00c3\7\30\2\2\u00c3\u00ca\7+\2\2\u00c4\u00c5\7\24\2\2\u00c5"+
		"\u00ca\7+\2\2\u00c6\u00ca\7\27\2\2\u00c7\u00ca\7\33\2\2\u00c8\u00ca\7"+
		")\2\2\u00c9\u00c1\3\2\2\2\u00c9\u00c2\3\2\2\2\u00c9\u00c4\3\2\2\2\u00c9"+
		"\u00c6\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\'\3\2\2\2"+
		"\u00cb\u00cc\t\5\2\2\u00cc\u00d0\7+\2\2\u00cd\u00ce\t\5\2\2\u00ce\u00d0"+
		"\5\62\32\2\u00cf\u00cb\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0)\3\2\2\2\u00d1"+
		"\u00d2\7\f\2\2\u00d2\u00d6\7+\2\2\u00d3\u00d4\5,\27\2\u00d4\u00d5\t\6"+
		"\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d9\7\r\2\2\u00d9+\3\2\2\2\u00da\u00db\t\7\2\2"+
		"\u00db-\3\2\2\2\u00dc\u00e3\7\n\2\2\u00dd\u00de\5\60\31\2\u00de\u00df"+
		"\7\22\2\2\u00df\u00e2\3\2\2\2\u00e0\u00e2\5\4\3\2\u00e1\u00dd\3\2\2\2"+
		"\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e8\5\60\31\2"+
		"\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea"+
		"\7\13\2\2\u00ea/\3\2\2\2\u00eb\u00f0\5&\24\2\u00ec\u00ed\7+\2\2\u00ed"+
		"\u00ee\7\21\2\2\u00ee\u00f0\5:\36\2\u00ef\u00eb\3\2\2\2\u00ef\u00ec\3"+
		"\2\2\2\u00f0\61\3\2\2\2\u00f1\u00f2\7+\2\2\u00f2\u00f4\7\b\2\2\u00f3\u00f5"+
		"\5\64\33\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2"+
		"\u00f6\u00f7\7\t\2\2\u00f7\63\3\2\2\2\u00f8\u00fd\5\66\34\2\u00f9\u00fa"+
		"\7\23\2\2\u00fa\u00fc\5\66\34\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2\2"+
		"\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\65\3\2\2\2\u00ff\u00fd"+
		"\3\2\2\2\u0100\u0101\5:\36\2\u0101\67\3\2\2\2\u0102\u0107\5\20\t\2\u0103"+
		"\u0104\7\23\2\2\u0104\u0106\5\20\t\2\u0105\u0103\3\2\2\2\u0106\u0109\3"+
		"\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u01089\3\2\2\2\u0109\u0107"+
		"\3\2\2\2\u010a\u010e\5\20\t\2\u010b\u010d\5\20\t\2\u010c\u010b\3\2\2\2"+
		"\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f;\3"+
		"\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7\63\2\2\u0112\u0118\7\65\2\2\u0113"+
		"\u0114\7\23\2\2\u0114\u0115\7\63\2\2\u0115\u0117\7\65\2\2\u0116\u0113"+
		"\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\7\22\2\2\u011c=\3\2\2\2"+
		"\u011d\u011e\7 \2\2\u011e\u011f\7\63\2\2\u011f\u0120\7\62\2\2\u0120?\3"+
		"\2\2\2\u0121\u0122\7!\2\2\u0122\u0123\7\65\2\2\u0123\u0124\7\64\2\2\u0124"+
		"A\3\2\2\2\u0125\u0126\7\30\2\2\u0126\u0127\t\b\2\2\u0127C\3\2\2\2\36G"+
		"M]grz\u0089\u008f\u0096\u009c\u00a2\u00a6\u00aa\u00b3\u00b9\u00bd\u00c9"+
		"\u00cf\u00d6\u00e1\u00e3\u00e7\u00ef\u00f4\u00fd\u0107\u010e\u0118";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}