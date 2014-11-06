// Generated from MyLessParser.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyLessParser}.
 */
public interface MyLessParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyLessParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull MyLessParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLessParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull MyLessParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyLessParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(@NotNull MyLessParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLessParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(@NotNull MyLessParser.SelectorContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyLessParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatement(@NotNull MyLessParser.VariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLessParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatement(@NotNull MyLessParser.VariableStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyLessParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(@NotNull MyLessParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLessParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(@NotNull MyLessParser.VariableNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyLessParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(@NotNull MyLessParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLessParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(@NotNull MyLessParser.ExpressionStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyLessParser#pseudo}.
	 * @param ctx the parse tree
	 */
	void enterPseudo(@NotNull MyLessParser.PseudoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLessParser#pseudo}.
	 * @param ctx the parse tree
	 */
	void exitPseudo(@NotNull MyLessParser.PseudoContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyLessParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull MyLessParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLessParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull MyLessParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyLessParser#mathCharacter}.
	 * @param ctx the parse tree
	 */
	void enterMathCharacter(@NotNull MyLessParser.MathCharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLessParser#mathCharacter}.
	 * @param ctx the parse tree
	 */
	void exitMathCharacter(@NotNull MyLessParser.MathCharacterContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyLessParser#propertyValues}.
	 * @param ctx the parse tree
	 */
	void enterPropertyValues(@NotNull MyLessParser.PropertyValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLessParser#propertyValues}.
	 * @param ctx the parse tree
	 */
	void exitPropertyValues(@NotNull MyLessParser.PropertyValuesContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyLessParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull MyLessParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLessParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull MyLessParser.FunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyLessParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(@NotNull MyLessParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLessParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(@NotNull MyLessParser.ValuesContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyLessParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(@NotNull MyLessParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLessParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(@NotNull MyLessParser.ImportStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyLessParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheet(@NotNull MyLessParser.StylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLessParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheet(@NotNull MyLessParser.StylesheetContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyLessParser#mixinParamName}.
	 * @param ctx the parse tree
	 */
	void enterMixinParamName(@NotNull MyLessParser.MixinParamNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLessParser#mixinParamName}.
	 * @param ctx the parse tree
	 */
	void exitMixinParamName(@NotNull MyLessParser.MixinParamNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyLessParser#mixin}.
	 * @param ctx the parse tree
	 */
	void enterMixin(@NotNull MyLessParser.MixinContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLessParser#mixin}.
	 * @param ctx the parse tree
	 */
	void exitMixin(@NotNull MyLessParser.MixinContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyLessParser#functionCallParam}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallParam(@NotNull MyLessParser.FunctionCallParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLessParser#functionCallParam}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallParam(@NotNull MyLessParser.FunctionCallParamContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyLessParser#commaValues}.
	 * @param ctx the parse tree
	 */
	void enterCommaValues(@NotNull MyLessParser.CommaValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLessParser#commaValues}.
	 * @param ctx the parse tree
	 */
	void exitCommaValues(@NotNull MyLessParser.CommaValuesContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyLessParser#functionCallParams}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallParams(@NotNull MyLessParser.FunctionCallParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLessParser#functionCallParams}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallParams(@NotNull MyLessParser.FunctionCallParamsContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyLessParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(@NotNull MyLessParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLessParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(@NotNull MyLessParser.ElementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyLessParser#ruleStatement}.
	 * @param ctx the parse tree
	 */
	void enterRuleStatement(@NotNull MyLessParser.RuleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLessParser#ruleStatement}.
	 * @param ctx the parse tree
	 */
	void exitRuleStatement(@NotNull MyLessParser.RuleStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyLessParser#mixinParams}.
	 * @param ctx the parse tree
	 */
	void enterMixinParams(@NotNull MyLessParser.MixinParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLessParser#mixinParams}.
	 * @param ctx the parse tree
	 */
	void exitMixinParams(@NotNull MyLessParser.MixinParamsContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyLessParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(@NotNull MyLessParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLessParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(@NotNull MyLessParser.PropertyContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyLessParser#attrib}.
	 * @param ctx the parse tree
	 */
	void enterAttrib(@NotNull MyLessParser.AttribContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLessParser#attrib}.
	 * @param ctx the parse tree
	 */
	void exitAttrib(@NotNull MyLessParser.AttribContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyLessParser#attribRelate}.
	 * @param ctx the parse tree
	 */
	void enterAttribRelate(@NotNull MyLessParser.AttribRelateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLessParser#attribRelate}.
	 * @param ctx the parse tree
	 */
	void exitAttribRelate(@NotNull MyLessParser.AttribRelateContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyLessParser#measurement}.
	 * @param ctx the parse tree
	 */
	void enterMeasurement(@NotNull MyLessParser.MeasurementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLessParser#measurement}.
	 * @param ctx the parse tree
	 */
	void exitMeasurement(@NotNull MyLessParser.MeasurementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyLessParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull MyLessParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLessParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull MyLessParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyLessParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(@NotNull MyLessParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLessParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(@NotNull MyLessParser.ColorContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyLessParser#selectors}.
	 * @param ctx the parse tree
	 */
	void enterSelectors(@NotNull MyLessParser.SelectorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLessParser#selectors}.
	 * @param ctx the parse tree
	 */
	void exitSelectors(@NotNull MyLessParser.SelectorsContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyLessParser#mathPrefixCharacter}.
	 * @param ctx the parse tree
	 */
	void enterMathPrefixCharacter(@NotNull MyLessParser.MathPrefixCharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLessParser#mathPrefixCharacter}.
	 * @param ctx the parse tree
	 */
	void exitMathPrefixCharacter(@NotNull MyLessParser.MathPrefixCharacterContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyLessParser#mixinParam}.
	 * @param ctx the parse tree
	 */
	void enterMixinParam(@NotNull MyLessParser.MixinParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLessParser#mixinParam}.
	 * @param ctx the parse tree
	 */
	void exitMixinParam(@NotNull MyLessParser.MixinParamContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyLessParser#selectorPrefix}.
	 * @param ctx the parse tree
	 */
	void enterSelectorPrefix(@NotNull MyLessParser.SelectorPrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLessParser#selectorPrefix}.
	 * @param ctx the parse tree
	 */
	void exitSelectorPrefix(@NotNull MyLessParser.SelectorPrefixContext ctx);
}