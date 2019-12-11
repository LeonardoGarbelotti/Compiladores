/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycustomccompiler;

import MCGrammar.CMCGrammarBaseVisitor;
import MCGrammar.CMCGrammarParser;
import mycustomccompiler.simbolos.*;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 *
 * @author 1511 IRON
 */
public class Visitor extends CMCGrammarBaseVisitor {

    @Override
    public Object visitIncludes(CMCGrammarParser.IncludesContext ctx) {
        System.out.println("visitou include");
        return visitChildren(ctx);
    }

    @Override
    public Object visitGlobals(CMCGrammarParser.GlobalsContext ctx) {
        System.out.println("visitou global");
        return visitChildren(ctx);
    }

    @Override
    public Object visitFunctions(CMCGrammarParser.FunctionsContext ctx) {
        System.out.println("visitou funcao");
        return visitChildren(ctx);
    }

    @Override
    public Object visitFunction(CMCGrammarParser.FunctionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitMain(CMCGrammarParser.MainContext ctx) {
        System.out.println("visitou main");
        return visitChildren(ctx);
    }

    @Override
    public Object visitBlock(CMCGrammarParser.BlockContext ctx) {
        return visitChildren(ctx);
    }
}
