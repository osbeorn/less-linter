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
		DOLLAR=19, LT=14, LBRACK=10, ONLY=43, LTEQ=34, INTERPOLATION_END=52, MEDIA=42, 
		AND=21, ANDW=35, LPAREN=6, INTERPOLATION_START=30, AT=20, ML_COMMENT=51, 
		RPAREN=7, IMPORT=41, STRING_LITERAL=46, IN=2, COMMA=17, TIL=13, TILD_EQ=39, 
		IDENT=45, PLUS=24, NL=49, EQ=37, DOT=18, PIPE_EQ=38, NOTW=36, EQEQ=31, 
		RBRACK=11, NULL=1, QUOT=29, NUMBER=47, HASH=22, ELLIPSIS=5, LCURLY=8, 
		MINUS=27, GTEQ=33, SEMI=16, IMPORTANT=44, COLON=15, COLONCOLON=23, UNIT=3, 
		NOTEQ=32, WS=48, PERC=28, WHEN=40, SL_COMMENT=50, RCURLY=9, GT=12, INTERPOLATION=53, 
		DIV=26, TIMES=25, COMBINE_COMPARE=4;
	public static final String[] tokenNames = {
		"<INVALID>", "'null'", "'in'", "UNIT", "COMBINE_COMPARE", "'...'", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "'>'", "'~'", "'<'", "':'", "';'", 
		"','", "'.'", "'$'", "'@'", "'&'", "'#'", "'::'", "'+'", "'*'", "'/'", 
		"'-'", "'%'", "'\"'", "'@{'", "'=='", "'!='", "'>='", "'<='", "'and'", 
		"'not'", "'='", "'|='", "'~='", "'when'", "'@import'", "'@media'", "'only'", 
		"'!important'", "IDENT", "STRING_LITERAL", "NUMBER", "WS", "NL", "SL_COMMENT", 
		"ML_COMMENT", "INTERPOLATION_END", "INTERPOLATION"
	};
	public static final int
		RULE_stylesheet = 0, RULE_statement = 1, RULE_mediaStatement = 2, RULE_mediaQueryList = 3, 
		RULE_mediaQuery = 4, RULE_mediaQueryExpression = 5, RULE_importStatement = 6, 
		RULE_keyword = 7, RULE_variableStatement = 8, RULE_variableName = 9, RULE_measurement = 10, 
		RULE_expression = 11, RULE_expressionStatement = 12, RULE_mathCharacter = 13, 
		RULE_boolCharacter = 14, RULE_mathPrefixCharacter = 15, RULE_ruleStatement = 16, 
		RULE_selectors = 17, RULE_selector = 18, RULE_mixin = 19, RULE_mixinGuards = 20, 
		RULE_mixinGuardsList = 21, RULE_mixinGuard = 22, RULE_mixinParams = 23, 
		RULE_mixinParam = 24, RULE_mixinParamName = 25, RULE_selectorPrefix = 26, 
		RULE_element = 27, RULE_pseudo = 28, RULE_attrib = 29, RULE_attribRelate = 30, 
		RULE_block = 31, RULE_property = 32, RULE_propertyStatement = 33, RULE_propertyIdent = 34, 
		RULE_varInterpolationIdent = 35, RULE_varInterpolation = 36, RULE_propertyValues = 37, 
		RULE_mixinCall = 38, RULE_functionCall = 39, RULE_callParams = 40, RULE_callParam = 41, 
		RULE_commaValues = 42, RULE_values = 43, RULE_color = 44;
	public static final String[] ruleNames = {
		"stylesheet", "statement", "mediaStatement", "mediaQueryList", "mediaQuery", 
		"mediaQueryExpression", "importStatement", "keyword", "variableStatement", 
		"variableName", "measurement", "expression", "expressionStatement", "mathCharacter", 
		"boolCharacter", "mathPrefixCharacter", "ruleStatement", "selectors", 
		"selector", "mixin", "mixinGuards", "mixinGuardsList", "mixinGuard", "mixinParams", 
		"mixinParam", "mixinParamName", "selectorPrefix", "element", "pseudo", 
		"attrib", "attribRelate", "block", "property", "propertyStatement", "propertyIdent", 
		"varInterpolationIdent", "varInterpolation", "propertyValues", "mixinCall", 
		"functionCall", "callParams", "callParam", "commaValues", "values", "color"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitStylesheet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LCURLY) | (1L << LBRACK) | (1L << GT) | (1L << TIL) | (1L << COLON) | (1L << COMMA) | (1L << DOT) | (1L << AT) | (1L << AND) | (1L << HASH) | (1L << COLONCOLON) | (1L << PLUS) | (1L << TIMES) | (1L << WHEN) | (1L << IMPORT) | (1L << MEDIA) | (1L << IDENT) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(90); statement();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96); match(EOF);
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
		public MediaStatementContext mediaStatement() {
			return getRuleContext(MediaStatementContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(102);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98); importStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99); variableStatement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(100); ruleStatement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(101); mediaStatement();
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

	public static class MediaStatementContext extends ParserRuleContext {
		public TerminalNode MEDIA() { return getToken(MyLessParser.MEDIA, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MediaQueryListContext mediaQueryList() {
			return getRuleContext(MediaQueryListContext.class,0);
		}
		public MediaStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterMediaStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitMediaStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitMediaStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaStatementContext mediaStatement() throws RecognitionException {
		MediaStatementContext _localctx = new MediaStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mediaStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); match(MEDIA);
			setState(105); mediaQueryList();
			setState(106); block();
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

	public static class MediaQueryListContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(MyLessParser.COMMA); }
		public List<MediaQueryContext> mediaQuery() {
			return getRuleContexts(MediaQueryContext.class);
		}
		public MediaQueryContext mediaQuery(int i) {
			return getRuleContext(MediaQueryContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(MyLessParser.COMMA, i);
		}
		public MediaQueryListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaQueryList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterMediaQueryList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitMediaQueryList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitMediaQueryList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaQueryListContext mediaQueryList() throws RecognitionException {
		MediaQueryListContext _localctx = new MediaQueryListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mediaQueryList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); mediaQuery();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(109); match(COMMA);
				setState(110); mediaQuery();
				}
				}
				setState(115);
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

	public static class MediaQueryContext extends ParserRuleContext {
		public List<TerminalNode> ANDW() { return getTokens(MyLessParser.ANDW); }
		public TerminalNode ONLY() { return getToken(MyLessParser.ONLY, 0); }
		public MediaQueryExpressionContext mediaQueryExpression(int i) {
			return getRuleContext(MediaQueryExpressionContext.class,i);
		}
		public List<MediaQueryExpressionContext> mediaQueryExpression() {
			return getRuleContexts(MediaQueryExpressionContext.class);
		}
		public TerminalNode ANDW(int i) {
			return getToken(MyLessParser.ANDW, i);
		}
		public TerminalNode NOTW() { return getToken(MyLessParser.NOTW, 0); }
		public TerminalNode IDENT() { return getToken(MyLessParser.IDENT, 0); }
		public MediaQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterMediaQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitMediaQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitMediaQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaQueryContext mediaQuery() throws RecognitionException {
		MediaQueryContext _localctx = new MediaQueryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mediaQuery);
		int _la;
		try {
			setState(135);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				_la = _input.LA(1);
				if (_la==NOTW || _la==ONLY) {
					{
					setState(116);
					_la = _input.LA(1);
					if ( !(_la==NOTW || _la==ONLY) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(119); match(IDENT);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ANDW) {
					{
					{
					setState(120); match(ANDW);
					setState(121); mediaQueryExpression();
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127); mediaQueryExpression();
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ANDW) {
					{
					{
					setState(128); match(ANDW);
					setState(129); mediaQueryExpression();
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class MediaQueryExpressionContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(MyLessParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(MyLessParser.LPAREN, 0); }
		public TerminalNode COLON() { return getToken(MyLessParser.COLON, 0); }
		public TerminalNode IDENT() { return getToken(MyLessParser.IDENT, 0); }
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public MediaQueryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaQueryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterMediaQueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitMediaQueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitMediaQueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaQueryExpressionContext mediaQueryExpression() throws RecognitionException {
		MediaQueryExpressionContext _localctx = new MediaQueryExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mediaQueryExpression);
		try {
			setState(144);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(137); match(IDENT);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(138); match(LPAREN);
				setState(139); match(IDENT);
				setState(140); match(COLON);
				setState(141); expressionStatement(0);
				setState(142); match(RPAREN);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); match(IMPORT);
			setState(148);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(147); keyword();
				}
			}

			setState(150); match(STRING_LITERAL);
			setState(151); match(SEMI);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153); match(LPAREN);
			setState(154); match(IDENT);
			setState(155); match(RPAREN);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitVariableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157); variableName();
			setState(158); match(COLON);
			setState(159); commaValues();
			setState(160); match(SEMI);
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
		public TerminalNode MEDIA() { return getToken(MyLessParser.MEDIA, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableName);
		try {
			setState(165);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(162); match(AT);
				setState(163); match(IDENT);
				}
				break;
			case MEDIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(164); match(MEDIA);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitMeasurement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeasurementContext measurement() throws RecognitionException {
		MeasurementContext _localctx = new MeasurementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_measurement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); match(NUMBER);
			setState(169);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(168); match(UNIT);
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
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		try {
			setState(179);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171); variableName();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172); functionCall();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(173); measurement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(174); color();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(175); element();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(176); match(IDENT);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(177); match(STRING_LITERAL);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(178); match(NULL);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expressionStatement, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				{
				setState(182); mathPrefixCharacter();
				setState(183); expressionStatement(2);
				}
				break;
			case LPAREN:
				{
				setState(185); match(LPAREN);
				setState(186); expressionStatement(0);
				setState(187); match(RPAREN);
				}
				break;
			case NULL:
			case DOT:
			case AT:
			case AND:
			case HASH:
			case TIMES:
			case NOTW:
			case MEDIA:
			case IDENT:
			case STRING_LITERAL:
			case NUMBER:
				{
				setState(189); expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(200);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionStatementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionStatement);
						setState(192);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(193); mathCharacter();
						setState(194); expressionStatement(6);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionStatementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionStatement);
						setState(196);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(197); boolCharacter();
						setState(198); expressionStatement(5);
						}
						break;
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitMathCharacter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathCharacterContext mathCharacter() throws RecognitionException {
		MathCharacterContext _localctx = new MathCharacterContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mathCharacter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitBoolCharacter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolCharacterContext boolCharacter() throws RecognitionException {
		BoolCharacterContext _localctx = new BoolCharacterContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_boolCharacter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitMathPrefixCharacter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathPrefixCharacterContext mathPrefixCharacter() throws RecognitionException {
		MathPrefixCharacterContext _localctx = new MathPrefixCharacterContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mathPrefixCharacter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitRuleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleStatementContext ruleStatement() throws RecognitionException {
		RuleStatementContext _localctx = new RuleStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ruleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211); selectors();
			setState(212); block();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitSelectors(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorsContext selectors() throws RecognitionException {
		SelectorsContext _localctx = new SelectorsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_selectors);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214); selector();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(215); match(COMMA);
				setState(216); selector();
				}
				}
				setState(221);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_selector);
		int _la;
		try {
			setState(268);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT) | (1L << AT) | (1L << AND) | (1L << HASH) | (1L << TIMES) | (1L << IDENT) | (1L << NUMBER))) != 0)) {
					{
					{
					setState(222); element();
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << TIL) | (1L << PLUS))) != 0)) {
					{
					{
					setState(228); selectorPrefix();
					setState(229); element();
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(236); attrib();
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON || _la==COLONCOLON) {
					{
					{
					setState(242); pseudo();
					}
					}
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT) | (1L << AT) | (1L << AND) | (1L << HASH) | (1L << TIMES) | (1L << IDENT) | (1L << NUMBER))) != 0)) {
					{
					{
					setState(248); element();
					}
					}
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << TIL) | (1L << PLUS))) != 0)) {
					{
					{
					setState(254); selectorPrefix();
					setState(255); element();
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(263);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(262); mixin();
					}
				}

				setState(266);
				_la = _input.LA(1);
				if (_la==WHEN) {
					{
					setState(265); mixinGuards();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitMixin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MixinContext mixin() throws RecognitionException {
		MixinContext _localctx = new MixinContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_mixin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270); match(LPAREN);
			setState(272);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MEDIA) | (1L << IDENT))) != 0)) {
				{
				setState(271); mixinParams();
				}
			}

			setState(274); match(RPAREN);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitMixinGuards(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MixinGuardsContext mixinGuards() throws RecognitionException {
		MixinGuardsContext _localctx = new MixinGuardsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_mixinGuards);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276); match(WHEN);
			setState(277); mixinGuardsList();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitMixinGuardsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MixinGuardsListContext mixinGuardsList() throws RecognitionException {
		MixinGuardsListContext _localctx = new MixinGuardsListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_mixinGuardsList);
		int _la;
		try {
			int _alt;
			setState(295);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279); mixinGuard();
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ANDW) {
					{
					{
					setState(280); match(ANDW);
					setState(281); mixinGuard();
					}
					}
					setState(286);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287); mixinGuard();
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(288); match(COMMA);
						setState(289); mixinGuard();
						}
						} 
					}
					setState(294);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitMixinGuard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MixinGuardContext mixinGuard() throws RecognitionException {
		MixinGuardContext _localctx = new MixinGuardContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mixinGuard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_la = _input.LA(1);
			if (_la==NOTW) {
				{
				setState(297); match(NOTW);
				}
			}

			setState(300); match(LPAREN);
			setState(301); expressionStatement(0);
			setState(302); match(RPAREN);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitMixinParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MixinParamsContext mixinParams() throws RecognitionException {
		MixinParamsContext _localctx = new MixinParamsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_mixinParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304); mixinParam();
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(305); match(COMMA);
				setState(306); mixinParam();
				}
				}
				setState(311);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitMixinParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MixinParamContext mixinParam() throws RecognitionException {
		MixinParamContext _localctx = new MixinParamContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_mixinParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312); mixinParamName();
			setState(315);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(313); match(COLON);
				setState(314); values();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitMixinParamName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MixinParamNameContext mixinParamName() throws RecognitionException {
		MixinParamNameContext _localctx = new MixinParamNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_mixinParamName);
		try {
			setState(319);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(317); match(IDENT);
				}
				break;
			case AT:
			case MEDIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(318); variableName();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitSelectorPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorPrefixContext selectorPrefix() throws RecognitionException {
		SelectorPrefixContext _localctx = new SelectorPrefixContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_selectorPrefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_element);
		try {
			setState(333);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(323); match(IDENT);
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(324); match(HASH);
				setState(325); match(IDENT);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(326); match(DOT);
				setState(327); match(IDENT);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 4);
				{
				setState(328); match(AT);
				setState(329); match(IDENT);
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 5);
				{
				setState(330); match(AND);
				}
				break;
			case TIMES:
				enterOuterAlt(_localctx, 6);
				{
				setState(331); match(TIMES);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 7);
				{
				setState(332); measurement();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitPseudo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoContext pseudo() throws RecognitionException {
		PseudoContext _localctx = new PseudoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_pseudo);
		int _la;
		try {
			setState(339);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==COLONCOLON) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(336);
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
				setState(337);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==COLONCOLON) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(338); functionCall();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitAttrib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttribContext attrib() throws RecognitionException {
		AttribContext _localctx = new AttribContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_attrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341); match(LBRACK);
			setState(342); match(IDENT);
			setState(346);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << PIPE_EQ) | (1L << TILD_EQ))) != 0)) {
				{
				setState(343); attribRelate();
				setState(344);
				_la = _input.LA(1);
				if ( !(_la==IDENT || _la==STRING_LITERAL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(348); match(RBRACK);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitAttribRelate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttribRelateContext attribRelate() throws RecognitionException {
		AttribRelateContext _localctx = new AttribRelateContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_attribRelate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352); match(LCURLY);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LCURLY) | (1L << LBRACK) | (1L << GT) | (1L << TIL) | (1L << COLON) | (1L << COMMA) | (1L << DOT) | (1L << AT) | (1L << AND) | (1L << HASH) | (1L << COLONCOLON) | (1L << PLUS) | (1L << TIMES) | (1L << INTERPOLATION_START) | (1L << WHEN) | (1L << IMPORT) | (1L << MEDIA) | (1L << IDENT) | (1L << NUMBER))) != 0)) {
				{
				setState(357);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(353); property();
					setState(354); match(SEMI);
					}
					break;

				case 2:
					{
					setState(356); statement();
					}
					break;
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(362); match(RCURLY);
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
		public PropertyStatementContext propertyStatement() {
			return getRuleContext(PropertyStatementContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_property);
		try {
			setState(366);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(364); mixinCall();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365); propertyStatement();
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

	public static class PropertyStatementContext extends ParserRuleContext {
		public TerminalNode IMPORTANT() { return getToken(MyLessParser.IMPORTANT, 0); }
		public PropertyValuesContext propertyValues() {
			return getRuleContext(PropertyValuesContext.class,0);
		}
		public PropertyIdentContext propertyIdent() {
			return getRuleContext(PropertyIdentContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MyLessParser.COLON, 0); }
		public PropertyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterPropertyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitPropertyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitPropertyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyStatementContext propertyStatement() throws RecognitionException {
		PropertyStatementContext _localctx = new PropertyStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_propertyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368); propertyIdent();
			setState(369); match(COLON);
			setState(370); propertyValues();
			setState(372);
			_la = _input.LA(1);
			if (_la==IMPORTANT) {
				{
				setState(371); match(IMPORTANT);
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

	public static class PropertyIdentContext extends ParserRuleContext {
		public VarInterpolationIdentContext varInterpolationIdent() {
			return getRuleContext(VarInterpolationIdentContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MyLessParser.IDENT, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitPropertyIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyIdentContext propertyIdent() throws RecognitionException {
		PropertyIdentContext _localctx = new PropertyIdentContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_propertyIdent);
		try {
			setState(376);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(374); match(IDENT);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(375); varInterpolationIdent();
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

	public static class VarInterpolationIdentContext extends ParserRuleContext {
		public VarInterpolationContext varInterpolation() {
			return getRuleContext(VarInterpolationContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(MyLessParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(MyLessParser.IDENT, i);
		}
		public VarInterpolationIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varInterpolationIdent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).enterVarInterpolationIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLessParserListener ) ((MyLessParserListener)listener).exitVarInterpolationIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitVarInterpolationIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarInterpolationIdentContext varInterpolationIdent() throws RecognitionException {
		VarInterpolationIdentContext _localctx = new VarInterpolationIdentContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_varInterpolationIdent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(378); match(IDENT);
				}
			}

			setState(381); varInterpolation();
			setState(383);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(382); match(IDENT);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitVarInterpolation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarInterpolationContext varInterpolation() throws RecognitionException {
		VarInterpolationContext _localctx = new VarInterpolationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_varInterpolation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385); match(INTERPOLATION_START);
			setState(386); match(INTERPOLATION);
			setState(387); match(INTERPOLATION_END);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitPropertyValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyValuesContext propertyValues() throws RecognitionException {
		PropertyValuesContext _localctx = new PropertyValuesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_propertyValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389); values();
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(390); match(COMMA);
				setState(391); values();
				}
				}
				setState(396);
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
		public TerminalNode IMPORTANT() { return getToken(MyLessParser.IMPORTANT, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitMixinCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MixinCallContext mixinCall() throws RecognitionException {
		MixinCallContext _localctx = new MixinCallContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_mixinCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397); element();
			setState(403);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(398); match(LPAREN);
				setState(400);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << LPAREN) | (1L << DOT) | (1L << AT) | (1L << AND) | (1L << HASH) | (1L << PLUS) | (1L << TIMES) | (1L << MINUS) | (1L << NOTW) | (1L << MEDIA) | (1L << IDENT) | (1L << STRING_LITERAL) | (1L << NUMBER))) != 0)) {
					{
					setState(399); callParams();
					}
				}

				setState(402); match(RPAREN);
				}
			}

			setState(406);
			_la = _input.LA(1);
			if (_la==IMPORTANT) {
				{
				setState(405); match(IMPORTANT);
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
		public TerminalNode NOTW() { return getToken(MyLessParser.NOTW, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_la = _input.LA(1);
			if ( !(_la==NOTW || _la==IDENT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(409); match(LPAREN);
			setState(411);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << LPAREN) | (1L << DOT) | (1L << AT) | (1L << AND) | (1L << HASH) | (1L << PLUS) | (1L << TIMES) | (1L << MINUS) | (1L << NOTW) | (1L << MEDIA) | (1L << IDENT) | (1L << STRING_LITERAL) | (1L << NUMBER))) != 0)) {
				{
				setState(410); callParams();
				}
			}

			setState(413); match(RPAREN);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitCallParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallParamsContext callParams() throws RecognitionException {
		CallParamsContext _localctx = new CallParamsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_callParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415); callParam();
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(416); match(COMMA);
				setState(417); callParam();
				}
				}
				setState(422);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitCallParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallParamContext callParam() throws RecognitionException {
		CallParamContext _localctx = new CallParamContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_callParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423); values();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitCommaValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommaValuesContext commaValues() throws RecognitionException {
		CommaValuesContext _localctx = new CommaValuesContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_commaValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425); expressionStatement(0);
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(426); match(COMMA);
				setState(427); expressionStatement(0);
				}
				}
				setState(432);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433); expressionStatement(0);
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << LPAREN) | (1L << DOT) | (1L << AT) | (1L << AND) | (1L << HASH) | (1L << PLUS) | (1L << TIMES) | (1L << MINUS) | (1L << NOTW) | (1L << MEDIA) | (1L << IDENT) | (1L << STRING_LITERAL) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(434); expressionStatement(0);
				}
				}
				setState(439);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLessParserVisitor ) return ((MyLessParserVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_color);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(440); match(HASH);
			setState(442); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(441);
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
				setState(444); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
		case 12: return expressionStatement_sempred((ExpressionStatementContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\67\u01c1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\7\2^\n\2\f\2\16\2a\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5"+
		"\3i\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5r\n\5\f\5\16\5u\13\5\3\6\5\6x\n"+
		"\6\3\6\3\6\3\6\7\6}\n\6\f\6\16\6\u0080\13\6\3\6\3\6\3\6\7\6\u0085\n\6"+
		"\f\6\16\6\u0088\13\6\5\6\u008a\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0093"+
		"\n\7\3\b\3\b\5\b\u0097\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\5\13\u00a8\n\13\3\f\3\f\5\f\u00ac\n\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u00b6\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u00c1\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16"+
		"\u00cb\n\16\f\16\16\16\u00ce\13\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\7\23\u00dc\n\23\f\23\16\23\u00df\13\23\3\24"+
		"\7\24\u00e2\n\24\f\24\16\24\u00e5\13\24\3\24\3\24\3\24\7\24\u00ea\n\24"+
		"\f\24\16\24\u00ed\13\24\3\24\7\24\u00f0\n\24\f\24\16\24\u00f3\13\24\3"+
		"\24\7\24\u00f6\n\24\f\24\16\24\u00f9\13\24\3\24\7\24\u00fc\n\24\f\24\16"+
		"\24\u00ff\13\24\3\24\3\24\3\24\7\24\u0104\n\24\f\24\16\24\u0107\13\24"+
		"\3\24\5\24\u010a\n\24\3\24\5\24\u010d\n\24\5\24\u010f\n\24\3\25\3\25\5"+
		"\25\u0113\n\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\7\27\u011d\n\27"+
		"\f\27\16\27\u0120\13\27\3\27\3\27\3\27\7\27\u0125\n\27\f\27\16\27\u0128"+
		"\13\27\5\27\u012a\n\27\3\30\5\30\u012d\n\30\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\7\31\u0136\n\31\f\31\16\31\u0139\13\31\3\32\3\32\3\32\5\32\u013e"+
		"\n\32\3\33\3\33\5\33\u0142\n\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u0150\n\35\3\36\3\36\3\36\3\36\5\36\u0156\n"+
		"\36\3\37\3\37\3\37\3\37\3\37\5\37\u015d\n\37\3\37\3\37\3 \3 \3!\3!\3!"+
		"\3!\3!\7!\u0168\n!\f!\16!\u016b\13!\3!\3!\3\"\3\"\5\"\u0171\n\"\3#\3#"+
		"\3#\3#\5#\u0177\n#\3$\3$\5$\u017b\n$\3%\5%\u017e\n%\3%\3%\5%\u0182\n%"+
		"\3&\3&\3&\3&\3\'\3\'\3\'\7\'\u018b\n\'\f\'\16\'\u018e\13\'\3(\3(\3(\5"+
		"(\u0193\n(\3(\5(\u0196\n(\3(\5(\u0199\n(\3)\3)\3)\5)\u019e\n)\3)\3)\3"+
		"*\3*\3*\7*\u01a5\n*\f*\16*\u01a8\13*\3+\3+\3,\3,\3,\7,\u01af\n,\f,\16"+
		",\u01b2\13,\3-\3-\7-\u01b6\n-\f-\16-\u01b9\13-\3.\3.\6.\u01bd\n.\r.\16"+
		".\u01be\3.\2\3\32/\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\2\f\4\2&&--\3\2\32\35\6\2\16\16\20\20\"$\'"+
		"\'\4\2\32\32\35\35\4\2\16\17\32\32\4\2\21\21\31\31\4\2&&//\3\2/\60\3\2"+
		"\')\4\2//\61\61\u01d5\2_\3\2\2\2\4h\3\2\2\2\6j\3\2\2\2\bn\3\2\2\2\n\u0089"+
		"\3\2\2\2\f\u0092\3\2\2\2\16\u0094\3\2\2\2\20\u009b\3\2\2\2\22\u009f\3"+
		"\2\2\2\24\u00a7\3\2\2\2\26\u00a9\3\2\2\2\30\u00b5\3\2\2\2\32\u00c0\3\2"+
		"\2\2\34\u00cf\3\2\2\2\36\u00d1\3\2\2\2 \u00d3\3\2\2\2\"\u00d5\3\2\2\2"+
		"$\u00d8\3\2\2\2&\u010e\3\2\2\2(\u0110\3\2\2\2*\u0116\3\2\2\2,\u0129\3"+
		"\2\2\2.\u012c\3\2\2\2\60\u0132\3\2\2\2\62\u013a\3\2\2\2\64\u0141\3\2\2"+
		"\2\66\u0143\3\2\2\28\u014f\3\2\2\2:\u0155\3\2\2\2<\u0157\3\2\2\2>\u0160"+
		"\3\2\2\2@\u0162\3\2\2\2B\u0170\3\2\2\2D\u0172\3\2\2\2F\u017a\3\2\2\2H"+
		"\u017d\3\2\2\2J\u0183\3\2\2\2L\u0187\3\2\2\2N\u018f\3\2\2\2P\u019a\3\2"+
		"\2\2R\u01a1\3\2\2\2T\u01a9\3\2\2\2V\u01ab\3\2\2\2X\u01b3\3\2\2\2Z\u01ba"+
		"\3\2\2\2\\^\5\4\3\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2"+
		"a_\3\2\2\2bc\7\2\2\3c\3\3\2\2\2di\5\16\b\2ei\5\22\n\2fi\5\"\22\2gi\5\6"+
		"\4\2hd\3\2\2\2he\3\2\2\2hf\3\2\2\2hg\3\2\2\2i\5\3\2\2\2jk\7,\2\2kl\5\b"+
		"\5\2lm\5@!\2m\7\3\2\2\2ns\5\n\6\2op\7\23\2\2pr\5\n\6\2qo\3\2\2\2ru\3\2"+
		"\2\2sq\3\2\2\2st\3\2\2\2t\t\3\2\2\2us\3\2\2\2vx\t\2\2\2wv\3\2\2\2wx\3"+
		"\2\2\2xy\3\2\2\2y~\7/\2\2z{\7%\2\2{}\5\f\7\2|z\3\2\2\2}\u0080\3\2\2\2"+
		"~|\3\2\2\2~\177\3\2\2\2\177\u008a\3\2\2\2\u0080~\3\2\2\2\u0081\u0086\5"+
		"\f\7\2\u0082\u0083\7%\2\2\u0083\u0085\5\f\7\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008a\3\2"+
		"\2\2\u0088\u0086\3\2\2\2\u0089w\3\2\2\2\u0089\u0081\3\2\2\2\u008a\13\3"+
		"\2\2\2\u008b\u0093\7/\2\2\u008c\u008d\7\b\2\2\u008d\u008e\7/\2\2\u008e"+
		"\u008f\7\21\2\2\u008f\u0090\5\32\16\2\u0090\u0091\7\t\2\2\u0091\u0093"+
		"\3\2\2\2\u0092\u008b\3\2\2\2\u0092\u008c\3\2\2\2\u0093\r\3\2\2\2\u0094"+
		"\u0096\7+\2\2\u0095\u0097\5\20\t\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7\60\2\2\u0099\u009a\7\22\2\2\u009a"+
		"\17\3\2\2\2\u009b\u009c\7\b\2\2\u009c\u009d\7/\2\2\u009d\u009e\7\t\2\2"+
		"\u009e\21\3\2\2\2\u009f\u00a0\5\24\13\2\u00a0\u00a1\7\21\2\2\u00a1\u00a2"+
		"\5V,\2\u00a2\u00a3\7\22\2\2\u00a3\23\3\2\2\2\u00a4\u00a5\7\26\2\2\u00a5"+
		"\u00a8\7/\2\2\u00a6\u00a8\7,\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a6\3\2\2"+
		"\2\u00a8\25\3\2\2\2\u00a9\u00ab\7\61\2\2\u00aa\u00ac\7\5\2\2\u00ab\u00aa"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\27\3\2\2\2\u00ad\u00b6\5\24\13\2\u00ae"+
		"\u00b6\5P)\2\u00af\u00b6\5\26\f\2\u00b0\u00b6\5Z.\2\u00b1\u00b6\58\35"+
		"\2\u00b2\u00b6\7/\2\2\u00b3\u00b6\7\60\2\2\u00b4\u00b6\7\3\2\2\u00b5\u00ad"+
		"\3\2\2\2\u00b5\u00ae\3\2\2\2\u00b5\u00af\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b5"+
		"\u00b1\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2"+
		"\2\2\u00b6\31\3\2\2\2\u00b7\u00b8\b\16\1\2\u00b8\u00b9\5 \21\2\u00b9\u00ba"+
		"\5\32\16\4\u00ba\u00c1\3\2\2\2\u00bb\u00bc\7\b\2\2\u00bc\u00bd\5\32\16"+
		"\2\u00bd\u00be\7\t\2\2\u00be\u00c1\3\2\2\2\u00bf\u00c1\5\30\r\2\u00c0"+
		"\u00b7\3\2\2\2\u00c0\u00bb\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00cc\3\2"+
		"\2\2\u00c2\u00c3\f\7\2\2\u00c3\u00c4\5\34\17\2\u00c4\u00c5\5\32\16\b\u00c5"+
		"\u00cb\3\2\2\2\u00c6\u00c7\f\6\2\2\u00c7\u00c8\5\36\20\2\u00c8\u00c9\5"+
		"\32\16\7\u00c9\u00cb\3\2\2\2\u00ca\u00c2\3\2\2\2\u00ca\u00c6\3\2\2\2\u00cb"+
		"\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\33\3\2\2"+
		"\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\t\3\2\2\u00d0\35\3\2\2\2\u00d1\u00d2"+
		"\t\4\2\2\u00d2\37\3\2\2\2\u00d3\u00d4\t\5\2\2\u00d4!\3\2\2\2\u00d5\u00d6"+
		"\5$\23\2\u00d6\u00d7\5@!\2\u00d7#\3\2\2\2\u00d8\u00dd\5&\24\2\u00d9\u00da"+
		"\7\23\2\2\u00da\u00dc\5&\24\2\u00db\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2"+
		"\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de%\3\2\2\2\u00df\u00dd\3"+
		"\2\2\2\u00e0\u00e2\58\35\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00eb\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e6\u00e7\5\66\34\2\u00e7\u00e8\58\35\2\u00e8\u00ea\3\2\2\2\u00e9"+
		"\u00e6\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00f1\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f0\5<\37\2\u00ef"+
		"\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f7\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f6\5:\36\2\u00f5"+
		"\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\u010f\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fc\58\35\2\u00fb"+
		"\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2"+
		"\2\2\u00fe\u0105\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\5\66\34\2\u0101"+
		"\u0102\58\35\2\u0102\u0104\3\2\2\2\u0103\u0100\3\2\2\2\u0104\u0107\3\2"+
		"\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0109\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0108\u010a\5(\25\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u010c\3\2\2\2\u010b\u010d\5*\26\2\u010c\u010b\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u00e3\3\2\2\2\u010e\u00fd\3\2"+
		"\2\2\u010f\'\3\2\2\2\u0110\u0112\7\b\2\2\u0111\u0113\5\60\31\2\u0112\u0111"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\7\t\2\2\u0115"+
		")\3\2\2\2\u0116\u0117\7*\2\2\u0117\u0118\5,\27\2\u0118+\3\2\2\2\u0119"+
		"\u011e\5.\30\2\u011a\u011b\7%\2\2\u011b\u011d\5.\30\2\u011c\u011a\3\2"+
		"\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u012a\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0126\5.\30\2\u0122\u0123\7\23"+
		"\2\2\u0123\u0125\5.\30\2\u0124\u0122\3\2\2\2\u0125\u0128\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2"+
		"\2\2\u0129\u0119\3\2\2\2\u0129\u0121\3\2\2\2\u012a-\3\2\2\2\u012b\u012d"+
		"\7&\2\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u012f\7\b\2\2\u012f\u0130\5\32\16\2\u0130\u0131\7\t\2\2\u0131/\3\2\2"+
		"\2\u0132\u0137\5\62\32\2\u0133\u0134\7\23\2\2\u0134\u0136\5\62\32\2\u0135"+
		"\u0133\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2"+
		"\2\2\u0138\61\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013d\5\64\33\2\u013b"+
		"\u013c\7\21\2\2\u013c\u013e\5X-\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2"+
		"\2\2\u013e\63\3\2\2\2\u013f\u0142\7/\2\2\u0140\u0142\5\24\13\2\u0141\u013f"+
		"\3\2\2\2\u0141\u0140\3\2\2\2\u0142\65\3\2\2\2\u0143\u0144\t\6\2\2\u0144"+
		"\67\3\2\2\2\u0145\u0150\7/\2\2\u0146\u0147\7\30\2\2\u0147\u0150\7/\2\2"+
		"\u0148\u0149\7\24\2\2\u0149\u0150\7/\2\2\u014a\u014b\7\26\2\2\u014b\u0150"+
		"\7/\2\2\u014c\u0150\7\27\2\2\u014d\u0150\7\33\2\2\u014e\u0150\5\26\f\2"+
		"\u014f\u0145\3\2\2\2\u014f\u0146\3\2\2\2\u014f\u0148\3\2\2\2\u014f\u014a"+
		"\3\2\2\2\u014f\u014c\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150"+
		"9\3\2\2\2\u0151\u0152\t\7\2\2\u0152\u0156\t\b\2\2\u0153\u0154\t\7\2\2"+
		"\u0154\u0156\5P)\2\u0155\u0151\3\2\2\2\u0155\u0153\3\2\2\2\u0156;\3\2"+
		"\2\2\u0157\u0158\7\f\2\2\u0158\u015c\7/\2\2\u0159\u015a\5> \2\u015a\u015b"+
		"\t\t\2\2\u015b\u015d\3\2\2\2\u015c\u0159\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u015f\7\r\2\2\u015f=\3\2\2\2\u0160\u0161\t\n\2\2"+
		"\u0161?\3\2\2\2\u0162\u0169\7\n\2\2\u0163\u0164\5B\"\2\u0164\u0165\7\22"+
		"\2\2\u0165\u0168\3\2\2\2\u0166\u0168\5\4\3\2\u0167\u0163\3\2\2\2\u0167"+
		"\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2"+
		"\2\2\u016a\u016c\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016d\7\13\2\2\u016d"+
		"A\3\2\2\2\u016e\u0171\5N(\2\u016f\u0171\5D#\2\u0170\u016e\3\2\2\2\u0170"+
		"\u016f\3\2\2\2\u0171C\3\2\2\2\u0172\u0173\5F$\2\u0173\u0174\7\21\2\2\u0174"+
		"\u0176\5L\'\2\u0175\u0177\7.\2\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2"+
		"\2\u0177E\3\2\2\2\u0178\u017b\7/\2\2\u0179\u017b\5H%\2\u017a\u0178\3\2"+
		"\2\2\u017a\u0179\3\2\2\2\u017bG\3\2\2\2\u017c\u017e\7/\2\2\u017d\u017c"+
		"\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\5J&\2\u0180"+
		"\u0182\7/\2\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182I\3\2\2\2\u0183"+
		"\u0184\7 \2\2\u0184\u0185\7\67\2\2\u0185\u0186\7\66\2\2\u0186K\3\2\2\2"+
		"\u0187\u018c\5X-\2\u0188\u0189\7\23\2\2\u0189\u018b\5X-\2\u018a\u0188"+
		"\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"M\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0195\58\35\2\u0190\u0192\7\b\2\2"+
		"\u0191\u0193\5R*\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194"+
		"\3\2\2\2\u0194\u0196\7\t\2\2\u0195\u0190\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u0198\3\2\2\2\u0197\u0199\7.\2\2\u0198\u0197\3\2\2\2\u0198\u0199\3\2"+
		"\2\2\u0199O\3\2\2\2\u019a\u019b\t\b\2\2\u019b\u019d\7\b\2\2\u019c\u019e"+
		"\5R*\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"\u01a0\7\t\2\2\u01a0Q\3\2\2\2\u01a1\u01a6\5T+\2\u01a2\u01a3\7\23\2\2\u01a3"+
		"\u01a5\5T+\2\u01a4\u01a2\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2"+
		"\2\u01a6\u01a7\3\2\2\2\u01a7S\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01aa"+
		"\5X-\2\u01aaU\3\2\2\2\u01ab\u01b0\5\32\16\2\u01ac\u01ad\7\23\2\2\u01ad"+
		"\u01af\5\32\16\2\u01ae\u01ac\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3"+
		"\2\2\2\u01b0\u01b1\3\2\2\2\u01b1W\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b7"+
		"\5\32\16\2\u01b4\u01b6\5\32\16\2\u01b5\u01b4\3\2\2\2\u01b6\u01b9\3\2\2"+
		"\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8Y\3\2\2\2\u01b9\u01b7"+
		"\3\2\2\2\u01ba\u01bc\7\30\2\2\u01bb\u01bd\t\13\2\2\u01bc\u01bb\3\2\2\2"+
		"\u01bd\u01be\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf[\3"+
		"\2\2\2\66_hsw~\u0086\u0089\u0092\u0096\u00a7\u00ab\u00b5\u00c0\u00ca\u00cc"+
		"\u00dd\u00e3\u00eb\u00f1\u00f7\u00fd\u0105\u0109\u010c\u010e\u0112\u011e"+
		"\u0126\u0129\u012c\u0137\u013d\u0141\u014f\u0155\u015c\u0167\u0169\u0170"+
		"\u0176\u017a\u017d\u0181\u018c\u0192\u0195\u0198\u019d\u01a6\u01b0\u01b7"+
		"\u01be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}