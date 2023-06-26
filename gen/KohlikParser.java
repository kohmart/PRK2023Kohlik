// Generated from D:/Projekty/2.semestr/PRK/KohlikKalkulator/src/main/antlr4/cz/tul/kohlik/kohlik\Kohlik.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class KohlikParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, LIST=3, UPPER=4, PLUS=5, TIMES=6, HEXAPLUS=7, CAESAR=8, 
		NON_ZERO_DIGIT=9, DIGIT=10, INT_DEFAULT=11, INT=12, FRACTION_NUMBER=13, 
		HEX_DEFAULT=14, HEX=15, STRING=16, NEWLINE=17, WS=18;
	public static final int
		RULE_root = 0, RULE_expr = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", null, "'^'", "'+'", "'*'", "'++'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "LIST", "UPPER", "PLUS", "TIMES", "HEXAPLUS", "CAESAR", 
			"NON_ZERO_DIGIT", "DIGIT", "INT_DEFAULT", "INT", "FRACTION_NUMBER", "HEX_DEFAULT", 
			"HEX", "STRING", "NEWLINE", "WS"
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

	@Override
	public String getGrammarFileName() { return "Kohlik.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KohlikParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(KohlikParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(KohlikParser.NEWLINE, i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KohlikListener ) ((KohlikListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KohlikListener ) ((KohlikListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KohlikVisitor ) return ((KohlikVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4);
				expr(0);
				setState(5);
				match(NEWLINE);
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 26L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class ParexprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KohlikListener ) ((KohlikListener)listener).enterParexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KohlikListener ) ((KohlikListener)listener).exitParexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KohlikVisitor ) return ((KohlikVisitor<? extends T>)visitor).visitParexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LeafexprContext extends ExprContext {
		public TerminalNode LIST() { return getToken(KohlikParser.LIST, 0); }
		public LeafexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KohlikListener ) ((KohlikListener)listener).enterLeafexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KohlikListener ) ((KohlikListener)listener).exitLeafexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KohlikVisitor ) return ((KohlikVisitor<? extends T>)visitor).visitLeafexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpexprContext extends ExprContext {
		public ExprContext left;
		public Token operator;
		public ExprContext right;
		public TerminalNode UPPER() { return getToken(KohlikParser.UPPER, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(KohlikParser.TIMES, 0); }
		public TerminalNode PLUS() { return getToken(KohlikParser.PLUS, 0); }
		public TerminalNode HEXAPLUS() { return getToken(KohlikParser.HEXAPLUS, 0); }
		public OpexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KohlikListener ) ((KohlikListener)listener).enterOpexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KohlikListener ) ((KohlikListener)listener).exitOpexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KohlikVisitor ) return ((KohlikVisitor<? extends T>)visitor).visitOpexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				_localctx = new ParexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(12);
				match(T__0);
				setState(13);
				expr(0);
				setState(14);
				match(T__1);
				}
				break;
			case UPPER:
				{
				_localctx = new OpexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(16);
				((OpexprContext)_localctx).operator = match(UPPER);
				setState(17);
				((OpexprContext)_localctx).right = expr(5);
				}
				break;
			case LIST:
				{
				_localctx = new LeafexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(18);
				match(LIST);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(32);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(30);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new OpexprContext(new ExprContext(_parentctx, _parentState));
						((OpexprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(21);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(22);
						((OpexprContext)_localctx).operator = match(TIMES);
						setState(23);
						((OpexprContext)_localctx).right = expr(5);
						}
						break;
					case 2:
						{
						_localctx = new OpexprContext(new ExprContext(_parentctx, _parentState));
						((OpexprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(24);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(25);
						((OpexprContext)_localctx).operator = match(PLUS);
						setState(26);
						((OpexprContext)_localctx).right = expr(4);
						}
						break;
					case 3:
						{
						_localctx = new OpexprContext(new ExprContext(_parentctx, _parentState));
						((OpexprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(27);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(28);
						((OpexprContext)_localctx).operator = match(HEXAPLUS);
						setState(29);
						((OpexprContext)_localctx).right = expr(3);
						}
						break;
					}
					} 
				}
				setState(34);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0012$\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0004\u0000\b\b\u0000\u000b\u0000\f\u0000"+
		"\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u0014\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001\u001f\b\u0001\n\u0001\f\u0001\"\t\u0001\u0001"+
		"\u0001\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0000\'\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0002\u0013\u0001\u0000\u0000\u0000\u0004\u0005\u0003"+
		"\u0002\u0001\u0000\u0005\u0006\u0005\u0011\u0000\u0000\u0006\b\u0001\u0000"+
		"\u0000\u0000\u0007\u0004\u0001\u0000\u0000\u0000\b\t\u0001\u0000\u0000"+
		"\u0000\t\u0007\u0001\u0000\u0000\u0000\t\n\u0001\u0000\u0000\u0000\n\u0001"+
		"\u0001\u0000\u0000\u0000\u000b\f\u0006\u0001\uffff\uffff\u0000\f\r\u0005"+
		"\u0001\u0000\u0000\r\u000e\u0003\u0002\u0001\u0000\u000e\u000f\u0005\u0002"+
		"\u0000\u0000\u000f\u0014\u0001\u0000\u0000\u0000\u0010\u0011\u0005\u0004"+
		"\u0000\u0000\u0011\u0014\u0003\u0002\u0001\u0005\u0012\u0014\u0005\u0003"+
		"\u0000\u0000\u0013\u000b\u0001\u0000\u0000\u0000\u0013\u0010\u0001\u0000"+
		"\u0000\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014 \u0001\u0000\u0000"+
		"\u0000\u0015\u0016\n\u0004\u0000\u0000\u0016\u0017\u0005\u0006\u0000\u0000"+
		"\u0017\u001f\u0003\u0002\u0001\u0005\u0018\u0019\n\u0003\u0000\u0000\u0019"+
		"\u001a\u0005\u0005\u0000\u0000\u001a\u001f\u0003\u0002\u0001\u0004\u001b"+
		"\u001c\n\u0002\u0000\u0000\u001c\u001d\u0005\u0007\u0000\u0000\u001d\u001f"+
		"\u0003\u0002\u0001\u0003\u001e\u0015\u0001\u0000\u0000\u0000\u001e\u0018"+
		"\u0001\u0000\u0000\u0000\u001e\u001b\u0001\u0000\u0000\u0000\u001f\"\u0001"+
		"\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000"+
		"\u0000!\u0003\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\u0004"+
		"\t\u0013\u001e ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}