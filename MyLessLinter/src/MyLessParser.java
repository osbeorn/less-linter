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
		DOLLAR=19, LT=14, LBRACK=10, LTEQ=34, INTERPOLATION_END=50, AND=21, ANDW=35, 
		LPAREN=6, INTERPOLATION_START=30, AT=20, ML_COMMENT=49, RPAREN=7, IMPORT=41, 
		STRING_LITERAL=44, IN=2, COMMA=17, TIL=13, TILD_EQ=39, IDENT=43, PLUS=24, 
		NL=47, EQ=37, DOT=18, PIPE_EQ=38, NOTW=36, EQEQ=31, RBRACK=11, NULL=1, 
		QUOT=29, NUMBER=45, HASH=22, ELLIPSIS=5, LCURLY=8, MINUS=27, GTEQ=33, 
		SEMI=16, IMPORTANT=42, COLON=15, COLONCOLON=23, UNIT=3, NOTEQ=32, WS=46, 
		PERC=28, WHEN=40, RCURLY=9, SL_COMMENT=48, GT=12, INTERPOLATION=51, DIV=26, 
		TIMES=25, COMBINE_COMPARE=4;
	public static final String[] tokenNames = {
		"<INVALID>", "'null'", "'in'", "UNIT", "COMBINE_COMPARE", "'...'", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "'>'", "'~'", "'<'", "':'", "';'", 
		"','", "'.'", "'$'", "'@'", "'&'", "'#'", "'::'", "'+'", "'*'", "'/'", 
		"'-'", "'%'", "'\"'", "'@{'", "'=='", "'!='", "'>='", "'<='", "'and'", 
		"'not'", "'='", "'|='", "'~='", "'when'", "'@import'", "'!important'", 
		"IDENT", "STRING_LITERAL", "NUMBER", "WS", "NL", "SL_COMMENT", "ML_COMMENT", 
		"INTERPOLATION_END", "INTERPOLATION"
	};
	public static final int
		RULE_stylesheet = 0, RULE_statement = 1, RULE_importStatement = 2, RULE_keyword = 3, 
		RULE_variableStatement = 4, RULE_variableName = 5, RULE_measurement = 6, 
		RULE_expression = 7, RULE_expressionStatement = 8, RULE_mathCharacter = 9, 
		RULE_boolCharacter = 10, RULE_mathPrefixCharacter = 11, RULE_ruleStatement = 12, 
		RULE_selectors = 13, RULE_selector = 14, RULE_mixin = 15, RULE_mixinGuards = 16, 
		RULE_mixinGuardsList = 17, RULE_mixinGuard = 18, RULE_mixinParams = 19, 
		RULE_mixinParam = 20, RULE_mixinParamName = 21, RULE_selectorPrefix = 22, 
		RULE_element = 23, RULE_pseudo = 24, RULE_attrib = 25, RULE_attribRelate = 26, 
		RULE_block = 27, RULE_property = 28, RULE_propertyIdent = 29, RULE_varInterpolation = 30, 
		RULE_propertyValues = 31, RULE_mixinCall = 32, RULE_functionCall = 33, 
		RULE_callParams = 34, RULE_callParam = 35, RULE_commaValues = 36, RULE_values = 37, 
		RULE_color = 38;
	public static final String[] ruleNames = {
		"stylesheet", "statement", "importStatement", "keyword", "variableStatement", 
		"variableName", "measurement", "expression", "expressionStatement", "mathCharacter", 
		"boolCharacter", "mathPrefixCharacter", "ruleStatement", "selectors", 
		"selector", "mixin", "mixinGuards", "mixinGuardsList", "mixinGuard", "mixinParams", 
		"mixinParam", "mixinParamName", "selectorPrefix", "element", "pseudo", 
		"attrib", "attribRelate", "block", "property", "propertyIdent", "varInterpolation", 
		"propertyValues", "mixinCall", "functionCall", "callParams", "callParam", 
		"commaValues", "values", "color"
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
		public TerminalNode EOF() { return getToken(MyLessParser.EOF, 0); }
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
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LCURLY) | (1L << LBRACK) | (1L << GT) | (1L << TIL) | (1L << COLON) | (1L << COMMA) | (1L << DOT) | (1L << AT) | (1L << AND) | (1L << HASH) | (1L << COLONCOLON) | (1L << PLUS) | (1L << TIMES) | (1L << WHEN) | (1L << IMPORT) | (1L << IDENT) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(78); statement();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84); match(EOF);
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
			setState(89);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86); importStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87); variableStatement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88); ruleStatement();
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

	public static class ImportStatementContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); match(IMPORT);
			setState(93);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(92); keyword();
				}
			}

			setState(95); match(STRING_LITERAL);
			setState(96); match(SEMI);
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(MyLessParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(MyLessParser.LPAREN, 0); }
		public TerminalNode IDENT() { return getToken(MyLessParser.IDENT, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); match(LPAREN);
			setState(99); match(IDENT);
			setState(100); match(RPAREN);
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
		enterRule(_localctx, 8, RULE_variableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); variableName();
			setState(103); match(COLON);
			setState(104); commaValues();
			setState(105); match(SEMI);
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
		enterRule(_localctx, 10, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); match(AT);
			setState(108); match(IDENT);
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
		enterRule(_localctx, 12, RULE_measurement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(NUMBER);
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(111); match(UNIT);
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
		enterRule(_localctx, 14, RULE_expression);
		try {
			setState(121);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114); variableName();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115); functionCall();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(116); measurement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(117); color();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(118); match(IDENT);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(119); match(STRING_LITERAL);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(120); match(NULL);
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
		public BoolCharacterContext boolCharacter() {
			return getRuleContext(BoolCharacterContext.class,0);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expressionStatement, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				{
				setState(124); mathPrefixCharacter();
				setState(125); expressionStatement(2);
				}
				break;
			case LPAREN:
				{
				setState(127); match(LPAREN);
				setState(128); expressionStatement(0);
				setState(129); match(RPAREN);
				}
				break;
			case NULL:
			case AT:
			case HASH:
			case IDENT:
			case STRING_LITERAL:
			case NUMBER:
				{
				setState(131); expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(142);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionStatementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionStatement);
						setState(134);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(135); mathCharacter();
						setState(136); expressionStatement(6);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionStatementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionStatement);
						setState(138);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(139); boolCharacter();
						setState(140); expressionStatement(5);
						}
						break;
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		enterRule(_localctx, 18, RULE_mathCharacter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
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

	public static class BoolCharacterContext extends ParserRuleContext {
		public TerminalNode GTEQ() { return getToken(MyLessParser.GTEQ, 0); }
		public TerminalNode LT() { return getToken(MyLessParser.LT, 0); }
		public TerminalNode NOTEQ() { return getToken(MyLessParser.NOTEQ, 0); }
		public TerminalNode GT() { return getToken(MyLessParser.GT, 0); }
		public TerminalNode EQ() { return getToken(MyLessParser.EQ, 0); }
		public TerminalNode LTEQ() { return getToken(MyLessParser.LTEQ, 0); }
		public BoolCharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolCharacter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterBoolCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitBoolCharacter(this);
		}
	}

	public final BoolCharacterContext boolCharacter() throws RecognitionException {
		BoolCharacterContext _localctx = new BoolCharacterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_boolCharacter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << NOTEQ) | (1L << GTEQ) | (1L << LTEQ) | (1L << EQ))) != 0)) ) {
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
		enterRule(_localctx, 22, RULE_mathPrefixCharacter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
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
		enterRule(_localctx, 24, RULE_ruleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153); selectors();
			setState(154); block();
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
		enterRule(_localctx, 26, RULE_selectors);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); selector();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(157); match(COMMA);
				setState(158); selector();
				}
				}
				setState(163);
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
		public MixinGuardsContext mixinGuards() {
			return getRuleContext(MixinGuardsContext.class,0);
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
		enterRule(_localctx, 28, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT) | (1L << AT) | (1L << AND) | (1L << HASH) | (1L << TIMES) | (1L << IDENT) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(164); element();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << TIL) | (1L << PLUS))) != 0)) {
				{
				{
				setState(170); selectorPrefix();
				setState(171); element();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(178); attrib();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON || _la==COLONCOLON) {
				{
				{
				setState(184); pseudo();
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(190); mixin();
				}
			}

			setState(194);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(193); mixinGuards();
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
		enterRule(_localctx, 30, RULE_mixin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196); match(LPAREN);
			setState(198);
			_la = _input.LA(1);
			if (_la==AT || _la==IDENT) {
				{
				setState(197); mixinParams();
				}
			}

			setState(200); match(RPAREN);
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

	public static class MixinGuardsContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(MyLessParser.WHEN, 0); }
		public MixinGuardsListContext mixinGuardsList() {
			return getRuleContext(MixinGuardsListContext.class,0);
		}
		public MixinGuardsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mixinGuards; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterMixinGuards(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitMixinGuards(this);
		}
	}

	public final MixinGuardsContext mixinGuards() throws RecognitionException {
		MixinGuardsContext _localctx = new MixinGuardsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mixinGuards);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202); match(WHEN);
			setState(203); mixinGuardsList();
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

	public static class MixinGuardsListContext extends ParserRuleContext {
		public List<MixinGuardContext> mixinGuard() {
			return getRuleContexts(MixinGuardContext.class);
		}
		public List<TerminalNode> ANDW() { return getTokens(MyLessParser.ANDW); }
		public List<TerminalNode> COMMA() { return getTokens(MyLessParser.COMMA); }
		public TerminalNode ANDW(int i) {
			return getToken(MyLessParser.ANDW, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(MyLessParser.COMMA, i);
		}
		public MixinGuardContext mixinGuard(int i) {
			return getRuleContext(MixinGuardContext.class,i);
		}
		public MixinGuardsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mixinGuardsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterMixinGuardsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitMixinGuardsList(this);
		}
	}

	public final MixinGuardsListContext mixinGuardsList() throws RecognitionException {
		MixinGuardsListContext _localctx = new MixinGuardsListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mixinGuardsList);
		int _la;
		try {
			int _alt;
			setState(221);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205); mixinGuard();
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ANDW) {
					{
					{
					setState(206); match(ANDW);
					setState(207); mixinGuard();
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213); mixinGuard();
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(214); match(COMMA);
						setState(215); mixinGuard();
						}
						} 
					}
					setState(220);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
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

	public static class MixinGuardContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(MyLessParser.RPAREN, 0); }
		public TerminalNode NOTW() { return getToken(MyLessParser.NOTW, 0); }
		public TerminalNode LPAREN() { return getToken(MyLessParser.LPAREN, 0); }
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public MixinGuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mixinGuard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterMixinGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitMixinGuard(this);
		}
	}

	public final MixinGuardContext mixinGuard() throws RecognitionException {
		MixinGuardContext _localctx = new MixinGuardContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mixinGuard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_la = _input.LA(1);
			if (_la==NOTW) {
				{
				setState(223); match(NOTW);
				}
			}

			setState(226); match(LPAREN);
			setState(227); expressionStatement(0);
			setState(228); match(RPAREN);
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
		enterRule(_localctx, 38, RULE_mixinParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230); mixinParam();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(231); match(COMMA);
				setState(232); mixinParam();
				}
				}
				setState(237);
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
		enterRule(_localctx, 40, RULE_mixinParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238); mixinParamName();
			setState(241);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(239); match(COLON);
				setState(240); values();
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
		enterRule(_localctx, 42, RULE_mixinParamName);
		try {
			setState(245);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(243); match(IDENT);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(244); variableName();
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
		enterRule(_localctx, 44, RULE_selectorPrefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
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
		public TerminalNode AND() { return getToken(MyLessParser.AND, 0); }
		public MeasurementContext measurement() {
			return getRuleContext(MeasurementContext.class,0);
		}
		public TerminalNode AT() { return getToken(MyLessParser.AT, 0); }
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
		enterRule(_localctx, 46, RULE_element);
		try {
			setState(259);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(249); match(IDENT);
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(250); match(HASH);
				setState(251); match(IDENT);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(252); match(DOT);
				setState(253); match(IDENT);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 4);
				{
				setState(254); match(AT);
				setState(255); match(IDENT);
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 5);
				{
				setState(256); match(AND);
				}
				break;
			case TIMES:
				enterOuterAlt(_localctx, 6);
				{
				setState(257); match(TIMES);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 7);
				{
				setState(258); measurement();
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
		public TerminalNode NOTW() { return getToken(MyLessParser.NOTW, 0); }
		public TerminalNode IDENT() { return getToken(MyLessParser.IDENT, 0); }
		public TerminalNode COLON() { return getToken(MyLessParser.COLON, 0); }
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
		enterRule(_localctx, 48, RULE_pseudo);
		int _la;
		try {
			setState(265);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==COLONCOLON) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(262);
				_la = _input.LA(1);
				if ( !(_la==NOTW || _la==IDENT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==COLONCOLON) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(264); functionCall();
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
		enterRule(_localctx, 50, RULE_attrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267); match(LBRACK);
			setState(268); match(IDENT);
			setState(272);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << PIPE_EQ) | (1L << TILD_EQ))) != 0)) {
				{
				setState(269); attribRelate();
				setState(270);
				_la = _input.LA(1);
				if ( !(_la==IDENT || _la==STRING_LITERAL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(274); match(RBRACK);
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
		enterRule(_localctx, 52, RULE_attribRelate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
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
		enterRule(_localctx, 54, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(278); match(LCURLY);
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(283);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						setState(279); property();
						setState(280); match(SEMI);
						}
						break;

					case 2:
						{
						setState(282); statement();
						}
						break;
					}
					} 
				}
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(289);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT) | (1L << AT) | (1L << AND) | (1L << HASH) | (1L << TIMES) | (1L << INTERPOLATION_START) | (1L << IDENT) | (1L << NUMBER))) != 0)) {
				{
				setState(288); property();
				}
			}

			setState(291); match(RCURLY);
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
		public TerminalNode IMPORTANT() { return getToken(MyLessParser.IMPORTANT, 0); }
		public PropertyValuesContext propertyValues() {
			return getRuleContext(PropertyValuesContext.class,0);
		}
		public PropertyIdentContext propertyIdent() {
			return getRuleContext(PropertyIdentContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MyLessParser.COLON, 0); }
		public MixinCallContext mixinCall() {
			return getRuleContext(MixinCallContext.class,0);
		}
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
		enterRule(_localctx, 56, RULE_property);
		int _la;
		try {
			setState(303);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293); mixinCall();
				setState(295);
				_la = _input.LA(1);
				if (_la==IMPORTANT) {
					{
					setState(294); match(IMPORTANT);
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297); propertyIdent();
				setState(298); match(COLON);
				setState(299); propertyValues();
				setState(301);
				_la = _input.LA(1);
				if (_la==IMPORTANT) {
					{
					setState(300); match(IMPORTANT);
					}
				}

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

	public static class PropertyIdentContext extends ParserRuleContext {
		public VarInterpolationContext varInterpolation() {
			return getRuleContext(VarInterpolationContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(MyLessParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(MyLessParser.IDENT, i);
		}
		public PropertyIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyIdent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterPropertyIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitPropertyIdent(this);
		}
	}

	public final PropertyIdentContext propertyIdent() throws RecognitionException {
		PropertyIdentContext _localctx = new PropertyIdentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_propertyIdent);
		int _la;
		try {
			setState(313);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305); match(IDENT);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				_la = _input.LA(1);
				if (_la==IDENT) {
					{
					setState(306); match(IDENT);
					}
				}

				setState(309); varInterpolation();
				setState(311);
				_la = _input.LA(1);
				if (_la==IDENT) {
					{
					setState(310); match(IDENT);
					}
				}

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

	public static class VarInterpolationContext extends ParserRuleContext {
		public TerminalNode INTERPOLATION_START() { return getToken(MyLessParser.INTERPOLATION_START, 0); }
		public TerminalNode INTERPOLATION_END() { return getToken(MyLessParser.INTERPOLATION_END, 0); }
		public TerminalNode INTERPOLATION() { return getToken(MyLessParser.INTERPOLATION, 0); }
		public VarInterpolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varInterpolation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterVarInterpolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitVarInterpolation(this);
		}
	}

	public final VarInterpolationContext varInterpolation() throws RecognitionException {
		VarInterpolationContext _localctx = new VarInterpolationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_varInterpolation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315); match(INTERPOLATION_START);
			setState(316); match(INTERPOLATION);
			setState(317); match(INTERPOLATION_END);
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

	public static class PropertyValuesContext extends ParserRuleContext {
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MyLessParser.COMMA); }
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(MyLessParser.COMMA, i);
		}
		public PropertyValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterPropertyValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitPropertyValues(this);
		}
	}

	public final PropertyValuesContext propertyValues() throws RecognitionException {
		PropertyValuesContext _localctx = new PropertyValuesContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_propertyValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319); values();
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(320); match(COMMA);
				setState(321); values();
				}
				}
				setState(326);
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

	public static class MixinCallContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public CallParamsContext callParams() {
			return getRuleContext(CallParamsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MyLessParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(MyLessParser.LPAREN, 0); }
		public MixinCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mixinCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterMixinCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitMixinCall(this);
		}
	}

	public final MixinCallContext mixinCall() throws RecognitionException {
		MixinCallContext _localctx = new MixinCallContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_mixinCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327); element();
			setState(333);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(328); match(LPAREN);
				setState(330);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << LPAREN) | (1L << AT) | (1L << HASH) | (1L << PLUS) | (1L << MINUS) | (1L << IDENT) | (1L << STRING_LITERAL) | (1L << NUMBER))) != 0)) {
					{
					setState(329); callParams();
					}
				}

				setState(332); match(RPAREN);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public CallParamsContext callParams() {
			return getRuleContext(CallParamsContext.class,0);
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
		enterRule(_localctx, 66, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335); match(IDENT);
			setState(336); match(LPAREN);
			setState(338);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << LPAREN) | (1L << AT) | (1L << HASH) | (1L << PLUS) | (1L << MINUS) | (1L << IDENT) | (1L << STRING_LITERAL) | (1L << NUMBER))) != 0)) {
				{
				setState(337); callParams();
				}
			}

			setState(340); match(RPAREN);
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

	public static class CallParamsContext extends ParserRuleContext {
		public CallParamContext callParam(int i) {
			return getRuleContext(CallParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MyLessParser.COMMA); }
		public List<CallParamContext> callParam() {
			return getRuleContexts(CallParamContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(MyLessParser.COMMA, i);
		}
		public CallParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterCallParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitCallParams(this);
		}
	}

	public final CallParamsContext callParams() throws RecognitionException {
		CallParamsContext _localctx = new CallParamsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_callParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342); callParam();
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(343); match(COMMA);
				setState(344); callParam();
				}
				}
				setState(349);
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

	public static class CallParamContext extends ParserRuleContext {
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public CallParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterCallParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitCallParam(this);
		}
	}

	public final CallParamContext callParam() throws RecognitionException {
		CallParamContext _localctx = new CallParamContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_callParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350); values();
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
		enterRule(_localctx, 72, RULE_commaValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352); expressionStatement(0);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(353); match(COMMA);
				setState(354); expressionStatement(0);
				}
				}
				setState(359);
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
		enterRule(_localctx, 74, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360); expressionStatement(0);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << LPAREN) | (1L << AT) | (1L << HASH) | (1L << PLUS) | (1L << MINUS) | (1L << IDENT) | (1L << STRING_LITERAL) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(361); expressionStatement(0);
				}
				}
				setState(366);
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

	public static class ColorContext extends ParserRuleContext {
		public TerminalNode NUMBER(int i) {
			return getToken(MyLessParser.NUMBER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(MyLessParser.NUMBER); }
		public TerminalNode HASH() { return getToken(MyLessParser.HASH, 0); }
		public List<TerminalNode> IDENT() { return getTokens(MyLessParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(MyLessParser.IDENT, i);
		}
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
		enterRule(_localctx, 76, RULE_color);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(367); match(HASH);
			setState(369); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(368);
					_la = _input.LA(1);
					if ( !(_la==IDENT || _la==NUMBER) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(371); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
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
		case 8: return expressionStatement_sempred((ExpressionStatementContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressionStatement_sempred(ExpressionStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 5);

		case 1: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\65\u0178\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\7\2R\n\2\f\2\16"+
		"\2U\13\2\3\2\3\2\3\3\3\3\3\3\5\3\\\n\3\3\4\3\4\5\4`\n\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\5\bs\n\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t|\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u0087\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0091\n\n\f\n\16\n\u0094"+
		"\13\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u00a2"+
		"\n\17\f\17\16\17\u00a5\13\17\3\20\7\20\u00a8\n\20\f\20\16\20\u00ab\13"+
		"\20\3\20\3\20\3\20\7\20\u00b0\n\20\f\20\16\20\u00b3\13\20\3\20\7\20\u00b6"+
		"\n\20\f\20\16\20\u00b9\13\20\3\20\7\20\u00bc\n\20\f\20\16\20\u00bf\13"+
		"\20\3\20\5\20\u00c2\n\20\3\20\5\20\u00c5\n\20\3\21\3\21\5\21\u00c9\n\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\7\23\u00d3\n\23\f\23\16\23\u00d6"+
		"\13\23\3\23\3\23\3\23\7\23\u00db\n\23\f\23\16\23\u00de\13\23\5\23\u00e0"+
		"\n\23\3\24\5\24\u00e3\n\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\7\25\u00ec"+
		"\n\25\f\25\16\25\u00ef\13\25\3\26\3\26\3\26\5\26\u00f4\n\26\3\27\3\27"+
		"\5\27\u00f8\n\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u0106\n\31\3\32\3\32\3\32\3\32\5\32\u010c\n\32\3\33\3\33\3"+
		"\33\3\33\3\33\5\33\u0113\n\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\7\35\u011e\n\35\f\35\16\35\u0121\13\35\3\35\5\35\u0124\n\35\3\35"+
		"\3\35\3\36\3\36\5\36\u012a\n\36\3\36\3\36\3\36\3\36\5\36\u0130\n\36\5"+
		"\36\u0132\n\36\3\37\3\37\5\37\u0136\n\37\3\37\3\37\5\37\u013a\n\37\5\37"+
		"\u013c\n\37\3 \3 \3 \3 \3!\3!\3!\7!\u0145\n!\f!\16!\u0148\13!\3\"\3\""+
		"\3\"\5\"\u014d\n\"\3\"\5\"\u0150\n\"\3#\3#\3#\5#\u0155\n#\3#\3#\3$\3$"+
		"\3$\7$\u015c\n$\f$\16$\u015f\13$\3%\3%\3&\3&\3&\7&\u0166\n&\f&\16&\u0169"+
		"\13&\3\'\3\'\7\'\u016d\n\'\f\'\16\'\u0170\13\'\3(\3(\6(\u0174\n(\r(\16"+
		"(\u0175\3(\2\3\22)\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLN\2\13\3\2\32\35\6\2\16\16\20\20\"$\'\'\4\2\32\32"+
		"\35\35\4\2\16\17\32\32\4\2\21\21\31\31\4\2&&--\3\2-.\3\2\')\4\2--//\u0187"+
		"\2S\3\2\2\2\4[\3\2\2\2\6]\3\2\2\2\bd\3\2\2\2\nh\3\2\2\2\fm\3\2\2\2\16"+
		"p\3\2\2\2\20{\3\2\2\2\22\u0086\3\2\2\2\24\u0095\3\2\2\2\26\u0097\3\2\2"+
		"\2\30\u0099\3\2\2\2\32\u009b\3\2\2\2\34\u009e\3\2\2\2\36\u00a9\3\2\2\2"+
		" \u00c6\3\2\2\2\"\u00cc\3\2\2\2$\u00df\3\2\2\2&\u00e2\3\2\2\2(\u00e8\3"+
		"\2\2\2*\u00f0\3\2\2\2,\u00f7\3\2\2\2.\u00f9\3\2\2\2\60\u0105\3\2\2\2\62"+
		"\u010b\3\2\2\2\64\u010d\3\2\2\2\66\u0116\3\2\2\28\u0118\3\2\2\2:\u0131"+
		"\3\2\2\2<\u013b\3\2\2\2>\u013d\3\2\2\2@\u0141\3\2\2\2B\u0149\3\2\2\2D"+
		"\u0151\3\2\2\2F\u0158\3\2\2\2H\u0160\3\2\2\2J\u0162\3\2\2\2L\u016a\3\2"+
		"\2\2N\u0171\3\2\2\2PR\5\4\3\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2"+
		"TV\3\2\2\2US\3\2\2\2VW\7\2\2\3W\3\3\2\2\2X\\\5\6\4\2Y\\\5\n\6\2Z\\\5\32"+
		"\16\2[X\3\2\2\2[Y\3\2\2\2[Z\3\2\2\2\\\5\3\2\2\2]_\7+\2\2^`\5\b\5\2_^\3"+
		"\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7.\2\2bc\7\22\2\2c\7\3\2\2\2de\7\b\2\2ef"+
		"\7-\2\2fg\7\t\2\2g\t\3\2\2\2hi\5\f\7\2ij\7\21\2\2jk\5J&\2kl\7\22\2\2l"+
		"\13\3\2\2\2mn\7\26\2\2no\7-\2\2o\r\3\2\2\2pr\7/\2\2qs\7\5\2\2rq\3\2\2"+
		"\2rs\3\2\2\2s\17\3\2\2\2t|\5\f\7\2u|\5D#\2v|\5\16\b\2w|\5N(\2x|\7-\2\2"+
		"y|\7.\2\2z|\7\3\2\2{t\3\2\2\2{u\3\2\2\2{v\3\2\2\2{w\3\2\2\2{x\3\2\2\2"+
		"{y\3\2\2\2{z\3\2\2\2|\21\3\2\2\2}~\b\n\1\2~\177\5\30\r\2\177\u0080\5\22"+
		"\n\4\u0080\u0087\3\2\2\2\u0081\u0082\7\b\2\2\u0082\u0083\5\22\n\2\u0083"+
		"\u0084\7\t\2\2\u0084\u0087\3\2\2\2\u0085\u0087\5\20\t\2\u0086}\3\2\2\2"+
		"\u0086\u0081\3\2\2\2\u0086\u0085\3\2\2\2\u0087\u0092\3\2\2\2\u0088\u0089"+
		"\f\7\2\2\u0089\u008a\5\24\13\2\u008a\u008b\5\22\n\b\u008b\u0091\3\2\2"+
		"\2\u008c\u008d\f\6\2\2\u008d\u008e\5\26\f\2\u008e\u008f\5\22\n\7\u008f"+
		"\u0091\3\2\2\2\u0090\u0088\3\2\2\2\u0090\u008c\3\2\2\2\u0091\u0094\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\23\3\2\2\2\u0094\u0092"+
		"\3\2\2\2\u0095\u0096\t\2\2\2\u0096\25\3\2\2\2\u0097\u0098\t\3\2\2\u0098"+
		"\27\3\2\2\2\u0099\u009a\t\4\2\2\u009a\31\3\2\2\2\u009b\u009c\5\34\17\2"+
		"\u009c\u009d\58\35\2\u009d\33\3\2\2\2\u009e\u00a3\5\36\20\2\u009f\u00a0"+
		"\7\23\2\2\u00a0\u00a2\5\36\20\2\u00a1\u009f\3\2\2\2\u00a2\u00a5\3\2\2"+
		"\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\35\3\2\2\2\u00a5\u00a3"+
		"\3\2\2\2\u00a6\u00a8\5\60\31\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2"+
		"\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00b1\3\2\2\2\u00ab\u00a9"+
		"\3\2\2\2\u00ac\u00ad\5.\30\2\u00ad\u00ae\5\60\31\2\u00ae\u00b0\3\2\2\2"+
		"\u00af\u00ac\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00b7\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b6\5\64\33\2"+
		"\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\u00bd\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bc\5\62\32\2"+
		"\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be"+
		"\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c2\5 \21\2\u00c1"+
		"\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c5\5\""+
		"\22\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\37\3\2\2\2\u00c6\u00c8"+
		"\7\b\2\2\u00c7\u00c9\5(\25\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cb\7\t\2\2\u00cb!\3\2\2\2\u00cc\u00cd\7*\2\2\u00cd"+
		"\u00ce\5$\23\2\u00ce#\3\2\2\2\u00cf\u00d4\5&\24\2\u00d0\u00d1\7%\2\2\u00d1"+
		"\u00d3\5&\24\2\u00d2\u00d0\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00e0\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"\u00dc\5&\24\2\u00d8\u00d9\7\23\2\2\u00d9\u00db\5&\24\2\u00da\u00d8\3"+
		"\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00cf\3\2\2\2\u00df\u00d7\3\2"+
		"\2\2\u00e0%\3\2\2\2\u00e1\u00e3\7&\2\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\7\b\2\2\u00e5\u00e6\5\22\n\2"+
		"\u00e6\u00e7\7\t\2\2\u00e7\'\3\2\2\2\u00e8\u00ed\5*\26\2\u00e9\u00ea\7"+
		"\23\2\2\u00ea\u00ec\5*\26\2\u00eb\u00e9\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee)\3\2\2\2\u00ef\u00ed\3\2\2\2"+
		"\u00f0\u00f3\5,\27\2\u00f1\u00f2\7\21\2\2\u00f2\u00f4\5L\'\2\u00f3\u00f1"+
		"\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4+\3\2\2\2\u00f5\u00f8\7-\2\2\u00f6\u00f8"+
		"\5\f\7\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8-\3\2\2\2\u00f9"+
		"\u00fa\t\5\2\2\u00fa/\3\2\2\2\u00fb\u0106\7-\2\2\u00fc\u00fd\7\30\2\2"+
		"\u00fd\u0106\7-\2\2\u00fe\u00ff\7\24\2\2\u00ff\u0106\7-\2\2\u0100\u0101"+
		"\7\26\2\2\u0101\u0106\7-\2\2\u0102\u0106\7\27\2\2\u0103\u0106\7\33\2\2"+
		"\u0104\u0106\5\16\b\2\u0105\u00fb\3\2\2\2\u0105\u00fc\3\2\2\2\u0105\u00fe"+
		"\3\2\2\2\u0105\u0100\3\2\2\2\u0105\u0102\3\2\2\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0104\3\2\2\2\u0106\61\3\2\2\2\u0107\u0108\t\6\2\2\u0108\u010c\t\7\2"+
		"\2\u0109\u010a\t\6\2\2\u010a\u010c\5D#\2\u010b\u0107\3\2\2\2\u010b\u0109"+
		"\3\2\2\2\u010c\63\3\2\2\2\u010d\u010e\7\f\2\2\u010e\u0112\7-\2\2\u010f"+
		"\u0110\5\66\34\2\u0110\u0111\t\b\2\2\u0111\u0113\3\2\2\2\u0112\u010f\3"+
		"\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\7\r\2\2\u0115"+
		"\65\3\2\2\2\u0116\u0117\t\t\2\2\u0117\67\3\2\2\2\u0118\u011f\7\n\2\2\u0119"+
		"\u011a\5:\36\2\u011a\u011b\7\22\2\2\u011b\u011e\3\2\2\2\u011c\u011e\5"+
		"\4\3\2\u011d\u0119\3\2\2\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2"+
		"\2\2\u0122\u0124\5:\36\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u0126\7\13\2\2\u01269\3\2\2\2\u0127\u0129\5B\"\2"+
		"\u0128\u012a\7,\2\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0132"+
		"\3\2\2\2\u012b\u012c\5<\37\2\u012c\u012d\7\21\2\2\u012d\u012f\5@!\2\u012e"+
		"\u0130\7,\2\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2"+
		"\2\2\u0131\u0127\3\2\2\2\u0131\u012b\3\2\2\2\u0132;\3\2\2\2\u0133\u013c"+
		"\7-\2\2\u0134\u0136\7-\2\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0139\5> \2\u0138\u013a\7-\2\2\u0139\u0138\3\2\2"+
		"\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0133\3\2\2\2\u013b\u0135"+
		"\3\2\2\2\u013c=\3\2\2\2\u013d\u013e\7 \2\2\u013e\u013f\7\65\2\2\u013f"+
		"\u0140\7\64\2\2\u0140?\3\2\2\2\u0141\u0146\5L\'\2\u0142\u0143\7\23\2\2"+
		"\u0143\u0145\5L\'\2\u0144\u0142\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144"+
		"\3\2\2\2\u0146\u0147\3\2\2\2\u0147A\3\2\2\2\u0148\u0146\3\2\2\2\u0149"+
		"\u014f\5\60\31\2\u014a\u014c\7\b\2\2\u014b\u014d\5F$\2\u014c\u014b\3\2"+
		"\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150\7\t\2\2\u014f"+
		"\u014a\3\2\2\2\u014f\u0150\3\2\2\2\u0150C\3\2\2\2\u0151\u0152\7-\2\2\u0152"+
		"\u0154\7\b\2\2\u0153\u0155\5F$\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2"+
		"\2\u0155\u0156\3\2\2\2\u0156\u0157\7\t\2\2\u0157E\3\2\2\2\u0158\u015d"+
		"\5H%\2\u0159\u015a\7\23\2\2\u015a\u015c\5H%\2\u015b\u0159\3\2\2\2\u015c"+
		"\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015eG\3\2\2\2"+
		"\u015f\u015d\3\2\2\2\u0160\u0161\5L\'\2\u0161I\3\2\2\2\u0162\u0167\5\22"+
		"\n\2\u0163\u0164\7\23\2\2\u0164\u0166\5\22\n\2\u0165\u0163\3\2\2\2\u0166"+
		"\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168K\3\2\2\2"+
		"\u0169\u0167\3\2\2\2\u016a\u016e\5\22\n\2\u016b\u016d\5\22\n\2\u016c\u016b"+
		"\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"M\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0173\7\30\2\2\u0172\u0174\t\n\2\2"+
		"\u0173\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176"+
		"\3\2\2\2\u0176O\3\2\2\2-S[_r{\u0086\u0090\u0092\u00a3\u00a9\u00b1\u00b7"+
		"\u00bd\u00c1\u00c4\u00c8\u00d4\u00dc\u00df\u00e2\u00ed\u00f3\u00f7\u0105"+
		"\u010b\u0112\u011d\u011f\u0123\u0129\u012f\u0131\u0135\u0139\u013b\u0146"+
		"\u014c\u014f\u0154\u015d\u0167\u016e\u0175";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}