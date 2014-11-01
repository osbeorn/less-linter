package si.fri.celtra.lesslinter.antlr;

// Generated from LessParser.g4 by ANTLR 4.4
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
	 * Visit a parse tree produced by {@link LessParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull LessParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LessParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(@NotNull LessParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LessParser#identifierPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierPart(@NotNull LessParser.IdentifierPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link LessParser#nested}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested(@NotNull LessParser.NestedContext ctx);
	/**
	 * Visit a parse tree produced by {@link LessParser#ruleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleset(@NotNull LessParser.RulesetContext ctx);
	/**
	 * Visit a parse tree produced by {@link LessParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(@NotNull LessParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LessParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(@NotNull LessParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link LessParser#pseudo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudo(@NotNull LessParser.PseudoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LessParser#mediaTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaTypes(@NotNull LessParser.MediaTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LessParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull LessParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LessParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(@NotNull LessParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LessParser#mathCharacter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathCharacter(@NotNull LessParser.MathCharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link LessParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(@NotNull LessParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link LessParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(@NotNull LessParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LessParser#stylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesheet(@NotNull LessParser.StylesheetContext ctx);
	/**
	 * Visit a parse tree produced by {@link LessParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(@NotNull LessParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LessParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(@NotNull LessParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LessParser#referenceUrl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceUrl(@NotNull LessParser.ReferenceUrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link LessParser#nest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNest(@NotNull LessParser.NestContext ctx);
	/**
	 * Visit a parse tree produced by {@link LessParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(@NotNull LessParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LessParser#identifierVariableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierVariableName(@NotNull LessParser.IdentifierVariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LessParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(@NotNull LessParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LessParser#attrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrib(@NotNull LessParser.AttribContext ctx);
	/**
	 * Visit a parse tree produced by {@link LessParser#url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl(@NotNull LessParser.UrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link LessParser#attribRelate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribRelate(@NotNull LessParser.AttribRelateContext ctx);
	/**
	 * Visit a parse tree produced by {@link LessParser#commandStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandStatement(@NotNull LessParser.CommandStatementContext ctx);
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
	 * Visit a parse tree produced by {@link LessParser#paramOptionalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamOptionalValue(@NotNull LessParser.ParamOptionalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LessParser#selectors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectors(@NotNull LessParser.SelectorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LessParser#mathStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathStatement(@NotNull LessParser.MathStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LessParser#selectorPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorPrefix(@NotNull LessParser.SelectorPrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link LessParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull LessParser.IdentifierContext ctx);
}