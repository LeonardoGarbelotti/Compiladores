// Generated from C:\Users\1511 IRON\Documents\NetBeansProjects\Compiladores\MyCustomCCompiler\grammar\MCGrammar\CMCGrammar.g4 by ANTLR 4.6

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
		INCLUDE=1, GLOB=2, MAIN=3, FUNCTION=4, WS=5, NL=6, LC=7, IF=8, ELSE=9, 
		FOR=10, WHILE=11, WRITE=12, READ=13, RET=14, OP=15, CL=16, SEP=17, OPP=18, 
		CLP=19, EOL=20, AT=21, RNG=22, NEG=23, EQ=24, LESS=25, LESSEQ=26, GREATER=27, 
		GREATEREQ=28, CALL=29, TRUE=30, FALSE=31, PLUS=32, MINUM=33, MULT=34, 
		DIV=35, INT=36, FLOAT=37, BOOLEAN=38, STRING=39, ID=40, NUM=41, STR=42;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INCLUDE", "GLOB", "MAIN", "FUNCTION", "WS", "NL", "LC", "IF", "ELSE", 
		"FOR", "WHILE", "WRITE", "READ", "RET", "OP", "CL", "SEP", "OPP", "CLP", 
		"EOL", "AT", "RNG", "NEG", "EQ", "LESS", "LESSEQ", "GREATER", "GREATEREQ", 
		"CALL", "TRUE", "FALSE", "PLUS", "MINUM", "MULT", "DIV", "INT", "FLOAT", 
		"BOOLEAN", "STRING", "ID", "NUM", "STR"
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
		case 4:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			NL_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2,\u012a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\6\6w\n\6\r\6\16\6"+
		"x\3\6\3\6\3\7\5\7~\n\7\3\7\6\7\u0081\n\7\r\7\16\7\u0082\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\7\b\u008b\n\b\f\b\16\b\u008e\13\b\3\b\3\b\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3"+
		"%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)"+
		"\3)\7)\u010a\n)\f)\16)\u010d\13)\3*\5*\u0110\n*\3*\6*\u0113\n*\r*\16*"+
		"\u0114\3*\3*\6*\u0119\n*\r*\16*\u011a\5*\u011d\n*\3+\3+\5+\u0121\n+\3"+
		"+\7+\u0124\n+\f+\16+\u0127\13+\3+\3+\2\2,\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,\3\2\n\4\2\13\13\"\"\4\2\f\f\17\17\4\2C\\c|\5\2\62;C\\c|\4\2--//\3\2"+
		"\62;\6\2\"\"\62;C\\c|\b\2\"\"\60\60\62<C\\aac|\u0134\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2"+
		"\2\5`\3\2\2\2\7g\3\2\2\2\tl\3\2\2\2\13v\3\2\2\2\r}\3\2\2\2\17\u0086\3"+
		"\2\2\2\21\u0091\3\2\2\2\23\u0094\3\2\2\2\25\u0099\3\2\2\2\27\u009d\3\2"+
		"\2\2\31\u00a3\3\2\2\2\33\u00ab\3\2\2\2\35\u00b2\3\2\2\2\37\u00b9\3\2\2"+
		"\2!\u00bb\3\2\2\2#\u00bd\3\2\2\2%\u00bf\3\2\2\2\'\u00c1\3\2\2\2)\u00c3"+
		"\3\2\2\2+\u00c5\3\2\2\2-\u00c7\3\2\2\2/\u00cb\3\2\2\2\61\u00ce\3\2\2\2"+
		"\63\u00d1\3\2\2\2\65\u00d3\3\2\2\2\67\u00d6\3\2\2\29\u00d8\3\2\2\2;\u00db"+
		"\3\2\2\2=\u00de\3\2\2\2?\u00e3\3\2\2\2A\u00e9\3\2\2\2C\u00eb\3\2\2\2E"+
		"\u00ed\3\2\2\2G\u00ef\3\2\2\2I\u00f1\3\2\2\2K\u00f5\3\2\2\2M\u00fb\3\2"+
		"\2\2O\u0100\3\2\2\2Q\u0107\3\2\2\2S\u010f\3\2\2\2U\u011e\3\2\2\2WX\7%"+
		"\2\2XY\7K\2\2YZ\7p\2\2Z[\7e\2\2[\\\7n\2\2\\]\7w\2\2]^\7f\2\2^_\7g\2\2"+
		"_\4\3\2\2\2`a\7i\2\2ab\7n\2\2bc\7q\2\2cd\7d\2\2de\7c\2\2ef\7n\2\2f\6\3"+
		"\2\2\2gh\7o\2\2hi\7c\2\2ij\7k\2\2jk\7p\2\2k\b\3\2\2\2lm\7h\2\2mn\7w\2"+
		"\2no\7p\2\2op\7e\2\2pq\7v\2\2qr\7k\2\2rs\7q\2\2st\7p\2\2t\n\3\2\2\2uw"+
		"\t\2\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\b\6\2\2{"+
		"\f\3\2\2\2|~\7\17\2\2}|\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177\u0081\7\f"+
		"\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\7\3\2\u0085\16\3\2\2\2\u0086"+
		"\u0087\7\61\2\2\u0087\u0088\7\61\2\2\u0088\u008c\3\2\2\2\u0089\u008b\n"+
		"\3\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\b\b"+
		"\4\2\u0090\20\3\2\2\2\u0091\u0092\7k\2\2\u0092\u0093\7h\2\2\u0093\22\3"+
		"\2\2\2\u0094\u0095\7g\2\2\u0095\u0096\7n\2\2\u0096\u0097\7u\2\2\u0097"+
		"\u0098\7g\2\2\u0098\24\3\2\2\2\u0099\u009a\7h\2\2\u009a\u009b\7q\2\2\u009b"+
		"\u009c\7t\2\2\u009c\26\3\2\2\2\u009d\u009e\7y\2\2\u009e\u009f\7j\2\2\u009f"+
		"\u00a0\7k\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7g\2\2\u00a2\30\3\2\2\2\u00a3"+
		"\u00a4\7y\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7v\2\2"+
		"\u00a7\u00a8\7g\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa\7p\2\2\u00aa\32\3\2"+
		"\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af"+
		"\7f\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7p\2\2\u00b1\34\3\2\2\2\u00b2\u00b3"+
		"\7t\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7w\2\2\u00b6"+
		"\u00b7\7t\2\2\u00b7\u00b8\7p\2\2\u00b8\36\3\2\2\2\u00b9\u00ba\7}\2\2\u00ba"+
		" \3\2\2\2\u00bb\u00bc\7\177\2\2\u00bc\"\3\2\2\2\u00bd\u00be\7.\2\2\u00be"+
		"$\3\2\2\2\u00bf\u00c0\7*\2\2\u00c0&\3\2\2\2\u00c1\u00c2\7+\2\2\u00c2("+
		"\3\2\2\2\u00c3\u00c4\7=\2\2\u00c4*\3\2\2\2\u00c5\u00c6\7?\2\2\u00c6,\3"+
		"\2\2\2\u00c7\u00c8\7\60\2\2\u00c8\u00c9\7\60\2\2\u00c9\u00ca\7\60\2\2"+
		"\u00ca.\3\2\2\2\u00cb\u00cc\7#\2\2\u00cc\u00cd\7?\2\2\u00cd\60\3\2\2\2"+
		"\u00ce\u00cf\7?\2\2\u00cf\u00d0\7?\2\2\u00d0\62\3\2\2\2\u00d1\u00d2\7"+
		">\2\2\u00d2\64\3\2\2\2\u00d3\u00d4\7>\2\2\u00d4\u00d5\7?\2\2\u00d5\66"+
		"\3\2\2\2\u00d6\u00d7\7@\2\2\u00d78\3\2\2\2\u00d8\u00d9\7@\2\2\u00d9\u00da"+
		"\7?\2\2\u00da:\3\2\2\2\u00db\u00dc\7/\2\2\u00dc\u00dd\7@\2\2\u00dd<\3"+
		"\2\2\2\u00de\u00df\7v\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7w\2\2\u00e1"+
		"\u00e2\7g\2\2\u00e2>\3\2\2\2\u00e3\u00e4\7h\2\2\u00e4\u00e5\7c\2\2\u00e5"+
		"\u00e6\7n\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8\7g\2\2\u00e8@\3\2\2\2\u00e9"+
		"\u00ea\7-\2\2\u00eaB\3\2\2\2\u00eb\u00ec\7/\2\2\u00ecD\3\2\2\2\u00ed\u00ee"+
		"\7,\2\2\u00eeF\3\2\2\2\u00ef\u00f0\7\61\2\2\u00f0H\3\2\2\2\u00f1\u00f2"+
		"\7k\2\2\u00f2\u00f3\7p\2\2\u00f3\u00f4\7v\2\2\u00f4J\3\2\2\2\u00f5\u00f6"+
		"\7h\2\2\u00f6\u00f7\7n\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7c\2\2\u00f9"+
		"\u00fa\7v\2\2\u00faL\3\2\2\2\u00fb\u00fc\7d\2\2\u00fc\u00fd\7q\2\2\u00fd"+
		"\u00fe\7q\2\2\u00fe\u00ff\7n\2\2\u00ffN\3\2\2\2\u0100\u0101\7u\2\2\u0101"+
		"\u0102\7v\2\2\u0102\u0103\7t\2\2\u0103\u0104\7k\2\2\u0104\u0105\7p\2\2"+
		"\u0105\u0106\7i\2\2\u0106P\3\2\2\2\u0107\u010b\t\4\2\2\u0108\u010a\t\5"+
		"\2\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010cR\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0110\t\6\2\2"+
		"\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u0113"+
		"\t\7\2\2\u0112\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0112\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u011c\3\2\2\2\u0116\u0118\7\60\2\2\u0117\u0119\t"+
		"\7\2\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u0116\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011dT\3\2\2\2\u011e\u0120\7$\2\2\u011f\u0121\t\b\2\2\u0120\u011f"+
		"\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0125\3\2\2\2\u0122\u0124\t\t\2\2\u0123"+
		"\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2"+
		"\2\2\u0126\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0129\7$\2\2\u0129"+
		"V\3\2\2\2\16\2x}\u0082\u008c\u010b\u010f\u0114\u011a\u011c\u0120\u0125"+
		"\5\3\6\2\3\7\3\3\b\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}