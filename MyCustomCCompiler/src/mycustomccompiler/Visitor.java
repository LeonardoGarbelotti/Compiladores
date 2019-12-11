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
    public Object visitVars(CMCGrammarParser.VarsContext ctx) {

        String tipo = ctx.type().getText();
        String nome = ctx.ID().getText();
        Simbolo s = new Simbolo((TabelaSimbolos.getInstance().size() + 1), nome, tipo, "null");
        System.out.println(tipo + " " + nome);
        TabelaSimbolos.getInstance().add(s);

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
    public Object visitAttrExpr(CMCGrammarParser.AttrExprContext ctx) {
        System.out.println("agr chega expr");
        for (int i = 0; i < TabelaSimbolos.getInstance().size(); i++) {
            String name = TabelaSimbolos.getInstance().get(i).getNome();
            if (ctx.ID().getText().equals(name)) {
                Simbolo s = TabelaSimbolos.getInstance().get(i);
                s.setVal(visit(ctx.expr()).toString());
                TabelaSimbolos.getInstance().set(i, s);
                break;
            }
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitAttrStr(CMCGrammarParser.AttrStrContext ctx) {
        String aux = ctx.STR().getText();
        aux = aux.replace("\"", "");
        for (int i = 0; i < TabelaSimbolos.getInstance().size(); i++) {
            String name = TabelaSimbolos.getInstance().get(i).getNome();
            if (ctx.ID().getText().equals(name)) {
                Simbolo s = TabelaSimbolos.getInstance().get(i);
                s.setVal(aux);
                TabelaSimbolos.getInstance().set(i, s);
                break;
            }
        }

        return visitChildren(ctx);
    }
}
