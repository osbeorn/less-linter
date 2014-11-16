package si.osbeorn.lesslint.antlr;

// Generated from LessParser.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LessParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOLLAR=19, LT=14, LBRACK=10, ONLY=44, LTEQ=35, INTERPOLATION_END=53, MEDIA=43, 
		AND=21, ANDW=36, LPAREN=6, INTERPOLATION_START=30, AT=20, ML_COMMENT=52, 
		RPAREN=7, IMPORT=42, STRING_LITERAL=47, IN=2, COMMA=17, TIL=13, TILD_EQ=40, 
		IDENT=46, PLUS=24, NL=50, EQ=38, DOT=18, URL_END=55, PIPE_EQ=39, NOTW=37, 
		EQEQ=32, RBRACK=11, URL_START=31, NULL=1, QUOT=29, NUMBER=48, HASH=22, 
		ELLIPSIS=5, LCURLY=8, MINUS=27, GTEQ=34, SEMI=16, URL=56, IMPORTANT=45, 
		COLON=15, COLONCOLON=23, UNIT=3, NOTEQ=33, WS=49, PERC=28, WHEN=41, SL_COMMENT=51, 
		RCURLY=9, GT=12, INTERPOLATION=54, DIV=26, TIMES=25, COMBINE_COMPARE=4;
	public static final String[] tokenNames = {
		"<INVALID>", "'null'", "'in'", "UNIT", "COMBINE_COMPARE", "'...'", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "'>'", "'~'", "'<'", "':'", "';'", 
		"','", "'.'", "'$'", "'@'", "'&'", "'#'", "'::'", "'+'", "'*'", "'/'", 
		"'-'", "'%'", "'\"'", "'@{'", "URL_START", "'=='", "'!='", "'>='", "'<='", 
		"'and'", "'not'", "'='", "'|='", "'~='", "'when'", "'@import'", "'@media'", 
		"'only'", "'!important'", "IDENT", "STRING_LITERAL", "NUMBER", "WS", "NL", 
		"SL_COMMENT", "ML_COMMENT", "INTERPOLATION_END", "INTERPOLATION", "URL_END", 
		"URL"
	};
	public static final int
		RULE_stylesheet = 0, RULE_statement = 1, RULE_mediaStatement = 2, RULE_mediaQueryList = 3, 
		RULE_mediaQuery = 4, RULE_mediaQueryExpression = 5, RULE_importStatement = 6, 
		RULE_keyword = 7, RULE_variableStatement = 8, RULE_variableName = 9, RULE_measurement = 10, 
		RULE_expression = 11, RULE_expressionStatement = 12, RULE_mathCharacter = 13, 
		RULE_boolCharacter = 14, RULE_mathPrefixCharacter = 15, RULE_ruleStatement = 16, 
		RULE_selectors = 17, RULE_selectorGroup = 18, RULE_selector = 19, RULE_mixin = 20, 
		RULE_mixinGuards = 21, RULE_mixinGuardsList = 22, RULE_mixinGuard = 23, 
		RULE_mixinParams = 24, RULE_mixinParamList = 25, RULE_mixinParam = 26, 
		RULE_mixinParamName = 27, RULE_selectorPrefix = 28, RULE_element = 29, 
		RULE_pseudo = 30, RULE_pseudoParams = 31, RULE_attrib = 32, RULE_attribRelate = 33, 
		RULE_block = 34, RULE_property = 35, RULE_propertyStatement = 36, RULE_propertyIdent = 37, 
		RULE_varInterpolationIdent = 38, RULE_varInterpolation = 39, RULE_propertyValues = 40, 
		RULE_mixinCall = 41, RULE_functionCall = 42, RULE_callParams = 43, RULE_callParam = 44, 
		RULE_commaValues = 45, RULE_values = 46, RULE_url = 47, RULE_color = 48;
	public static final String[] ruleNames = {
		"stylesheet", "statement", "mediaStatement", "mediaQueryList", "mediaQuery", 
		"mediaQueryExpression", "importStatement", "keyword", "variableStatement", 
		"variableName", "measurement", "expression", "expressionStatement", "mathCharacter", 
		"boolCharacter", "mathPrefixCharacter", "ruleStatement", "selectors", 
		"selectorGroup", "selector", "mixin", "mixinGuards", "mixinGuardsList", 
		"mixinGuard", "mixinParams", "mixinParamList", "mixinParam", "mixinParamName", 
		"selectorPrefix", "element", "pseudo", "pseudoParams", "attrib", "attribRelate", 
		"block", "property", "propertyStatement", "propertyIdent", "varInterpolationIdent", 
		"varInterpolation", "propertyValues", "mixinCall", "functionCall", "callParams", 
		"callParam", "commaValues", "values", "url", "color"
	};

	@Override
	public String getGrammarFileName() { return "LessParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LessParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StylesheetContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode EOF() { return getToken(LessParser.EOF, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitStylesheet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitStylesheet(this);
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
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNIT) | (1L << LBRACK) | (1L << GT) | (1L << TIL) | (1L << COLON) | (1L << DOT) | (1L << AT) | (1L << AND) | (1L << HASH) | (1L << COLONCOLON) | (1L << PLUS) | (1L << TIMES) | (1L << IMPORT) | (1L << MEDIA) | (1L << IDENT) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(98); statement();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104); match(EOF);
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
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(110);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106); importStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107); variableStatement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108); ruleStatement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(109); mediaStatement();
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
		public TerminalNode MEDIA() { return getToken(LessParser.MEDIA, 0); }
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
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterMediaStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitMediaStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitMediaStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaStatementContext mediaStatement() throws RecognitionException {
		MediaStatementContext _localctx = new MediaStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mediaStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); match(MEDIA);
			setState(113); mediaQueryList();
			setState(114); block();
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
		public List<TerminalNode> COMMA() { return getTokens(LessParser.COMMA); }
		public List<MediaQueryContext> mediaQuery() {
			return getRuleContexts(MediaQueryContext.class);
		}
		public MediaQueryContext mediaQuery(int i) {
			return getRuleContext(MediaQueryContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(LessParser.COMMA, i);
		}
		public MediaQueryListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaQueryList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterMediaQueryList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitMediaQueryList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitMediaQueryList(this);
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
			setState(116); mediaQuery();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(117); match(COMMA);
				setState(118); mediaQuery();
				}
				}
				setState(123);
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
		public List<TerminalNode> ANDW() { return getTokens(LessParser.ANDW); }
		public TerminalNode ONLY() { return getToken(LessParser.ONLY, 0); }
		public MediaQueryExpressionContext mediaQueryExpression(int i) {
			return getRuleContext(MediaQueryExpressionContext.class,i);
		}
		public List<MediaQueryExpressionContext> mediaQueryExpression() {
			return getRuleContexts(MediaQueryExpressionContext.class);
		}
		public TerminalNode ANDW(int i) {
			return getToken(LessParser.ANDW, i);
		}
		public TerminalNode NOTW() { return getToken(LessParser.NOTW, 0); }
		public TerminalNode IDENT() { return getToken(LessParser.IDENT, 0); }
		public MediaQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterMediaQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitMediaQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitMediaQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaQueryContext mediaQuery() throws RecognitionException {
		MediaQueryContext _localctx = new MediaQueryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mediaQuery);
		int _la;
		try {
			setState(143);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				_la = _input.LA(1);
				if (_la==NOTW || _la==ONLY) {
					{
					setState(124);
					_la = _input.LA(1);
					if ( !(_la==NOTW || _la==ONLY) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(127); match(IDENT);
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

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135); mediaQueryExpression();
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ANDW) {
					{
					{
					setState(136); match(ANDW);
					setState(137); mediaQueryExpression();
					}
					}
					setState(142);
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
		public TerminalNode RPAREN() { return getToken(LessParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(LessParser.LPAREN, 0); }
		public TerminalNode COLON() { return getToken(LessParser.COLON, 0); }
		public TerminalNode IDENT() { return getToken(LessParser.IDENT, 0); }
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public MediaQueryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaQueryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterMediaQueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitMediaQueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitMediaQueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaQueryExpressionContext mediaQueryExpression() throws RecognitionException {
		MediaQueryExpressionContext _localctx = new MediaQueryExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mediaQueryExpression);
		try {
			setState(152);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(145); match(IDENT);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(146); match(LPAREN);
				setState(147); match(IDENT);
				setState(148); match(COLON);
				setState(149); expressionStatement(0);
				setState(150); match(RPAREN);
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
		public TerminalNode IMPORT() { return getToken(LessParser.IMPORT, 0); }
		public TerminalNode SEMI() { return getToken(LessParser.SEMI, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(LessParser.STRING_LITERAL, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitImportStatement(this);
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
			setState(154); match(IMPORT);
			setState(156);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(155); keyword();
				}
			}

			setState(158); match(STRING_LITERAL);
			setState(159); match(SEMI);
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
		public TerminalNode RPAREN() { return getToken(LessParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(LessParser.LPAREN, 0); }
		public TerminalNode IDENT() { return getToken(LessParser.IDENT, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161); match(LPAREN);
			setState(162); match(IDENT);
			setState(163); match(RPAREN);
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
		public TerminalNode SEMI() { return getToken(LessParser.SEMI, 0); }
		public CommaValuesContext commaValues() {
			return getRuleContext(CommaValuesContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LessParser.COLON, 0); }
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitVariableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitVariableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165); variableName();
			setState(166); match(COLON);
			setState(167); commaValues();
			setState(168); match(SEMI);
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
		public TerminalNode MEDIA() { return getToken(LessParser.MEDIA, 0); }
		public TerminalNode AT() { return getToken(LessParser.AT, 0); }
		public TerminalNode IDENT() { return getToken(LessParser.IDENT, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableName);
		try {
			setState(173);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(170); match(AT);
				setState(171); match(IDENT);
				}
				break;
			case MEDIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(172); match(MEDIA);
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
		public TerminalNode UNIT() { return getToken(LessParser.UNIT, 0); }
		public TerminalNode NUMBER() { return getToken(LessParser.NUMBER, 0); }
		public MeasurementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measurement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterMeasurement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitMeasurement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitMeasurement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeasurementContext measurement() throws RecognitionException {
		MeasurementContext _localctx = new MeasurementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_measurement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175); match(NUMBER);
			setState(177);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(176); match(UNIT);
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
		public TerminalNode STRING_LITERAL() { return getToken(LessParser.STRING_LITERAL, 0); }
		public MeasurementContext measurement() {
			return getRuleContext(MeasurementContext.class,0);
		}
		public TerminalNode NULL() { return getToken(LessParser.NULL, 0); }
		public TerminalNode IDENT() { return getToken(LessParser.IDENT, 0); }
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		try {
			setState(187);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179); variableName();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180); functionCall();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181); measurement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(182); color();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(183); url();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(184); match(IDENT);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(185); match(STRING_LITERAL);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(186); match(NULL);
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
		public TerminalNode RPAREN() { return getToken(LessParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(LessParser.LPAREN, 0); }
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
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
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
			setState(198);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				{
				setState(190); mathPrefixCharacter();
				setState(191); expressionStatement(2);
				}
				break;
			case LPAREN:
				{
				setState(193); match(LPAREN);
				setState(194); expressionStatement(0);
				setState(195); match(RPAREN);
				}
				break;
			case NULL:
			case AT:
			case HASH:
			case URL_START:
			case NOTW:
			case MEDIA:
			case IDENT:
			case STRING_LITERAL:
			case NUMBER:
				{
				setState(197); expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(208);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionStatementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionStatement);
						setState(200);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(201); mathCharacter();
						setState(202); expressionStatement(6);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionStatementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionStatement);
						setState(204);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(205); boolCharacter();
						setState(206); expressionStatement(5);
						}
						break;
					}
					} 
				}
				setState(212);
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
		public TerminalNode TIMES() { return getToken(LessParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(LessParser.DIV, 0); }
		public TerminalNode MINUS() { return getToken(LessParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(LessParser.PLUS, 0); }
		public MathCharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathCharacter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterMathCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitMathCharacter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitMathCharacter(this);
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
			setState(213);
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
		public TerminalNode GTEQ() { return getToken(LessParser.GTEQ, 0); }
		public TerminalNode LT() { return getToken(LessParser.LT, 0); }
		public TerminalNode NOTEQ() { return getToken(LessParser.NOTEQ, 0); }
		public TerminalNode GT() { return getToken(LessParser.GT, 0); }
		public TerminalNode EQ() { return getToken(LessParser.EQ, 0); }
		public TerminalNode LTEQ() { return getToken(LessParser.LTEQ, 0); }
		public BoolCharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolCharacter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterBoolCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitBoolCharacter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitBoolCharacter(this);
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
			setState(215);
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
		public TerminalNode MINUS() { return getToken(LessParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(LessParser.PLUS, 0); }
		public MathPrefixCharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathPrefixCharacter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterMathPrefixCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitMathPrefixCharacter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitMathPrefixCharacter(this);
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
			setState(217);
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
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterRuleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitRuleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitRuleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleStatementContext ruleStatement() throws RecognitionException {
		RuleStatementContext _localctx = new RuleStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ruleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219); selectors();
			setState(220); block();
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
		public SelectorGroupContext selectorGroup(int i) {
			return getRuleContext(SelectorGroupContext.class,i);
		}
		public List<SelectorGroupContext> selectorGroup() {
			return getRuleContexts(SelectorGroupContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(LessParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LessParser.COMMA, i);
		}
		public SelectorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectors; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterSelectors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitSelectors(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitSelectors(this);
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
			setState(222); selectorGroup();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(223); match(COMMA);
				setState(224); selectorGroup();
				}
				}
				setState(229);
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

	public static class SelectorGroupContext extends ParserRuleContext {
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterSelectorGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitSelectorGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitSelectorGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorGroupContext selectorGroup() throws RecognitionException {
		SelectorGroupContext _localctx = new SelectorGroupContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_selectorGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(230); selector();
				}
				}
				setState(233); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNIT) | (1L << LBRACK) | (1L << GT) | (1L << TIL) | (1L << COLON) | (1L << DOT) | (1L << AT) | (1L << AND) | (1L << HASH) | (1L << COLONCOLON) | (1L << PLUS) | (1L << TIMES) | (1L << IDENT) | (1L << NUMBER))) != 0) );
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
		public SelectorPrefixContext selectorPrefix() {
			return getRuleContext(SelectorPrefixContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
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
		public MixinContext mixin() {
			return getRuleContext(MixinContext.class,0);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_selector);
		int _la;
		try {
			int _alt;
			setState(277);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(235); attrib();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(238); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(240); pseudo();
						}
						} 
					}
					setState(245);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(246); pseudo();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(249); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << TIL) | (1L << PLUS))) != 0)) {
					{
					setState(251); selectorPrefix();
					}
				}

				setState(254); element();
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(255); attrib();
						}
						} 
					}
					setState(260);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(261); pseudo();
						}
						} 
					}
					setState(266);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << TIL) | (1L << PLUS))) != 0)) {
					{
					setState(267); selectorPrefix();
					}
				}

				setState(270); element();
				setState(272);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(271); mixin();
					}
				}

				setState(275);
				_la = _input.LA(1);
				if (_la==WHEN) {
					{
					setState(274); mixinGuards();
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
		public TerminalNode RPAREN() { return getToken(LessParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(LessParser.LPAREN, 0); }
		public MixinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mixin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterMixin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitMixin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitMixin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MixinContext mixin() throws RecognitionException {
		MixinContext _localctx = new MixinContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_mixin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279); match(LPAREN);
			setState(281);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELLIPSIS) | (1L << AT) | (1L << MEDIA) | (1L << IDENT))) != 0)) {
				{
				setState(280); mixinParams();
				}
			}

			setState(283); match(RPAREN);
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
		public TerminalNode WHEN() { return getToken(LessParser.WHEN, 0); }
		public MixinGuardsListContext mixinGuardsList() {
			return getRuleContext(MixinGuardsListContext.class,0);
		}
		public MixinGuardsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mixinGuards; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterMixinGuards(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitMixinGuards(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitMixinGuards(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MixinGuardsContext mixinGuards() throws RecognitionException {
		MixinGuardsContext _localctx = new MixinGuardsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_mixinGuards);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285); match(WHEN);
			setState(286); mixinGuardsList();
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
		public List<TerminalNode> ANDW() { return getTokens(LessParser.ANDW); }
		public List<TerminalNode> COMMA() { return getTokens(LessParser.COMMA); }
		public TerminalNode ANDW(int i) {
			return getToken(LessParser.ANDW, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(LessParser.COMMA, i);
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
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterMixinGuardsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitMixinGuardsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitMixinGuardsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MixinGuardsListContext mixinGuardsList() throws RecognitionException {
		MixinGuardsListContext _localctx = new MixinGuardsListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mixinGuardsList);
		int _la;
		try {
			int _alt;
			setState(304);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288); mixinGuard();
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ANDW) {
					{
					{
					setState(289); match(ANDW);
					setState(290); mixinGuard();
					}
					}
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296); mixinGuard();
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(297); match(COMMA);
						setState(298); mixinGuard();
						}
						} 
					}
					setState(303);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		public TerminalNode RPAREN() { return getToken(LessParser.RPAREN, 0); }
		public TerminalNode NOTW() { return getToken(LessParser.NOTW, 0); }
		public TerminalNode LPAREN() { return getToken(LessParser.LPAREN, 0); }
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public MixinGuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mixinGuard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterMixinGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitMixinGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitMixinGuard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MixinGuardContext mixinGuard() throws RecognitionException {
		MixinGuardContext _localctx = new MixinGuardContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_mixinGuard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_la = _input.LA(1);
			if (_la==NOTW) {
				{
				setState(306); match(NOTW);
				}
			}

			setState(309); match(LPAREN);
			setState(310); expressionStatement(0);
			setState(311); match(RPAREN);
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
		public List<TerminalNode> SEMI() { return getTokens(LessParser.SEMI); }
		public List<MixinParamListContext> mixinParamList() {
			return getRuleContexts(MixinParamListContext.class);
		}
		public MixinParamListContext mixinParamList(int i) {
			return getRuleContext(MixinParamListContext.class,i);
		}
		public TerminalNode SEMI(int i) {
			return getToken(LessParser.SEMI, i);
		}
		public MixinParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mixinParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterMixinParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitMixinParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitMixinParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MixinParamsContext mixinParams() throws RecognitionException {
		MixinParamsContext _localctx = new MixinParamsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_mixinParams);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(313); mixinParamList();
			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(314); match(SEMI);
					setState(315); mixinParamList();
					}
					} 
				}
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(322);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(321); match(SEMI);
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

	public static class MixinParamListContext extends ParserRuleContext {
		public MixinParamContext mixinParam(int i) {
			return getRuleContext(MixinParamContext.class,i);
		}
		public List<MixinParamContext> mixinParam() {
			return getRuleContexts(MixinParamContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(LessParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LessParser.COMMA, i);
		}
		public MixinParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mixinParamList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterMixinParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitMixinParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitMixinParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MixinParamListContext mixinParamList() throws RecognitionException {
		MixinParamListContext _localctx = new MixinParamListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_mixinParamList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324); mixinParam();
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(325); match(COMMA);
				setState(326); mixinParam();
				}
				}
				setState(331);
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
		public TerminalNode ELLIPSIS() { return getToken(LessParser.ELLIPSIS, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public MixinParamNameContext mixinParamName() {
			return getRuleContext(MixinParamNameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LessParser.COLON, 0); }
		public MixinParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mixinParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterMixinParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitMixinParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitMixinParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MixinParamContext mixinParam() throws RecognitionException {
		MixinParamContext _localctx = new MixinParamContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_mixinParam);
		int _la;
		try {
			setState(341);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332); mixinParamName();
				setState(335);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(333); match(COLON);
					setState(334); values();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				_la = _input.LA(1);
				if (_la==AT || _la==MEDIA) {
					{
					setState(337); variableName();
					}
				}

				setState(340); match(ELLIPSIS);
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

	public static class MixinParamNameContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LessParser.IDENT, 0); }
		public MixinParamNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mixinParamName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterMixinParamName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitMixinParamName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitMixinParamName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MixinParamNameContext mixinParamName() throws RecognitionException {
		MixinParamNameContext _localctx = new MixinParamNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_mixinParamName);
		try {
			setState(345);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(343); match(IDENT);
				}
				break;
			case AT:
			case MEDIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(344); variableName();
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
		public TerminalNode PLUS() { return getToken(LessParser.PLUS, 0); }
		public TerminalNode GT() { return getToken(LessParser.GT, 0); }
		public TerminalNode TIL() { return getToken(LessParser.TIL, 0); }
		public SelectorPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorPrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterSelectorPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitSelectorPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitSelectorPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorPrefixContext selectorPrefix() throws RecognitionException {
		SelectorPrefixContext _localctx = new SelectorPrefixContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_selectorPrefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
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
		public TerminalNode TIMES() { return getToken(LessParser.TIMES, 0); }
		public TerminalNode DOT() { return getToken(LessParser.DOT, 0); }
		public TerminalNode AND() { return getToken(LessParser.AND, 0); }
		public TerminalNode UNIT() { return getToken(LessParser.UNIT, 0); }
		public MeasurementContext measurement() {
			return getRuleContext(MeasurementContext.class,0);
		}
		public TerminalNode AT() { return getToken(LessParser.AT, 0); }
		public TerminalNode HASH() { return getToken(LessParser.HASH, 0); }
		public TerminalNode IDENT() { return getToken(LessParser.IDENT, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_element);
		try {
			setState(360);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(349); match(IDENT);
				}
				break;
			case UNIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(350); match(UNIT);
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 3);
				{
				setState(351); match(HASH);
				setState(352); match(IDENT);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(353); match(DOT);
				setState(354); match(IDENT);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(355); match(AT);
				setState(356); match(IDENT);
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 6);
				{
				setState(357); match(AND);
				}
				break;
			case TIMES:
				enterOuterAlt(_localctx, 7);
				{
				setState(358); match(TIMES);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 8);
				{
				setState(359); measurement();
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
		public TerminalNode COLONCOLON() { return getToken(LessParser.COLONCOLON, 0); }
		public TerminalNode RPAREN() { return getToken(LessParser.RPAREN, 0); }
		public PseudoParamsContext pseudoParams() {
			return getRuleContext(PseudoParamsContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(LessParser.LPAREN, 0); }
		public TerminalNode NOTW() { return getToken(LessParser.NOTW, 0); }
		public TerminalNode IDENT() { return getToken(LessParser.IDENT, 0); }
		public TerminalNode COLON() { return getToken(LessParser.COLON, 0); }
		public PseudoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterPseudo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitPseudo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitPseudo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoContext pseudo() throws RecognitionException {
		PseudoContext _localctx = new PseudoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_pseudo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_la = _input.LA(1);
			if ( !(_la==COLON || _la==COLONCOLON) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(363);
			_la = _input.LA(1);
			if ( !(_la==NOTW || _la==IDENT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(368);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(364); match(LPAREN);
				setState(365); pseudoParams();
				setState(366); match(RPAREN);
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

	public static class PseudoParamsContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public AttribContext attrib() {
			return getRuleContext(AttribContext.class,0);
		}
		public PseudoContext pseudo() {
			return getRuleContext(PseudoContext.class,0);
		}
		public PseudoParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterPseudoParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitPseudoParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitPseudoParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoParamsContext pseudoParams() throws RecognitionException {
		PseudoParamsContext _localctx = new PseudoParamsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_pseudoParams);
		try {
			setState(373);
			switch (_input.LA(1)) {
			case COLON:
			case COLONCOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(370); pseudo();
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(371); attrib();
				}
				break;
			case UNIT:
			case DOT:
			case AT:
			case AND:
			case HASH:
			case TIMES:
			case IDENT:
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(372); element();
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

	public static class AttribContext extends ParserRuleContext {
		public TerminalNode RBRACK() { return getToken(LessParser.RBRACK, 0); }
		public AttribRelateContext attribRelate() {
			return getRuleContext(AttribRelateContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(LessParser.STRING_LITERAL, 0); }
		public List<TerminalNode> IDENT() { return getTokens(LessParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LessParser.IDENT, i);
		}
		public TerminalNode LBRACK() { return getToken(LessParser.LBRACK, 0); }
		public AttribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterAttrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitAttrib(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitAttrib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttribContext attrib() throws RecognitionException {
		AttribContext _localctx = new AttribContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_attrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375); match(LBRACK);
			setState(376); match(IDENT);
			setState(380);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << PIPE_EQ) | (1L << TILD_EQ))) != 0)) {
				{
				setState(377); attribRelate();
				setState(378);
				_la = _input.LA(1);
				if ( !(_la==IDENT || _la==STRING_LITERAL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(382); match(RBRACK);
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
		public TerminalNode PIPE_EQ() { return getToken(LessParser.PIPE_EQ, 0); }
		public TerminalNode TILD_EQ() { return getToken(LessParser.TILD_EQ, 0); }
		public TerminalNode EQ() { return getToken(LessParser.EQ, 0); }
		public AttribRelateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribRelate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterAttribRelate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitAttribRelate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitAttribRelate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttribRelateContext attribRelate() throws RecognitionException {
		AttribRelateContext _localctx = new AttribRelateContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_attribRelate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
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
		public TerminalNode LCURLY() { return getToken(LessParser.LCURLY, 0); }
		public List<TerminalNode> SEMI() { return getTokens(LessParser.SEMI); }
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public TerminalNode SEMI(int i) {
			return getToken(LessParser.SEMI, i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public TerminalNode RCURLY() { return getToken(LessParser.RCURLY, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386); match(LCURLY);
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNIT) | (1L << LBRACK) | (1L << GT) | (1L << TIL) | (1L << COLON) | (1L << DOT) | (1L << AT) | (1L << AND) | (1L << HASH) | (1L << COLONCOLON) | (1L << PLUS) | (1L << TIMES) | (1L << INTERPOLATION_START) | (1L << IMPORT) | (1L << MEDIA) | (1L << IDENT) | (1L << NUMBER))) != 0)) {
				{
				setState(395);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(387); statement();
					}
					break;

				case 2:
					{
					setState(388); property();
					setState(392);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEMI) {
						{
						{
						setState(389); match(SEMI);
						}
						}
						setState(394);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				}
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(400); match(RCURLY);
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
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_property);
		try {
			setState(404);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(402); mixinCall();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(403); propertyStatement();
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
		public TerminalNode IMPORTANT() { return getToken(LessParser.IMPORTANT, 0); }
		public PropertyValuesContext propertyValues() {
			return getRuleContext(PropertyValuesContext.class,0);
		}
		public PropertyIdentContext propertyIdent() {
			return getRuleContext(PropertyIdentContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LessParser.COLON, 0); }
		public PropertyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterPropertyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitPropertyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitPropertyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyStatementContext propertyStatement() throws RecognitionException {
		PropertyStatementContext _localctx = new PropertyStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_propertyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406); propertyIdent();
			setState(407); match(COLON);
			setState(408); propertyValues();
			setState(410);
			_la = _input.LA(1);
			if (_la==IMPORTANT) {
				{
				setState(409); match(IMPORTANT);
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
		public TerminalNode IDENT() { return getToken(LessParser.IDENT, 0); }
		public PropertyIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyIdent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterPropertyIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitPropertyIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitPropertyIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyIdentContext propertyIdent() throws RecognitionException {
		PropertyIdentContext _localctx = new PropertyIdentContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_propertyIdent);
		try {
			setState(414);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(412); match(IDENT);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(413); varInterpolationIdent();
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
		public List<TerminalNode> IDENT() { return getTokens(LessParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LessParser.IDENT, i);
		}
		public VarInterpolationIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varInterpolationIdent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterVarInterpolationIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitVarInterpolationIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitVarInterpolationIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarInterpolationIdentContext varInterpolationIdent() throws RecognitionException {
		VarInterpolationIdentContext _localctx = new VarInterpolationIdentContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_varInterpolationIdent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(416); match(IDENT);
				}
			}

			setState(419); varInterpolation();
			setState(421);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(420); match(IDENT);
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
		public TerminalNode INTERPOLATION_START() { return getToken(LessParser.INTERPOLATION_START, 0); }
		public TerminalNode INTERPOLATION_END() { return getToken(LessParser.INTERPOLATION_END, 0); }
		public TerminalNode INTERPOLATION() { return getToken(LessParser.INTERPOLATION, 0); }
		public VarInterpolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varInterpolation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterVarInterpolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitVarInterpolation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitVarInterpolation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarInterpolationContext varInterpolation() throws RecognitionException {
		VarInterpolationContext _localctx = new VarInterpolationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_varInterpolation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423); match(INTERPOLATION_START);
			setState(424); match(INTERPOLATION);
			setState(425); match(INTERPOLATION_END);
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
		public List<TerminalNode> COMMA() { return getTokens(LessParser.COMMA); }
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(LessParser.COMMA, i);
		}
		public PropertyValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterPropertyValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitPropertyValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitPropertyValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyValuesContext propertyValues() throws RecognitionException {
		PropertyValuesContext _localctx = new PropertyValuesContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_propertyValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427); values();
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(428); match(COMMA);
				setState(429); values();
				}
				}
				setState(434);
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
		public TerminalNode IMPORTANT() { return getToken(LessParser.IMPORTANT, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public CallParamsContext callParams() {
			return getRuleContext(CallParamsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LessParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(LessParser.LPAREN, 0); }
		public MixinCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mixinCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterMixinCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitMixinCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitMixinCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MixinCallContext mixinCall() throws RecognitionException {
		MixinCallContext _localctx = new MixinCallContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_mixinCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435); element();
			setState(441);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(436); match(LPAREN);
				setState(438);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << LPAREN) | (1L << AT) | (1L << HASH) | (1L << PLUS) | (1L << MINUS) | (1L << URL_START) | (1L << NOTW) | (1L << MEDIA) | (1L << IDENT) | (1L << STRING_LITERAL) | (1L << NUMBER))) != 0)) {
					{
					setState(437); callParams();
					}
				}

				setState(440); match(RPAREN);
				}
			}

			setState(444);
			_la = _input.LA(1);
			if (_la==IMPORTANT) {
				{
				setState(443); match(IMPORTANT);
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
		public TerminalNode RPAREN() { return getToken(LessParser.RPAREN, 0); }
		public TerminalNode NOTW() { return getToken(LessParser.NOTW, 0); }
		public TerminalNode LPAREN() { return getToken(LessParser.LPAREN, 0); }
		public TerminalNode IDENT() { return getToken(LessParser.IDENT, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			_la = _input.LA(1);
			if ( !(_la==NOTW || _la==IDENT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(447); match(LPAREN);
			setState(449);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << LPAREN) | (1L << AT) | (1L << HASH) | (1L << PLUS) | (1L << MINUS) | (1L << URL_START) | (1L << NOTW) | (1L << MEDIA) | (1L << IDENT) | (1L << STRING_LITERAL) | (1L << NUMBER))) != 0)) {
				{
				setState(448); callParams();
				}
			}

			setState(451); match(RPAREN);
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
		public List<TerminalNode> COMMA() { return getTokens(LessParser.COMMA); }
		public List<CallParamContext> callParam() {
			return getRuleContexts(CallParamContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(LessParser.COMMA, i);
		}
		public CallParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterCallParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitCallParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitCallParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallParamsContext callParams() throws RecognitionException {
		CallParamsContext _localctx = new CallParamsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_callParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453); callParam();
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(454); match(COMMA);
				setState(455); callParam();
				}
				}
				setState(460);
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
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterCallParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitCallParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitCallParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallParamContext callParam() throws RecognitionException {
		CallParamContext _localctx = new CallParamContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_callParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461); values();
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
		public List<TerminalNode> COMMA() { return getTokens(LessParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LessParser.COMMA, i);
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
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterCommaValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitCommaValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitCommaValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommaValuesContext commaValues() throws RecognitionException {
		CommaValuesContext _localctx = new CommaValuesContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_commaValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463); expressionStatement(0);
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(464); match(COMMA);
				setState(465); expressionStatement(0);
				}
				}
				setState(470);
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
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_values);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(471); expressionStatement(0);
			setState(475);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(472); expressionStatement(0);
					}
					} 
				}
				setState(477);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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

	public static class UrlContext extends ParserRuleContext {
		public TerminalNode URL_START() { return getToken(LessParser.URL_START, 0); }
		public TerminalNode URL_END() { return getToken(LessParser.URL_END, 0); }
		public TerminalNode URL() { return getToken(LessParser.URL, 0); }
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_url);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478); match(URL_START);
			setState(479); match(URL);
			setState(480); match(URL_END);
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
			return getToken(LessParser.NUMBER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(LessParser.NUMBER); }
		public TerminalNode HASH() { return getToken(LessParser.HASH, 0); }
		public List<TerminalNode> IDENT() { return getTokens(LessParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LessParser.IDENT, i);
		}
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_color);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(482); match(HASH);
			setState(484); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(483);
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
				setState(486); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3:\u01eb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\7\2f\n\2\f\2"+
		"\16\2i\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3q\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\7\5z\n\5\f\5\16\5}\13\5\3\6\5\6\u0080\n\6\3\6\3\6\3\6\7\6\u0085\n\6"+
		"\f\6\16\6\u0088\13\6\3\6\3\6\3\6\7\6\u008d\n\6\f\6\16\6\u0090\13\6\5\6"+
		"\u0092\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u009b\n\7\3\b\3\b\5\b\u009f"+
		"\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\5"+
		"\13\u00b0\n\13\3\f\3\f\5\f\u00b4\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u00be\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00c9\n"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00d3\n\16\f\16\16\16"+
		"\u00d6\13\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\7\23\u00e4\n\23\f\23\16\23\u00e7\13\23\3\24\6\24\u00ea\n\24\r\24\16"+
		"\24\u00eb\3\25\6\25\u00ef\n\25\r\25\16\25\u00f0\3\25\7\25\u00f4\n\25\f"+
		"\25\16\25\u00f7\13\25\3\25\6\25\u00fa\n\25\r\25\16\25\u00fb\3\25\5\25"+
		"\u00ff\n\25\3\25\3\25\7\25\u0103\n\25\f\25\16\25\u0106\13\25\3\25\7\25"+
		"\u0109\n\25\f\25\16\25\u010c\13\25\3\25\5\25\u010f\n\25\3\25\3\25\5\25"+
		"\u0113\n\25\3\25\5\25\u0116\n\25\5\25\u0118\n\25\3\26\3\26\5\26\u011c"+
		"\n\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\7\30\u0126\n\30\f\30\16"+
		"\30\u0129\13\30\3\30\3\30\3\30\7\30\u012e\n\30\f\30\16\30\u0131\13\30"+
		"\5\30\u0133\n\30\3\31\5\31\u0136\n\31\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\7\32\u013f\n\32\f\32\16\32\u0142\13\32\3\32\5\32\u0145\n\32\3\33\3"+
		"\33\3\33\7\33\u014a\n\33\f\33\16\33\u014d\13\33\3\34\3\34\3\34\5\34\u0152"+
		"\n\34\3\34\5\34\u0155\n\34\3\34\5\34\u0158\n\34\3\35\3\35\5\35\u015c\n"+
		"\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5"+
		"\37\u016b\n\37\3 \3 \3 \3 \3 \3 \5 \u0173\n \3!\3!\3!\5!\u0178\n!\3\""+
		"\3\"\3\"\3\"\3\"\5\"\u017f\n\"\3\"\3\"\3#\3#\3$\3$\3$\3$\7$\u0189\n$\f"+
		"$\16$\u018c\13$\7$\u018e\n$\f$\16$\u0191\13$\3$\3$\3%\3%\5%\u0197\n%\3"+
		"&\3&\3&\3&\5&\u019d\n&\3\'\3\'\5\'\u01a1\n\'\3(\5(\u01a4\n(\3(\3(\5(\u01a8"+
		"\n(\3)\3)\3)\3)\3*\3*\3*\7*\u01b1\n*\f*\16*\u01b4\13*\3+\3+\3+\5+\u01b9"+
		"\n+\3+\5+\u01bc\n+\3+\5+\u01bf\n+\3,\3,\3,\5,\u01c4\n,\3,\3,\3-\3-\3-"+
		"\7-\u01cb\n-\f-\16-\u01ce\13-\3.\3.\3/\3/\3/\7/\u01d5\n/\f/\16/\u01d8"+
		"\13/\3\60\3\60\7\60\u01dc\n\60\f\60\16\60\u01df\13\60\3\61\3\61\3\61\3"+
		"\61\3\62\3\62\6\62\u01e7\n\62\r\62\16\62\u01e8\3\62\2\3\32\63\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`b\2\f\4\2\'\'..\3\2\32\35\6\2\16\16\20\20#%((\4\2\32\32\35\35\4\2"+
		"\16\17\32\32\4\2\21\21\31\31\4\2\'\'\60\60\3\2\60\61\3\2(*\4\2\60\60\62"+
		"\62\u0207\2g\3\2\2\2\4p\3\2\2\2\6r\3\2\2\2\bv\3\2\2\2\n\u0091\3\2\2\2"+
		"\f\u009a\3\2\2\2\16\u009c\3\2\2\2\20\u00a3\3\2\2\2\22\u00a7\3\2\2\2\24"+
		"\u00af\3\2\2\2\26\u00b1\3\2\2\2\30\u00bd\3\2\2\2\32\u00c8\3\2\2\2\34\u00d7"+
		"\3\2\2\2\36\u00d9\3\2\2\2 \u00db\3\2\2\2\"\u00dd\3\2\2\2$\u00e0\3\2\2"+
		"\2&\u00e9\3\2\2\2(\u0117\3\2\2\2*\u0119\3\2\2\2,\u011f\3\2\2\2.\u0132"+
		"\3\2\2\2\60\u0135\3\2\2\2\62\u013b\3\2\2\2\64\u0146\3\2\2\2\66\u0157\3"+
		"\2\2\28\u015b\3\2\2\2:\u015d\3\2\2\2<\u016a\3\2\2\2>\u016c\3\2\2\2@\u0177"+
		"\3\2\2\2B\u0179\3\2\2\2D\u0182\3\2\2\2F\u0184\3\2\2\2H\u0196\3\2\2\2J"+
		"\u0198\3\2\2\2L\u01a0\3\2\2\2N\u01a3\3\2\2\2P\u01a9\3\2\2\2R\u01ad\3\2"+
		"\2\2T\u01b5\3\2\2\2V\u01c0\3\2\2\2X\u01c7\3\2\2\2Z\u01cf\3\2\2\2\\\u01d1"+
		"\3\2\2\2^\u01d9\3\2\2\2`\u01e0\3\2\2\2b\u01e4\3\2\2\2df\5\4\3\2ed\3\2"+
		"\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7\2\2\3k\3\3"+
		"\2\2\2lq\5\16\b\2mq\5\22\n\2nq\5\"\22\2oq\5\6\4\2pl\3\2\2\2pm\3\2\2\2"+
		"pn\3\2\2\2po\3\2\2\2q\5\3\2\2\2rs\7-\2\2st\5\b\5\2tu\5F$\2u\7\3\2\2\2"+
		"v{\5\n\6\2wx\7\23\2\2xz\5\n\6\2yw\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2"+
		"\2|\t\3\2\2\2}{\3\2\2\2~\u0080\t\2\2\2\177~\3\2\2\2\177\u0080\3\2\2\2"+
		"\u0080\u0081\3\2\2\2\u0081\u0086\7\60\2\2\u0082\u0083\7&\2\2\u0083\u0085"+
		"\5\f\7\2\u0084\u0082\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0092\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008e\5\f"+
		"\7\2\u008a\u008b\7&\2\2\u008b\u008d\5\f\7\2\u008c\u008a\3\2\2\2\u008d"+
		"\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0092\3\2"+
		"\2\2\u0090\u008e\3\2\2\2\u0091\177\3\2\2\2\u0091\u0089\3\2\2\2\u0092\13"+
		"\3\2\2\2\u0093\u009b\7\60\2\2\u0094\u0095\7\b\2\2\u0095\u0096\7\60\2\2"+
		"\u0096\u0097\7\21\2\2\u0097\u0098\5\32\16\2\u0098\u0099\7\t\2\2\u0099"+
		"\u009b\3\2\2\2\u009a\u0093\3\2\2\2\u009a\u0094\3\2\2\2\u009b\r\3\2\2\2"+
		"\u009c\u009e\7,\2\2\u009d\u009f\5\20\t\2\u009e\u009d\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\7\61\2\2\u00a1\u00a2\7\22\2\2"+
		"\u00a2\17\3\2\2\2\u00a3\u00a4\7\b\2\2\u00a4\u00a5\7\60\2\2\u00a5\u00a6"+
		"\7\t\2\2\u00a6\21\3\2\2\2\u00a7\u00a8\5\24\13\2\u00a8\u00a9\7\21\2\2\u00a9"+
		"\u00aa\5\\/\2\u00aa\u00ab\7\22\2\2\u00ab\23\3\2\2\2\u00ac\u00ad\7\26\2"+
		"\2\u00ad\u00b0\7\60\2\2\u00ae\u00b0\7-\2\2\u00af\u00ac\3\2\2\2\u00af\u00ae"+
		"\3\2\2\2\u00b0\25\3\2\2\2\u00b1\u00b3\7\62\2\2\u00b2\u00b4\7\5\2\2\u00b3"+
		"\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\27\3\2\2\2\u00b5\u00be\5\24\13"+
		"\2\u00b6\u00be\5V,\2\u00b7\u00be\5\26\f\2\u00b8\u00be\5b\62\2\u00b9\u00be"+
		"\5`\61\2\u00ba\u00be\7\60\2\2\u00bb\u00be\7\61\2\2\u00bc\u00be\7\3\2\2"+
		"\u00bd\u00b5\3\2\2\2\u00bd\u00b6\3\2\2\2\u00bd\u00b7\3\2\2\2\u00bd\u00b8"+
		"\3\2\2\2\u00bd\u00b9\3\2\2\2\u00bd\u00ba\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00bc\3\2\2\2\u00be\31\3\2\2\2\u00bf\u00c0\b\16\1\2\u00c0\u00c1\5 \21"+
		"\2\u00c1\u00c2\5\32\16\4\u00c2\u00c9\3\2\2\2\u00c3\u00c4\7\b\2\2\u00c4"+
		"\u00c5\5\32\16\2\u00c5\u00c6\7\t\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c9\5"+
		"\30\r\2\u00c8\u00bf\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9"+
		"\u00d4\3\2\2\2\u00ca\u00cb\f\7\2\2\u00cb\u00cc\5\34\17\2\u00cc\u00cd\5"+
		"\32\16\b\u00cd\u00d3\3\2\2\2\u00ce\u00cf\f\6\2\2\u00cf\u00d0\5\36\20\2"+
		"\u00d0\u00d1\5\32\16\7\u00d1\u00d3\3\2\2\2\u00d2\u00ca\3\2\2\2\u00d2\u00ce"+
		"\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\33\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\t\3\2\2\u00d8\35\3\2\2\2\u00d9"+
		"\u00da\t\4\2\2\u00da\37\3\2\2\2\u00db\u00dc\t\5\2\2\u00dc!\3\2\2\2\u00dd"+
		"\u00de\5$\23\2\u00de\u00df\5F$\2\u00df#\3\2\2\2\u00e0\u00e5\5&\24\2\u00e1"+
		"\u00e2\7\23\2\2\u00e2\u00e4\5&\24\2\u00e3\u00e1\3\2\2\2\u00e4\u00e7\3"+
		"\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6%\3\2\2\2\u00e7\u00e5"+
		"\3\2\2\2\u00e8\u00ea\5(\25\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\'\3\2\2\2\u00ed\u00ef\5B\"\2"+
		"\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\u00f5\3\2\2\2\u00f2\u00f4\5> \2\u00f3\u00f2\3\2\2\2\u00f4"+
		"\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u0118\3\2"+
		"\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fa\5> \2\u00f9\u00f8\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0118\3\2\2\2\u00fd"+
		"\u00ff\5:\36\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\u0104\5<\37\2\u0101\u0103\5B\"\2\u0102\u0101\3\2\2\2\u0103"+
		"\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u010a\3\2"+
		"\2\2\u0106\u0104\3\2\2\2\u0107\u0109\5> \2\u0108\u0107\3\2\2\2\u0109\u010c"+
		"\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0118\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010d\u010f\5:\36\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2"+
		"\2\2\u010f\u0110\3\2\2\2\u0110\u0112\5<\37\2\u0111\u0113\5*\26\2\u0112"+
		"\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0116\5,"+
		"\27\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117"+
		"\u00ee\3\2\2\2\u0117\u00f9\3\2\2\2\u0117\u00fe\3\2\2\2\u0117\u010e\3\2"+
		"\2\2\u0118)\3\2\2\2\u0119\u011b\7\b\2\2\u011a\u011c\5\62\32\2\u011b\u011a"+
		"\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\7\t\2\2\u011e"+
		"+\3\2\2\2\u011f\u0120\7+\2\2\u0120\u0121\5.\30\2\u0121-\3\2\2\2\u0122"+
		"\u0127\5\60\31\2\u0123\u0124\7&\2\2\u0124\u0126\5\60\31\2\u0125\u0123"+
		"\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u0133\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012f\5\60\31\2\u012b\u012c\7"+
		"\23\2\2\u012c\u012e\5\60\31\2\u012d\u012b\3\2\2\2\u012e\u0131\3\2\2\2"+
		"\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f"+
		"\3\2\2\2\u0132\u0122\3\2\2\2\u0132\u012a\3\2\2\2\u0133/\3\2\2\2\u0134"+
		"\u0136\7\'\2\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0137\u0138\7\b\2\2\u0138\u0139\5\32\16\2\u0139\u013a\7\t\2\2\u013a"+
		"\61\3\2\2\2\u013b\u0140\5\64\33\2\u013c\u013d\7\22\2\2\u013d\u013f\5\64"+
		"\33\2\u013e\u013c\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0145\7\22"+
		"\2\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\63\3\2\2\2\u0146\u014b"+
		"\5\66\34\2\u0147\u0148\7\23\2\2\u0148\u014a\5\66\34\2\u0149\u0147\3\2"+
		"\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\65\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u0151\58\35\2\u014f\u0150\7\21\2"+
		"\2\u0150\u0152\5^\60\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0158"+
		"\3\2\2\2\u0153\u0155\5\24\13\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2"+
		"\u0155\u0156\3\2\2\2\u0156\u0158\7\7\2\2\u0157\u014e\3\2\2\2\u0157\u0154"+
		"\3\2\2\2\u0158\67\3\2\2\2\u0159\u015c\7\60\2\2\u015a\u015c\5\24\13\2\u015b"+
		"\u0159\3\2\2\2\u015b\u015a\3\2\2\2\u015c9\3\2\2\2\u015d\u015e\t\6\2\2"+
		"\u015e;\3\2\2\2\u015f\u016b\7\60\2\2\u0160\u016b\7\5\2\2\u0161\u0162\7"+
		"\30\2\2\u0162\u016b\7\60\2\2\u0163\u0164\7\24\2\2\u0164\u016b\7\60\2\2"+
		"\u0165\u0166\7\26\2\2\u0166\u016b\7\60\2\2\u0167\u016b\7\27\2\2\u0168"+
		"\u016b\7\33\2\2\u0169\u016b\5\26\f\2\u016a\u015f\3\2\2\2\u016a\u0160\3"+
		"\2\2\2\u016a\u0161\3\2\2\2\u016a\u0163\3\2\2\2\u016a\u0165\3\2\2\2\u016a"+
		"\u0167\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u0169\3\2\2\2\u016b=\3\2\2\2"+
		"\u016c\u016d\t\7\2\2\u016d\u0172\t\b\2\2\u016e\u016f\7\b\2\2\u016f\u0170"+
		"\5@!\2\u0170\u0171\7\t\2\2\u0171\u0173\3\2\2\2\u0172\u016e\3\2\2\2\u0172"+
		"\u0173\3\2\2\2\u0173?\3\2\2\2\u0174\u0178\5> \2\u0175\u0178\5B\"\2\u0176"+
		"\u0178\5<\37\2\u0177\u0174\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0176\3\2"+
		"\2\2\u0178A\3\2\2\2\u0179\u017a\7\f\2\2\u017a\u017e\7\60\2\2\u017b\u017c"+
		"\5D#\2\u017c\u017d\t\t\2\2\u017d\u017f\3\2\2\2\u017e\u017b\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\7\r\2\2\u0181C\3\2\2\2"+
		"\u0182\u0183\t\n\2\2\u0183E\3\2\2\2\u0184\u018f\7\n\2\2\u0185\u018e\5"+
		"\4\3\2\u0186\u018a\5H%\2\u0187\u0189\7\22\2\2\u0188\u0187\3\2\2\2\u0189"+
		"\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018e\3\2"+
		"\2\2\u018c\u018a\3\2\2\2\u018d\u0185\3\2\2\2\u018d\u0186\3\2\2\2\u018e"+
		"\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0192\3\2"+
		"\2\2\u0191\u018f\3\2\2\2\u0192\u0193\7\13\2\2\u0193G\3\2\2\2\u0194\u0197"+
		"\5T+\2\u0195\u0197\5J&\2\u0196\u0194\3\2\2\2\u0196\u0195\3\2\2\2\u0197"+
		"I\3\2\2\2\u0198\u0199\5L\'\2\u0199\u019a\7\21\2\2\u019a\u019c\5R*\2\u019b"+
		"\u019d\7/\2\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019dK\3\2\2\2\u019e"+
		"\u01a1\7\60\2\2\u019f\u01a1\5N(\2\u01a0\u019e\3\2\2\2\u01a0\u019f\3\2"+
		"\2\2\u01a1M\3\2\2\2\u01a2\u01a4\7\60\2\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4"+
		"\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\5P)\2\u01a6\u01a8\7\60\2\2\u01a7"+
		"\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8O\3\2\2\2\u01a9\u01aa\7 \2\2\u01aa"+
		"\u01ab\78\2\2\u01ab\u01ac\7\67\2\2\u01acQ\3\2\2\2\u01ad\u01b2\5^\60\2"+
		"\u01ae\u01af\7\23\2\2\u01af\u01b1\5^\60\2\u01b0\u01ae\3\2\2\2\u01b1\u01b4"+
		"\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3S\3\2\2\2\u01b4"+
		"\u01b2\3\2\2\2\u01b5\u01bb\5<\37\2\u01b6\u01b8\7\b\2\2\u01b7\u01b9\5X"+
		"-\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"\u01bc\7\t\2\2\u01bb\u01b6\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01be\3\2"+
		"\2\2\u01bd\u01bf\7/\2\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf"+
		"U\3\2\2\2\u01c0\u01c1\t\b\2\2\u01c1\u01c3\7\b\2\2\u01c2\u01c4\5X-\2\u01c3"+
		"\u01c2\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\7\t"+
		"\2\2\u01c6W\3\2\2\2\u01c7\u01cc\5Z.\2\u01c8\u01c9\7\23\2\2\u01c9\u01cb"+
		"\5Z.\2\u01ca\u01c8\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc"+
		"\u01cd\3\2\2\2\u01cdY\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d0\5^\60\2"+
		"\u01d0[\3\2\2\2\u01d1\u01d6\5\32\16\2\u01d2\u01d3\7\23\2\2\u01d3\u01d5"+
		"\5\32\16\2\u01d4\u01d2\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2"+
		"\u01d6\u01d7\3\2\2\2\u01d7]\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01dd\5"+
		"\32\16\2\u01da\u01dc\5\32\16\2\u01db\u01da\3\2\2\2\u01dc\u01df\3\2\2\2"+
		"\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de_\3\2\2\2\u01df\u01dd\3"+
		"\2\2\2\u01e0\u01e1\7!\2\2\u01e1\u01e2\7:\2\2\u01e2\u01e3\79\2\2\u01e3"+
		"a\3\2\2\2\u01e4\u01e6\7\30\2\2\u01e5\u01e7\t\13\2\2\u01e6\u01e5\3\2\2"+
		"\2\u01e7\u01e8\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9c"+
		"\3\2\2\2>gp{\177\u0086\u008e\u0091\u009a\u009e\u00af\u00b3\u00bd\u00c8"+
		"\u00d2\u00d4\u00e5\u00eb\u00f0\u00f5\u00fb\u00fe\u0104\u010a\u010e\u0112"+
		"\u0115\u0117\u011b\u0127\u012f\u0132\u0135\u0140\u0144\u014b\u0151\u0154"+
		"\u0157\u015b\u016a\u0172\u0177\u017e\u018a\u018d\u018f\u0196\u019c\u01a0"+
		"\u01a3\u01a7\u01b2\u01b8\u01bb\u01be\u01c3\u01cc\u01d6\u01dd\u01e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}