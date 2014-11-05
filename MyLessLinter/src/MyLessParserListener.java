// Generated from MyLessParser.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyLessParser}.
 */
public interface MyLessParserListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link MyLessParser#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(@NotNull MyLessParser.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLessParser#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(@NotNull MyLessParser.UrlContext ctx);

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
	 * Enter a parse tree produced by {@link MyLessParser#commaSeparatedValues}.
	 * @param ctx the parse tree
	 */
	void enterCommaSeparatedValues(@NotNull MyLessParser.CommaSeparatedValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLessParser#commaSeparatedValues}.
	 * @param ctx the parse tree
	 */
	void exitCommaSeparatedValues(@NotNull MyLessParser.CommaSeparatedValuesContext ctx);

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
	 * Enter a parse tree produced by {@link MyLessParser#whiteSpaceSeparatedValues}.
	 * @param ctx the parse tree
	 */
	void enterWhiteSpaceSeparatedValues(@NotNull MyLessParser.WhiteSpaceSeparatedValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLessParser#whiteSpaceSeparatedValues}.
	 * @param ctx the parse tree
	 */
	void exitWhiteSpaceSeparatedValues(@NotNull MyLessParser.WhiteSpaceSeparatedValuesContext ctx);

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