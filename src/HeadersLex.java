// Generated from C:/Users/petar/Documents/VU/AaC/Headers/src\HeadersLex.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HeadersLex extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE=1, IDENTIFIER=2, COMMENT=3, PREPROCESSOR=4, WS=5;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"TYPE", "IDENTIFIER", "COMMENT", "PREPROCESSOR", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TYPE", "IDENTIFIER", "COMMENT", "PREPROCESSOR", "WS"
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


	public HeadersLex(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HeadersLex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\7M\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2 \n\2\3\3\3\3\7\3$\n\3\f\3\16\3\'"+
		"\13\3\3\4\3\4\3\4\3\4\7\4-\n\4\f\4\16\4\60\13\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\7\48\n\4\f\4\16\4;\13\4\5\4=\n\4\3\5\3\5\6\5A\n\5\r\5\16\5B\3\5\3\5"+
		"\3\6\6\6H\n\6\r\6\16\6I\3\6\3\6\2\2\7\3\3\5\4\7\5\t\6\13\7\3\2\7\5\2C"+
		"\\aac|\6\2\62;C\\aac|\3\2,,\4\2\f\f\17\17\5\2\f\f\17\17\"\"U\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\3\37\3\2\2\2\5!\3"+
		"\2\2\2\7<\3\2\2\2\t>\3\2\2\2\13G\3\2\2\2\r\16\7k\2\2\16\17\7p\2\2\17 "+
		"\7v\2\2\20\21\7h\2\2\21\22\7n\2\2\22\23\7q\2\2\23\24\7c\2\2\24 \7v\2\2"+
		"\25\26\7f\2\2\26\27\7q\2\2\27\30\7w\2\2\30\31\7d\2\2\31\32\7n\2\2\32 "+
		"\7g\2\2\33\34\7e\2\2\34\35\7j\2\2\35\36\7c\2\2\36 \7t\2\2\37\r\3\2\2\2"+
		"\37\20\3\2\2\2\37\25\3\2\2\2\37\33\3\2\2\2 \4\3\2\2\2!%\t\2\2\2\"$\t\3"+
		"\2\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\6\3\2\2\2\'%\3\2\2\2("+
		")\7\61\2\2)*\7,\2\2*.\3\2\2\2+-\n\4\2\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2"+
		"\2./\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\62\7,\2\2\62=\7\61\2\2\63\64\7"+
		"\61\2\2\64\65\7\61\2\2\659\3\2\2\2\668\n\5\2\2\67\66\3\2\2\28;\3\2\2\2"+
		"9\67\3\2\2\29:\3\2\2\2:=\3\2\2\2;9\3\2\2\2<(\3\2\2\2<\63\3\2\2\2=\b\3"+
		"\2\2\2>@\7%\2\2?A\n\5\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CD\3"+
		"\2\2\2DE\b\5\2\2E\n\3\2\2\2FH\t\6\2\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ"+
		"\3\2\2\2JK\3\2\2\2KL\b\6\2\2L\f\3\2\2\2\n\2\37%.9<BI\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}