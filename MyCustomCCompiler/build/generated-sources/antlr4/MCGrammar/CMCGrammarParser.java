// Generated from C:\Users\cc49755682848\Documents\NetBeansProjects\Compiladores\MyCustomCCompiler\grammar\MCGrammar\CMCGrammar.g4 by ANTLR 4.6

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
		T__0=1, T__1=2, T__2=3, T__3=4, INCLUDE=5, STR=6, GLOB=7, MAIN=8, FUNCTION=9, 
		IF=10, ELSE=11, FOR=12, WHILE=13, WRITE=14, READ=15, OP=16, CL=17, SEP=18, 
		OPP=19, CLP=20, EOL=21, AT=22, RNG=23, NEG=24, EQ=25, LESS=26, LESSEQ=27, 
		GREATER=28, GREATEREQ=29, INT=30, FLOAT=31, BOOLEAN=32, STRING=33, ID=34, 
		NUM=35;
	public static final int
		RULE_prog = 0, RULE_includes = 1, RULE_globals = 2, RULE_vars = 3, RULE_ids = 4, 
		RULE_functions = 5, RULE_function = 6, RULE_main = 7, RULE_block = 8, 
		RULE_line = 9, RULE_declaration = 10, RULE_input = 11, RULE_output = 12, 
		RULE_expr = 13, RULE_ifstmt = 14, RULE_whilestmt = 15, RULE_forstmt = 16, 
		RULE_type = 17, RULE_assignOP = 18, RULE_mag = 19, RULE_term = 20, RULE_factor = 21;
	public static final String[] ruleNames = {
		"prog", "includes", "globals", "vars", "ids", "functions", "function", 
		"main", "block", "line", "declaration", "input", "output", "expr", "ifstmt", 
		"whilestmt", "forstmt", "type", "assignOP", "mag", "term", "factor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "'#Include'", null, "'global'", "'main'", 
		"'function'", "'if'", "'else'", "'for'", "'while'", "'writeln'", "'readln'", 
		"'{'", "'}'", "','", "'('", "')'", "';'", "'='", "'...'", "'!='", "'=='", 
		"'<'", "'<='", "'>'", "'>='", "'int'", "'float'", "'bool'", "'string'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "INCLUDE", "STR", "GLOB", "MAIN", "FUNCTION", 
		"IF", "ELSE", "FOR", "WHILE", "WRITE", "READ", "OP", "CL", "SEP", "OPP", 
		"CLP", "EOL", "AT", "RNG", "NEG", "EQ", "LESS", "LESSEQ", "GREATER", "GREATEREQ", 
		"INT", "FLOAT", "BOOLEAN", "STRING", "ID", "NUM"
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
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INCLUDE) {
				{
				setState(44);
				includes();
				}
			}

			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GLOB) {
				{
				setState(47);
				globals();
				}
			}

			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION) {
				{
				setState(50);
				functions();
				}
			}

			setState(53);
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
	}

	public final IncludesContext includes() throws RecognitionException {
		IncludesContext _localctx = new IncludesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_includes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55);
				match(INCLUDE);
				setState(56);
				match(STR);
				}
				}
				setState(59); 
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
	}

	public final GlobalsContext globals() throws RecognitionException {
		GlobalsContext _localctx = new GlobalsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_globals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(GLOB);
			setState(62);
			match(OP);
			setState(63);
			vars();
			setState(64);
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
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vars);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(66);
					type();
					setState(67);
					ids();
					setState(68);
					match(EOL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(72); 
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
	}

	public final IdsContext ids() throws RecognitionException {
		IdsContext _localctx = new IdsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ids);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(ID);
				setState(76);
				match(SEP);
				setState(77);
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
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				function();
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNCTION );
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
		public TerminalNode FUNCTION() { return getToken(CMCGrammarParser.FUNCTION, 0); }
		public List<TerminalNode> ID() { return getTokens(CMCGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CMCGrammarParser.ID, i);
		}
		public TerminalNode OPP() { return getToken(CMCGrammarParser.OPP, 0); }
		public TerminalNode CLP() { return getToken(CMCGrammarParser.CLP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> SEP() { return getTokens(CMCGrammarParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(CMCGrammarParser.SEP, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(FUNCTION);
			setState(86);
			match(ID);
			setState(87);
			match(OPP);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING))) != 0)) {
				{
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(88);
						type();
						setState(89);
						match(ID);
						setState(90);
						match(SEP);
						}
						} 
					}
					setState(96);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(97);
				type();
				setState(98);
				match(ID);
				}
			}

			setState(102);
			match(CLP);
			setState(103);
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
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(MAIN);
			setState(106);
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(OP);
			setState(110); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(109);
				line();
				}
				}
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << WRITE) | (1L << READ) | (1L << OPP) | (1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING) | (1L << ID) | (1L << NUM))) != 0) );
			setState(114);
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
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_line);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOLEAN:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				declaration();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				input();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				output();
				}
				break;
			case T__0:
			case T__1:
			case OPP:
			case ID:
			case NUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				expr();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(120);
				ifstmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 6);
				{
				setState(121);
				whilestmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 7);
				{
				setState(122);
				forstmt();
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
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(126); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(125);
					vars();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(128); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(READ);
			setState(131);
			match(OPP);
			setState(132);
			match(ID);
			setState(133);
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
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(WRITE);
			setState(136);
			match(OPP);
			setState(137);
			match(ID);
			setState(138);
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

	public static class ExprContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CMCGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CMCGrammarParser.ID, i);
		}
		public AssignOPContext assignOP() {
			return getRuleContext(AssignOPContext.class,0);
		}
		public TerminalNode NUM() { return getToken(CMCGrammarParser.NUM, 0); }
		public MagContext mag() {
			return getRuleContext(MagContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(ID);
				setState(141);
				assignOP();
				setState(142);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(ID);
				setState(145);
				assignOP();
				setState(146);
				match(NUM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				match(ID);
				setState(149);
				assignOP();
				setState(150);
				mag(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
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
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifstmt);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(IF);
				setState(156);
				match(OPP);
				setState(157);
				expr();
				setState(158);
				match(CLP);
				setState(159);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(IF);
				setState(162);
				match(OPP);
				setState(163);
				expr();
				setState(164);
				match(CLP);
				setState(165);
				block();
				setState(166);
				match(ELSE);
				setState(167);
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
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(WHILE);
			setState(172);
			match(OPP);
			setState(173);
			expr();
			setState(174);
			match(CLP);
			setState(175);
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
	}

	public final ForstmtContext forstmt() throws RecognitionException {
		ForstmtContext _localctx = new ForstmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(FOR);
			setState(178);
			match(OPP);
			setState(179);
			type();
			setState(180);
			expr();
			setState(181);
			match(RNG);
			setState(182);
			match(NUM);
			setState(183);
			match(CLP);
			setState(184);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CMCGrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(CMCGrammarParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(CMCGrammarParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(CMCGrammarParser.STRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
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
	}

	public final AssignOPContext assignOP() throws RecognitionException {
		AssignOPContext _localctx = new AssignOPContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
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
	}

	public final MagContext mag() throws RecognitionException {
		return mag(0);
	}

	private MagContext mag(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MagContext _localctx = new MagContext(_ctx, _parentState);
		MagContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_mag, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(191);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(199);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new MagContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mag);
						setState(193);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(194);
						match(T__0);
						setState(195);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new MagContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mag);
						setState(196);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(197);
						match(T__1);
						setState(198);
						term(0);
						}
						break;
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(205);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(213);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(207);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(208);
						match(T__2);
						setState(209);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(210);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(211);
						match(T__3);
						setState(212);
						factor();
						}
						break;
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode ID() { return getToken(CMCGrammarParser.ID, 0); }
		public TerminalNode NUM() { return getToken(CMCGrammarParser.NUM, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_factor);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPP:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(OPP);
				setState(219);
				expr();
				setState(220);
				match(CLP);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(T__1);
				setState(223);
				factor();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				match(T__0);
				setState(225);
				factor();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				match(ID);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(227);
				match(NUM);
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
		case 19:
			return mag_sempred((MagContext)_localctx, predIndex);
		case 20:
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
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u00e9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\5\2\60\n\2\3\2"+
		"\5\2\63\n\2\3\2\5\2\66\n\2\3\2\3\2\3\3\3\3\6\3<\n\3\r\3\16\3=\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\6\5I\n\5\r\5\16\5J\3\6\3\6\3\6\3\6\5\6Q\n"+
		"\6\3\7\6\7T\n\7\r\7\16\7U\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b_\n\b\f\b\16"+
		"\bb\13\b\3\b\3\b\3\b\5\bg\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\6\nq\n\n"+
		"\r\n\16\nr\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13~\n\13\3\f\6"+
		"\f\u0081\n\f\r\f\16\f\u0082\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5"+
		"\17\u009c\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00ac\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00ca\n\25\f\25\16\25\u00cd\13\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00d8\n\26\f\26\16"+
		"\26\u00db\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u00e7\n\27\3\27\2\4(*\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,\2\4\3\2 #\4\2\30\30\32\37\u00ef\2/\3\2\2\2\4;\3\2\2\2\6?\3\2\2\2\b"+
		"H\3\2\2\2\nP\3\2\2\2\fS\3\2\2\2\16W\3\2\2\2\20k\3\2\2\2\22n\3\2\2\2\24"+
		"}\3\2\2\2\26\u0080\3\2\2\2\30\u0084\3\2\2\2\32\u0089\3\2\2\2\34\u009b"+
		"\3\2\2\2\36\u00ab\3\2\2\2 \u00ad\3\2\2\2\"\u00b3\3\2\2\2$\u00bc\3\2\2"+
		"\2&\u00be\3\2\2\2(\u00c0\3\2\2\2*\u00ce\3\2\2\2,\u00e6\3\2\2\2.\60\5\4"+
		"\3\2/.\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61\63\5\6\4\2\62\61\3\2\2\2\62"+
		"\63\3\2\2\2\63\65\3\2\2\2\64\66\5\f\7\2\65\64\3\2\2\2\65\66\3\2\2\2\66"+
		"\67\3\2\2\2\678\5\20\t\28\3\3\2\2\29:\7\7\2\2:<\7\b\2\2;9\3\2\2\2<=\3"+
		"\2\2\2=;\3\2\2\2=>\3\2\2\2>\5\3\2\2\2?@\7\t\2\2@A\7\22\2\2AB\5\b\5\2B"+
		"C\7\23\2\2C\7\3\2\2\2DE\5$\23\2EF\5\n\6\2FG\7\27\2\2GI\3\2\2\2HD\3\2\2"+
		"\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\t\3\2\2\2LQ\7$\2\2MN\7$\2\2NO\7\24\2"+
		"\2OQ\5\n\6\2PL\3\2\2\2PM\3\2\2\2Q\13\3\2\2\2RT\5\16\b\2SR\3\2\2\2TU\3"+
		"\2\2\2US\3\2\2\2UV\3\2\2\2V\r\3\2\2\2WX\7\13\2\2XY\7$\2\2Yf\7\25\2\2Z"+
		"[\5$\23\2[\\\7$\2\2\\]\7\24\2\2]_\3\2\2\2^Z\3\2\2\2_b\3\2\2\2`^\3\2\2"+
		"\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\5$\23\2de\7$\2\2eg\3\2\2\2f`\3\2\2"+
		"\2fg\3\2\2\2gh\3\2\2\2hi\7\26\2\2ij\5\22\n\2j\17\3\2\2\2kl\7\n\2\2lm\5"+
		"\22\n\2m\21\3\2\2\2np\7\22\2\2oq\5\24\13\2po\3\2\2\2qr\3\2\2\2rp\3\2\2"+
		"\2rs\3\2\2\2st\3\2\2\2tu\7\23\2\2u\23\3\2\2\2v~\5\26\f\2w~\5\30\r\2x~"+
		"\5\32\16\2y~\5\34\17\2z~\5\36\20\2{~\5 \21\2|~\5\"\22\2}v\3\2\2\2}w\3"+
		"\2\2\2}x\3\2\2\2}y\3\2\2\2}z\3\2\2\2}{\3\2\2\2}|\3\2\2\2~\25\3\2\2\2\177"+
		"\u0081\5\b\5\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2"+
		"\2\u0082\u0083\3\2\2\2\u0083\27\3\2\2\2\u0084\u0085\7\21\2\2\u0085\u0086"+
		"\7\25\2\2\u0086\u0087\7$\2\2\u0087\u0088\7\26\2\2\u0088\31\3\2\2\2\u0089"+
		"\u008a\7\20\2\2\u008a\u008b\7\25\2\2\u008b\u008c\7$\2\2\u008c\u008d\7"+
		"\26\2\2\u008d\33\3\2\2\2\u008e\u008f\7$\2\2\u008f\u0090\5&\24\2\u0090"+
		"\u0091\7$\2\2\u0091\u009c\3\2\2\2\u0092\u0093\7$\2\2\u0093\u0094\5&\24"+
		"\2\u0094\u0095\7%\2\2\u0095\u009c\3\2\2\2\u0096\u0097\7$\2\2\u0097\u0098"+
		"\5&\24\2\u0098\u0099\5(\25\2\u0099\u009c\3\2\2\2\u009a\u009c\5(\25\2\u009b"+
		"\u008e\3\2\2\2\u009b\u0092\3\2\2\2\u009b\u0096\3\2\2\2\u009b\u009a\3\2"+
		"\2\2\u009c\35\3\2\2\2\u009d\u009e\7\f\2\2\u009e\u009f\7\25\2\2\u009f\u00a0"+
		"\5\34\17\2\u00a0\u00a1\7\26\2\2\u00a1\u00a2\5\22\n\2\u00a2\u00ac\3\2\2"+
		"\2\u00a3\u00a4\7\f\2\2\u00a4\u00a5\7\25\2\2\u00a5\u00a6\5\34\17\2\u00a6"+
		"\u00a7\7\26\2\2\u00a7\u00a8\5\22\n\2\u00a8\u00a9\7\r\2\2\u00a9\u00aa\5"+
		"\22\n\2\u00aa\u00ac\3\2\2\2\u00ab\u009d\3\2\2\2\u00ab\u00a3\3\2\2\2\u00ac"+
		"\37\3\2\2\2\u00ad\u00ae\7\17\2\2\u00ae\u00af\7\25\2\2\u00af\u00b0\5\34"+
		"\17\2\u00b0\u00b1\7\26\2\2\u00b1\u00b2\5\22\n\2\u00b2!\3\2\2\2\u00b3\u00b4"+
		"\7\16\2\2\u00b4\u00b5\7\25\2\2\u00b5\u00b6\5$\23\2\u00b6\u00b7\5\34\17"+
		"\2\u00b7\u00b8\7\31\2\2\u00b8\u00b9\7%\2\2\u00b9\u00ba\7\26\2\2\u00ba"+
		"\u00bb\5\22\n\2\u00bb#\3\2\2\2\u00bc\u00bd\t\2\2\2\u00bd%\3\2\2\2\u00be"+
		"\u00bf\t\3\2\2\u00bf\'\3\2\2\2\u00c0\u00c1\b\25\1\2\u00c1\u00c2\5*\26"+
		"\2\u00c2\u00cb\3\2\2\2\u00c3\u00c4\f\5\2\2\u00c4\u00c5\7\3\2\2\u00c5\u00ca"+
		"\5*\26\2\u00c6\u00c7\f\4\2\2\u00c7\u00c8\7\4\2\2\u00c8\u00ca\5*\26\2\u00c9"+
		"\u00c3\3\2\2\2\u00c9\u00c6\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2"+
		"\2\2\u00cb\u00cc\3\2\2\2\u00cc)\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf"+
		"\b\26\1\2\u00cf\u00d0\5,\27\2\u00d0\u00d9\3\2\2\2\u00d1\u00d2\f\5\2\2"+
		"\u00d2\u00d3\7\5\2\2\u00d3\u00d8\5,\27\2\u00d4\u00d5\f\4\2\2\u00d5\u00d6"+
		"\7\6\2\2\u00d6\u00d8\5,\27\2\u00d7\u00d1\3\2\2\2\u00d7\u00d4\3\2\2\2\u00d8"+
		"\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da+\3\2\2\2"+
		"\u00db\u00d9\3\2\2\2\u00dc\u00dd\7\25\2\2\u00dd\u00de\5\34\17\2\u00de"+
		"\u00df\7\26\2\2\u00df\u00e7\3\2\2\2\u00e0\u00e1\7\4\2\2\u00e1\u00e7\5"+
		",\27\2\u00e2\u00e3\7\3\2\2\u00e3\u00e7\5,\27\2\u00e4\u00e7\7$\2\2\u00e5"+
		"\u00e7\7%\2\2\u00e6\u00dc\3\2\2\2\u00e6\u00e0\3\2\2\2\u00e6\u00e2\3\2"+
		"\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7-\3\2\2\2\25/\62\65"+
		"=JPU`fr}\u0082\u009b\u00ab\u00c9\u00cb\u00d7\u00d9\u00e6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}