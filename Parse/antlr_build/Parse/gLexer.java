// Generated from Parse/gLexer.g4 by ANTLR 4.13.2

   package Parse.antlr_build;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class gLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LT=1, AND=2, OR=3, MULT=4, PLUS=5, BITNOT=6, EQUALS=7, DOT=8, ARROW=9, 
		VAR=10, FUN=11, WHILE=12, CONST=13, STRING=14, VOID=15, RETURN=16, IF=17, 
		ELSE=18, BREAK=19, INT=20, TYPEDEF=21, STRUCT=22, UNION=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ALPHA", "DIGIT", "LT", "AND", "OR", "MULT", "PLUS", "BITNOT", "EQUALS", 
			"DOT", "ARROW", "VAR", "FUN", "WHILE", "CONST", "STRING", "VOID", "RETURN", 
			"IF", "ELSE", "BREAK", "INT", "TYPEDEF", "STRUCT", "UNION"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'&&'", "'||'", "'*'", "'+'", "'~'", "'='", "'.'", "'->'", 
			"'var'", "'fun'", "'while'", "'const'", "'string'", "'void'", "'return'", 
			"'if'", "'else'", "'break'", "'int'", "'typedef'", "'struct'", "'union'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LT", "AND", "OR", "MULT", "PLUS", "BITNOT", "EQUALS", "DOT", "ARROW", 
			"VAR", "FUN", "WHILE", "CONST", "STRING", "VOID", "RETURN", "IF", "ELSE", 
			"BREAK", "INT", "TYPEDEF", "STRUCT", "UNION"
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


	   StringBuilder sb;
	   private int stringToInt(String target) {
	      // TODO: Implement me!
	      return 0;
	   }


	public gLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gLexer.g4"; }

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
		"\u0004\u0000\u0017\u009a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0000\u0000\u0019\u0001\u0000"+
		"\u0003\u0000\u0005\u0001\u0007\u0002\t\u0003\u000b\u0004\r\u0005\u000f"+
		"\u0006\u0011\u0007\u0013\b\u0015\t\u0017\n\u0019\u000b\u001b\f\u001d\r"+
		"\u001f\u000e!\u000f#\u0010%\u0011\'\u0012)\u0013+\u0014-\u0015/\u0016"+
		"1\u0017\u0001\u0000\u0002\u0002\u0000AZaz\u0001\u000009\u0097\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000"+
		"\u0000\u00001\u0001\u0000\u0000\u0000\u00013\u0001\u0000\u0000\u0000\u0003"+
		"5\u0001\u0000\u0000\u0000\u00057\u0001\u0000\u0000\u0000\u00079\u0001"+
		"\u0000\u0000\u0000\t<\u0001\u0000\u0000\u0000\u000b?\u0001\u0000\u0000"+
		"\u0000\rA\u0001\u0000\u0000\u0000\u000fC\u0001\u0000\u0000\u0000\u0011"+
		"E\u0001\u0000\u0000\u0000\u0013G\u0001\u0000\u0000\u0000\u0015I\u0001"+
		"\u0000\u0000\u0000\u0017L\u0001\u0000\u0000\u0000\u0019P\u0001\u0000\u0000"+
		"\u0000\u001bT\u0001\u0000\u0000\u0000\u001dZ\u0001\u0000\u0000\u0000\u001f"+
		"`\u0001\u0000\u0000\u0000!g\u0001\u0000\u0000\u0000#l\u0001\u0000\u0000"+
		"\u0000%s\u0001\u0000\u0000\u0000\'v\u0001\u0000\u0000\u0000){\u0001\u0000"+
		"\u0000\u0000+\u0081\u0001\u0000\u0000\u0000-\u0085\u0001\u0000\u0000\u0000"+
		"/\u008d\u0001\u0000\u0000\u00001\u0094\u0001\u0000\u0000\u000034\u0007"+
		"\u0000\u0000\u00004\u0002\u0001\u0000\u0000\u000056\u0007\u0001\u0000"+
		"\u00006\u0004\u0001\u0000\u0000\u000078\u0005<\u0000\u00008\u0006\u0001"+
		"\u0000\u0000\u00009:\u0005&\u0000\u0000:;\u0005&\u0000\u0000;\b\u0001"+
		"\u0000\u0000\u0000<=\u0005|\u0000\u0000=>\u0005|\u0000\u0000>\n\u0001"+
		"\u0000\u0000\u0000?@\u0005*\u0000\u0000@\f\u0001\u0000\u0000\u0000AB\u0005"+
		"+\u0000\u0000B\u000e\u0001\u0000\u0000\u0000CD\u0005~\u0000\u0000D\u0010"+
		"\u0001\u0000\u0000\u0000EF\u0005=\u0000\u0000F\u0012\u0001\u0000\u0000"+
		"\u0000GH\u0005.\u0000\u0000H\u0014\u0001\u0000\u0000\u0000IJ\u0005-\u0000"+
		"\u0000JK\u0005>\u0000\u0000K\u0016\u0001\u0000\u0000\u0000LM\u0005v\u0000"+
		"\u0000MN\u0005a\u0000\u0000NO\u0005r\u0000\u0000O\u0018\u0001\u0000\u0000"+
		"\u0000PQ\u0005f\u0000\u0000QR\u0005u\u0000\u0000RS\u0005n\u0000\u0000"+
		"S\u001a\u0001\u0000\u0000\u0000TU\u0005w\u0000\u0000UV\u0005h\u0000\u0000"+
		"VW\u0005i\u0000\u0000WX\u0005l\u0000\u0000XY\u0005e\u0000\u0000Y\u001c"+
		"\u0001\u0000\u0000\u0000Z[\u0005c\u0000\u0000[\\\u0005o\u0000\u0000\\"+
		"]\u0005n\u0000\u0000]^\u0005s\u0000\u0000^_\u0005t\u0000\u0000_\u001e"+
		"\u0001\u0000\u0000\u0000`a\u0005s\u0000\u0000ab\u0005t\u0000\u0000bc\u0005"+
		"r\u0000\u0000cd\u0005i\u0000\u0000de\u0005n\u0000\u0000ef\u0005g\u0000"+
		"\u0000f \u0001\u0000\u0000\u0000gh\u0005v\u0000\u0000hi\u0005o\u0000\u0000"+
		"ij\u0005i\u0000\u0000jk\u0005d\u0000\u0000k\"\u0001\u0000\u0000\u0000"+
		"lm\u0005r\u0000\u0000mn\u0005e\u0000\u0000no\u0005t\u0000\u0000op\u0005"+
		"u\u0000\u0000pq\u0005r\u0000\u0000qr\u0005n\u0000\u0000r$\u0001\u0000"+
		"\u0000\u0000st\u0005i\u0000\u0000tu\u0005f\u0000\u0000u&\u0001\u0000\u0000"+
		"\u0000vw\u0005e\u0000\u0000wx\u0005l\u0000\u0000xy\u0005s\u0000\u0000"+
		"yz\u0005e\u0000\u0000z(\u0001\u0000\u0000\u0000{|\u0005b\u0000\u0000|"+
		"}\u0005r\u0000\u0000}~\u0005e\u0000\u0000~\u007f\u0005a\u0000\u0000\u007f"+
		"\u0080\u0005k\u0000\u0000\u0080*\u0001\u0000\u0000\u0000\u0081\u0082\u0005"+
		"i\u0000\u0000\u0082\u0083\u0005n\u0000\u0000\u0083\u0084\u0005t\u0000"+
		"\u0000\u0084,\u0001\u0000\u0000\u0000\u0085\u0086\u0005t\u0000\u0000\u0086"+
		"\u0087\u0005y\u0000\u0000\u0087\u0088\u0005p\u0000\u0000\u0088\u0089\u0005"+
		"e\u0000\u0000\u0089\u008a\u0005d\u0000\u0000\u008a\u008b\u0005e\u0000"+
		"\u0000\u008b\u008c\u0005f\u0000\u0000\u008c.\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0005s\u0000\u0000\u008e\u008f\u0005t\u0000\u0000\u008f\u0090\u0005"+
		"r\u0000\u0000\u0090\u0091\u0005u\u0000\u0000\u0091\u0092\u0005c\u0000"+
		"\u0000\u0092\u0093\u0005t\u0000\u0000\u00930\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0005u\u0000\u0000\u0095\u0096\u0005n\u0000\u0000\u0096\u0097\u0005"+
		"i\u0000\u0000\u0097\u0098\u0005o\u0000\u0000\u0098\u0099\u0005n\u0000"+
		"\u0000\u00992\u0001\u0000\u0000\u0000\u0001\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}