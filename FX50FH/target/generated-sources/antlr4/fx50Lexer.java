// Generated from fx50.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class fx50Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, LET=9, 
		SHOW=10, NEXT=11, ASK=12, PAR=13, VAR=14, CONSTANT=15, NUM=16, ADD=17, 
		SUB=18, MUL=19, DIV=20, EXP=21, ROOT=22, BINCON=23, IF=24, THEN=25, ELSE=26, 
		IFEND=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "DIGIT", 
			"LET", "SHOW", "NEXT", "ASK", "PAR", "VAR", "CONSTANT", "NUM", "ADD", 
			"SUB", "MUL", "DIV", "EXP", "ROOT", "BINCON", "IF", "THEN", "ELSE", "IFEND"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'='", "'/='", "'>'", "'>='", "'<'", "'<='", "'->'", 
			"'/|'", "':'", "'?'", null, null, null, null, "'+'", "'-'", "'*'", "'/'", 
			"'^'", "'/-('", null, "'If'", "'Then'", "'Else'", "'IfEnd'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "LET", "SHOW", 
			"NEXT", "ASK", "PAR", "VAR", "CONSTANT", "NUM", "ADD", "SUB", "MUL", 
			"DIV", "EXP", "ROOT", "BINCON", "IF", "THEN", "ELSE", "IFEND"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public fx50Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "fx50.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00a0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\5\20"+
		"a\n\20\3\21\3\21\3\21\5\21f\n\21\3\22\6\22i\n\22\r\22\16\22j\3\22\3\22"+
		"\6\22o\n\22\r\22\16\22p\5\22s\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u008c\n\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\2\2\36\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\2\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22"+
		"%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35\3\2\5\3\2\62;\5"+
		"\2CFOOZ[\4\2..\60\60\2\u00a8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7?\3\2\2\2\tA\3\2\2\2\13D\3\2\2\2\rF\3"+
		"\2\2\2\17I\3\2\2\2\21K\3\2\2\2\23N\3\2\2\2\25P\3\2\2\2\27S\3\2\2\2\31"+
		"V\3\2\2\2\33X\3\2\2\2\35Z\3\2\2\2\37`\3\2\2\2!e\3\2\2\2#h\3\2\2\2%t\3"+
		"\2\2\2\'v\3\2\2\2)x\3\2\2\2+z\3\2\2\2-|\3\2\2\2/~\3\2\2\2\61\u008b\3\2"+
		"\2\2\63\u008d\3\2\2\2\65\u0090\3\2\2\2\67\u0095\3\2\2\29\u009a\3\2\2\2"+
		";<\7*\2\2<\4\3\2\2\2=>\7+\2\2>\6\3\2\2\2?@\7?\2\2@\b\3\2\2\2AB\7\61\2"+
		"\2BC\7?\2\2C\n\3\2\2\2DE\7@\2\2E\f\3\2\2\2FG\7@\2\2GH\7?\2\2H\16\3\2\2"+
		"\2IJ\7>\2\2J\20\3\2\2\2KL\7>\2\2LM\7?\2\2M\22\3\2\2\2NO\t\2\2\2O\24\3"+
		"\2\2\2PQ\7/\2\2QR\7@\2\2R\26\3\2\2\2ST\7\61\2\2TU\7~\2\2U\30\3\2\2\2V"+
		"W\7<\2\2W\32\3\2\2\2XY\7A\2\2Y\34\3\2\2\2Z[\4*+\2[\36\3\2\2\2\\a\t\3\2"+
		"\2]^\7C\2\2^_\7p\2\2_a\7u\2\2`\\\3\2\2\2`]\3\2\2\2a \3\2\2\2bc\7r\2\2"+
		"cf\7k\2\2df\7g\2\2eb\3\2\2\2ed\3\2\2\2f\"\3\2\2\2gi\5\23\n\2hg\3\2\2\2"+
		"ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2kr\3\2\2\2ln\t\4\2\2mo\5\23\n\2nm\3\2\2"+
		"\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rl\3\2\2\2rs\3\2\2\2s$\3\2\2"+
		"\2tu\7-\2\2u&\3\2\2\2vw\7/\2\2w(\3\2\2\2xy\7,\2\2y*\3\2\2\2z{\7\61\2\2"+
		"{,\3\2\2\2|}\7`\2\2}.\3\2\2\2~\177\7\61\2\2\177\u0080\7/\2\2\u0080\u0081"+
		"\7*\2\2\u0081\60\3\2\2\2\u0082\u008c\7?\2\2\u0083\u0084\7\61\2\2\u0084"+
		"\u008c\7?\2\2\u0085\u008c\7@\2\2\u0086\u0087\7@\2\2\u0087\u008c\7?\2\2"+
		"\u0088\u008c\7>\2\2\u0089\u008a\7>\2\2\u008a\u008c\7?\2\2\u008b\u0082"+
		"\3\2\2\2\u008b\u0083\3\2\2\2\u008b\u0085\3\2\2\2\u008b\u0086\3\2\2\2\u008b"+
		"\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008c\62\3\2\2\2\u008d\u008e\7K\2\2"+
		"\u008e\u008f\7h\2\2\u008f\64\3\2\2\2\u0090\u0091\7V\2\2\u0091\u0092\7"+
		"j\2\2\u0092\u0093\7g\2\2\u0093\u0094\7p\2\2\u0094\66\3\2\2\2\u0095\u0096"+
		"\7G\2\2\u0096\u0097\7n\2\2\u0097\u0098\7u\2\2\u0098\u0099\7g\2\2\u0099"+
		"8\3\2\2\2\u009a\u009b\7K\2\2\u009b\u009c\7h\2\2\u009c\u009d\7G\2\2\u009d"+
		"\u009e\7p\2\2\u009e\u009f\7f\2\2\u009f:\3\2\2\2\t\2`ejpr\u008b\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}