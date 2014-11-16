package si.osbeorn.lesslinter.antlr;

// Generated from LessParser.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LessParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LessParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LessParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(@NotNull LessParser.SelectorContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull LessParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#mixinCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixinCall(@NotNull LessParser.MixinCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(@NotNull LessParser.VariableNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(@NotNull LessParser.ExpressionStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#pseudo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudo(@NotNull LessParser.PseudoContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#pseudoParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoParams(@NotNull LessParser.PseudoParamsContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#propertyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyStatement(@NotNull LessParser.PropertyStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#boolCharacter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolCharacter(@NotNull LessParser.BoolCharacterContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#mathCharacter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathCharacter(@NotNull LessParser.MathCharacterContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#propertyValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyValues(@NotNull LessParser.PropertyValuesContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(@NotNull LessParser.FunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#callParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallParam(@NotNull LessParser.CallParamContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(@NotNull LessParser.ValuesContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#mixinGuardsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixinGuardsList(@NotNull LessParser.MixinGuardsListContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#mixinParamName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixinParamName(@NotNull LessParser.MixinParamNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#mediaStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaStatement(@NotNull LessParser.MediaStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(@NotNull LessParser.ElementContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#ruleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleStatement(@NotNull LessParser.RuleStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#mixinParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixinParams(@NotNull LessParser.MixinParamsContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#mixinGuard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixinGuard(@NotNull LessParser.MixinGuardContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#mediaQueryList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaQueryList(@NotNull LessParser.MediaQueryListContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(@NotNull LessParser.PropertyContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#varInterpolationIdent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarInterpolationIdent(@NotNull LessParser.VarInterpolationIdentContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#attribRelate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribRelate(@NotNull LessParser.AttribRelateContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl(@NotNull LessParser.UrlContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#measurement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeasurement(@NotNull LessParser.MeasurementContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull LessParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#mediaQueryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaQueryExpression(@NotNull LessParser.MediaQueryExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#mathPrefixCharacter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathPrefixCharacter(@NotNull LessParser.MathPrefixCharacterContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#selectorGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorGroup(@NotNull LessParser.SelectorGroupContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#variableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableStatement(@NotNull LessParser.VariableStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull LessParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#propertyIdent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyIdent(@NotNull LessParser.PropertyIdentContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#stylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesheet(@NotNull LessParser.StylesheetContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(@NotNull LessParser.ImportStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#mixin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixin(@NotNull LessParser.MixinContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#callParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallParams(@NotNull LessParser.CallParamsContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#commaValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaValues(@NotNull LessParser.CommaValuesContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#mediaQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaQuery(@NotNull LessParser.MediaQueryContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(@NotNull LessParser.KeywordContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#mixinParamList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixinParamList(@NotNull LessParser.MixinParamListContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#attrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrib(@NotNull LessParser.AttribContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#mixinGuards}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixinGuards(@NotNull LessParser.MixinGuardsContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(@NotNull LessParser.ColorContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#selectors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectors(@NotNull LessParser.SelectorsContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#mixinParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixinParam(@NotNull LessParser.MixinParamContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#selectorPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorPrefix(@NotNull LessParser.SelectorPrefixContext ctx);

	/**
	 * Visit a parse tree produced by {@link LessParser#varInterpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarInterpolation(@NotNull LessParser.VarInterpolationContext ctx);
}