// Generated from C:\Users\1511 IRON\Documents\NetBeansProjects\Compiladores\MyCustomCCompiler\grammar\MCGrammar\CMCGrammar.g4 by ANTLR 4.6

package MCGrammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CMCGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INCLUDE=1, GLOB=2, MAIN=3, FUNCTION=4, WS=5, NL=6, LC=7, IF=8, ELSE=9, 
		FOR=10, WHILE=11, WRITE=12, READ=13, RET=14, OP=15, CL=16, SEP=17, OPP=18, 
		CLP=19, EOL=20, AT=21, RNG=22, NEG=23, EQ=24, LESS=25, LESSEQ=26, GREATER=27, 
		GREATEREQ=28, CALL=29, TRUE=30, FALSE=31, PLUS=32, MINUM=33, MULT=34, 
		DIV=35, INT=36, FLOAT=37, BOOLEAN=38, STRING=39, ID=40, NUM=41, STR=42;
	public static final int
		RULE_prog = 0, RULE_includes = 1, RULE_globals = 2, RULE_vars = 3, RULE_functions = 4, 
		RULE_function = 5, RULE_main = 6, RULE_block = 7, RULE_line = 8, RULE_attribution = 9, 
		RULE_input = 10, RULE_output = 11, RULE_ifstmt = 12, RULE_cond = 13, RULE_whilestmt = 14, 
		RULE_forstmt = 15, RULE_callfunction = 16, RULE_retrn = 17, RULE_type = 18, 
		RULE_assignOP = 19, RULE_expr = 20, RULE_term = 21, RULE_factor = 22, 
		RULE_boolexpr = 23;
	public static final String[] ruleNames = {
		"prog", "includes", "globals", "vars", "functions", "function", "main", 
		"block", "line", "attribution", "input", "output", "ifstmt", "cond", "whilestmt", 
		"forstmt", "callfunction", "retrn", "type", "assignOP", "expr", "term", 
		"factor", "boolexpr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#Include'", "'global'", "'main'", "'function'", null, null, null, 
		"'if'", "'else'", "'for'", "'while'", "'writeln'", "'readln'", "'return'", 
		"'{'", "'}'", "','", "'('", "')'", "';'", "'='", "'...'", "'!='", "'=='", 
		"'<'", "'<='", "'>'", "'>='", "'->'", "'true'", "'false'", "'+'", "'-'", 
		"'*'", "'/'", "'int'", "'float'", "'bool'", "'string'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INCLUDE", "GLOB", "MAIN", "FUNCTION", "WS", "NL", "LC", "IF", "ELSE", 
		"FOR", "WHILE", "WRITE", "READ", "RET", "OP", "CL", "SEP", "OPP", "CLP", 
		"EOL", "AT", "RNG", "NEG", "EQ", "LESS", "LESSEQ", "GREATER", "GREATEREQ", 
		"CALL", "TRUE", "FALSE", "PLUS", "MINUM", "MULT", "DIV", "INT", "FLOAT", 
		"BOOLEAN", "STRING", "ID", "NUM", "STR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CMCGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CMCGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public IncludesContext includes() {
			return getRuleContext(IncludesContext.class,0);
		}
		public GlobalsContext globals() {
			return getRuleContext(GlobalsContext.class,0);
		}
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INCLUDE) {
				{
				setState(48);
				includes();
				}
			}

			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GLOB) {
				{
				setState(51);
				globals();
				}
			}

			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING))) != 0)) {
				{
				setState(54);
				functions();
				}
			}

			setState(57);
			main();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncludesContext extends ParserRuleContext {
		public List<TerminalNode> INCLUDE() { return getTokens(CMCGrammarParser.INCLUDE); }
		public TerminalNode INCLUDE(int i) {
			return getToken(CMCGrammarParser.INCLUDE, i);
		}
		public List<TerminalNode> STR() { return getTokens(CMCGrammarParser.STR); }
		public TerminalNode STR(int i) {
			return getToken(CMCGrammarParser.STR, i);
		}
		public IncludesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterIncludes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitIncludes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitIncludes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludesContext includes() throws RecognitionException {
		IncludesContext _localctx = new IncludesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_includes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59);
				match(INCLUDE);
				setState(60);
				match(STR);
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INCLUDE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalsContext extends ParserRuleContext {
		public TerminalNode GLOB() { return getToken(CMCGrammarParser.GLOB, 0); }
		public TerminalNode OP() { return getToken(CMCGrammarParser.OP, 0); }
		public TerminalNode CL() { return getToken(CMCGrammarParser.CL, 0); }
		public List<VarsContext> vars() {
			return getRuleContexts(VarsContext.class);
		}
		public VarsContext vars(int i) {
			return getRuleContext(VarsContext.class,i);
		}
		public GlobalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterGlobals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitGlobals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitGlobals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalsContext globals() throws RecognitionException {
		GlobalsContext _localctx = new GlobalsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_globals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(GLOB);
			setState(66);
			match(OP);
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				vars();
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING))) != 0) );
			setState(72);
			match(CL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CMCGrammarParser.ID, 0); }
		public TerminalNode EOL() { return getToken(CMCGrammarParser.EOL, 0); }
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			type();
			setState(75);
			match(ID);
			setState(76);
			match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionsContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(78);
				function();
				}
				}
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(CMCGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CMCGrammarParser.ID, i);
		}
		public TerminalNode OPP() { return getToken(CMCGrammarParser.OPP, 0); }
		public TerminalNode CLP() { return getToken(CMCGrammarParser.CLP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> SEP() { return getTokens(CMCGrammarParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(CMCGrammarParser.SEP, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			type();
			setState(84);
			match(ID);
			setState(85);
			match(OPP);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING))) != 0)) {
				{
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(86);
						type();
						setState(87);
						match(ID);
						setState(88);
						match(SEP);
						}
						} 
					}
					setState(94);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(95);
				type();
				setState(96);
				match(ID);
				}
			}

			setState(100);
			match(CLP);
			setState(101);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(CMCGrammarParser.MAIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(MAIN);
			setState(104);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(CMCGrammarParser.OP, 0); }
		public TerminalNode CL() { return getToken(CMCGrammarParser.CL, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(OP);
			setState(108); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(107);
				line();
				}
				}
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << WRITE) | (1L << READ) | (1L << RET) | (1L << OPP) | (1L << TRUE) | (1L << FALSE) | (1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING) | (1L << ID) | (1L << NUM) | (1L << STR))) != 0) );
			setState(112);
			match(CL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	 
		public LineContext() { }
		public void copyFrom(LineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprLineContext extends LineContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOL() { return getToken(CMCGrammarParser.EOL, 0); }
		public ExprLineContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterExprLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitExprLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitExprLine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileLineContext extends LineContext {
		public WhilestmtContext whilestmt() {
			return getRuleContext(WhilestmtContext.class,0);
		}
		public WhileLineContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterWhileLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitWhileLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitWhileLine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttrLineContext extends LineContext {
		public AttributionContext attribution() {
			return getRuleContext(AttributionContext.class,0);
		}
		public TerminalNode EOL() { return getToken(CMCGrammarParser.EOL, 0); }
		public AttrLineContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterAttrLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitAttrLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitAttrLine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InputLineContext extends LineContext {
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode EOL() { return getToken(CMCGrammarParser.EOL, 0); }
		public InputLineContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterInputLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitInputLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitInputLine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnLineContext extends LineContext {
		public RetrnContext retrn() {
			return getRuleContext(RetrnContext.class,0);
		}
		public TerminalNode EOL() { return getToken(CMCGrammarParser.EOL, 0); }
		public ReturnLineContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterReturnLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitReturnLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitReturnLine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncLineContext extends LineContext {
		public CallfunctionContext callfunction() {
			return getRuleContext(CallfunctionContext.class,0);
		}
		public TerminalNode EOL() { return getToken(CMCGrammarParser.EOL, 0); }
		public FuncLineContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterFuncLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitFuncLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitFuncLine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDeclartContext extends LineContext {
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public VarDeclartContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterVarDeclart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitVarDeclart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitVarDeclart(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OutputLineContext extends LineContext {
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public TerminalNode EOL() { return getToken(CMCGrammarParser.EOL, 0); }
		public OutputLineContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterOutputLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitOutputLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitOutputLine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForLineContext extends LineContext {
		public ForstmtContext forstmt() {
			return getRuleContext(ForstmtContext.class,0);
		}
		public ForLineContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterForLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitForLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitForLine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfLineContext extends LineContext {
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public IfLineContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterIfLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitIfLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitIfLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_line);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new VarDeclartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				vars();
				}
				break;
			case 2:
				_localctx = new AttrLineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				attribution();
				setState(116);
				match(EOL);
				}
				break;
			case 3:
				_localctx = new InputLineContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				input();
				setState(119);
				match(EOL);
				}
				break;
			case 4:
				_localctx = new OutputLineContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				output();
				setState(122);
				match(EOL);
				}
				break;
			case 5:
				_localctx = new ExprLineContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				expr();
				setState(125);
				match(EOL);
				}
				break;
			case 6:
				_localctx = new IfLineContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(127);
				ifstmt();
				}
				break;
			case 7:
				_localctx = new WhileLineContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(128);
				whilestmt();
				}
				break;
			case 8:
				_localctx = new ForLineContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(129);
				forstmt();
				}
				break;
			case 9:
				_localctx = new ReturnLineContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(130);
				retrn();
				setState(131);
				match(EOL);
				}
				break;
			case 10:
				_localctx = new FuncLineContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(133);
				callfunction();
				setState(134);
				match(EOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributionContext extends ParserRuleContext {
		public AttributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribution; }
	 
		public AttributionContext() { }
		public void copyFrom(AttributionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AttrStrContext extends AttributionContext {
		public TerminalNode ID() { return getToken(CMCGrammarParser.ID, 0); }
		public TerminalNode AT() { return getToken(CMCGrammarParser.AT, 0); }
		public TerminalNode STR() { return getToken(CMCGrammarParser.STR, 0); }
		public AttrStrContext(AttributionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterAttrStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitAttrStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitAttrStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttrExprContext extends AttributionContext {
		public TerminalNode ID() { return getToken(CMCGrammarParser.ID, 0); }
		public TerminalNode AT() { return getToken(CMCGrammarParser.AT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AttrExprContext(AttributionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterAttrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitAttrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitAttrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributionContext attribution() throws RecognitionException {
		AttributionContext _localctx = new AttributionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attribution);
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new AttrExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(ID);
				setState(139);
				match(AT);
				setState(140);
				expr();
				}
				break;
			case 2:
				_localctx = new AttrStrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(ID);
				setState(142);
				match(AT);
				setState(143);
				match(STR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputContext extends ParserRuleContext {
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	 
		public InputContext() { }
		public void copyFrom(InputContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InputValueContext extends InputContext {
		public TerminalNode READ() { return getToken(CMCGrammarParser.READ, 0); }
		public TerminalNode OPP() { return getToken(CMCGrammarParser.OPP, 0); }
		public TerminalNode ID() { return getToken(CMCGrammarParser.ID, 0); }
		public TerminalNode CLP() { return getToken(CMCGrammarParser.CLP, 0); }
		public InputValueContext(InputContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterInputValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitInputValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitInputValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_input);
		try {
			_localctx = new InputValueContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(READ);
			setState(147);
			match(OPP);
			setState(148);
			match(ID);
			setState(149);
			match(CLP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputContext extends ParserRuleContext {
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
	 
		public OutputContext() { }
		public void copyFrom(OutputContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintIdContext extends OutputContext {
		public TerminalNode WRITE() { return getToken(CMCGrammarParser.WRITE, 0); }
		public TerminalNode OPP() { return getToken(CMCGrammarParser.OPP, 0); }
		public TerminalNode ID() { return getToken(CMCGrammarParser.ID, 0); }
		public TerminalNode CLP() { return getToken(CMCGrammarParser.CLP, 0); }
		public PrintIdContext(OutputContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterPrintId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitPrintId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitPrintId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStrContext extends OutputContext {
		public TerminalNode WRITE() { return getToken(CMCGrammarParser.WRITE, 0); }
		public TerminalNode OPP() { return getToken(CMCGrammarParser.OPP, 0); }
		public TerminalNode STR() { return getToken(CMCGrammarParser.STR, 0); }
		public TerminalNode CLP() { return getToken(CMCGrammarParser.CLP, 0); }
		public PrintStrContext(OutputContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterPrintStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitPrintStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitPrintStr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_output);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new PrintIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(WRITE);
				setState(152);
				match(OPP);
				setState(153);
				match(ID);
				setState(154);
				match(CLP);
				}
				break;
			case 2:
				_localctx = new PrintStrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(WRITE);
				setState(156);
				match(OPP);
				setState(157);
				match(STR);
				setState(158);
				match(CLP);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfstmtContext extends ParserRuleContext {
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
	 
		public IfstmtContext() { }
		public void copyFrom(IfstmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IffStmtContext extends IfstmtContext {
		public BlockContext bloco1;
		public TerminalNode IF() { return getToken(CMCGrammarParser.IF, 0); }
		public TerminalNode OPP() { return getToken(CMCGrammarParser.OPP, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode CLP() { return getToken(CMCGrammarParser.CLP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IffStmtContext(IfstmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterIffStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitIffStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitIffStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStmtElseContext extends IfstmtContext {
		public BlockContext bloco1;
		public BlockContext bloco2;
		public TerminalNode IF() { return getToken(CMCGrammarParser.IF, 0); }
		public TerminalNode OPP() { return getToken(CMCGrammarParser.OPP, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode CLP() { return getToken(CMCGrammarParser.CLP, 0); }
		public TerminalNode ELSE() { return getToken(CMCGrammarParser.ELSE, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfStmtElseContext(IfstmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterIfStmtElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitIfStmtElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitIfStmtElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifstmt);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new IffStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(IF);
				setState(162);
				match(OPP);
				setState(163);
				cond();
				setState(164);
				match(CLP);
				setState(165);
				((IffStmtContext)_localctx).bloco1 = block();
				}
				break;
			case 2:
				_localctx = new IfStmtElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(IF);
				setState(168);
				match(OPP);
				setState(169);
				cond();
				setState(170);
				match(CLP);
				setState(171);
				((IfStmtElseContext)_localctx).bloco1 = block();
				setState(172);
				match(ELSE);
				setState(173);
				((IfStmtElseContext)_localctx).bloco2 = block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondOprtorsContext extends CondContext {
		public AssignOPContext operators;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AssignOPContext assignOP() {
			return getRuleContext(AssignOPContext.class,0);
		}
		public CondOprtorsContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterCondOprtors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitCondOprtors(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitCondOprtors(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondExprContext extends CondContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CondExprContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterCondExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitCondExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitCondExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cond);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new CondExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				expr();
				}
				break;
			case 2:
				_localctx = new CondOprtorsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				expr();
				setState(179);
				((CondOprtorsContext)_localctx).operators = assignOP();
				setState(180);
				expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhilestmtContext extends ParserRuleContext {
		public WhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestmt; }
	 
		public WhilestmtContext() { }
		public void copyFrom(WhilestmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileeStmtContext extends WhilestmtContext {
		public TerminalNode WHILE() { return getToken(CMCGrammarParser.WHILE, 0); }
		public TerminalNode OPP() { return getToken(CMCGrammarParser.OPP, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode CLP() { return getToken(CMCGrammarParser.CLP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileeStmtContext(WhilestmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterWhileeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitWhileeStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitWhileeStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whilestmt);
		try {
			_localctx = new WhileeStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(WHILE);
			setState(185);
			match(OPP);
			setState(186);
			cond();
			setState(187);
			match(CLP);
			setState(188);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForstmtContext extends ParserRuleContext {
		public ForstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstmt; }
	 
		public ForstmtContext() { }
		public void copyFrom(ForstmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForrStmtContext extends ForstmtContext {
		public TerminalNode FOR() { return getToken(CMCGrammarParser.FOR, 0); }
		public TerminalNode OPP() { return getToken(CMCGrammarParser.OPP, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode RNG() { return getToken(CMCGrammarParser.RNG, 0); }
		public TerminalNode NUM() { return getToken(CMCGrammarParser.NUM, 0); }
		public TerminalNode CLP() { return getToken(CMCGrammarParser.CLP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForrStmtContext(ForstmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterForrStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitForrStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitForrStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForstmtContext forstmt() throws RecognitionException {
		ForstmtContext _localctx = new ForstmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forstmt);
		try {
			_localctx = new ForrStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(FOR);
			setState(191);
			match(OPP);
			setState(192);
			type();
			setState(193);
			cond();
			setState(194);
			match(RNG);
			setState(195);
			match(NUM);
			setState(196);
			match(CLP);
			setState(197);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallfunctionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CMCGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CMCGrammarParser.ID, i);
		}
		public TerminalNode CALL() { return getToken(CMCGrammarParser.CALL, 0); }
		public TerminalNode OPP() { return getToken(CMCGrammarParser.OPP, 0); }
		public TerminalNode CLP() { return getToken(CMCGrammarParser.CLP, 0); }
		public List<TerminalNode> SEP() { return getTokens(CMCGrammarParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(CMCGrammarParser.SEP, i);
		}
		public List<TerminalNode> NUM() { return getTokens(CMCGrammarParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(CMCGrammarParser.NUM, i);
		}
		public CallfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callfunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterCallfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitCallfunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitCallfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallfunctionContext callfunction() throws RecognitionException {
		CallfunctionContext _localctx = new CallfunctionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_callfunction);
		try {
			int _alt;
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(ID);
				setState(200);
				match(CALL);
				setState(201);
				match(ID);
				setState(202);
				match(OPP);
				{
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(203);
						match(ID);
						setState(204);
						match(SEP);
						}
						} 
					}
					setState(209);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(210);
				match(ID);
				}
				setState(212);
				match(CLP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(ID);
				setState(214);
				match(CALL);
				setState(215);
				match(ID);
				setState(216);
				match(OPP);
				{
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(217);
						match(NUM);
						setState(218);
						match(SEP);
						}
						} 
					}
					setState(223);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(224);
				match(NUM);
				}
				setState(226);
				match(CLP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				match(ID);
				setState(228);
				match(OPP);
				setState(229);
				match(CLP);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetrnContext extends ParserRuleContext {
		public TerminalNode RET() { return getToken(CMCGrammarParser.RET, 0); }
		public TerminalNode ID() { return getToken(CMCGrammarParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RetrnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retrn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterRetrn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitRetrn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitRetrn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetrnContext retrn() throws RecognitionException {
		RetrnContext _localctx = new RetrnContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_retrn);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(RET);
				setState(233);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				match(RET);
				setState(235);
				expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CMCGrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(CMCGrammarParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(CMCGrammarParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(CMCGrammarParser.STRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignOPContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(CMCGrammarParser.AT, 0); }
		public TerminalNode EQ() { return getToken(CMCGrammarParser.EQ, 0); }
		public TerminalNode NEG() { return getToken(CMCGrammarParser.NEG, 0); }
		public TerminalNode LESS() { return getToken(CMCGrammarParser.LESS, 0); }
		public TerminalNode LESSEQ() { return getToken(CMCGrammarParser.LESSEQ, 0); }
		public TerminalNode GREATER() { return getToken(CMCGrammarParser.GREATER, 0); }
		public TerminalNode GREATEREQ() { return getToken(CMCGrammarParser.GREATEREQ, 0); }
		public AssignOPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterAssignOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitAssignOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitAssignOP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignOPContext assignOP() throws RecognitionException {
		AssignOPContext _localctx = new AssignOPContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << NEG) | (1L << EQ) | (1L << LESS) | (1L << LESSEQ) | (1L << GREATER) | (1L << GREATEREQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprPlusContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(CMCGrammarParser.PLUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprPlusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterExprPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitExprPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitExprPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMinumContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MINUM() { return getToken(CMCGrammarParser.MINUM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprMinumContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterExprMinum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitExprMinum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitExprMinum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprTermContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprTermContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterExprTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitExprTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitExprTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new ExprPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				term(0);
				setState(243);
				match(PLUS);
				setState(244);
				expr();
				}
				break;
			case 2:
				_localctx = new ExprMinumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				term(0);
				setState(247);
				match(MINUM);
				setState(248);
				expr();
				}
				break;
			case 3:
				_localctx = new ExprTermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				term(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TermDivContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode DIV() { return getToken(CMCGrammarParser.DIV, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermDivContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterTermDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitTermDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitTermDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TermFactorContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermFactorContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterTermFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitTermFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitTermFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TermMultContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MULT() { return getToken(CMCGrammarParser.MULT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermMultContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterTermMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitTermMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitTermMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TermFactorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(254);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(262);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new TermMultContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(256);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(257);
						match(MULT);
						setState(258);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new TermDivContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(259);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(260);
						match(DIV);
						setState(261);
						factor();
						}
						break;
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FactorIdContext extends FactorContext {
		public TerminalNode ID() { return getToken(CMCGrammarParser.ID, 0); }
		public FactorIdContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterFactorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitFactorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitFactorId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorStrContext extends FactorContext {
		public TerminalNode STR() { return getToken(CMCGrammarParser.STR, 0); }
		public FactorStrContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterFactorStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitFactorStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitFactorStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorBoolContext extends FactorContext {
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public FactorBoolContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterFactorBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitFactorBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitFactorBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorNumContext extends FactorContext {
		public TerminalNode NUM() { return getToken(CMCGrammarParser.NUM, 0); }
		public FactorNumContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterFactorNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitFactorNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitFactorNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprParntContext extends FactorContext {
		public TerminalNode OPP() { return getToken(CMCGrammarParser.OPP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLP() { return getToken(CMCGrammarParser.CLP, 0); }
		public ExprParntContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterExprParnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitExprParnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitExprParnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_factor);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPP:
				_localctx = new ExprParntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(OPP);
				setState(268);
				expr();
				setState(269);
				match(CLP);
				}
				break;
			case ID:
				_localctx = new FactorIdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(ID);
				}
				break;
			case NUM:
				_localctx = new FactorNumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				match(NUM);
				}
				break;
			case STR:
				_localctx = new FactorStrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(273);
				match(STR);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new FactorBoolContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(274);
				boolexpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolexprContext extends ParserRuleContext {
		public BoolexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr; }
	 
		public BoolexprContext() { }
		public void copyFrom(BoolexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FalseValueContext extends BoolexprContext {
		public TerminalNode FALSE() { return getToken(CMCGrammarParser.FALSE, 0); }
		public FalseValueContext(BoolexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterFalseValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitFalseValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitFalseValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueValueContext extends BoolexprContext {
		public TerminalNode TRUE() { return getToken(CMCGrammarParser.TRUE, 0); }
		public TrueValueContext(BoolexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterTrueValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitTrueValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitTrueValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolexprContext boolexpr() throws RecognitionException {
		BoolexprContext _localctx = new BoolexprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_boolexpr);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				_localctx = new TrueValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\u011c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\5\2\64\n\2\3\2\5\2\67\n\2\3\2\5\2:\n\2\3\2\3\2\3\3\3\3\6\3@\n\3\r"+
		"\3\16\3A\3\4\3\4\3\4\6\4G\n\4\r\4\16\4H\3\4\3\4\3\5\3\5\3\5\3\5\3\6\6"+
		"\6R\n\6\r\6\16\6S\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7]\n\7\f\7\16\7`\13\7"+
		"\3\7\3\7\3\7\5\7e\n\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\6\to\n\t\r\t\16"+
		"\tp\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008b\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u0093\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u00a2\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u00b2\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u00b9"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00d0\n\22\f\22\16\22\u00d3"+
		"\13\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00de\n\22\f"+
		"\22\16\22\u00e1\13\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e9\n\22\3"+
		"\23\3\23\3\23\3\23\5\23\u00ef\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00fe\n\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\7\27\u0109\n\27\f\27\16\27\u010c\13\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0116\n\30\3\31\3\31\5\31\u011a\n"+
		"\31\3\31\2\3,\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2"+
		"\4\3\2&)\4\2\27\27\31\36\u0127\2\63\3\2\2\2\4?\3\2\2\2\6C\3\2\2\2\bL\3"+
		"\2\2\2\nQ\3\2\2\2\fU\3\2\2\2\16i\3\2\2\2\20l\3\2\2\2\22\u008a\3\2\2\2"+
		"\24\u0092\3\2\2\2\26\u0094\3\2\2\2\30\u00a1\3\2\2\2\32\u00b1\3\2\2\2\34"+
		"\u00b8\3\2\2\2\36\u00ba\3\2\2\2 \u00c0\3\2\2\2\"\u00e8\3\2\2\2$\u00ee"+
		"\3\2\2\2&\u00f0\3\2\2\2(\u00f2\3\2\2\2*\u00fd\3\2\2\2,\u00ff\3\2\2\2."+
		"\u0115\3\2\2\2\60\u0119\3\2\2\2\62\64\5\4\3\2\63\62\3\2\2\2\63\64\3\2"+
		"\2\2\64\66\3\2\2\2\65\67\5\6\4\2\66\65\3\2\2\2\66\67\3\2\2\2\679\3\2\2"+
		"\28:\5\n\6\298\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\5\16\b\2<\3\3\2\2\2=>\7\3"+
		"\2\2>@\7,\2\2?=\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\5\3\2\2\2CD\7\4"+
		"\2\2DF\7\21\2\2EG\5\b\5\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IJ\3"+
		"\2\2\2JK\7\22\2\2K\7\3\2\2\2LM\5&\24\2MN\7*\2\2NO\7\26\2\2O\t\3\2\2\2"+
		"PR\5\f\7\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\13\3\2\2\2UV\5&\24"+
		"\2VW\7*\2\2Wd\7\24\2\2XY\5&\24\2YZ\7*\2\2Z[\7\23\2\2[]\3\2\2\2\\X\3\2"+
		"\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ab\5&\24\2bc\7"+
		"*\2\2ce\3\2\2\2d^\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\7\25\2\2gh\5\20\t\2h\r"+
		"\3\2\2\2ij\7\5\2\2jk\5\20\t\2k\17\3\2\2\2ln\7\21\2\2mo\5\22\n\2nm\3\2"+
		"\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7\22\2\2s\21\3\2\2\2t\u008b"+
		"\5\b\5\2uv\5\24\13\2vw\7\26\2\2w\u008b\3\2\2\2xy\5\26\f\2yz\7\26\2\2z"+
		"\u008b\3\2\2\2{|\5\30\r\2|}\7\26\2\2}\u008b\3\2\2\2~\177\5*\26\2\177\u0080"+
		"\7\26\2\2\u0080\u008b\3\2\2\2\u0081\u008b\5\32\16\2\u0082\u008b\5\36\20"+
		"\2\u0083\u008b\5 \21\2\u0084\u0085\5$\23\2\u0085\u0086\7\26\2\2\u0086"+
		"\u008b\3\2\2\2\u0087\u0088\5\"\22\2\u0088\u0089\7\26\2\2\u0089\u008b\3"+
		"\2\2\2\u008at\3\2\2\2\u008au\3\2\2\2\u008ax\3\2\2\2\u008a{\3\2\2\2\u008a"+
		"~\3\2\2\2\u008a\u0081\3\2\2\2\u008a\u0082\3\2\2\2\u008a\u0083\3\2\2\2"+
		"\u008a\u0084\3\2\2\2\u008a\u0087\3\2\2\2\u008b\23\3\2\2\2\u008c\u008d"+
		"\7*\2\2\u008d\u008e\7\27\2\2\u008e\u0093\5*\26\2\u008f\u0090\7*\2\2\u0090"+
		"\u0091\7\27\2\2\u0091\u0093\7,\2\2\u0092\u008c\3\2\2\2\u0092\u008f\3\2"+
		"\2\2\u0093\25\3\2\2\2\u0094\u0095\7\17\2\2\u0095\u0096\7\24\2\2\u0096"+
		"\u0097\7*\2\2\u0097\u0098\7\25\2\2\u0098\27\3\2\2\2\u0099\u009a\7\16\2"+
		"\2\u009a\u009b\7\24\2\2\u009b\u009c\7*\2\2\u009c\u00a2\7\25\2\2\u009d"+
		"\u009e\7\16\2\2\u009e\u009f\7\24\2\2\u009f\u00a0\7,\2\2\u00a0\u00a2\7"+
		"\25\2\2\u00a1\u0099\3\2\2\2\u00a1\u009d\3\2\2\2\u00a2\31\3\2\2\2\u00a3"+
		"\u00a4\7\n\2\2\u00a4\u00a5\7\24\2\2\u00a5\u00a6\5\34\17\2\u00a6\u00a7"+
		"\7\25\2\2\u00a7\u00a8\5\20\t\2\u00a8\u00b2\3\2\2\2\u00a9\u00aa\7\n\2\2"+
		"\u00aa\u00ab\7\24\2\2\u00ab\u00ac\5\34\17\2\u00ac\u00ad\7\25\2\2\u00ad"+
		"\u00ae\5\20\t\2\u00ae\u00af\7\13\2\2\u00af\u00b0\5\20\t\2\u00b0\u00b2"+
		"\3\2\2\2\u00b1\u00a3\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b2\33\3\2\2\2\u00b3"+
		"\u00b9\5*\26\2\u00b4\u00b5\5*\26\2\u00b5\u00b6\5(\25\2\u00b6\u00b7\5*"+
		"\26\2\u00b7\u00b9\3\2\2\2\u00b8\u00b3\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b9"+
		"\35\3\2\2\2\u00ba\u00bb\7\r\2\2\u00bb\u00bc\7\24\2\2\u00bc\u00bd\5\34"+
		"\17\2\u00bd\u00be\7\25\2\2\u00be\u00bf\5\20\t\2\u00bf\37\3\2\2\2\u00c0"+
		"\u00c1\7\f\2\2\u00c1\u00c2\7\24\2\2\u00c2\u00c3\5&\24\2\u00c3\u00c4\5"+
		"\34\17\2\u00c4\u00c5\7\30\2\2\u00c5\u00c6\7+\2\2\u00c6\u00c7\7\25\2\2"+
		"\u00c7\u00c8\5\20\t\2\u00c8!\3\2\2\2\u00c9\u00ca\7*\2\2\u00ca\u00cb\7"+
		"\37\2\2\u00cb\u00cc\7*\2\2\u00cc\u00d1\7\24\2\2\u00cd\u00ce\7*\2\2\u00ce"+
		"\u00d0\7\23\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3"+
		"\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d5\7*\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00e9\7\25\2\2\u00d7\u00d8\7*"+
		"\2\2\u00d8\u00d9\7\37\2\2\u00d9\u00da\7*\2\2\u00da\u00df\7\24\2\2\u00db"+
		"\u00dc\7+\2\2\u00dc\u00de\7\23\2\2\u00dd\u00db\3\2\2\2\u00de\u00e1\3\2"+
		"\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e2\u00e3\7+\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e9\7\25"+
		"\2\2\u00e5\u00e6\7*\2\2\u00e6\u00e7\7\24\2\2\u00e7\u00e9\7\25\2\2\u00e8"+
		"\u00c9\3\2\2\2\u00e8\u00d7\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e9#\3\2\2\2"+
		"\u00ea\u00eb\7\20\2\2\u00eb\u00ef\7*\2\2\u00ec\u00ed\7\20\2\2\u00ed\u00ef"+
		"\5*\26\2\u00ee\u00ea\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef%\3\2\2\2\u00f0"+
		"\u00f1\t\2\2\2\u00f1\'\3\2\2\2\u00f2\u00f3\t\3\2\2\u00f3)\3\2\2\2\u00f4"+
		"\u00f5\5,\27\2\u00f5\u00f6\7\"\2\2\u00f6\u00f7\5*\26\2\u00f7\u00fe\3\2"+
		"\2\2\u00f8\u00f9\5,\27\2\u00f9\u00fa\7#\2\2\u00fa\u00fb\5*\26\2\u00fb"+
		"\u00fe\3\2\2\2\u00fc\u00fe\5,\27\2\u00fd\u00f4\3\2\2\2\u00fd\u00f8\3\2"+
		"\2\2\u00fd\u00fc\3\2\2\2\u00fe+\3\2\2\2\u00ff\u0100\b\27\1\2\u0100\u0101"+
		"\5.\30\2\u0101\u010a\3\2\2\2\u0102\u0103\f\5\2\2\u0103\u0104\7$\2\2\u0104"+
		"\u0109\5.\30\2\u0105\u0106\f\4\2\2\u0106\u0107\7%\2\2\u0107\u0109\5.\30"+
		"\2\u0108\u0102\3\2\2\2\u0108\u0105\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b-\3\2\2\2\u010c\u010a\3\2\2\2\u010d"+
		"\u010e\7\24\2\2\u010e\u010f\5*\26\2\u010f\u0110\7\25\2\2\u0110\u0116\3"+
		"\2\2\2\u0111\u0116\7*\2\2\u0112\u0116\7+\2\2\u0113\u0116\7,\2\2\u0114"+
		"\u0116\5\60\31\2\u0115\u010d\3\2\2\2\u0115\u0111\3\2\2\2\u0115\u0112\3"+
		"\2\2\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116/\3\2\2\2\u0117\u011a"+
		"\7 \2\2\u0118\u011a\7!\2\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a"+
		"\61\3\2\2\2\31\63\669AHS^dp\u008a\u0092\u00a1\u00b1\u00b8\u00d1\u00df"+
		"\u00e8\u00ee\u00fd\u0108\u010a\u0115\u0119";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}