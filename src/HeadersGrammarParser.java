// Generated from C:/Users/petar/Documents/VU/AaC/Headers/src\HeadersGrammar.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HeadersGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, TYPE=9, 
		IDENTIFIER=10, COMMENT=11, PREPROCESSOR=12, WS=13;
	public static final int
		RULE_header = 0, RULE_comm = 1, RULE_declaration = 2, RULE_arguments = 3, 
		RULE_argument = 4, RULE_ret_type = 5, RULE_type = 6;
	public static final String[] ruleNames = {
		"header", "comm", "declaration", "arguments", "argument", "ret_type", 
		"type"
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

	@Override
	public String getGrammarFileName() { return "HeadersGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HeadersGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class HeaderContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<CommContext> comm() {
			return getRuleContexts(CommContext.class);
		}
		public CommContext comm(int i) {
			return getRuleContext(CommContext.class,i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HeadersGrammarVisitor ) return ((HeadersGrammarVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << TYPE) | (1L << COMMENT))) != 0)) {
				{
				setState(16);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__6:
				case TYPE:
					{
					setState(14);
					declaration();
					}
					break;
				case COMMENT:
					{
					setState(15);
					comm();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class CommContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(HeadersGrammarParser.COMMENT, 0); }
		public CommContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HeadersGrammarVisitor ) return ((HeadersGrammarVisitor<? extends T>)visitor).visitComm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommContext comm() throws RecognitionException {
		CommContext _localctx = new CommContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(COMMENT);
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
		public Ret_typeContext ret_type() {
			return getRuleContext(Ret_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(HeadersGrammarParser.IDENTIFIER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HeadersGrammarVisitor ) return ((HeadersGrammarVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			ret_type();
			setState(24);
			match(IDENTIFIER);
			setState(25);
			match(T__0);
			setState(26);
			arguments();
			setState(27);
			match(T__1);
			setState(28);
			match(T__2);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	 
		public ArgumentsContext() { }
		public void copyFrom(ArgumentsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NoargsContext extends ArgumentsContext {
		public NoargsContext(ArgumentsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HeadersGrammarVisitor ) return ((HeadersGrammarVisitor<? extends T>)visitor).visitNoargs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArglistContext extends ArgumentsContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public ArglistContext(ArgumentsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HeadersGrammarVisitor ) return ((HeadersGrammarVisitor<? extends T>)visitor).visitArglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arguments);
		int _la;
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				_localctx = new ArglistContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				argument();
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(31);
					match(T__3);
					setState(32);
					argument();
					}
					}
					setState(37);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__1:
				_localctx = new NoargsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ArgumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(HeadersGrammarParser.IDENTIFIER, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HeadersGrammarVisitor ) return ((HeadersGrammarVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			type();
			setState(42);
			match(IDENTIFIER);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(43);
				match(T__4);
				setState(44);
				match(T__5);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Ret_typeContext extends ParserRuleContext {
		public Ret_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret_type; }
	 
		public Ret_typeContext() { }
		public void copyFrom(Ret_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VoidRetContext extends Ret_typeContext {
		public VoidRetContext(Ret_typeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HeadersGrammarVisitor ) return ((HeadersGrammarVisitor<? extends T>)visitor).visitVoidRet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RegularRetContext extends Ret_typeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public RegularRetContext(Ret_typeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HeadersGrammarVisitor ) return ((HeadersGrammarVisitor<? extends T>)visitor).visitRegularRet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ret_typeContext ret_type() throws RecognitionException {
		Ret_typeContext _localctx = new Ret_typeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ret_type);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				_localctx = new VoidRetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(T__6);
				}
				break;
			case TYPE:
				_localctx = new RegularRetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				type();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(HeadersGrammarParser.TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HeadersGrammarVisitor ) return ((HeadersGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(TYPE);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(55);
				match(T__7);
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17@\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\7\2\23\n\2\f\2\16\2"+
		"\26\13\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5$\n\5\f\5"+
		"\16\5\'\13\5\3\5\5\5*\n\5\3\6\3\6\3\6\3\6\7\6\60\n\6\f\6\16\6\63\13\6"+
		"\3\7\3\7\5\7\67\n\7\3\b\3\b\7\b;\n\b\f\b\16\b>\13\b\3\b\2\2\t\2\4\6\b"+
		"\n\f\16\2\2?\2\24\3\2\2\2\4\27\3\2\2\2\6\31\3\2\2\2\b)\3\2\2\2\n+\3\2"+
		"\2\2\f\66\3\2\2\2\168\3\2\2\2\20\23\5\6\4\2\21\23\5\4\3\2\22\20\3\2\2"+
		"\2\22\21\3\2\2\2\23\26\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\3\3\2\2"+
		"\2\26\24\3\2\2\2\27\30\7\r\2\2\30\5\3\2\2\2\31\32\5\f\7\2\32\33\7\f\2"+
		"\2\33\34\7\3\2\2\34\35\5\b\5\2\35\36\7\4\2\2\36\37\7\5\2\2\37\7\3\2\2"+
		"\2 %\5\n\6\2!\"\7\6\2\2\"$\5\n\6\2#!\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3"+
		"\2\2\2&*\3\2\2\2\'%\3\2\2\2(*\3\2\2\2) \3\2\2\2)(\3\2\2\2*\t\3\2\2\2+"+
		",\5\16\b\2,\61\7\f\2\2-.\7\7\2\2.\60\7\b\2\2/-\3\2\2\2\60\63\3\2\2\2\61"+
		"/\3\2\2\2\61\62\3\2\2\2\62\13\3\2\2\2\63\61\3\2\2\2\64\67\7\t\2\2\65\67"+
		"\5\16\b\2\66\64\3\2\2\2\66\65\3\2\2\2\67\r\3\2\2\28<\7\13\2\29;\7\n\2"+
		"\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\17\3\2\2\2><\3\2\2\2\t\22"+
		"\24%)\61\66<";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}