// Generated from D:/Projekty/2.semestr/PRK/KohlikKalkulator/src/main/antlr4/cz/tul/kohlik/kohlik\Kohlik.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class KohlikLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, LIST=3, UPPER=4, PLUS=5, TIMES=6, HEXAPLUS=7, CAESAR=8, 
		NON_ZERO_DIGIT=9, DIGIT=10, INT_DEFAULT=11, INT=12, FRACTION_NUMBER=13, 
		HEX_DEFAULT=14, HEX=15, STRING=16, NEWLINE=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "LIST", "UPPER", "PLUS", "TIMES", "HEXAPLUS", "CAESAR", 
			"NON_ZERO_DIGIT", "DIGIT", "INT_DEFAULT", "INT", "FRACTION_NUMBER", "HEX_DEFAULT", 
			"HEX", "STRING", "NEWLINE", "WS"
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


	public KohlikLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Kohlik.g4"; }

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
		"\u0004\u0000\u0012\u0080\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002/\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0003\tH\b\t\u0001\n\u0001\n\u0001\n"+
		"\u0005\nM\b\n\n\n\f\nP\t\n\u0003\nR\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0005\fW\b\f\n\f\f\fZ\t\f\u0001\f\u0001\f\u0005\f^\b\f\n\f\f\fa\t\f"+
		"\u0001\r\u0001\r\u0001\r\u0004\rf\b\r\u000b\r\f\rg\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0005\u000fn\b\u000f\n\u000f\f\u000fq\t\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0004\u0010v\b\u0010\u000b\u0010"+
		"\f\u0010w\u0001\u0011\u0004\u0011{\b\u0011\u000b\u0011\f\u0011|\u0001"+
		"\u0011\u0001\u0011\u0000\u0000\u0012\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"\u0001\u0000\u0006\u0002\u0000,,..\u0002\u0000XXxx\u0003\u000009AFaf\u0001"+
		"\u0000\"\"\u0002\u0000\n\n\r\r\u0002\u0000\t\t  \u008c\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0003\'"+
		"\u0001\u0000\u0000\u0000\u0005.\u0001\u0000\u0000\u0000\u00070\u0001\u0000"+
		"\u0000\u0000\t2\u0001\u0000\u0000\u0000\u000b4\u0001\u0000\u0000\u0000"+
		"\r6\u0001\u0000\u0000\u0000\u000f9\u0001\u0000\u0000\u0000\u0011C\u0001"+
		"\u0000\u0000\u0000\u0013G\u0001\u0000\u0000\u0000\u0015Q\u0001\u0000\u0000"+
		"\u0000\u0017S\u0001\u0000\u0000\u0000\u0019X\u0001\u0000\u0000\u0000\u001b"+
		"b\u0001\u0000\u0000\u0000\u001di\u0001\u0000\u0000\u0000\u001fk\u0001"+
		"\u0000\u0000\u0000!u\u0001\u0000\u0000\u0000#z\u0001\u0000\u0000\u0000"+
		"%&\u0005(\u0000\u0000&\u0002\u0001\u0000\u0000\u0000\'(\u0005)\u0000\u0000"+
		"(\u0004\u0001\u0000\u0000\u0000)/\u0003\u0017\u000b\u0000*/\u0003\u001d"+
		"\u000e\u0000+/\u0003\u001f\u000f\u0000,/\u0003\u000f\u0007\u0000-/\u0003"+
		"\u0019\f\u0000.)\u0001\u0000\u0000\u0000.*\u0001\u0000\u0000\u0000.+\u0001"+
		"\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000.-\u0001\u0000\u0000\u0000"+
		"/\u0006\u0001\u0000\u0000\u000001\u0005^\u0000\u00001\b\u0001\u0000\u0000"+
		"\u000023\u0005+\u0000\u00003\n\u0001\u0000\u0000\u000045\u0005*\u0000"+
		"\u00005\f\u0001\u0000\u0000\u000067\u0005+\u0000\u000078\u0005+\u0000"+
		"\u00008\u000e\u0001\u0000\u0000\u00009:\u0005c\u0000\u0000:;\u0005a\u0000"+
		"\u0000;<\u0005e\u0000\u0000<=\u0005(\u0000\u0000=>\u0001\u0000\u0000\u0000"+
		">?\u0003\u001f\u000f\u0000?@\u0005,\u0000\u0000@A\u0003\u0017\u000b\u0000"+
		"AB\u0005)\u0000\u0000B\u0010\u0001\u0000\u0000\u0000CD\u000219\u0000D"+
		"\u0012\u0001\u0000\u0000\u0000EH\u00050\u0000\u0000FH\u0003\u0011\b\u0000"+
		"GE\u0001\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000H\u0014\u0001\u0000"+
		"\u0000\u0000IR\u0003\u0013\t\u0000JN\u0003\u0011\b\u0000KM\u0003\u0013"+
		"\t\u0000LK\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000NO\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001"+
		"\u0000\u0000\u0000QI\u0001\u0000\u0000\u0000QJ\u0001\u0000\u0000\u0000"+
		"R\u0016\u0001\u0000\u0000\u0000ST\u0003\u0015\n\u0000T\u0018\u0001\u0000"+
		"\u0000\u0000UW\u0003\u0013\t\u0000VU\u0001\u0000\u0000\u0000WZ\u0001\u0000"+
		"\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0001"+
		"\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[_\u0007\u0000\u0000\u0000"+
		"\\^\u0003\u0013\t\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000"+
		"\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`\u001a\u0001"+
		"\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000bc\u00050\u0000\u0000ce\u0007"+
		"\u0001\u0000\u0000df\u0007\u0002\u0000\u0000ed\u0001\u0000\u0000\u0000"+
		"fg\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000h\u001c\u0001\u0000\u0000\u0000ij\u0003\u001b\r\u0000j\u001e\u0001"+
		"\u0000\u0000\u0000ko\u0005\"\u0000\u0000ln\b\u0003\u0000\u0000ml\u0001"+
		"\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000"+
		"op\u0001\u0000\u0000\u0000pr\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000"+
		"\u0000rs\u0005\"\u0000\u0000s \u0001\u0000\u0000\u0000tv\u0007\u0004\u0000"+
		"\u0000ut\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000wx\u0001\u0000\u0000\u0000x\"\u0001\u0000\u0000\u0000y{\u0007"+
		"\u0005\u0000\u0000zy\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000"+
		"|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000"+
		"\u0000~\u007f\u0006\u0011\u0000\u0000\u007f$\u0001\u0000\u0000\u0000\u000b"+
		"\u0000.GNQX_gow|\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}