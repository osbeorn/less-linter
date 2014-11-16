package si.osbeorn.lesslint.antlr;

// Generated from LessParser.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LessParser}.
 */
public interface LessParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LessParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(@NotNull LessParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(@NotNull LessParser.SelectorContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull LessParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull LessParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#mixinCall}.
	 * @param ctx the parse tree
	 */
	void enterMixinCall(@NotNull LessParser.MixinCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#mixinCall}.
	 * @param ctx the parse tree
	 */
	void exitMixinCall(@NotNull LessParser.MixinCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(@NotNull LessParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(@NotNull LessParser.VariableNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(@NotNull LessParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(@NotNull LessParser.ExpressionStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#pseudo}.
	 * @param ctx the parse tree
	 */
	void enterPseudo(@NotNull LessParser.PseudoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#pseudo}.
	 * @param ctx the parse tree
	 */
	void exitPseudo(@NotNull LessParser.PseudoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#pseudoParams}.
	 * @param ctx the parse tree
	 */
	void enterPseudoParams(@NotNull LessParser.PseudoParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#pseudoParams}.
	 * @param ctx the parse tree
	 */
	void exitPseudoParams(@NotNull LessParser.PseudoParamsContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#propertyStatement}.
	 * @param ctx the parse tree
	 */
	void enterPropertyStatement(@NotNull LessParser.PropertyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#propertyStatement}.
	 * @param ctx the parse tree
	 */
	void exitPropertyStatement(@NotNull LessParser.PropertyStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#boolCharacter}.
	 * @param ctx the parse tree
	 */
	void enterBoolCharacter(@NotNull LessParser.BoolCharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#boolCharacter}.
	 * @param ctx the parse tree
	 */
	void exitBoolCharacter(@NotNull LessParser.BoolCharacterContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#mathCharacter}.
	 * @param ctx the parse tree
	 */
	void enterMathCharacter(@NotNull LessParser.MathCharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#mathCharacter}.
	 * @param ctx the parse tree
	 */
	void exitMathCharacter(@NotNull LessParser.MathCharacterContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#propertyValues}.
	 * @param ctx the parse tree
	 */
	void enterPropertyValues(@NotNull LessParser.PropertyValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#propertyValues}.
	 * @param ctx the parse tree
	 */
	void exitPropertyValues(@NotNull LessParser.PropertyValuesContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull LessParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull LessParser.FunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#callParam}.
	 * @param ctx the parse tree
	 */
	void enterCallParam(@NotNull LessParser.CallParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#callParam}.
	 * @param ctx the parse tree
	 */
	void exitCallParam(@NotNull LessParser.CallParamContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(@NotNull LessParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(@NotNull LessParser.ValuesContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#mixinGuardsList}.
	 * @param ctx the parse tree
	 */
	void enterMixinGuardsList(@NotNull LessParser.MixinGuardsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#mixinGuardsList}.
	 * @param ctx the parse tree
	 */
	void exitMixinGuardsList(@NotNull LessParser.MixinGuardsListContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#mixinParamName}.
	 * @param ctx the parse tree
	 */
	void enterMixinParamName(@NotNull LessParser.MixinParamNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#mixinParamName}.
	 * @param ctx the parse tree
	 */
	void exitMixinParamName(@NotNull LessParser.MixinParamNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#mediaStatement}.
	 * @param ctx the parse tree
	 */
	void enterMediaStatement(@NotNull LessParser.MediaStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#mediaStatement}.
	 * @param ctx the parse tree
	 */
	void exitMediaStatement(@NotNull LessParser.MediaStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(@NotNull LessParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(@NotNull LessParser.ElementContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#ruleStatement}.
	 * @param ctx the parse tree
	 */
	void enterRuleStatement(@NotNull LessParser.RuleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#ruleStatement}.
	 * @param ctx the parse tree
	 */
	void exitRuleStatement(@NotNull LessParser.RuleStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#mixinParams}.
	 * @param ctx the parse tree
	 */
	void enterMixinParams(@NotNull LessParser.MixinParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#mixinParams}.
	 * @param ctx the parse tree
	 */
	void exitMixinParams(@NotNull LessParser.MixinParamsContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#mixinGuard}.
	 * @param ctx the parse tree
	 */
	void enterMixinGuard(@NotNull LessParser.MixinGuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#mixinGuard}.
	 * @param ctx the parse tree
	 */
	void exitMixinGuard(@NotNull LessParser.MixinGuardContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#mediaQueryList}.
	 * @param ctx the parse tree
	 */
	void enterMediaQueryList(@NotNull LessParser.MediaQueryListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#mediaQueryList}.
	 * @param ctx the parse tree
	 */
	void exitMediaQueryList(@NotNull LessParser.MediaQueryListContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(@NotNull LessParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(@NotNull LessParser.PropertyContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#varInterpolationIdent}.
	 * @param ctx the parse tree
	 */
	void enterVarInterpolationIdent(@NotNull LessParser.VarInterpolationIdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#varInterpolationIdent}.
	 * @param ctx the parse tree
	 */
	void exitVarInterpolationIdent(@NotNull LessParser.VarInterpolationIdentContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#attribRelate}.
	 * @param ctx the parse tree
	 */
	void enterAttribRelate(@NotNull LessParser.AttribRelateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#attribRelate}.
	 * @param ctx the parse tree
	 */
	void exitAttribRelate(@NotNull LessParser.AttribRelateContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(@NotNull LessParser.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(@NotNull LessParser.UrlContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#measurement}.
	 * @param ctx the parse tree
	 */
	void enterMeasurement(@NotNull LessParser.MeasurementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#measurement}.
	 * @param ctx the parse tree
	 */
	void exitMeasurement(@NotNull LessParser.MeasurementContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull LessParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull LessParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#mediaQueryExpression}.
	 * @param ctx the parse tree
	 */
	void enterMediaQueryExpression(@NotNull LessParser.MediaQueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#mediaQueryExpression}.
	 * @param ctx the parse tree
	 */
	void exitMediaQueryExpression(@NotNull LessParser.MediaQueryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#mathPrefixCharacter}.
	 * @param ctx the parse tree
	 */
	void enterMathPrefixCharacter(@NotNull LessParser.MathPrefixCharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#mathPrefixCharacter}.
	 * @param ctx the parse tree
	 */
	void exitMathPrefixCharacter(@NotNull LessParser.MathPrefixCharacterContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#selectorGroup}.
	 * @param ctx the parse tree
	 */
	void enterSelectorGroup(@NotNull LessParser.SelectorGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#selectorGroup}.
	 * @param ctx the parse tree
	 */
	void exitSelectorGroup(@NotNull LessParser.SelectorGroupContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatement(@NotNull LessParser.VariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatement(@NotNull LessParser.VariableStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull LessParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull LessParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#propertyIdent}.
	 * @param ctx the parse tree
	 */
	void enterPropertyIdent(@NotNull LessParser.PropertyIdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#propertyIdent}.
	 * @param ctx the parse tree
	 */
	void exitPropertyIdent(@NotNull LessParser.PropertyIdentContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheet(@NotNull LessParser.StylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheet(@NotNull LessParser.StylesheetContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(@NotNull LessParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(@NotNull LessParser.ImportStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#mixin}.
	 * @param ctx the parse tree
	 */
	void enterMixin(@NotNull LessParser.MixinContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#mixin}.
	 * @param ctx the parse tree
	 */
	void exitMixin(@NotNull LessParser.MixinContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#callParams}.
	 * @param ctx the parse tree
	 */
	void enterCallParams(@NotNull LessParser.CallParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#callParams}.
	 * @param ctx the parse tree
	 */
	void exitCallParams(@NotNull LessParser.CallParamsContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#commaValues}.
	 * @param ctx the parse tree
	 */
	void enterCommaValues(@NotNull LessParser.CommaValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#commaValues}.
	 * @param ctx the parse tree
	 */
	void exitCommaValues(@NotNull LessParser.CommaValuesContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#mediaQuery}.
	 * @param ctx the parse tree
	 */
	void enterMediaQuery(@NotNull LessParser.MediaQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#mediaQuery}.
	 * @param ctx the parse tree
	 */
	void exitMediaQuery(@NotNull LessParser.MediaQueryContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(@NotNull LessParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(@NotNull LessParser.KeywordContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#mixinParamList}.
	 * @param ctx the parse tree
	 */
	void enterMixinParamList(@NotNull LessParser.MixinParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#mixinParamList}.
	 * @param ctx the parse tree
	 */
	void exitMixinParamList(@NotNull LessParser.MixinParamListContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#attrib}.
	 * @param ctx the parse tree
	 */
	void enterAttrib(@NotNull LessParser.AttribContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#attrib}.
	 * @param ctx the parse tree
	 */
	void exitAttrib(@NotNull LessParser.AttribContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#mixinGuards}.
	 * @param ctx the parse tree
	 */
	void enterMixinGuards(@NotNull LessParser.MixinGuardsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#mixinGuards}.
	 * @param ctx the parse tree
	 */
	void exitMixinGuards(@NotNull LessParser.MixinGuardsContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(@NotNull LessParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(@NotNull LessParser.ColorContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#selectors}.
	 * @param ctx the parse tree
	 */
	void enterSelectors(@NotNull LessParser.SelectorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#selectors}.
	 * @param ctx the parse tree
	 */
	void exitSelectors(@NotNull LessParser.SelectorsContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#mixinParam}.
	 * @param ctx the parse tree
	 */
	void enterMixinParam(@NotNull LessParser.MixinParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#mixinParam}.
	 * @param ctx the parse tree
	 */
	void exitMixinParam(@NotNull LessParser.MixinParamContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#selectorPrefix}.
	 * @param ctx the parse tree
	 */
	void enterSelectorPrefix(@NotNull LessParser.SelectorPrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#selectorPrefix}.
	 * @param ctx the parse tree
	 */
	void exitSelectorPrefix(@NotNull LessParser.SelectorPrefixContext ctx);

	/**
	 * Enter a parse tree produced by {@link LessParser#varInterpolation}.
	 * @param ctx the parse tree
	 */
	void enterVarInterpolation(@NotNull LessParser.VarInterpolationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#varInterpolation}.
	 * @param ctx the parse tree
	 */
	void exitVarInterpolation(@NotNull LessParser.VarInterpolationContext ctx);
}