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
    public Object visitPrintt(CMCGrammarParser.PrinttContext ctx) {
        Object o = visit(ctx.expr());
        System.out.println(o);
        return o;
    }

    @Override
    public Object visitExprPlus(CMCGrammarParser.ExprPlusContext ctx) {
        Double a = (Double) visit(ctx.term());
        Double b = (Double) visit(ctx.expr());
        return a + b;
    }

    @Override
    public Object visitExprMinum(CMCGrammarParser.ExprMinumContext ctx) {
        Double a = (Double) visit(ctx.term());
        Double b = (Double) visit(ctx.expr());
        return a - b;
    }

    @Override
    public Object visitTermDiv(CMCGrammarParser.TermDivContext ctx) {
        Double a = (Double) visit(ctx.term());
        Double b = (Double) visit(ctx.factor());
        return a / b;
    }

    @Override
    public Object visitTermMult(CMCGrammarParser.TermMultContext ctx) {
        Double a = (Double) visit(ctx.term());
        Double b = (Double) visit(ctx.factor());
        return a * b;
    }

    @Override
    public Object visitFactorId(CMCGrammarParser.FactorIdContext ctx) {
        //System.out.println(TabelaSimbolos.getInstance().get(0).)
        //return SymbolsTable.getInstance().getSymbol(ctx.ID().getText())[1];
        return  visitChildren(ctx);
    }

    @Override
    public Object visitFactorNum(CMCGrammarParser.FactorNumContext ctx) {
         return Double.parseDouble(ctx.NUM().getText());
    }
}
