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

    String escopo = "local";
    String nomeFuncao;

    @Override
    public Object visitIncludes(CMCGrammarParser.IncludesContext ctx) {
        System.out.println("visitou include");
        return visitChildren(ctx);
    }

    @Override
    public Object visitGlobals(CMCGrammarParser.GlobalsContext ctx) {
        escopo = "global";
        System.out.println("visitou global");
        return visitChildren(ctx);
    }

    @Override
    public Object visitFunctions(CMCGrammarParser.FunctionsContext ctx) {
        escopo = "funcao";
        System.out.println("visitou functions");
        return visitChildren(ctx);
    }

    @Override
    public Object visitFunction(CMCGrammarParser.FunctionContext ctx) {
        nomeFuncao = ctx.ID().get(0).getText();
        String tipo = ctx.type().get(0).getText();
        return visitChildren(ctx);
    }

    @Override
    public Object visitMain(CMCGrammarParser.MainContext ctx) {
        escopo = "local";
        System.out.println("Visitou main");
        return visitChildren(ctx);
    }
}
