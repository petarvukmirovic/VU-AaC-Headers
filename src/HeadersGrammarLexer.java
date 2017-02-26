// Generated from C:/Users/petar/Documents/VU/AaC/Headers/src\HeadersGrammar.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HeadersGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, TYPE=9, 
		IDENTIFIER=10, COMMENT=11, PREPROCESSOR=12, WS=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "TYPE", 
		"IDENTIFIER", "COMMENT", "PREPROCESSOR", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "';'", "','", "'['", "']'", "'void'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "TYPE", "IDENTIFIER", 
		"COMMENT", "PREPROCESSOR", "WS"
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


	public HeadersGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HeadersGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17p\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nC\n\n\3\13\3\13\7\13G\n\13\f"+
		"\13\16\13J\13\13\3\f\3\f\3\f\3\f\7\fP\n\f\f\f\16\fS\13\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\7\f[\n\f\f\f\16\f^\13\f\5\f`\n\f\3\r\3\r\6\rd\n\r\r\r\16\r"+
		"e\3\r\3\r\3\16\6\16k\n\16\r\16\16\16l\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\3\2\7\5\2C\\aac|\6\2\62"+
		";C\\aac|\3\2,,\4\2\f\f\17\17\5\2\f\f\17\17\"\"x\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\3\35\3\2\2\2\5\37\3\2\2\2\7!\3\2\2\2\t#\3\2\2\2\13%\3\2\2\2\r\'\3"+
		"\2\2\2\17)\3\2\2\2\21.\3\2\2\2\23B\3\2\2\2\25D\3\2\2\2\27_\3\2\2\2\31"+
		"a\3\2\2\2\33j\3\2\2\2\35\36\7*\2\2\36\4\3\2\2\2\37 \7+\2\2 \6\3\2\2\2"+
		"!\"\7=\2\2\"\b\3\2\2\2#$\7.\2\2$\n\3\2\2\2%&\7]\2\2&\f\3\2\2\2\'(\7_\2"+
		"\2(\16\3\2\2\2)*\7x\2\2*+\7q\2\2+,\7k\2\2,-\7f\2\2-\20\3\2\2\2./\7,\2"+
		"\2/\22\3\2\2\2\60\61\7k\2\2\61\62\7p\2\2\62C\7v\2\2\63\64\7h\2\2\64\65"+
		"\7n\2\2\65\66\7q\2\2\66\67\7c\2\2\67C\7v\2\289\7f\2\29:\7q\2\2:;\7w\2"+
		"\2;<\7d\2\2<=\7n\2\2=C\7g\2\2>?\7e\2\2?@\7j\2\2@A\7c\2\2AC\7t\2\2B\60"+
		"\3\2\2\2B\63\3\2\2\2B8\3\2\2\2B>\3\2\2\2C\24\3\2\2\2DH\t\2\2\2EG\t\3\2"+
		"\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\26\3\2\2\2JH\3\2\2\2KL\7\61"+
		"\2\2LM\7,\2\2MQ\3\2\2\2NP\n\4\2\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2"+
		"\2\2RT\3\2\2\2SQ\3\2\2\2TU\7,\2\2U`\7\61\2\2VW\7\61\2\2WX\7\61\2\2X\\"+
		"\3\2\2\2Y[\n\5\2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]`\3\2\2\2"+
		"^\\\3\2\2\2_K\3\2\2\2_V\3\2\2\2`\30\3\2\2\2ac\7%\2\2bd\n\5\2\2cb\3\2\2"+
		"\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\b\r\2\2h\32\3\2\2\2ik\t\6"+
		"\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\b\16\2\2o\34"+
		"\3\2\2\2\n\2BHQ\\_el\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}