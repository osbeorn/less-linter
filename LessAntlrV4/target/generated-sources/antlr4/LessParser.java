// Generated from LessParser.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOLLAR=20, LT=15, LBRACK=11, UrlEnd=47, InterpolationStart=6, Url=48, 
		AND=22, Identifier=39, LPAREN=7, AT=21, RPAREN=8, IMPORT=37, IN=2, Number=41, 
		COMMA=18, TIL=14, Ellipsis=5, TILD_EQ=35, Color=42, PLUS=25, NL=44, EQ=33, 
		DOT=19, COMMENT=46, PIPE_EQ=34, BlockStart=9, IdentifierAfter=50, UrlStart=30, 
		EQEQ=31, RBRACK=12, InterpolationStartAfter=49, BlockEnd=10, NULL=1, Unit=3, 
		HASH=23, FONTFACE=38, MINUS=28, SEMI=17, COLON=16, StringLiteral=40, COLONCOLON=24, 
		NOTEQ=32, WS=43, PERC=29, WHEN=36, SL_COMMENT=45, GT=13, DIV=27, TIMES=26, 
		COMBINE_COMPARE=4;
	public static final String[] tokenNames = {
		"<INVALID>", "'null'", "'in'", "Unit", "COMBINE_COMPARE", "'...'", "InterpolationStart", 
		"'('", "')'", "'{'", "'}'", "'['", "']'", "'>'", "'~'", "'<'", "':'", 
		"';'", "','", "'.'", "'$'", "'@'", "'&'", "'#'", "'::'", "'+'", "'*'", 
		"'/'", "'-'", "'%'", "UrlStart", "'=='", "'!='", "'='", "'|='", "'~='", 
		"'when'", "'@import'", "'@font-face'", "Identifier", "StringLiteral", 
		"Number", "Color", "WS", "NL", "SL_COMMENT", "COMMENT", "UrlEnd", "Url", 
		"InterpolationStartAfter", "IdentifierAfter"
	};
	public static final int
		RULE_stylesheet = 0, RULE_statement = 1, RULE_params = 2, RULE_param = 3, 
		RULE_variableName = 4, RULE_paramOptionalValue = 5, RULE_commandStatement = 6, 
		RULE_mathCharacter = 7, RULE_mathStatement = 8, RULE_expression = 9, RULE_variableDeclaration = 10, 
		RULE_importDeclaration = 11, RULE_referenceUrl = 12, RULE_mediaTypes = 13, 
		RULE_nested = 14, RULE_nest = 15, RULE_ruleset = 16, RULE_block = 17, 
		RULE_selectors = 18, RULE_selector = 19, RULE_selectorPrefix = 20, RULE_element = 21, 
		RULE_pseudo = 22, RULE_attrib = 23, RULE_attribRelate = 24, RULE_identifier = 25, 
		RULE_identifierPart = 26, RULE_identifierVariableName = 27, RULE_property = 28, 
		RULE_values = 29, RULE_url = 30, RULE_measurement = 31, RULE_functionCall = 32;
	public static final String[] ruleNames = {
		"stylesheet", "statement", "params", "param", "variableName", "paramOptionalValue", 
		"commandStatement", "mathCharacter", "mathStatement", "expression", "variableDeclaration", 
		"importDeclaration", "referenceUrl", "mediaTypes", "nested", "nest", "ruleset", 
		"block", "selectors", "selector", "selectorPrefix", "element", "pseudo", 
		"attrib", "attribRelate", "identifier", "identifierPart", "identifierVariableName", 
		"property", "values", "url", "measurement", "functionCall"
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
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << InterpolationStart) | (1L << DOT) | (1L << AT) | (1L << AND) | (1L << HASH) | (1L << TIMES) | (1L << IMPORT) | (1L << Identifier))) != 0)) {
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
		public ImportDeclarationContext importDeclaration() {
			return getRuleContext(ImportDeclarationContext.class,0);
		}
		public RulesetContext ruleset() {
			return getRuleContext(RulesetContext.class,0);
		}
		public NestedContext nested() {
			return getRuleContext(NestedContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
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
			setState(76);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72); importDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73); nested();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74); ruleset();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75); variableDeclaration();
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

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(LessParser.COMMA); }
		public TerminalNode Ellipsis() { return getToken(LessParser.Ellipsis, 0); }
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(LessParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); param();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(79); match(COMMA);
				setState(80); param();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(86); match(Ellipsis);
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

	public static class ParamContext extends ParserRuleContext {
		public ParamOptionalValueContext paramOptionalValue() {
			return getRuleContext(ParamOptionalValueContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); variableName();
			setState(91);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(90); paramOptionalValue();
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

	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(LessParser.Identifier, 0); }
		public TerminalNode AT() { return getToken(LessParser.AT, 0); }
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
		enterRule(_localctx, 8, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); match(AT);
			setState(94); match(Identifier);
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

	public static class ParamOptionalValueContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode COLON() { return getToken(LessParser.COLON, 0); }
		public ParamOptionalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramOptionalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterParamOptionalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitParamOptionalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitParamOptionalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamOptionalValueContext paramOptionalValue() throws RecognitionException {
		ParamOptionalValueContext _localctx = new ParamOptionalValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_paramOptionalValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); match(COLON);
			setState(98); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97); expression();
				}
				}
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << InterpolationStart) | (1L << AT) | (1L << UrlStart) | (1L << Identifier) | (1L << StringLiteral) | (1L << Number) | (1L << Color))) != 0) );
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

	public static class CommandStatementContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public CommandStatementContext commandStatement() {
			return getRuleContext(CommandStatementContext.class,0);
		}
		public CommandStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterCommandStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitCommandStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitCommandStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandStatementContext commandStatement() throws RecognitionException {
		CommandStatementContext _localctx = new CommandStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_commandStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			switch (_input.LA(1)) {
			case NULL:
			case InterpolationStart:
			case AT:
			case UrlStart:
			case Identifier:
			case StringLiteral:
			case Number:
			case Color:
				{
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(102); expression();
					}
					}
					setState(105); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << InterpolationStart) | (1L << AT) | (1L << UrlStart) | (1L << Identifier) | (1L << StringLiteral) | (1L << Number) | (1L << Color))) != 0) );
				}
				break;
			case LPAREN:
				{
				setState(107); match(LPAREN);
				setState(108); commandStatement();
				setState(109); match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(114);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << TIMES) | (1L << DIV) | (1L << MINUS) | (1L << PERC))) != 0)) {
				{
				setState(113); mathStatement();
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

	public static class MathCharacterContext extends ParserRuleContext {
		public TerminalNode PERC() { return getToken(LessParser.PERC, 0); }
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
		enterRule(_localctx, 14, RULE_mathCharacter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << TIMES) | (1L << DIV) | (1L << MINUS) | (1L << PERC))) != 0)) ) {
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

	public static class MathStatementContext extends ParserRuleContext {
		public MathCharacterContext mathCharacter() {
			return getRuleContext(MathCharacterContext.class,0);
		}
		public CommandStatementContext commandStatement() {
			return getRuleContext(CommandStatementContext.class,0);
		}
		public MathStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterMathStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitMathStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitMathStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathStatementContext mathStatement() throws RecognitionException {
		MathStatementContext _localctx = new MathStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mathStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); mathCharacter();
			setState(119); commandStatement();
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
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public MeasurementContext measurement() {
			return getRuleContext(MeasurementContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(LessParser.StringLiteral, 0); }
		public TerminalNode Color() { return getToken(LessParser.Color, 0); }
		public TerminalNode NULL() { return getToken(LessParser.NULL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		enterRule(_localctx, 18, RULE_expression);
		try {
			setState(129);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121); measurement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122); identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123); match(Color);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(124); match(StringLiteral);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(125); match(NULL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(126); url();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(127); variableName();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(128); functionCall();
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LessParser.COLON, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131); variableName();
			setState(132); match(COLON);
			setState(133); values();
			setState(134); match(SEMI);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public ReferenceUrlContext referenceUrl() {
			return getRuleContext(ReferenceUrlContext.class,0);
		}
		public MediaTypesContext mediaTypes() {
			return getRuleContext(MediaTypesContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); match(IMPORT);
			setState(137); referenceUrl();
			setState(139);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(138); mediaTypes();
				}
			}

			setState(141); match(SEMI);
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

	public static class ReferenceUrlContext extends ParserRuleContext {
		public TerminalNode Url() { return getToken(LessParser.Url, 0); }
		public TerminalNode UrlEnd() { return getToken(LessParser.UrlEnd, 0); }
		public TerminalNode StringLiteral() { return getToken(LessParser.StringLiteral, 0); }
		public TerminalNode UrlStart() { return getToken(LessParser.UrlStart, 0); }
		public ReferenceUrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceUrl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterReferenceUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitReferenceUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitReferenceUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceUrlContext referenceUrl() throws RecognitionException {
		ReferenceUrlContext _localctx = new ReferenceUrlContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_referenceUrl);
		try {
			setState(147);
			switch (_input.LA(1)) {
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(143); match(StringLiteral);
				}
				break;
			case UrlStart:
				enterOuterAlt(_localctx, 2);
				{
				setState(144); match(UrlStart);
				setState(145); match(Url);
				setState(146); match(UrlEnd);
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

	public static class MediaTypesContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(LessParser.COMMA); }
		public TerminalNode Identifier(int i) {
			return getToken(LessParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(LessParser.Identifier); }
		public TerminalNode COMMA(int i) {
			return getToken(LessParser.COMMA, i);
		}
		public MediaTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterMediaTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitMediaTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitMediaTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaTypesContext mediaTypes() throws RecognitionException {
		MediaTypesContext _localctx = new MediaTypesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mediaTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(149); match(Identifier);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(150); match(COMMA);
				setState(151); match(Identifier);
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class NestedContext extends ParserRuleContext {
		public SelectorsContext selectors() {
			return getRuleContext(SelectorsContext.class,0);
		}
		public StylesheetContext stylesheet() {
			return getRuleContext(StylesheetContext.class,0);
		}
		public TerminalNode BlockStart() { return getToken(LessParser.BlockStart, 0); }
		public TerminalNode BlockEnd() { return getToken(LessParser.BlockEnd, 0); }
		public NestContext nest() {
			return getRuleContext(NestContext.class,0);
		}
		public NestedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nested; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterNested(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitNested(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitNested(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedContext nested() throws RecognitionException {
		NestedContext _localctx = new NestedContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_nested);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157); match(AT);
			setState(158); nest();
			setState(159); selectors();
			setState(160); match(BlockStart);
			setState(161); stylesheet();
			setState(162); match(BlockEnd);
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

	public static class NestContext extends ParserRuleContext {
		public TerminalNode Identifier(int i) {
			return getToken(LessParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(LessParser.Identifier); }
		public PseudoContext pseudo(int i) {
			return getRuleContext(PseudoContext.class,i);
		}
		public List<PseudoContext> pseudo() {
			return getRuleContexts(PseudoContext.class);
		}
		public NestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterNest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitNest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitNest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestContext nest() throws RecognitionException {
		NestContext _localctx = new NestContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_nest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(165); match(Identifier);
					}
					} 
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON || _la==COLONCOLON) {
				{
				{
				setState(171); pseudo();
				}
				}
				setState(176);
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

	public static class RulesetContext extends ParserRuleContext {
		public SelectorsContext selectors() {
			return getRuleContext(SelectorsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public RulesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterRuleset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitRuleset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitRuleset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesetContext ruleset() throws RecognitionException {
		RulesetContext _localctx = new RulesetContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ruleset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); selectors();
			setState(178); block();
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
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public TerminalNode BlockStart() { return getToken(LessParser.BlockStart, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode BlockEnd() { return getToken(LessParser.BlockEnd, 0); }
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
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
		enterRule(_localctx, 34, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180); match(BlockStart);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(185);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(181); property();
						setState(182); match(SEMI);
						}
						break;
					case 2:
						{
						setState(184); statement();
						}
						break;
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(191);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << InterpolationStart) | (1L << DOT) | (1L << AND) | (1L << HASH) | (1L << TIMES) | (1L << Identifier))) != 0)) {
				{
				setState(190); property();
				}
			}

			setState(193); match(BlockEnd);
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
		public List<TerminalNode> COMMA() { return getTokens(LessParser.COMMA); }
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
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
		enterRule(_localctx, 36, RULE_selectors);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195); selector();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(196); match(COMMA);
				setState(197); selector();
				}
				}
				setState(202);
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
		public PseudoContext pseudo() {
			return getRuleContext(PseudoContext.class,0);
		}
		public List<AttribContext> attrib() {
			return getRuleContexts(AttribContext.class);
		}
		public SelectorPrefixContext selectorPrefix(int i) {
			return getRuleContext(SelectorPrefixContext.class,i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(204); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(203); element();
				}
				}
				setState(206); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << InterpolationStart) | (1L << DOT) | (1L << AND) | (1L << HASH) | (1L << TIMES) | (1L << Identifier))) != 0) );
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << TIL) | (1L << PLUS))) != 0)) {
				{
				{
				setState(208); selectorPrefix();
				setState(209); element();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(216); attrib();
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
			_la = _input.LA(1);
			if (_la==COLON || _la==COLONCOLON) {
				{
				setState(222); pseudo();
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
		enterRule(_localctx, 40, RULE_selectorPrefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		enterRule(_localctx, 42, RULE_element);
		try {
			setState(234);
			switch (_input.LA(1)) {
			case InterpolationStart:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(227); identifier();
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(228); match(HASH);
				setState(229); identifier();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(230); match(DOT);
				setState(231); identifier();
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 4);
				{
				setState(232); match(AND);
				}
				break;
			case TIMES:
				enterOuterAlt(_localctx, 5);
				{
				setState(233); match(TIMES);
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(LessParser.Identifier, 0); }
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
		enterRule(_localctx, 44, RULE_pseudo);
		int _la;
		try {
			setState(240);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==COLONCOLON) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(237); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==COLONCOLON) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(239); functionCall();
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
		public AttribRelateContext attribRelate() {
			return getRuleContext(AttribRelateContext.class,0);
		}
		public TerminalNode Identifier(int i) {
			return getToken(LessParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(LessParser.Identifier); }
		public TerminalNode StringLiteral() { return getToken(LessParser.StringLiteral, 0); }
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
		enterRule(_localctx, 46, RULE_attrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242); match(LBRACK);
			setState(243); match(Identifier);
			setState(247);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << PIPE_EQ) | (1L << TILD_EQ))) != 0)) {
				{
				setState(244); attribRelate();
				setState(245);
				_la = _input.LA(1);
				if ( !(_la==Identifier || _la==StringLiteral) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(249); match(RBRACK);
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
		enterRule(_localctx, 48, RULE_attribRelate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
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

	public static class IdentifierContext extends ParserRuleContext {
		public List<IdentifierPartContext> identifierPart() {
			return getRuleContexts(IdentifierPartContext.class);
		}
		public TerminalNode InterpolationStart() { return getToken(LessParser.InterpolationStart, 0); }
		public IdentifierPartContext identifierPart(int i) {
			return getRuleContext(IdentifierPartContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(LessParser.Identifier, 0); }
		public TerminalNode BlockEnd() { return getToken(LessParser.BlockEnd, 0); }
		public IdentifierVariableNameContext identifierVariableName() {
			return getRuleContext(IdentifierVariableNameContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_identifier);
		int _la;
		try {
			setState(269);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(253); match(Identifier);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==InterpolationStartAfter || _la==IdentifierAfter) {
					{
					{
					setState(254); identifierPart();
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case InterpolationStart:
				enterOuterAlt(_localctx, 2);
				{
				setState(260); match(InterpolationStart);
				setState(261); identifierVariableName();
				setState(262); match(BlockEnd);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==InterpolationStartAfter || _la==IdentifierAfter) {
					{
					{
					setState(263); identifierPart();
					}
					}
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class IdentifierPartContext extends ParserRuleContext {
		public TerminalNode BlockEnd() { return getToken(LessParser.BlockEnd, 0); }
		public IdentifierVariableNameContext identifierVariableName() {
			return getRuleContext(IdentifierVariableNameContext.class,0);
		}
		public TerminalNode InterpolationStartAfter() { return getToken(LessParser.InterpolationStartAfter, 0); }
		public TerminalNode IdentifierAfter() { return getToken(LessParser.IdentifierAfter, 0); }
		public IdentifierPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterIdentifierPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitIdentifierPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitIdentifierPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierPartContext identifierPart() throws RecognitionException {
		IdentifierPartContext _localctx = new IdentifierPartContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_identifierPart);
		try {
			setState(276);
			switch (_input.LA(1)) {
			case InterpolationStartAfter:
				enterOuterAlt(_localctx, 1);
				{
				setState(271); match(InterpolationStartAfter);
				setState(272); identifierVariableName();
				setState(273); match(BlockEnd);
				}
				break;
			case IdentifierAfter:
				enterOuterAlt(_localctx, 2);
				{
				setState(275); match(IdentifierAfter);
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

	public static class IdentifierVariableNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(LessParser.Identifier, 0); }
		public TerminalNode DOLLAR() { return getToken(LessParser.DOLLAR, 0); }
		public TerminalNode IdentifierAfter() { return getToken(LessParser.IdentifierAfter, 0); }
		public IdentifierVariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierVariableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).enterIdentifierVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LessParserListener ) ((LessParserListener)listener).exitIdentifierVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LessParserVisitor ) return ((LessParserVisitor<? extends T>)visitor).visitIdentifierVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierVariableNameContext identifierVariableName() throws RecognitionException {
		IdentifierVariableNameContext _localctx = new IdentifierVariableNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_identifierVariableName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278); match(DOLLAR);
			setState(279);
			_la = _input.LA(1);
			if ( !(_la==Identifier || _la==IdentifierAfter) ) {
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

	public static class PropertyContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LessParser.COLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		enterRule(_localctx, 56, RULE_property);
		try {
			setState(286);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281); element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282); identifier();
				setState(283); match(COLON);
				setState(284); values();
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

	public static class ValuesContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(LessParser.COMMA); }
		public CommandStatementContext commandStatement(int i) {
			return getRuleContext(CommandStatementContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(LessParser.COMMA, i);
		}
		public List<CommandStatementContext> commandStatement() {
			return getRuleContexts(CommandStatementContext.class);
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
		enterRule(_localctx, 58, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288); commandStatement();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(289); match(COMMA);
				setState(290); commandStatement();
				}
				}
				setState(295);
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

	public static class UrlContext extends ParserRuleContext {
		public TerminalNode Url() { return getToken(LessParser.Url, 0); }
		public TerminalNode UrlEnd() { return getToken(LessParser.UrlEnd, 0); }
		public TerminalNode UrlStart() { return getToken(LessParser.UrlStart, 0); }
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
		enterRule(_localctx, 60, RULE_url);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296); match(UrlStart);
			setState(297); match(Url);
			setState(298); match(UrlEnd);
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
		public TerminalNode Number() { return getToken(LessParser.Number, 0); }
		public TerminalNode Unit() { return getToken(LessParser.Unit, 0); }
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
		enterRule(_localctx, 62, RULE_measurement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300); match(Number);
			setState(302);
			_la = _input.LA(1);
			if (_la==Unit) {
				{
				setState(301); match(Unit);
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
		public TerminalNode RPAREN() { return getToken(LessParser.RPAREN, 0); }
		public TerminalNode Identifier() { return getToken(LessParser.Identifier, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(LessParser.LPAREN, 0); }
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
		enterRule(_localctx, 64, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304); match(Identifier);
			setState(305); match(LPAREN);
			setState(307);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << InterpolationStart) | (1L << LPAREN) | (1L << AT) | (1L << UrlStart) | (1L << Identifier) | (1L << StringLiteral) | (1L << Number) | (1L << Color))) != 0)) {
				{
				setState(306); values();
				}
			}

			setState(309); match(RPAREN);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64\u013a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\7\2F\n\2\f\2\16\2I\13\2\3\3\3\3\3\3\3\3\5\3O\n\3\3\4\3"+
		"\4\3\4\7\4T\n\4\f\4\16\4W\13\4\3\4\5\4Z\n\4\3\5\3\5\5\5^\n\5\3\6\3\6\3"+
		"\6\3\7\3\7\6\7e\n\7\r\7\16\7f\3\b\6\bj\n\b\r\b\16\bk\3\b\3\b\3\b\3\b\5"+
		"\br\n\b\3\b\5\bu\n\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u0084\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u008e\n"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u0096\n\16\3\17\3\17\3\17\7\17\u009b"+
		"\n\17\f\17\16\17\u009e\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\7\21\u00a9\n\21\f\21\16\21\u00ac\13\21\3\21\7\21\u00af\n\21\f\21\16"+
		"\21\u00b2\13\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\7\23\u00bc\n\23"+
		"\f\23\16\23\u00bf\13\23\3\23\5\23\u00c2\n\23\3\23\3\23\3\24\3\24\3\24"+
		"\7\24\u00c9\n\24\f\24\16\24\u00cc\13\24\3\25\6\25\u00cf\n\25\r\25\16\25"+
		"\u00d0\3\25\3\25\3\25\7\25\u00d6\n\25\f\25\16\25\u00d9\13\25\3\25\7\25"+
		"\u00dc\n\25\f\25\16\25\u00df\13\25\3\25\5\25\u00e2\n\25\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00ed\n\27\3\30\3\30\3\30\3\30\5\30"+
		"\u00f3\n\30\3\31\3\31\3\31\3\31\3\31\5\31\u00fa\n\31\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\7\33\u0102\n\33\f\33\16\33\u0105\13\33\3\33\3\33\3\33\3"+
		"\33\7\33\u010b\n\33\f\33\16\33\u010e\13\33\5\33\u0110\n\33\3\34\3\34\3"+
		"\34\3\34\3\34\5\34\u0117\n\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u0121\n\36\3\37\3\37\3\37\7\37\u0126\n\37\f\37\16\37\u0129\13\37"+
		"\3 \3 \3 \3 \3!\3!\5!\u0131\n!\3\"\3\"\3\"\5\"\u0136\n\"\3\"\3\"\3\"\2"+
		"\2#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"\2\t\3\2\33\37\4\2\30\30))\4\2\17\20\33\33\4\2\22\22\32\32\3\2)*\3\2#"+
		"%\4\2))\64\64\u0145\2G\3\2\2\2\4N\3\2\2\2\6P\3\2\2\2\b[\3\2\2\2\n_\3\2"+
		"\2\2\fb\3\2\2\2\16q\3\2\2\2\20v\3\2\2\2\22x\3\2\2\2\24\u0083\3\2\2\2\26"+
		"\u0085\3\2\2\2\30\u008a\3\2\2\2\32\u0095\3\2\2\2\34\u0097\3\2\2\2\36\u009f"+
		"\3\2\2\2 \u00a6\3\2\2\2\"\u00b3\3\2\2\2$\u00b6\3\2\2\2&\u00c5\3\2\2\2"+
		"(\u00ce\3\2\2\2*\u00e3\3\2\2\2,\u00ec\3\2\2\2.\u00f2\3\2\2\2\60\u00f4"+
		"\3\2\2\2\62\u00fd\3\2\2\2\64\u010f\3\2\2\2\66\u0116\3\2\2\28\u0118\3\2"+
		"\2\2:\u0120\3\2\2\2<\u0122\3\2\2\2>\u012a\3\2\2\2@\u012e\3\2\2\2B\u0132"+
		"\3\2\2\2DF\5\4\3\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\3\3\2\2\2"+
		"IG\3\2\2\2JO\5\30\r\2KO\5\36\20\2LO\5\"\22\2MO\5\26\f\2NJ\3\2\2\2NK\3"+
		"\2\2\2NL\3\2\2\2NM\3\2\2\2O\5\3\2\2\2PU\5\b\5\2QR\7\24\2\2RT\5\b\5\2S"+
		"Q\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VY\3\2\2\2WU\3\2\2\2XZ\7\7\2\2"+
		"YX\3\2\2\2YZ\3\2\2\2Z\7\3\2\2\2[]\5\n\6\2\\^\5\f\7\2]\\\3\2\2\2]^\3\2"+
		"\2\2^\t\3\2\2\2_`\7\27\2\2`a\7)\2\2a\13\3\2\2\2bd\7\22\2\2ce\5\24\13\2"+
		"dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\r\3\2\2\2hj\5\24\13\2ih\3\2"+
		"\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lr\3\2\2\2mn\7\t\2\2no\5\16\b\2op\7"+
		"\n\2\2pr\3\2\2\2qi\3\2\2\2qm\3\2\2\2rt\3\2\2\2su\5\22\n\2ts\3\2\2\2tu"+
		"\3\2\2\2u\17\3\2\2\2vw\t\2\2\2w\21\3\2\2\2xy\5\20\t\2yz\5\16\b\2z\23\3"+
		"\2\2\2{\u0084\5@!\2|\u0084\5\64\33\2}\u0084\7,\2\2~\u0084\7*\2\2\177\u0084"+
		"\7\3\2\2\u0080\u0084\5> \2\u0081\u0084\5\n\6\2\u0082\u0084\5B\"\2\u0083"+
		"{\3\2\2\2\u0083|\3\2\2\2\u0083}\3\2\2\2\u0083~\3\2\2\2\u0083\177\3\2\2"+
		"\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\25"+
		"\3\2\2\2\u0085\u0086\5\n\6\2\u0086\u0087\7\22\2\2\u0087\u0088\5<\37\2"+
		"\u0088\u0089\7\23\2\2\u0089\27\3\2\2\2\u008a\u008b\7\'\2\2\u008b\u008d"+
		"\5\32\16\2\u008c\u008e\5\34\17\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2"+
		"\2\u008e\u008f\3\2\2\2\u008f\u0090\7\23\2\2\u0090\31\3\2\2\2\u0091\u0096"+
		"\7*\2\2\u0092\u0093\7 \2\2\u0093\u0094\7\62\2\2\u0094\u0096\7\61\2\2\u0095"+
		"\u0091\3\2\2\2\u0095\u0092\3\2\2\2\u0096\33\3\2\2\2\u0097\u009c\7)\2\2"+
		"\u0098\u0099\7\24\2\2\u0099\u009b\7)\2\2\u009a\u0098\3\2\2\2\u009b\u009e"+
		"\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\35\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009f\u00a0\7\27\2\2\u00a0\u00a1\5 \21\2\u00a1\u00a2\5"+
		"&\24\2\u00a2\u00a3\7\13\2\2\u00a3\u00a4\5\2\2\2\u00a4\u00a5\7\f\2\2\u00a5"+
		"\37\3\2\2\2\u00a6\u00aa\t\3\2\2\u00a7\u00a9\7)\2\2\u00a8\u00a7\3\2\2\2"+
		"\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00b0"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00af\5.\30\2\u00ae\u00ad\3\2\2\2\u00af"+
		"\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1!\3\2\2\2"+
		"\u00b2\u00b0\3\2\2\2\u00b3\u00b4\5&\24\2\u00b4\u00b5\5$\23\2\u00b5#\3"+
		"\2\2\2\u00b6\u00bd\7\13\2\2\u00b7\u00b8\5:\36\2\u00b8\u00b9\7\23\2\2\u00b9"+
		"\u00bc\3\2\2\2\u00ba\u00bc\5\4\3\2\u00bb\u00b7\3\2\2\2\u00bb\u00ba\3\2"+
		"\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c2\5:\36\2\u00c1\u00c0\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\7\f\2\2\u00c4"+
		"%\3\2\2\2\u00c5\u00ca\5(\25\2\u00c6\u00c7\7\24\2\2\u00c7\u00c9\5(\25\2"+
		"\u00c8\u00c6\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\'\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00cf\5,\27\2\u00ce"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00d7\3\2\2\2\u00d2\u00d3\5*\26\2\u00d3\u00d4\5,\27\2\u00d4"+
		"\u00d6\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00dd\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da"+
		"\u00dc\5\60\31\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3"+
		"\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0"+
		"\u00e2\5.\30\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2)\3\2\2\2"+
		"\u00e3\u00e4\t\4\2\2\u00e4+\3\2\2\2\u00e5\u00ed\5\64\33\2\u00e6\u00e7"+
		"\7\31\2\2\u00e7\u00ed\5\64\33\2\u00e8\u00e9\7\25\2\2\u00e9\u00ed\5\64"+
		"\33\2\u00ea\u00ed\7\30\2\2\u00eb\u00ed\7\34\2\2\u00ec\u00e5\3\2\2\2\u00ec"+
		"\u00e6\3\2\2\2\u00ec\u00e8\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2"+
		"\2\2\u00ed-\3\2\2\2\u00ee\u00ef\t\5\2\2\u00ef\u00f3\7)\2\2\u00f0\u00f1"+
		"\t\5\2\2\u00f1\u00f3\5B\"\2\u00f2\u00ee\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"/\3\2\2\2\u00f4\u00f5\7\r\2\2\u00f5\u00f9\7)\2\2\u00f6\u00f7\5\62\32\2"+
		"\u00f7\u00f8\t\6\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f6\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\7\16\2\2\u00fc\61\3\2\2\2\u00fd"+
		"\u00fe\t\7\2\2\u00fe\63\3\2\2\2\u00ff\u0103\7)\2\2\u0100\u0102\5\66\34"+
		"\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0110\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7\b\2\2\u0107"+
		"\u0108\58\35\2\u0108\u010c\7\f\2\2\u0109\u010b\5\66\34\2\u010a\u0109\3"+
		"\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u00ff\3\2\2\2\u010f\u0106\3\2"+
		"\2\2\u0110\65\3\2\2\2\u0111\u0112\7\63\2\2\u0112\u0113\58\35\2\u0113\u0114"+
		"\7\f\2\2\u0114\u0117\3\2\2\2\u0115\u0117\7\64\2\2\u0116\u0111\3\2\2\2"+
		"\u0116\u0115\3\2\2\2\u0117\67\3\2\2\2\u0118\u0119\7\26\2\2\u0119\u011a"+
		"\t\b\2\2\u011a9\3\2\2\2\u011b\u0121\5,\27\2\u011c\u011d\5\64\33\2\u011d"+
		"\u011e\7\22\2\2\u011e\u011f\5<\37\2\u011f\u0121\3\2\2\2\u0120\u011b\3"+
		"\2\2\2\u0120\u011c\3\2\2\2\u0121;\3\2\2\2\u0122\u0127\5\16\b\2\u0123\u0124"+
		"\7\24\2\2\u0124\u0126\5\16\b\2\u0125\u0123\3\2\2\2\u0126\u0129\3\2\2\2"+
		"\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128=\3\2\2\2\u0129\u0127\3"+
		"\2\2\2\u012a\u012b\7 \2\2\u012b\u012c\7\62\2\2\u012c\u012d\7\61\2\2\u012d"+
		"?\3\2\2\2\u012e\u0130\7+\2\2\u012f\u0131\7\5\2\2\u0130\u012f\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131A\3\2\2\2\u0132\u0133\7)\2\2\u0133\u0135\7\t\2\2\u0134"+
		"\u0136\5<\37\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0137\u0138\7\n\2\2\u0138C\3\2\2\2$GNUY]fkqt\u0083\u008d\u0095\u009c"+
		"\u00aa\u00b0\u00bb\u00bd\u00c1\u00ca\u00d0\u00d7\u00dd\u00e1\u00ec\u00f2"+
		"\u00f9\u0103\u010c\u010f\u0116\u0120\u0127\u0130\u0135";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}