// Generated from C:\Users\cc49755682848\Documents\GitHub\Compiladores\MyCustomCCompiler\grammar\MCGrammar\CMCGrammar.g4 by ANTLR 4.6

package MCGrammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CMCGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, INCLUDE=5, GLOB=6, MAIN=7, FUNCTION=8, 
		WS=9, NL=10, LC=11, IF=12, ELSE=13, FOR=14, WHILE=15, WRITE=16, READ=17, 
		OP=18, CL=19, SEP=20, OPP=21, CLP=22, EOL=23, AT=24, RNG=25, NEG=26, EQ=27, 
		LESS=28, LESSEQ=29, GREATER=30, GREATEREQ=31, INT=32, FLOAT=33, BOOLEAN=34, 
		STRING=35, ID=36, NUM=37, STR=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "INCLUDE", "GLOB", "MAIN", "FUNCTION", 
		"WS", "NL", "LC", "IF", "ELSE", "FOR", "WHILE", "WRITE", "READ", "OP", 
		"CL", "SEP", "OPP", "CLP", "EOL", "AT", "RNG", "NEG", "EQ", "LESS", "LESSEQ", 
		"GREATER", "GREATEREQ", "INT", "FLOAT", "BOOLEAN", "STRING", "ID", "NUM", 
		"STR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "'#Include'", "'global'", "'main'", 
		"'function'", null, null, null, "'if'", "'else'", "'for'", "'while'", 
		"'writeln'", "'readln'", "'{'", "'}'", "','", "'('", "')'", "';'", "'='", 
		"'...'", "'!='", "'=='", "'<'", "'<='", "'>'", "'>='", "'int'", "'float'", 
		"'bool'", "'string'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "INCLUDE", "GLOB", "MAIN", "FUNCTION", "WS", 
		"NL", "LC", "IF", "ELSE", "FOR", "WHILE", "WRITE", "READ", "OP", "CL", 
		"SEP", "OPP", "CLP", "EOL", "AT", "RNG", "NEG", "EQ", "LESS", "LESSEQ", 
		"GREATER", "GREATEREQ", "INT", "FLOAT", "BOOLEAN", "STRING", "ID", "NUM", 
		"STR"
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


	public CMCGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CMCGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 8:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			NL_action((RuleContext)_localctx, actionIndex);
			break;
		case 10:
			LC_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void NL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}
	private void LC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2(\u010b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\6\nw\n\n"+
		"\r\n\16\nx\3\n\3\n\3\13\5\13~\n\13\3\13\6\13\u0081\n\13\r\13\16\13\u0082"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u008b\n\f\f\f\16\f\u008e\13\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\7%\u00ed\n%\f%\16"+
		"%\u00f0\13%\3&\5&\u00f3\n&\3&\6&\u00f6\n&\r&\16&\u00f7\3&\3&\6&\u00fc"+
		"\n&\r&\16&\u00fd\5&\u0100\n&\3\'\3\'\3\'\7\'\u0105\n\'\f\'\16\'\u0108"+
		"\13\'\3\'\3\'\2\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(\3\2\t\4\2\13\13\"\"\4\2\f\f\17"+
		"\17\4\2C\\c|\5\2\62;C\\c|\4\2--//\3\2\62;\3\2$$\u0115\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5Q\3\2\2\2\7S\3\2\2\2\tU\3\2\2\2\13W\3"+
		"\2\2\2\r`\3\2\2\2\17g\3\2\2\2\21l\3\2\2\2\23v\3\2\2\2\25}\3\2\2\2\27\u0086"+
		"\3\2\2\2\31\u0091\3\2\2\2\33\u0094\3\2\2\2\35\u0099\3\2\2\2\37\u009d\3"+
		"\2\2\2!\u00a3\3\2\2\2#\u00ab\3\2\2\2%\u00b2\3\2\2\2\'\u00b4\3\2\2\2)\u00b6"+
		"\3\2\2\2+\u00b8\3\2\2\2-\u00ba\3\2\2\2/\u00bc\3\2\2\2\61\u00be\3\2\2\2"+
		"\63\u00c0\3\2\2\2\65\u00c4\3\2\2\2\67\u00c7\3\2\2\29\u00ca\3\2\2\2;\u00cc"+
		"\3\2\2\2=\u00cf\3\2\2\2?\u00d1\3\2\2\2A\u00d4\3\2\2\2C\u00d8\3\2\2\2E"+
		"\u00de\3\2\2\2G\u00e3\3\2\2\2I\u00ea\3\2\2\2K\u00f2\3\2\2\2M\u0101\3\2"+
		"\2\2OP\7-\2\2P\4\3\2\2\2QR\7/\2\2R\6\3\2\2\2ST\7,\2\2T\b\3\2\2\2UV\7\61"+
		"\2\2V\n\3\2\2\2WX\7%\2\2XY\7K\2\2YZ\7p\2\2Z[\7e\2\2[\\\7n\2\2\\]\7w\2"+
		"\2]^\7f\2\2^_\7g\2\2_\f\3\2\2\2`a\7i\2\2ab\7n\2\2bc\7q\2\2cd\7d\2\2de"+
		"\7c\2\2ef\7n\2\2f\16\3\2\2\2gh\7o\2\2hi\7c\2\2ij\7k\2\2jk\7p\2\2k\20\3"+
		"\2\2\2lm\7h\2\2mn\7w\2\2no\7p\2\2op\7e\2\2pq\7v\2\2qr\7k\2\2rs\7q\2\2"+
		"st\7p\2\2t\22\3\2\2\2uw\t\2\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2"+
		"\2yz\3\2\2\2z{\b\n\2\2{\24\3\2\2\2|~\7\17\2\2}|\3\2\2\2}~\3\2\2\2~\u0080"+
		"\3\2\2\2\177\u0081\7\f\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\13"+
		"\3\2\u0085\26\3\2\2\2\u0086\u0087\7\61\2\2\u0087\u0088\7\61\2\2\u0088"+
		"\u008c\3\2\2\2\u0089\u008b\n\3\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f\u0090\b\f\4\2\u0090\30\3\2\2\2\u0091\u0092\7k\2\2"+
		"\u0092\u0093\7h\2\2\u0093\32\3\2\2\2\u0094\u0095\7g\2\2\u0095\u0096\7"+
		"n\2\2\u0096\u0097\7u\2\2\u0097\u0098\7g\2\2\u0098\34\3\2\2\2\u0099\u009a"+
		"\7h\2\2\u009a\u009b\7q\2\2\u009b\u009c\7t\2\2\u009c\36\3\2\2\2\u009d\u009e"+
		"\7y\2\2\u009e\u009f\7j\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7n\2\2\u00a1"+
		"\u00a2\7g\2\2\u00a2 \3\2\2\2\u00a3\u00a4\7y\2\2\u00a4\u00a5\7t\2\2\u00a5"+
		"\u00a6\7k\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7n\2\2"+
		"\u00a9\u00aa\7p\2\2\u00aa\"\3\2\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7g"+
		"\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7f\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1"+
		"\7p\2\2\u00b1$\3\2\2\2\u00b2\u00b3\7}\2\2\u00b3&\3\2\2\2\u00b4\u00b5\7"+
		"\177\2\2\u00b5(\3\2\2\2\u00b6\u00b7\7.\2\2\u00b7*\3\2\2\2\u00b8\u00b9"+
		"\7*\2\2\u00b9,\3\2\2\2\u00ba\u00bb\7+\2\2\u00bb.\3\2\2\2\u00bc\u00bd\7"+
		"=\2\2\u00bd\60\3\2\2\2\u00be\u00bf\7?\2\2\u00bf\62\3\2\2\2\u00c0\u00c1"+
		"\7\60\2\2\u00c1\u00c2\7\60\2\2\u00c2\u00c3\7\60\2\2\u00c3\64\3\2\2\2\u00c4"+
		"\u00c5\7#\2\2\u00c5\u00c6\7?\2\2\u00c6\66\3\2\2\2\u00c7\u00c8\7?\2\2\u00c8"+
		"\u00c9\7?\2\2\u00c98\3\2\2\2\u00ca\u00cb\7>\2\2\u00cb:\3\2\2\2\u00cc\u00cd"+
		"\7>\2\2\u00cd\u00ce\7?\2\2\u00ce<\3\2\2\2\u00cf\u00d0\7@\2\2\u00d0>\3"+
		"\2\2\2\u00d1\u00d2\7@\2\2\u00d2\u00d3\7?\2\2\u00d3@\3\2\2\2\u00d4\u00d5"+
		"\7k\2\2\u00d5\u00d6\7p\2\2\u00d6\u00d7\7v\2\2\u00d7B\3\2\2\2\u00d8\u00d9"+
		"\7h\2\2\u00d9\u00da\7n\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7c\2\2\u00dc"+
		"\u00dd\7v\2\2\u00ddD\3\2\2\2\u00de\u00df\7d\2\2\u00df\u00e0\7q\2\2\u00e0"+
		"\u00e1\7q\2\2\u00e1\u00e2\7n\2\2\u00e2F\3\2\2\2\u00e3\u00e4\7u\2\2\u00e4"+
		"\u00e5\7v\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7p\2\2"+
		"\u00e8\u00e9\7i\2\2\u00e9H\3\2\2\2\u00ea\u00ee\t\4\2\2\u00eb\u00ed\t\5"+
		"\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00efJ\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f3\t\6\2\2"+
		"\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f6"+
		"\t\7\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00ff\3\2\2\2\u00f9\u00fb\7\60\2\2\u00fa\u00fc\t"+
		"\7\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00f9\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100L\3\2\2\2\u0101\u0106\7$\2\2\u0102\u0105\n\b\2\2\u0103\u0105"+
		"\7$\2\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u0106\3\2"+
		"\2\2\u0109\u010a\7$\2\2\u010aN\3\2\2\2\16\2x}\u0082\u008c\u00ee\u00f2"+
		"\u00f7\u00fd\u00ff\u0104\u0106\5\3\n\2\3\13\3\3\f\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}