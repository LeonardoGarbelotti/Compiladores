/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycustomccompiler;

import java.util.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.TokenStream;
import MCGrammar.CMCGrammarLexer;
import MCGrammar.CMCGrammarParser;

/**
 *
 * @author cc49755682848
 */
public class MyCustomCCompiler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextLine()){
            String input = s.nextLine();
            Integer r = parse(input);
            System.out.println(">>> " + r);
        }
    }
    
     private static Integer parse(String text) throws RecognitionException {
        CharStream input = new ANTLRInputStream(text+"\n");
        CMCGrammarLexer lexer = new CMCGrammarLexer(input);
        TokenStream tokens = new BufferedTokenStream(lexer);
        CMCGrammarParser parser = new CMCGrammarParser(tokens);
        CMCGrammarParser.LangContext lang = parser.lang();
        return lang.value;
    }
    
}
