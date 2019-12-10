// Generated from C:\Users\1511 IRON\Documents\NetBeansProjects\Compiladores\MyCustomCCompiler\grammar\MCGrammar\CMCGrammar.g4 by ANTLR 4.6

package MCGrammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CMCGrammarParser}.
 */
public interface CMCGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CMCGrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CMCGrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#includes}.
	 * @param ctx the parse tree
	 */
	void enterIncludes(CMCGrammarParser.IncludesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#includes}.
	 * @param ctx the parse tree
	 */
	void exitIncludes(CMCGrammarParser.IncludesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#globals}.
	 * @param ctx the parse tree
	 */
	void enterGlobals(CMCGrammarParser.GlobalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#globals}.
	 * @param ctx the parse tree
	 */
	void exitGlobals(CMCGrammarParser.GlobalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(CMCGrammarParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(CMCGrammarParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#ids}.
	 * @param ctx the parse tree
	 */
	void enterIds(CMCGrammarParser.IdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#ids}.
	 * @param ctx the parse tree
	 */
	void exitIds(CMCGrammarParser.IdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFunctions(CMCGrammarParser.FunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFunctions(CMCGrammarParser.FunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(CMCGrammarParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(CMCGrammarParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(CMCGrammarParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(CMCGrammarParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CMCGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CMCGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(CMCGrammarParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(CMCGrammarParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(CMCGrammarParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(CMCGrammarParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(CMCGrammarParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(CMCGrammarParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CMCGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CMCGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpr(CMCGrammarParser.BoolexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpr(CMCGrammarParser.BoolexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(CMCGrammarParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(CMCGrammarParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void enterWhilestmt(CMCGrammarParser.WhilestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void exitWhilestmt(CMCGrammarParser.WhilestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#forstmt}.
	 * @param ctx the parse tree
	 */
	void enterForstmt(CMCGrammarParser.ForstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#forstmt}.
	 * @param ctx the parse tree
	 */
	void exitForstmt(CMCGrammarParser.ForstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#callfunction}.
	 * @param ctx the parse tree
	 */
	void enterCallfunction(CMCGrammarParser.CallfunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#callfunction}.
	 * @param ctx the parse tree
	 */
	void exitCallfunction(CMCGrammarParser.CallfunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#retrn}.
	 * @param ctx the parse tree
	 */
	void enterRetrn(CMCGrammarParser.RetrnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#retrn}.
	 * @param ctx the parse tree
	 */
	void exitRetrn(CMCGrammarParser.RetrnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CMCGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CMCGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#assignOP}.
	 * @param ctx the parse tree
	 */
	void enterAssignOP(CMCGrammarParser.AssignOPContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#assignOP}.
	 * @param ctx the parse tree
	 */
	void exitAssignOP(CMCGrammarParser.AssignOPContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#mag}.
	 * @param ctx the parse tree
	 */
	void enterMag(CMCGrammarParser.MagContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#mag}.
	 * @param ctx the parse tree
	 */
	void exitMag(CMCGrammarParser.MagContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(CMCGrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(CMCGrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(CMCGrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(CMCGrammarParser.FactorContext ctx);
}