// Generated from LessParser.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LessParser}.
 */
public interface LessParserListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link LessParser#identifierPart}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierPart(@NotNull LessParser.IdentifierPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#identifierPart}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierPart(@NotNull LessParser.IdentifierPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link LessParser#nested}.
	 * @param ctx the parse tree
	 */
	void enterNested(@NotNull LessParser.NestedContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#nested}.
	 * @param ctx the parse tree
	 */
	void exitNested(@NotNull LessParser.NestedContext ctx);
	/**
	 * Enter a parse tree produced by {@link LessParser#ruleset}.
	 * @param ctx the parse tree
	 */
	void enterRuleset(@NotNull LessParser.RulesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#ruleset}.
	 * @param ctx the parse tree
	 */
	void exitRuleset(@NotNull LessParser.RulesetContext ctx);
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
	 * Enter a parse tree produced by {@link LessParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(@NotNull LessParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(@NotNull LessParser.ParamContext ctx);
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
	 * Enter a parse tree produced by {@link LessParser#mediaTypes}.
	 * @param ctx the parse tree
	 */
	void enterMediaTypes(@NotNull LessParser.MediaTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#mediaTypes}.
	 * @param ctx the parse tree
	 */
	void exitMediaTypes(@NotNull LessParser.MediaTypesContext ctx);
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
	 * Enter a parse tree produced by {@link LessParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(@NotNull LessParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(@NotNull LessParser.VariableDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link LessParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(@NotNull LessParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(@NotNull LessParser.ImportDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link LessParser#referenceUrl}.
	 * @param ctx the parse tree
	 */
	void enterReferenceUrl(@NotNull LessParser.ReferenceUrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#referenceUrl}.
	 * @param ctx the parse tree
	 */
	void exitReferenceUrl(@NotNull LessParser.ReferenceUrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link LessParser#nest}.
	 * @param ctx the parse tree
	 */
	void enterNest(@NotNull LessParser.NestContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#nest}.
	 * @param ctx the parse tree
	 */
	void exitNest(@NotNull LessParser.NestContext ctx);
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
	 * Enter a parse tree produced by {@link LessParser#identifierVariableName}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierVariableName(@NotNull LessParser.IdentifierVariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#identifierVariableName}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierVariableName(@NotNull LessParser.IdentifierVariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LessParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(@NotNull LessParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(@NotNull LessParser.ParamsContext ctx);
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
	 * Enter a parse tree produced by {@link LessParser#commandStatement}.
	 * @param ctx the parse tree
	 */
	void enterCommandStatement(@NotNull LessParser.CommandStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#commandStatement}.
	 * @param ctx the parse tree
	 */
	void exitCommandStatement(@NotNull LessParser.CommandStatementContext ctx);
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
	 * Enter a parse tree produced by {@link LessParser#paramOptionalValue}.
	 * @param ctx the parse tree
	 */
	void enterParamOptionalValue(@NotNull LessParser.ParamOptionalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#paramOptionalValue}.
	 * @param ctx the parse tree
	 */
	void exitParamOptionalValue(@NotNull LessParser.ParamOptionalValueContext ctx);
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
	 * Enter a parse tree produced by {@link LessParser#mathStatement}.
	 * @param ctx the parse tree
	 */
	void enterMathStatement(@NotNull LessParser.MathStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#mathStatement}.
	 * @param ctx the parse tree
	 */
	void exitMathStatement(@NotNull LessParser.MathStatementContext ctx);
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
	 * Enter a parse tree produced by {@link LessParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull LessParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link LessParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull LessParser.IdentifierContext ctx);
}