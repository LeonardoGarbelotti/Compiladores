// Generated from C:\Users\1511 IRON\Documents\NetBeansProjects\Compiladores\MyCustomCCompiler\grammar\MCGrammar\CMCGrammar.g4 by ANTLR 4.6

package MCGrammar;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CMCGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CMCGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CMCGrammarParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#includes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludes(CMCGrammarParser.IncludesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#globals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobals(CMCGrammarParser.GlobalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(CMCGrammarParser.VarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#ids}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIds(CMCGrammarParser.IdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions(CMCGrammarParser.FunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(CMCGrammarParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(CMCGrammarParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CMCGrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(CMCGrammarParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CMCGrammarParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(CMCGrammarParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(CMCGrammarParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CMCGrammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#boolexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolexpr(CMCGrammarParser.BoolexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstmt(CMCGrammarParser.IfstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#whilestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestmt(CMCGrammarParser.WhilestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#forstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForstmt(CMCGrammarParser.ForstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#callfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallfunction(CMCGrammarParser.CallfunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#retrn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetrn(CMCGrammarParser.RetrnContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CMCGrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#assignOP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignOP(CMCGrammarParser.AssignOPContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#mag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMag(CMCGrammarParser.MagContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(CMCGrammarParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(CMCGrammarParser.FactorContext ctx);
}