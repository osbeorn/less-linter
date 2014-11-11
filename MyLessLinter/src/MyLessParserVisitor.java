// Generated from MyLessParser.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyLessParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyLessParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyLessParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull MyLessParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(@NotNull MyLessParser.SelectorContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#mixinCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixinCall(@NotNull MyLessParser.MixinCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#variableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableStatement(@NotNull MyLessParser.VariableStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(@NotNull MyLessParser.VariableNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#propertyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyStatement(@NotNull MyLessParser.PropertyStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#pseudo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudo(@NotNull MyLessParser.PseudoContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(@NotNull MyLessParser.ExpressionStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#boolCharacter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolCharacter(@NotNull MyLessParser.BoolCharacterContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull MyLessParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#mathCharacter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathCharacter(@NotNull MyLessParser.MathCharacterContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#propertyValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyValues(@NotNull MyLessParser.PropertyValuesContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#propertyIdent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyIdent(@NotNull MyLessParser.PropertyIdentContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#callParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallParam(@NotNull MyLessParser.CallParamContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(@NotNull MyLessParser.FunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(@NotNull MyLessParser.ValuesContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#mixinGuardsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixinGuardsList(@NotNull MyLessParser.MixinGuardsListContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#mixinParamName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixinParamName(@NotNull MyLessParser.MixinParamNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(@NotNull MyLessParser.ImportStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#stylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesheet(@NotNull MyLessParser.StylesheetContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#callParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallParams(@NotNull MyLessParser.CallParamsContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#mixin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixin(@NotNull MyLessParser.MixinContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#mediaStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaStatement(@NotNull MyLessParser.MediaStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#commaValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaValues(@NotNull MyLessParser.CommaValuesContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#mediaQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaQuery(@NotNull MyLessParser.MediaQueryContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(@NotNull MyLessParser.ElementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#ruleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleStatement(@NotNull MyLessParser.RuleStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#mixinParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixinParams(@NotNull MyLessParser.MixinParamsContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#mediaQueryList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaQueryList(@NotNull MyLessParser.MediaQueryListContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#mixinGuard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixinGuard(@NotNull MyLessParser.MixinGuardContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(@NotNull MyLessParser.KeywordContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(@NotNull MyLessParser.PropertyContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#attrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrib(@NotNull MyLessParser.AttribContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#attribRelate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribRelate(@NotNull MyLessParser.AttribRelateContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#measurement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeasurement(@NotNull MyLessParser.MeasurementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull MyLessParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#mixinGuards}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixinGuards(@NotNull MyLessParser.MixinGuardsContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#mediaQueryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaQueryExpression(@NotNull MyLessParser.MediaQueryExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(@NotNull MyLessParser.ColorContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#mathPrefixCharacter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathPrefixCharacter(@NotNull MyLessParser.MathPrefixCharacterContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#selectors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectors(@NotNull MyLessParser.SelectorsContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#mixinParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixinParam(@NotNull MyLessParser.MixinParamContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#selectorPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorPrefix(@NotNull MyLessParser.SelectorPrefixContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyLessParser#varInterpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarInterpolation(@NotNull MyLessParser.VarInterpolationContext ctx);
}