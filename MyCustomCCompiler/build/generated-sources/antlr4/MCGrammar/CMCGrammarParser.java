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
		T__0=1, T__1=2, T__2=3, T__3=4, INCLUDE=5, GLOB=6, MAIN=7, FUNCTION=8, 
		WS=9, NL=10, LC=11, IF=12, ELSE=13, FOR=14, WHILE=15, WRITE=16, READ=17, 
		RET=18, OP=19, CL=20, SEP=21, OPP=22, CLP=23, EOL=24, AT=25, RNG=26, NEG=27, 
		EQ=28, LESS=29, LESSEQ=30, GREATER=31, GREATEREQ=32, CALL=33, TRUE=34, 
		FALSE=35, INT=36, FLOAT=37, BOOLEAN=38, STRING=39, ID=40, NUM=41, STR=42;
	public static final int
		RULE_prog = 0, RULE_includes = 1, RULE_globals = 2, RULE_vars = 3, RULE_ids = 4, 
		RULE_functions = 5, RULE_function = 6, RULE_main = 7, RULE_block = 8, 
		RULE_line = 9, RULE_declaration = 10, RULE_input = 11, RULE_output = 12, 
		RULE_expr = 13, RULE_boolexpr = 14, RULE_ifstmt = 15, RULE_whilestmt = 16, 
		RULE_forstmt = 17, RULE_callfunction = 18, RULE_retrn = 19, RULE_type = 20, 
		RULE_assignOP = 21, RULE_mag = 22, RULE_term = 23, RULE_factor = 24;
	public static final String[] ruleNames = {
		"prog", "includes", "globals", "vars", "ids", "functions", "function", 
		"main", "block", "line", "declaration", "input", "output", "expr", "boolexpr", 
		"ifstmt", "whilestmt", "forstmt", "callfunction", "retrn", "type", "assignOP", 
		"mag", "term", "factor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "'#Include'", "'global'", "'main'", 
		"'function'", null, null, null, "'if'", "'else'", "'for'", "'while'", 
		"'writeln'", "'readln'", "'return'", "'{'", "'}'", "','", "'('", "')'", 
		"';'", "'='", "'...'", "'!='", "'=='", "'<'", "'<='", "'>'", "'>='", "'->'", 
		"'true'", "'false'", "'int'", "'float'", "'bool'", "'string'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "INCLUDE", "GLOB", "MAIN", "FUNCTION", "WS", 
		"NL", "LC", "IF", "ELSE", "FOR", "WHILE", "WRITE", "READ", "RET", "OP", 
		"CL", "SEP", "OPP", "CLP", "EOL", "AT", "RNG", "NEG", "EQ", "LESS", "LESSEQ", 
		"GREATER", "GREATEREQ", "CALL", "TRUE", "FALSE", "INT", "FLOAT", "BOOLEAN", 
		"STRING", "ID", "NUM", "STR"
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << WRITE) | (1L << READ) | (1L << RET) | (1L << OPP) | (1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING) | (1L << ID) | (1L << NUM) | (1L << STR))) != 0) );
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
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode EOL() { return getToken(CMCGrammarParser.EOL, 0); }
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public WhilestmtContext whilestmt() {
			return getRuleContext(WhilestmtContext.class,0);
		}
		public ForstmtContext forstmt() {
			return getRuleContext(ForstmtContext.class,0);
		}
		public CallfunctionContext callfunction() {
			return getRuleContext(CallfunctionContext.class,0);
		}
		public RetrnContext retrn() {
			return getRuleContext(RetrnContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_line);
		int _la;
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				input();
				setState(124);
				match(EOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				output();
				setState(127);
				match(EOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				expr();
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EOL) {
					{
					setState(130);
					match(EOL);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(133);
				ifstmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(134);
				whilestmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(135);
				forstmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(136);
				callfunction();
				setState(137);
				match(EOL);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(139);
				retrn();
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

	public static class DeclarationContext extends ParserRuleContext {
		public List<VarsContext> vars() {
			return getRuleContexts(VarsContext.class);
		}
		public VarsContext vars(int i) {
			return getRuleContext(VarsContext.class,i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(142);
					vars();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(145); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(CMCGrammarParser.READ, 0); }
		public TerminalNode OPP() { return getToken(CMCGrammarParser.OPP, 0); }
		public TerminalNode ID() { return getToken(CMCGrammarParser.ID, 0); }
		public TerminalNode CLP() { return getToken(CMCGrammarParser.CLP, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(READ);
			setState(148);
			match(OPP);
			setState(149);
			match(ID);
			setState(150);
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
		public TerminalNode WRITE() { return getToken(CMCGrammarParser.WRITE, 0); }
		public TerminalNode OPP() { return getToken(CMCGrammarParser.OPP, 0); }
		public TerminalNode ID() { return getToken(CMCGrammarParser.ID, 0); }
		public TerminalNode CLP() { return getToken(CMCGrammarParser.CLP, 0); }
		public TerminalNode STR() { return getToken(CMCGrammarParser.STR, 0); }
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_output);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(WRITE);
				setState(153);
				match(OPP);
				setState(154);
				match(ID);
				setState(155);
				match(CLP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(WRITE);
				setState(157);
				match(OPP);
				setState(158);
				match(STR);
				setState(159);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CMCGrammarParser.ID, 0); }
		public AssignOPContext assignOP() {
			return getRuleContext(AssignOPContext.class,0);
		}
		public MagContext mag() {
			return getRuleContext(MagContext.class,0);
		}
		public TerminalNode AT() { return getToken(CMCGrammarParser.AT, 0); }
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(ID);
				setState(163);
				assignOP();
				setState(164);
				mag(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(ID);
				setState(167);
				match(AT);
				setState(168);
				boolexpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				mag(0);
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

	public static class BoolexprContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(CMCGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CMCGrammarParser.FALSE, 0); }
		public BoolexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterBoolexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitBoolexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitBoolexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolexprContext boolexpr() throws RecognitionException {
		BoolexprContext _localctx = new BoolexprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_boolexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class IfstmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CMCGrammarParser.IF, 0); }
		public TerminalNode OPP() { return getToken(CMCGrammarParser.OPP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLP() { return getToken(CMCGrammarParser.CLP, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CMCGrammarParser.ELSE, 0); }
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitIfstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitIfstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ifstmt);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(IF);
				setState(175);
				match(OPP);
				setState(176);
				expr();
				setState(177);
				match(CLP);
				setState(178);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(IF);
				setState(181);
				match(OPP);
				setState(182);
				expr();
				setState(183);
				match(CLP);
				setState(184);
				block();
				setState(185);
				match(ELSE);
				setState(186);
				block();
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
		public TerminalNode WHILE() { return getToken(CMCGrammarParser.WHILE, 0); }
		public TerminalNode OPP() { return getToken(CMCGrammarParser.OPP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLP() { return getToken(CMCGrammarParser.CLP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterWhilestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitWhilestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitWhilestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(WHILE);
			setState(191);
			match(OPP);
			setState(192);
			expr();
			setState(193);
			match(CLP);
			setState(194);
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
		public TerminalNode FOR() { return getToken(CMCGrammarParser.FOR, 0); }
		public TerminalNode OPP() { return getToken(CMCGrammarParser.OPP, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RNG() { return getToken(CMCGrammarParser.RNG, 0); }
		public TerminalNode NUM() { return getToken(CMCGrammarParser.NUM, 0); }
		public TerminalNode CLP() { return getToken(CMCGrammarParser.CLP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterForstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitForstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitForstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForstmtContext forstmt() throws RecognitionException {
		ForstmtContext _localctx = new ForstmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(FOR);
			setState(197);
			match(OPP);
			setState(198);
			type();
			setState(199);
			expr();
			setState(200);
			match(RNG);
			setState(201);
			match(NUM);
			setState(202);
			match(CLP);
			setState(203);
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
		enterRule(_localctx, 36, RULE_callfunction);
		try {
			int _alt;
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(ID);
				setState(206);
				match(CALL);
				setState(207);
				match(ID);
				setState(208);
				match(OPP);
				{
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(209);
						match(ID);
						setState(210);
						match(SEP);
						}
						} 
					}
					setState(215);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(216);
				match(ID);
				}
				setState(218);
				match(CLP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(ID);
				setState(220);
				match(CALL);
				setState(221);
				match(ID);
				setState(222);
				match(OPP);
				{
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(223);
						match(NUM);
						setState(224);
						match(SEP);
						}
						} 
					}
					setState(229);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(230);
				match(NUM);
				}
				setState(232);
				match(CLP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				match(ID);
				setState(234);
				match(OPP);
				setState(235);
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
		public TerminalNode EOL() { return getToken(CMCGrammarParser.EOL, 0); }
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
		enterRule(_localctx, 38, RULE_retrn);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(RET);
				setState(239);
				match(ID);
				setState(240);
				match(EOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(RET);
				setState(242);
				expr();
				setState(243);
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
		enterRule(_localctx, 40, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
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
		public TerminalNode NEG() { return getToken(CMCGrammarParser.NEG, 0); }
		public TerminalNode EQ() { return getToken(CMCGrammarParser.EQ, 0); }
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
		enterRule(_localctx, 42, RULE_assignOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
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

	public static class MagContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public MagContext mag() {
			return getRuleContext(MagContext.class,0);
		}
		public MagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterMag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitMag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitMag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MagContext mag() throws RecognitionException {
		return mag(0);
	}

	private MagContext mag(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MagContext _localctx = new MagContext(_ctx, _parentState);
		MagContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_mag, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(252);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(260);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new MagContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mag);
						setState(254);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(255);
						match(T__0);
						setState(256);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new MagContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mag);
						setState(257);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(258);
						match(T__1);
						setState(259);
						term(0);
						}
						break;
					}
					} 
				}
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode SEP() { return getToken(CMCGrammarParser.SEP, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitTerm(this);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(266);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(277);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(268);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(269);
						match(T__2);
						setState(270);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(271);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(272);
						match(T__3);
						setState(273);
						factor();
						}
						break;
					case 3:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(274);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(275);
						match(SEP);
						setState(276);
						factor();
						}
						break;
					}
					} 
				}
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		public TerminalNode OPP() { return getToken(CMCGrammarParser.OPP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLP() { return getToken(CMCGrammarParser.CLP, 0); }
		public TerminalNode ID() { return getToken(CMCGrammarParser.ID, 0); }
		public TerminalNode NUM() { return getToken(CMCGrammarParser.NUM, 0); }
		public TerminalNode STR() { return getToken(CMCGrammarParser.STR, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMCGrammarListener ) ((CMCGrammarListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMCGrammarVisitor ) return ((CMCGrammarVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_factor);
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPP:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(OPP);
				setState(283);
				expr();
				setState(284);
				match(CLP);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(ID);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				match(NUM);
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 4);
				{
				setState(288);
				match(STR);
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
			return mag_sempred((MagContext)_localctx, predIndex);
		case 23:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean mag_sempred(MagContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\u0126\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\5\2\66\n\2\3\2\5\29\n\2\3\2\5\2<\n\2\3\2\3\2\3\3\3\3\6"+
		"\3B\n\3\r\3\16\3C\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\6\5O\n\5\r\5\16"+
		"\5P\3\6\3\6\3\6\3\6\5\6W\n\6\3\7\6\7Z\n\7\r\7\16\7[\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\7\be\n\b\f\b\16\bh\13\b\3\b\3\b\3\b\5\bm\n\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\n\3\n\6\nw\n\n\r\n\16\nx\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u0086\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u008f\n\13\3\f\6\f\u0092\n\f\r\f\16\f\u0093\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a3\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00ad\n\17\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00bf\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00d6\n\24\f\24\16\24\u00d9\13\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00e4\n\24\f\24\16"+
		"\24\u00e7\13\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00ef\n\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u00f8\n\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0107\n\30\f\30\16\30\u010a\13"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0118"+
		"\n\31\f\31\16\31\u011b\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0124"+
		"\n\32\3\32\2\4.\60\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\2\5\3\2$%\3\2&)\4\2\33\33\35\"\u0131\2\65\3\2\2\2\4A\3\2\2\2\6"+
		"E\3\2\2\2\bN\3\2\2\2\nV\3\2\2\2\fY\3\2\2\2\16]\3\2\2\2\20q\3\2\2\2\22"+
		"t\3\2\2\2\24\u008e\3\2\2\2\26\u0091\3\2\2\2\30\u0095\3\2\2\2\32\u00a2"+
		"\3\2\2\2\34\u00ac\3\2\2\2\36\u00ae\3\2\2\2 \u00be\3\2\2\2\"\u00c0\3\2"+
		"\2\2$\u00c6\3\2\2\2&\u00ee\3\2\2\2(\u00f7\3\2\2\2*\u00f9\3\2\2\2,\u00fb"+
		"\3\2\2\2.\u00fd\3\2\2\2\60\u010b\3\2\2\2\62\u0123\3\2\2\2\64\66\5\4\3"+
		"\2\65\64\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\679\5\6\4\28\67\3\2\2\289\3"+
		"\2\2\29;\3\2\2\2:<\5\f\7\2;:\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\5\20\t\2>\3"+
		"\3\2\2\2?@\7\7\2\2@B\7,\2\2A?\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\5"+
		"\3\2\2\2EF\7\b\2\2FG\7\25\2\2GH\5\b\5\2HI\7\26\2\2I\7\3\2\2\2JK\5*\26"+
		"\2KL\5\n\6\2LM\7\32\2\2MO\3\2\2\2NJ\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2"+
		"\2\2Q\t\3\2\2\2RW\7*\2\2ST\7*\2\2TU\7\27\2\2UW\5\n\6\2VR\3\2\2\2VS\3\2"+
		"\2\2W\13\3\2\2\2XZ\5\16\b\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\"+
		"\r\3\2\2\2]^\5*\26\2^_\7*\2\2_l\7\30\2\2`a\5*\26\2ab\7*\2\2bc\7\27\2\2"+
		"ce\3\2\2\2d`\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2"+
		"ij\5*\26\2jk\7*\2\2km\3\2\2\2lf\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\7\31\2\2"+
		"op\5\22\n\2p\17\3\2\2\2qr\7\t\2\2rs\5\22\n\2s\21\3\2\2\2tv\7\25\2\2uw"+
		"\5\24\13\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7\26\2"+
		"\2{\23\3\2\2\2|\u008f\5\26\f\2}~\5\30\r\2~\177\7\32\2\2\177\u008f\3\2"+
		"\2\2\u0080\u0081\5\32\16\2\u0081\u0082\7\32\2\2\u0082\u008f\3\2\2\2\u0083"+
		"\u0085\5\34\17\2\u0084\u0086\7\32\2\2\u0085\u0084\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u008f\3\2\2\2\u0087\u008f\5 \21\2\u0088\u008f\5\"\22\2"+
		"\u0089\u008f\5$\23\2\u008a\u008b\5&\24\2\u008b\u008c\7\32\2\2\u008c\u008f"+
		"\3\2\2\2\u008d\u008f\5(\25\2\u008e|\3\2\2\2\u008e}\3\2\2\2\u008e\u0080"+
		"\3\2\2\2\u008e\u0083\3\2\2\2\u008e\u0087\3\2\2\2\u008e\u0088\3\2\2\2\u008e"+
		"\u0089\3\2\2\2\u008e\u008a\3\2\2\2\u008e\u008d\3\2\2\2\u008f\25\3\2\2"+
		"\2\u0090\u0092\5\b\5\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\27\3\2\2\2\u0095\u0096\7\23\2\2\u0096"+
		"\u0097\7\30\2\2\u0097\u0098\7*\2\2\u0098\u0099\7\31\2\2\u0099\31\3\2\2"+
		"\2\u009a\u009b\7\22\2\2\u009b\u009c\7\30\2\2\u009c\u009d\7*\2\2\u009d"+
		"\u00a3\7\31\2\2\u009e\u009f\7\22\2\2\u009f\u00a0\7\30\2\2\u00a0\u00a1"+
		"\7,\2\2\u00a1\u00a3\7\31\2\2\u00a2\u009a\3\2\2\2\u00a2\u009e\3\2\2\2\u00a3"+
		"\33\3\2\2\2\u00a4\u00a5\7*\2\2\u00a5\u00a6\5,\27\2\u00a6\u00a7\5.\30\2"+
		"\u00a7\u00ad\3\2\2\2\u00a8\u00a9\7*\2\2\u00a9\u00aa\7\33\2\2\u00aa\u00ad"+
		"\5\36\20\2\u00ab\u00ad\5.\30\2\u00ac\u00a4\3\2\2\2\u00ac\u00a8\3\2\2\2"+
		"\u00ac\u00ab\3\2\2\2\u00ad\35\3\2\2\2\u00ae\u00af\t\2\2\2\u00af\37\3\2"+
		"\2\2\u00b0\u00b1\7\16\2\2\u00b1\u00b2\7\30\2\2\u00b2\u00b3\5\34\17\2\u00b3"+
		"\u00b4\7\31\2\2\u00b4\u00b5\5\22\n\2\u00b5\u00bf\3\2\2\2\u00b6\u00b7\7"+
		"\16\2\2\u00b7\u00b8\7\30\2\2\u00b8\u00b9\5\34\17\2\u00b9\u00ba\7\31\2"+
		"\2\u00ba\u00bb\5\22\n\2\u00bb\u00bc\7\17\2\2\u00bc\u00bd\5\22\n\2\u00bd"+
		"\u00bf\3\2\2\2\u00be\u00b0\3\2\2\2\u00be\u00b6\3\2\2\2\u00bf!\3\2\2\2"+
		"\u00c0\u00c1\7\21\2\2\u00c1\u00c2\7\30\2\2\u00c2\u00c3\5\34\17\2\u00c3"+
		"\u00c4\7\31\2\2\u00c4\u00c5\5\22\n\2\u00c5#\3\2\2\2\u00c6\u00c7\7\20\2"+
		"\2\u00c7\u00c8\7\30\2\2\u00c8\u00c9\5*\26\2\u00c9\u00ca\5\34\17\2\u00ca"+
		"\u00cb\7\34\2\2\u00cb\u00cc\7+\2\2\u00cc\u00cd\7\31\2\2\u00cd\u00ce\5"+
		"\22\n\2\u00ce%\3\2\2\2\u00cf\u00d0\7*\2\2\u00d0\u00d1\7#\2\2\u00d1\u00d2"+
		"\7*\2\2\u00d2\u00d7\7\30\2\2\u00d3\u00d4\7*\2\2\u00d4\u00d6\7\27\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7*\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00ef\7\31\2\2\u00dd\u00de\7*\2\2\u00de\u00df\7#"+
		"\2\2\u00df\u00e0\7*\2\2\u00e0\u00e5\7\30\2\2\u00e1\u00e2\7+\2\2\u00e2"+
		"\u00e4\7\27\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3"+
		"\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8"+
		"\u00e9\7+\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ef\7\31\2\2\u00eb\u00ec\7*"+
		"\2\2\u00ec\u00ed\7\30\2\2\u00ed\u00ef\7\31\2\2\u00ee\u00cf\3\2\2\2\u00ee"+
		"\u00dd\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ef\'\3\2\2\2\u00f0\u00f1\7\24\2"+
		"\2\u00f1\u00f2\7*\2\2\u00f2\u00f8\7\32\2\2\u00f3\u00f4\7\24\2\2\u00f4"+
		"\u00f5\5\34\17\2\u00f5\u00f6\7\32\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f0"+
		"\3\2\2\2\u00f7\u00f3\3\2\2\2\u00f8)\3\2\2\2\u00f9\u00fa\t\3\2\2\u00fa"+
		"+\3\2\2\2\u00fb\u00fc\t\4\2\2\u00fc-\3\2\2\2\u00fd\u00fe\b\30\1\2\u00fe"+
		"\u00ff\5\60\31\2\u00ff\u0108\3\2\2\2\u0100\u0101\f\5\2\2\u0101\u0102\7"+
		"\3\2\2\u0102\u0107\5\60\31\2\u0103\u0104\f\4\2\2\u0104\u0105\7\4\2\2\u0105"+
		"\u0107\5\60\31\2\u0106\u0100\3\2\2\2\u0106\u0103\3\2\2\2\u0107\u010a\3"+
		"\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109/\3\2\2\2\u010a\u0108"+
		"\3\2\2\2\u010b\u010c\b\31\1\2\u010c\u010d\5\62\32\2\u010d\u0119\3\2\2"+
		"\2\u010e\u010f\f\6\2\2\u010f\u0110\7\5\2\2\u0110\u0118\5\62\32\2\u0111"+
		"\u0112\f\5\2\2\u0112\u0113\7\6\2\2\u0113\u0118\5\62\32\2\u0114\u0115\f"+
		"\4\2\2\u0115\u0116\7\27\2\2\u0116\u0118\5\62\32\2\u0117\u010e\3\2\2\2"+
		"\u0117\u0111\3\2\2\2\u0117\u0114\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117"+
		"\3\2\2\2\u0119\u011a\3\2\2\2\u011a\61\3\2\2\2\u011b\u0119\3\2\2\2\u011c"+
		"\u011d\7\30\2\2\u011d\u011e\5\34\17\2\u011e\u011f\7\31\2\2\u011f\u0124"+
		"\3\2\2\2\u0120\u0124\7*\2\2\u0121\u0124\7+\2\2\u0122\u0124\7,\2\2\u0123"+
		"\u011c\3\2\2\2\u0123\u0120\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2"+
		"\2\2\u0124\63\3\2\2\2\33\658;CPV[flx\u0085\u008e\u0093\u00a2\u00ac\u00be"+
		"\u00d7\u00e5\u00ee\u00f7\u0106\u0108\u0117\u0119\u0123";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}