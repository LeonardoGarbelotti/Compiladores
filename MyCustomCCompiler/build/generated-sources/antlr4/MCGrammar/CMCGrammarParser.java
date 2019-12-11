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
		RULE_prog = 0, RULE_includes = 1, RULE_globals = 2, RULE_vars = 3, RULE_ids = 4, 
		RULE_functions = 5, RULE_function = 6, RULE_main = 7, RULE_block = 8, 
		RULE_line = 9, RULE_attribution = 10, RULE_input = 11, RULE_output = 12, 
		RULE_ifstmt = 13, RULE_cond = 14, RULE_whilestmt = 15, RULE_forstmt = 16, 
		RULE_callfunction = 17, RULE_retrn = 18, RULE_type = 19, RULE_assignOP = 20, 
		RULE_expr = 21, RULE_term = 22, RULE_factor = 23, RULE_boolexpr = 24;
	public static final String[] ruleNames = {
		"prog", "includes", "globals", "vars", "ids", "functions", "function", 
		"main", "block", "line", "attribution", "input", "output", "ifstmt", "cond", 
		"whilestmt", "forstmt", "callfunction", "retrn", "type", "assignOP", "expr", 
		"term", "factor", "boolexpr"
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
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INCLUDE) {
				{
				setState(50);
				includes();
				}
			}

			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GLOB) {
				{
				setState(53);
				globals();
				}
			}

			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING))) != 0)) {
				{
				setState(56);
				functions();
				}
			}

			setState(59);
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
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(61);
				match(INCLUDE);
				setState(62);
				match(STR);
				}
				}
				setState(65); 
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
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public TerminalNode CL() { return getToken(CMCGrammarParser.CL, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(GLOB);
			setState(68);
			match(OP);
			setState(69);
			vars();
			setState(70);
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
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<IdsContext> ids() {
			return getRuleContexts(IdsContext.class);
		}
		public IdsContext ids(int i) {
			return getRuleContext(IdsContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(CMCGrammarParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(CMCGrammarParser.EOL, i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(72);
					type();
					setState(73);
					ids();
					setState(74);
					match(EOL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(78); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class IdsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CMCGrammarParser.ID, 0); }
		public TerminalNode SEP() { return getToken(CMCGrammarParser.SEP, 0); }
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public IdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ids; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterIds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitIds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitIds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdsContext ids() throws RecognitionException {
		IdsContext _localctx = new IdsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ids);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(ID);
				setState(82);
				match(SEP);
				setState(83);
				ids();
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
		enterRule(_localctx, 10, RULE_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(86);
				function();
				}
				}
				setState(89); 
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
		enterRule(_localctx, 12, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			type();
			setState(92);
			match(ID);
			setState(93);
			match(OPP);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING))) != 0)) {
				{
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(94);
						type();
						setState(95);
						match(ID);
						setState(96);
						match(SEP);
						}
						} 
					}
					setState(102);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(103);
				type();
				setState(104);
				match(ID);
				}
			}

			setState(108);
			match(CLP);
			setState(109);
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
		enterRule(_localctx, 14, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(MAIN);
			setState(112);
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
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(OP);
			setState(116); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(115);
				line();
				}
				}
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << WRITE) | (1L << READ) | (1L << RET) | (1L << OPP) | (1L << TRUE) | (1L << FALSE) | (1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING) | (1L << ID) | (1L << NUM) | (1L << STR))) != 0) );
			setState(120);
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
		enterRule(_localctx, 18, RULE_line);
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new VarDeclartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				vars();
				}
				break;
			case 2:
				_localctx = new AttrLineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				attribution();
				setState(124);
				match(EOL);
				}
				break;
			case 3:
				_localctx = new InputLineContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				input();
				setState(127);
				match(EOL);
				}
				break;
			case 4:
				_localctx = new OutputLineContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				output();
				setState(130);
				match(EOL);
				}
				break;
			case 5:
				_localctx = new ExprLineContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				expr();
				setState(133);
				match(EOL);
				}
				break;
			case 6:
				_localctx = new IfLineContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				ifstmt();
				}
				break;
			case 7:
				_localctx = new WhileLineContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(136);
				whilestmt();
				}
				break;
			case 8:
				_localctx = new ForLineContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(137);
				forstmt();
				}
				break;
			case 9:
				_localctx = new ReturnLineContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(138);
				retrn();
				setState(139);
				match(EOL);
				}
				break;
			case 10:
				_localctx = new FuncLineContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(141);
				callfunction();
				setState(142);
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
		public TerminalNode ID() { return getToken(CMCGrammarParser.ID, 0); }
		public TerminalNode AT() { return getToken(CMCGrammarParser.AT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AttributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterAttribution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitAttribution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitAttribution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributionContext attribution() throws RecognitionException {
		AttributionContext _localctx = new AttributionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(ID);
			setState(147);
			match(AT);
			setState(148);
			expr();
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
		enterRule(_localctx, 22, RULE_input);
		try {
			_localctx = new InputValueContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(READ);
			setState(151);
			match(OPP);
			setState(152);
			match(ID);
			setState(153);
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
		enterRule(_localctx, 24, RULE_output);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new PrintIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(WRITE);
				setState(156);
				match(OPP);
				setState(157);
				match(ID);
				setState(158);
				match(CLP);
				}
				break;
			case 2:
				_localctx = new PrintStrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(WRITE);
				setState(160);
				match(OPP);
				setState(161);
				match(STR);
				setState(162);
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
		enterRule(_localctx, 26, RULE_ifstmt);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new IffStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(IF);
				setState(166);
				match(OPP);
				setState(167);
				cond();
				setState(168);
				match(CLP);
				setState(169);
				((IffStmtContext)_localctx).bloco1 = block();
				}
				break;
			case 2:
				_localctx = new IfStmtElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(IF);
				setState(172);
				match(OPP);
				setState(173);
				cond();
				setState(174);
				match(CLP);
				setState(175);
				((IfStmtElseContext)_localctx).bloco1 = block();
				setState(176);
				match(ELSE);
				setState(177);
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
		enterRule(_localctx, 28, RULE_cond);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new CondExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				expr();
				}
				break;
			case 2:
				_localctx = new CondOprtorsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				expr();
				setState(183);
				((CondOprtorsContext)_localctx).operators = assignOP();
				setState(184);
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
		enterRule(_localctx, 30, RULE_whilestmt);
		try {
			_localctx = new WhileeStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(WHILE);
			setState(189);
			match(OPP);
			setState(190);
			cond();
			setState(191);
			match(CLP);
			setState(192);
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
		enterRule(_localctx, 32, RULE_forstmt);
		try {
			_localctx = new ForrStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(FOR);
			setState(195);
			match(OPP);
			setState(196);
			type();
			setState(197);
			cond();
			setState(198);
			match(RNG);
			setState(199);
			match(NUM);
			setState(200);
			match(CLP);
			setState(201);
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
		enterRule(_localctx, 34, RULE_callfunction);
		try {
			int _alt;
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(ID);
				setState(204);
				match(CALL);
				setState(205);
				match(ID);
				setState(206);
				match(OPP);
				{
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(207);
						match(ID);
						setState(208);
						match(SEP);
						}
						} 
					}
					setState(213);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(214);
				match(ID);
				}
				setState(216);
				match(CLP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(ID);
				setState(218);
				match(CALL);
				setState(219);
				match(ID);
				setState(220);
				match(OPP);
				{
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(221);
						match(NUM);
						setState(222);
						match(SEP);
						}
						} 
					}
					setState(227);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(228);
				match(NUM);
				}
				setState(230);
				match(CLP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				match(ID);
				setState(232);
				match(OPP);
				setState(233);
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
		enterRule(_localctx, 36, RULE_retrn);
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(RET);
				setState(237);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(RET);
				setState(239);
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
		enterRule(_localctx, 38, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
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
		enterRule(_localctx, 40, RULE_assignOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
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
		enterRule(_localctx, 42, RULE_expr);
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new ExprPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				term(0);
				setState(247);
				match(PLUS);
				setState(248);
				expr();
				}
				break;
			case 2:
				_localctx = new ExprMinumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				term(0);
				setState(251);
				match(MINUM);
				setState(252);
				expr();
				}
				break;
			case 3:
				_localctx = new ExprTermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TermFactorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(258);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(266);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new TermMultContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(260);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(261);
						match(MULT);
						setState(262);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new TermDivContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(263);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(264);
						match(DIV);
						setState(265);
						factor();
						}
						break;
					}
					} 
				}
				setState(270);
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
		enterRule(_localctx, 46, RULE_factor);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPP:
				_localctx = new ExprParntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				match(OPP);
				setState(272);
				expr();
				setState(273);
				match(CLP);
				}
				break;
			case ID:
				_localctx = new FactorIdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(ID);
				}
				break;
			case NUM:
				_localctx = new FactorNumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				match(NUM);
				}
				break;
			case STR:
				_localctx = new FactorStrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(277);
				match(STR);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new FactorBoolContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(278);
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
		enterRule(_localctx, 48, RULE_boolexpr);
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				_localctx = new TrueValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
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
		case 22:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\u0120\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\5\2\66\n\2\3\2\5\29\n\2\3\2\5\2<\n\2\3\2\3\2\3\3\3\3\6"+
		"\3B\n\3\r\3\16\3C\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\6\5O\n\5\r\5\16"+
		"\5P\3\6\3\6\3\6\3\6\5\6W\n\6\3\7\6\7Z\n\7\r\7\16\7[\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\7\be\n\b\f\b\16\bh\13\b\3\b\3\b\3\b\5\bm\n\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\n\3\n\6\nw\n\n\r\n\16\nx\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u0093\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a6\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b6\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u00bd\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\7\23\u00d4\n\23\f\23\16\23\u00d7\13\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\7\23\u00e2\n\23\f\23\16\23\u00e5\13\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u00ed\n\23\3\24\3\24\3\24\3\24\5\24\u00f3\n"+
		"\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5"+
		"\27\u0102\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u010d"+
		"\n\30\f\30\16\30\u0110\13\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5"+
		"\31\u011a\n\31\3\32\3\32\5\32\u011e\n\32\3\32\2\3.\33\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\4\3\2&)\4\2\27\27\31\36\u012a\2"+
		"\65\3\2\2\2\4A\3\2\2\2\6E\3\2\2\2\bN\3\2\2\2\nV\3\2\2\2\fY\3\2\2\2\16"+
		"]\3\2\2\2\20q\3\2\2\2\22t\3\2\2\2\24\u0092\3\2\2\2\26\u0094\3\2\2\2\30"+
		"\u0098\3\2\2\2\32\u00a5\3\2\2\2\34\u00b5\3\2\2\2\36\u00bc\3\2\2\2 \u00be"+
		"\3\2\2\2\"\u00c4\3\2\2\2$\u00ec\3\2\2\2&\u00f2\3\2\2\2(\u00f4\3\2\2\2"+
		"*\u00f6\3\2\2\2,\u0101\3\2\2\2.\u0103\3\2\2\2\60\u0119\3\2\2\2\62\u011d"+
		"\3\2\2\2\64\66\5\4\3\2\65\64\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\679\5\6"+
		"\4\28\67\3\2\2\289\3\2\2\29;\3\2\2\2:<\5\f\7\2;:\3\2\2\2;<\3\2\2\2<=\3"+
		"\2\2\2=>\5\20\t\2>\3\3\2\2\2?@\7\3\2\2@B\7,\2\2A?\3\2\2\2BC\3\2\2\2CA"+
		"\3\2\2\2CD\3\2\2\2D\5\3\2\2\2EF\7\4\2\2FG\7\21\2\2GH\5\b\5\2HI\7\22\2"+
		"\2I\7\3\2\2\2JK\5(\25\2KL\5\n\6\2LM\7\26\2\2MO\3\2\2\2NJ\3\2\2\2OP\3\2"+
		"\2\2PN\3\2\2\2PQ\3\2\2\2Q\t\3\2\2\2RW\7*\2\2ST\7*\2\2TU\7\23\2\2UW\5\n"+
		"\6\2VR\3\2\2\2VS\3\2\2\2W\13\3\2\2\2XZ\5\16\b\2YX\3\2\2\2Z[\3\2\2\2[Y"+
		"\3\2\2\2[\\\3\2\2\2\\\r\3\2\2\2]^\5(\25\2^_\7*\2\2_l\7\24\2\2`a\5(\25"+
		"\2ab\7*\2\2bc\7\23\2\2ce\3\2\2\2d`\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2"+
		"\2gi\3\2\2\2hf\3\2\2\2ij\5(\25\2jk\7*\2\2km\3\2\2\2lf\3\2\2\2lm\3\2\2"+
		"\2mn\3\2\2\2no\7\25\2\2op\5\22\n\2p\17\3\2\2\2qr\7\5\2\2rs\5\22\n\2s\21"+
		"\3\2\2\2tv\7\21\2\2uw\5\24\13\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2"+
		"\2yz\3\2\2\2z{\7\22\2\2{\23\3\2\2\2|\u0093\5\b\5\2}~\5\26\f\2~\177\7\26"+
		"\2\2\177\u0093\3\2\2\2\u0080\u0081\5\30\r\2\u0081\u0082\7\26\2\2\u0082"+
		"\u0093\3\2\2\2\u0083\u0084\5\32\16\2\u0084\u0085\7\26\2\2\u0085\u0093"+
		"\3\2\2\2\u0086\u0087\5,\27\2\u0087\u0088\7\26\2\2\u0088\u0093\3\2\2\2"+
		"\u0089\u0093\5\34\17\2\u008a\u0093\5 \21\2\u008b\u0093\5\"\22\2\u008c"+
		"\u008d\5&\24\2\u008d\u008e\7\26\2\2\u008e\u0093\3\2\2\2\u008f\u0090\5"+
		"$\23\2\u0090\u0091\7\26\2\2\u0091\u0093\3\2\2\2\u0092|\3\2\2\2\u0092}"+
		"\3\2\2\2\u0092\u0080\3\2\2\2\u0092\u0083\3\2\2\2\u0092\u0086\3\2\2\2\u0092"+
		"\u0089\3\2\2\2\u0092\u008a\3\2\2\2\u0092\u008b\3\2\2\2\u0092\u008c\3\2"+
		"\2\2\u0092\u008f\3\2\2\2\u0093\25\3\2\2\2\u0094\u0095\7*\2\2\u0095\u0096"+
		"\7\27\2\2\u0096\u0097\5,\27\2\u0097\27\3\2\2\2\u0098\u0099\7\17\2\2\u0099"+
		"\u009a\7\24\2\2\u009a\u009b\7*\2\2\u009b\u009c\7\25\2\2\u009c\31\3\2\2"+
		"\2\u009d\u009e\7\16\2\2\u009e\u009f\7\24\2\2\u009f\u00a0\7*\2\2\u00a0"+
		"\u00a6\7\25\2\2\u00a1\u00a2\7\16\2\2\u00a2\u00a3\7\24\2\2\u00a3\u00a4"+
		"\7,\2\2\u00a4\u00a6\7\25\2\2\u00a5\u009d\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a6"+
		"\33\3\2\2\2\u00a7\u00a8\7\n\2\2\u00a8\u00a9\7\24\2\2\u00a9\u00aa\5\36"+
		"\20\2\u00aa\u00ab\7\25\2\2\u00ab\u00ac\5\22\n\2\u00ac\u00b6\3\2\2\2\u00ad"+
		"\u00ae\7\n\2\2\u00ae\u00af\7\24\2\2\u00af\u00b0\5\36\20\2\u00b0\u00b1"+
		"\7\25\2\2\u00b1\u00b2\5\22\n\2\u00b2\u00b3\7\13\2\2\u00b3\u00b4\5\22\n"+
		"\2\u00b4\u00b6\3\2\2\2\u00b5\u00a7\3\2\2\2\u00b5\u00ad\3\2\2\2\u00b6\35"+
		"\3\2\2\2\u00b7\u00bd\5,\27\2\u00b8\u00b9\5,\27\2\u00b9\u00ba\5*\26\2\u00ba"+
		"\u00bb\5,\27\2\u00bb\u00bd\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bc\u00b8\3\2"+
		"\2\2\u00bd\37\3\2\2\2\u00be\u00bf\7\r\2\2\u00bf\u00c0\7\24\2\2\u00c0\u00c1"+
		"\5\36\20\2\u00c1\u00c2\7\25\2\2\u00c2\u00c3\5\22\n\2\u00c3!\3\2\2\2\u00c4"+
		"\u00c5\7\f\2\2\u00c5\u00c6\7\24\2\2\u00c6\u00c7\5(\25\2\u00c7\u00c8\5"+
		"\36\20\2\u00c8\u00c9\7\30\2\2\u00c9\u00ca\7+\2\2\u00ca\u00cb\7\25\2\2"+
		"\u00cb\u00cc\5\22\n\2\u00cc#\3\2\2\2\u00cd\u00ce\7*\2\2\u00ce\u00cf\7"+
		"\37\2\2\u00cf\u00d0\7*\2\2\u00d0\u00d5\7\24\2\2\u00d1\u00d2\7*\2\2\u00d2"+
		"\u00d4\7\23\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3"+
		"\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00d9\7*\2\2\u00d9\u00da\3\2\2\2\u00da\u00ed\7\25\2\2\u00db\u00dc\7*"+
		"\2\2\u00dc\u00dd\7\37\2\2\u00dd\u00de\7*\2\2\u00de\u00e3\7\24\2\2\u00df"+
		"\u00e0\7+\2\2\u00e0\u00e2\7\23\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e5\3\2"+
		"\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e6\u00e7\7+\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ed\7\25"+
		"\2\2\u00e9\u00ea\7*\2\2\u00ea\u00eb\7\24\2\2\u00eb\u00ed\7\25\2\2\u00ec"+
		"\u00cd\3\2\2\2\u00ec\u00db\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ed%\3\2\2\2"+
		"\u00ee\u00ef\7\20\2\2\u00ef\u00f3\7*\2\2\u00f0\u00f1\7\20\2\2\u00f1\u00f3"+
		"\5,\27\2\u00f2\u00ee\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\'\3\2\2\2\u00f4"+
		"\u00f5\t\2\2\2\u00f5)\3\2\2\2\u00f6\u00f7\t\3\2\2\u00f7+\3\2\2\2\u00f8"+
		"\u00f9\5.\30\2\u00f9\u00fa\7\"\2\2\u00fa\u00fb\5,\27\2\u00fb\u0102\3\2"+
		"\2\2\u00fc\u00fd\5.\30\2\u00fd\u00fe\7#\2\2\u00fe\u00ff\5,\27\2\u00ff"+
		"\u0102\3\2\2\2\u0100\u0102\5.\30\2\u0101\u00f8\3\2\2\2\u0101\u00fc\3\2"+
		"\2\2\u0101\u0100\3\2\2\2\u0102-\3\2\2\2\u0103\u0104\b\30\1\2\u0104\u0105"+
		"\5\60\31\2\u0105\u010e\3\2\2\2\u0106\u0107\f\5\2\2\u0107\u0108\7$\2\2"+
		"\u0108\u010d\5\60\31\2\u0109\u010a\f\4\2\2\u010a\u010b\7%\2\2\u010b\u010d"+
		"\5\60\31\2\u010c\u0106\3\2\2\2\u010c\u0109\3\2\2\2\u010d\u0110\3\2\2\2"+
		"\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f/\3\2\2\2\u0110\u010e\3"+
		"\2\2\2\u0111\u0112\7\24\2\2\u0112\u0113\5,\27\2\u0113\u0114\7\25\2\2\u0114"+
		"\u011a\3\2\2\2\u0115\u011a\7*\2\2\u0116\u011a\7+\2\2\u0117\u011a\7,\2"+
		"\2\u0118\u011a\5\62\32\2\u0119\u0111\3\2\2\2\u0119\u0115\3\2\2\2\u0119"+
		"\u0116\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a\61\3\2\2"+
		"\2\u011b\u011e\7 \2\2\u011c\u011e\7!\2\2\u011d\u011b\3\2\2\2\u011d\u011c"+
		"\3\2\2\2\u011e\63\3\2\2\2\31\658;CPV[flx\u0092\u00a5\u00b5\u00bc\u00d5"+
		"\u00e3\u00ec\u00f2\u0101\u010c\u010e\u0119\u011d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}