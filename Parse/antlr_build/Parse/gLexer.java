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
		START_LINE_COMMENT=1, START_BLOCK_COMMENT=2, WHITESPACE=3, NEWLINE=4, 
		DECIMAL_LITERAL=5, START_STRING_LITERAL=6, LT=7, AND=8, OR=9, STAR=10, 
		ADD=11, TILDE=12, ASSIGN=13, DOT=14, ARROW=15, VAR=16, FUN=17, WHILE=18, 
		CONST=19, STRING=20, VOID=21, RETURN=22, IF=23, ELSE=24, BREAK=25, INT=26, 
		TYPEDEF=27, STRUCT=28, UNION=29, LCURLY=30, RCURLY=31, LPAREN=32, RPAREN=33, 
		LSQUARE=34, RSQUARE=35, COMMA=36, BITWISEAND=37, BITWISEOR=38, NOT=39, 
		SEMICOLON=40, ID=41, END_LINE_COMMENT=42, OTHER_CHARACTER_LINE=43, END_BLOCK_COMMENT=44, 
		OTHER_CHARACTER_BLOCK=45, STRING_LITERAL=46, READ_S_CHAR=47, READ_ESCAPE=48, 
		READ_HEX=49, READ_OCT=50;
	public static final int
		LINE_COMMENT_MODE=1, BLOCK_COMMENT_MODE=2, STRING_READ_MODE=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "LINE_COMMENT_MODE", "BLOCK_COMMENT_MODE", "STRING_READ_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ALPHA", "DIGIT", "NONZERO_DIGIT", "DECIMAL_CONSTANT", "OCTAL_DIGIT", 
			"OCTAL_CONSTANT", "HEX_DIGIT", "HEX_CONSTANT", "ESCAPE_SEQUENCE", "ESCAPE_HEX", 
			"ESCAPE_OCTAL", "S_CHAR", "START_LINE_COMMENT", "START_BLOCK_COMMENT", 
			"WHITESPACE", "NEWLINE", "DECIMAL_LITERAL", "START_STRING_LITERAL", "LT", 
			"AND", "OR", "STAR", "ADD", "TILDE", "ASSIGN", "DOT", "ARROW", "VAR", 
			"FUN", "WHILE", "CONST", "STRING", "VOID", "RETURN", "IF", "ELSE", "BREAK", 
			"INT", "TYPEDEF", "STRUCT", "UNION", "LCURLY", "RCURLY", "LPAREN", "RPAREN", 
			"LSQUARE", "RSQUARE", "COMMA", "BITWISEAND", "BITWISEOR", "NOT", "SEMICOLON", 
			"ID", "END_LINE_COMMENT", "OTHER_CHARACTER_LINE", "END_BLOCK_COMMENT", 
			"OTHER_CHARACTER_BLOCK", "STRING_LITERAL", "READ_S_CHAR", "READ_ESCAPE", 
			"READ_HEX", "READ_OCT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "'/*'", null, null, null, null, "'<'", "'&&'", "'||'", 
			"'*'", "'+'", "'~'", "'='", "'.'", "'->'", "'var'", "'fun'", "'while'", 
			"'const'", "'string'", "'void'", "'return'", "'if'", "'else'", "'break'", 
			"'int'", "'typedef'", "'struct'", "'union'", "'{'", "'}'", "'('", "')'", 
			"'['", "']'", "','", "'&'", "'|'", "'!'", "';'", null, null, null, "'*/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "START_LINE_COMMENT", "START_BLOCK_COMMENT", "WHITESPACE", "NEWLINE", 
			"DECIMAL_LITERAL", "START_STRING_LITERAL", "LT", "AND", "OR", "STAR", 
			"ADD", "TILDE", "ASSIGN", "DOT", "ARROW", "VAR", "FUN", "WHILE", "CONST", 
			"STRING", "VOID", "RETURN", "IF", "ELSE", "BREAK", "INT", "TYPEDEF", 
			"STRUCT", "UNION", "LCURLY", "RCURLY", "LPAREN", "RPAREN", "LSQUARE", 
			"RSQUARE", "COMMA", "BITWISEAND", "BITWISEOR", "NOT", "SEMICOLON", "ID", 
			"END_LINE_COMMENT", "OTHER_CHARACTER_LINE", "END_BLOCK_COMMENT", "OTHER_CHARACTER_BLOCK", 
			"STRING_LITERAL", "READ_S_CHAR", "READ_ESCAPE", "READ_HEX", "READ_OCT"
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


	   private int stringToInt(String target, int base) {
	      return Integer.parseInt(target, base);
	   }

	   /*
	   private int[] hexStringToInts(String target){
	       //split string into array of values, <=2 hex digits per value
	       int numChars = (int)Math.ceil(target.length()/2.0);
	       int[] charNums = new int[numChars];
	       String current = target;
	       int i = 0;
	       while(current.length()>1){
	           charNums[i++] = Integer.parseInt(current.substring(0,2),16);
	           current = current.substring(2);
	       }
	       if(current.length()==1){
	           charNums[i] = Integer.parseInt(current,16);
	       }
	       return charNums;
	   }
	   */


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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 17:
			START_STRING_LITERAL_action((RuleContext)_localctx, actionIndex);
			break;
		case 57:
			STRING_LITERAL_action((RuleContext)_localctx, actionIndex);
			break;
		case 58:
			READ_S_CHAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 59:
			READ_ESCAPE_action((RuleContext)_localctx, actionIndex);
			break;
		case 60:
			READ_HEX_action((RuleContext)_localctx, actionIndex);
			break;
		case 61:
			READ_OCT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void START_STRING_LITERAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			sb = new StringBuilder();
			break;
		}
	}
	private void STRING_LITERAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			setText(sb.toString());
			break;
		}
	}
	private void READ_S_CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			sb.append(getText().toString());
			break;
		}
	}
	private void READ_ESCAPE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:

			    String s = getText().substring(1);
			    switch(s)
			    {
			        case "n" : {s = "\n"; break;}
			        case "a" : {s = "\007" ; break;}
			        case "b" : {s = "\b"; break;}
			        case "f" : {s = "\f"; break;}
			        case "r" : {s = "\r"; break;}
			        case "t" : {s = "\t"; break;}
			        case "v" : {s = "\013"; break;}
			        case "?" : {s = "?"; break;}
			        case "\"" : {s = "\\\""; break;}
			        case "\'" : {s = "\'"; break;}
			        case "\\" : {s = "\\"; break;}
			    }
			    sb.append(s);

			break;
		}
	}
	private void READ_HEX_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:

			    String t = getText().substring(2);
			    int val = stringToInt(t, 16);

			    sb.append((char)val);
			    //System.out.println(val);
			    //System.out.println((char)val);
			    /*int[] vals = hexStringToInts(t);
			    for(int v : vals){
			        sb.append((char)v);
			    }*/


			break;
		}
	}
	private void READ_OCT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:

			    String t = getText().substring(1);
			        int val = stringToInt (t, 8);
			        //System.out.println(val);
			        //System.out.println((char)val);
			        sb.append((char)val);

			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u00002\u0188\u0006\uffff\uffff\u0006\uffff\uffff\u0006\uffff\uffff"+
		"\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0005\u0003\u0089\b\u0003"+
		"\n\u0003\f\u0003\u008c\t\u0003\u0001\u0003\u0003\u0003\u008f\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0004\u0005\u0095\b\u0005\u000b"+
		"\u0005\f\u0005\u0096\u0001\u0006\u0003\u0006\u009a\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0004\u0007\u009f\b\u0007\u000b\u0007\f\u0007"+
		"\u00a0\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t"+
		"\u00aa\b\t\u0001\n\u0001\n\u0001\n\u0003\n\u00af\b\n\u0001\n\u0003\n\u00b2"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0004\u000e"+
		"\u00c3\b\u000e\u000b\u000e\f\u000e\u00c4\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00d0\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001*\u0001"+
		"*\u0001+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001.\u0001.\u0001/\u0001"+
		"/\u00010\u00010\u00011\u00011\u00012\u00012\u00013\u00013\u00014\u0001"+
		"4\u00034\u0153\b4\u00014\u00014\u00014\u00054\u0158\b4\n4\f4\u015b\t4"+
		"\u00015\u00015\u00015\u00015\u00015\u00016\u00016\u00016\u00016\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00018\u00018\u00018\u00018\u0001"+
		"9\u00019\u00019\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0000\u0000>\u0004\u0000\u0006\u0000\b\u0000"+
		"\n\u0000\f\u0000\u000e\u0000\u0010\u0000\u0012\u0000\u0014\u0000\u0016"+
		"\u0000\u0018\u0000\u001a\u0000\u001c\u0001\u001e\u0002 \u0003\"\u0004"+
		"$\u0005&\u0006(\u0007*\b,\t.\n0\u000b2\f4\r6\u000e8\u000f:\u0010<\u0011"+
		">\u0012@\u0013B\u0014D\u0015F\u0016H\u0017J\u0018L\u0019N\u001aP\u001b"+
		"R\u001cT\u001dV\u001eX\u001fZ \\!^\"`#b$d%f&h\'j(l)n*p+r,t-v.x/z0|1~2"+
		"\u0004\u0000\u0001\u0002\u0003\t\u0002\u0000AZaz\u0001\u000009\u0001\u0000"+
		"19\u0001\u000007\u0003\u000009AFaf\u0002\u0000XXxx\n\u0000\"\"\'\'??\\"+
		"\\abffnnrrttvv\u0004\u0000\n\n\r\r\"\"\\\\\u0003\u0000\t\t\r\r  \u0186"+
		"\u0000\u001c\u0001\u0000\u0000\u0000\u0000\u001e\u0001\u0000\u0000\u0000"+
		"\u0000 \u0001\u0000\u0000\u0000\u0000\"\u0001\u0000\u0000\u0000\u0000"+
		"$\u0001\u0000\u0000\u0000\u0000&\u0001\u0000\u0000\u0000\u0000(\u0001"+
		"\u0000\u0000\u0000\u0000*\u0001\u0000\u0000\u0000\u0000,\u0001\u0000\u0000"+
		"\u0000\u0000.\u0001\u0000\u0000\u0000\u00000\u0001\u0000\u0000\u0000\u0000"+
		"2\u0001\u0000\u0000\u0000\u00004\u0001\u0000\u0000\u0000\u00006\u0001"+
		"\u0000\u0000\u0000\u00008\u0001\u0000\u0000\u0000\u0000:\u0001\u0000\u0000"+
		"\u0000\u0000<\u0001\u0000\u0000\u0000\u0000>\u0001\u0000\u0000\u0000\u0000"+
		"@\u0001\u0000\u0000\u0000\u0000B\u0001\u0000\u0000\u0000\u0000D\u0001"+
		"\u0000\u0000\u0000\u0000F\u0001\u0000\u0000\u0000\u0000H\u0001\u0000\u0000"+
		"\u0000\u0000J\u0001\u0000\u0000\u0000\u0000L\u0001\u0000\u0000\u0000\u0000"+
		"N\u0001\u0000\u0000\u0000\u0000P\u0001\u0000\u0000\u0000\u0000R\u0001"+
		"\u0000\u0000\u0000\u0000T\u0001\u0000\u0000\u0000\u0000V\u0001\u0000\u0000"+
		"\u0000\u0000X\u0001\u0000\u0000\u0000\u0000Z\u0001\u0000\u0000\u0000\u0000"+
		"\\\u0001\u0000\u0000\u0000\u0000^\u0001\u0000\u0000\u0000\u0000`\u0001"+
		"\u0000\u0000\u0000\u0000b\u0001\u0000\u0000\u0000\u0000d\u0001\u0000\u0000"+
		"\u0000\u0000f\u0001\u0000\u0000\u0000\u0000h\u0001\u0000\u0000\u0000\u0000"+
		"j\u0001\u0000\u0000\u0000\u0000l\u0001\u0000\u0000\u0000\u0001n\u0001"+
		"\u0000\u0000\u0000\u0001p\u0001\u0000\u0000\u0000\u0002r\u0001\u0000\u0000"+
		"\u0000\u0002t\u0001\u0000\u0000\u0000\u0003v\u0001\u0000\u0000\u0000\u0003"+
		"x\u0001\u0000\u0000\u0000\u0003z\u0001\u0000\u0000\u0000\u0003|\u0001"+
		"\u0000\u0000\u0000\u0003~\u0001\u0000\u0000\u0000\u0004\u0080\u0001\u0000"+
		"\u0000\u0000\u0006\u0082\u0001\u0000\u0000\u0000\b\u0084\u0001\u0000\u0000"+
		"\u0000\n\u008e\u0001\u0000\u0000\u0000\f\u0090\u0001\u0000\u0000\u0000"+
		"\u000e\u0092\u0001\u0000\u0000\u0000\u0010\u0099\u0001\u0000\u0000\u0000"+
		"\u0012\u009b\u0001\u0000\u0000\u0000\u0014\u00a2\u0001\u0000\u0000\u0000"+
		"\u0016\u00a5\u0001\u0000\u0000\u0000\u0018\u00ab\u0001\u0000\u0000\u0000"+
		"\u001a\u00b3\u0001\u0000\u0000\u0000\u001c\u00b5\u0001\u0000\u0000\u0000"+
		"\u001e\u00bb\u0001\u0000\u0000\u0000 \u00c2\u0001\u0000\u0000\u0000\""+
		"\u00c8\u0001\u0000\u0000\u0000$\u00cf\u0001\u0000\u0000\u0000&\u00d1\u0001"+
		"\u0000\u0000\u0000(\u00d7\u0001\u0000\u0000\u0000*\u00d9\u0001\u0000\u0000"+
		"\u0000,\u00dc\u0001\u0000\u0000\u0000.\u00df\u0001\u0000\u0000\u00000"+
		"\u00e1\u0001\u0000\u0000\u00002\u00e3\u0001\u0000\u0000\u00004\u00e5\u0001"+
		"\u0000\u0000\u00006\u00e7\u0001\u0000\u0000\u00008\u00e9\u0001\u0000\u0000"+
		"\u0000:\u00ec\u0001\u0000\u0000\u0000<\u00f0\u0001\u0000\u0000\u0000>"+
		"\u00f4\u0001\u0000\u0000\u0000@\u00fa\u0001\u0000\u0000\u0000B\u0100\u0001"+
		"\u0000\u0000\u0000D\u0107\u0001\u0000\u0000\u0000F\u010c\u0001\u0000\u0000"+
		"\u0000H\u0113\u0001\u0000\u0000\u0000J\u0116\u0001\u0000\u0000\u0000L"+
		"\u011b\u0001\u0000\u0000\u0000N\u0121\u0001\u0000\u0000\u0000P\u0125\u0001"+
		"\u0000\u0000\u0000R\u012d\u0001\u0000\u0000\u0000T\u0134\u0001\u0000\u0000"+
		"\u0000V\u013a\u0001\u0000\u0000\u0000X\u013c\u0001\u0000\u0000\u0000Z"+
		"\u013e\u0001\u0000\u0000\u0000\\\u0140\u0001\u0000\u0000\u0000^\u0142"+
		"\u0001\u0000\u0000\u0000`\u0144\u0001\u0000\u0000\u0000b\u0146\u0001\u0000"+
		"\u0000\u0000d\u0148\u0001\u0000\u0000\u0000f\u014a\u0001\u0000\u0000\u0000"+
		"h\u014c\u0001\u0000\u0000\u0000j\u014e\u0001\u0000\u0000\u0000l\u0152"+
		"\u0001\u0000\u0000\u0000n\u015c\u0001\u0000\u0000\u0000p\u0161\u0001\u0000"+
		"\u0000\u0000r\u0165\u0001\u0000\u0000\u0000t\u016b\u0001\u0000\u0000\u0000"+
		"v\u016f\u0001\u0000\u0000\u0000x\u0174\u0001\u0000\u0000\u0000z\u0179"+
		"\u0001\u0000\u0000\u0000|\u017e\u0001\u0000\u0000\u0000~\u0183\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0007\u0000\u0000\u0000\u0081\u0005\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0007\u0001\u0000\u0000\u0083\u0007\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0007\u0002\u0000\u0000\u0085\t\u0001\u0000\u0000"+
		"\u0000\u0086\u008a\u0003\b\u0002\u0000\u0087\u0089\u0003\u0006\u0001\u0000"+
		"\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000"+
		"\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000"+
		"\u008b\u008f\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000"+
		"\u008d\u008f\u0003\u0006\u0001\u0000\u008e\u0086\u0001\u0000\u0000\u0000"+
		"\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u000b\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0007\u0003\u0000\u0000\u0091\r\u0001\u0000\u0000\u0000\u0092"+
		"\u0094\u00050\u0000\u0000\u0093\u0095\u0003\f\u0004\u0000\u0094\u0093"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0094"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u000f"+
		"\u0001\u0000\u0000\u0000\u0098\u009a\u0007\u0004\u0000\u0000\u0099\u0098"+
		"\u0001\u0000\u0000\u0000\u009a\u0011\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u00050\u0000\u0000\u009c\u009e\u0007\u0005\u0000\u0000\u009d\u009f\u0003"+
		"\u0010\u0006\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a1\u0013\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005"+
		"\\\u0000\u0000\u00a3\u00a4\u0007\u0006\u0000\u0000\u00a4\u0015\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0005\\\u0000\u0000\u00a6\u00a7\u0005x\u0000"+
		"\u0000\u00a7\u00a9\u0003\u0010\u0006\u0000\u00a8\u00aa\u0003\u0010\u0006"+
		"\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000"+
		"\u0000\u00aa\u0017\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\\\u0000\u0000"+
		"\u00ac\u00ae\u0003\f\u0004\u0000\u00ad\u00af\u0003\f\u0004\u0000\u00ae"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b0\u00b2\u0003\f\u0004\u0000\u00b1\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u0019"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\b\u0007\u0000\u0000\u00b4\u001b\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0005/\u0000\u0000\u00b6\u00b7\u0005/\u0000"+
		"\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9\u0006\f\u0000\u0000"+
		"\u00b9\u00ba\u0006\f\u0001\u0000\u00ba\u001d\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u0005/\u0000\u0000\u00bc\u00bd\u0005*\u0000\u0000\u00bd\u00be\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0006\r\u0000\u0000\u00bf\u00c0\u0006\r"+
		"\u0002\u0000\u00c0\u001f\u0001\u0000\u0000\u0000\u00c1\u00c3\u0007\b\u0000"+
		"\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7\u0006\u000e\u0000"+
		"\u0000\u00c7!\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\n\u0000\u0000"+
		"\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cb\u0006\u000f\u0000\u0000"+
		"\u00cb#\u0001\u0000\u0000\u0000\u00cc\u00d0\u0003\n\u0003\u0000\u00cd"+
		"\u00d0\u0003\u000e\u0005\u0000\u00ce\u00d0\u0003\u0012\u0007\u0000\u00cf"+
		"\u00cc\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d0%\u0001\u0000\u0000\u0000\u00d1\u00d2"+
		"\u0005\"\u0000\u0000\u00d2\u00d3\u0006\u0011\u0003\u0000\u00d3\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0006\u0011\u0000\u0000\u00d5\u00d6\u0006"+
		"\u0011\u0004\u0000\u00d6\'\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005<"+
		"\u0000\u0000\u00d8)\u0001\u0000\u0000\u0000\u00d9\u00da\u0005&\u0000\u0000"+
		"\u00da\u00db\u0005&\u0000\u0000\u00db+\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0005|\u0000\u0000\u00dd\u00de\u0005|\u0000\u0000\u00de-\u0001\u0000"+
		"\u0000\u0000\u00df\u00e0\u0005*\u0000\u0000\u00e0/\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0005+\u0000\u0000\u00e21\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\u0005~\u0000\u0000\u00e43\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005="+
		"\u0000\u0000\u00e65\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005.\u0000\u0000"+
		"\u00e87\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005-\u0000\u0000\u00ea\u00eb"+
		"\u0005>\u0000\u0000\u00eb9\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005v"+
		"\u0000\u0000\u00ed\u00ee\u0005a\u0000\u0000\u00ee\u00ef\u0005r\u0000\u0000"+
		"\u00ef;\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005f\u0000\u0000\u00f1\u00f2"+
		"\u0005u\u0000\u0000\u00f2\u00f3\u0005n\u0000\u0000\u00f3=\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f5\u0005w\u0000\u0000\u00f5\u00f6\u0005h\u0000\u0000"+
		"\u00f6\u00f7\u0005i\u0000\u0000\u00f7\u00f8\u0005l\u0000\u0000\u00f8\u00f9"+
		"\u0005e\u0000\u0000\u00f9?\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005c"+
		"\u0000\u0000\u00fb\u00fc\u0005o\u0000\u0000\u00fc\u00fd\u0005n\u0000\u0000"+
		"\u00fd\u00fe\u0005s\u0000\u0000\u00fe\u00ff\u0005t\u0000\u0000\u00ffA"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0005s\u0000\u0000\u0101\u0102\u0005"+
		"t\u0000\u0000\u0102\u0103\u0005r\u0000\u0000\u0103\u0104\u0005i\u0000"+
		"\u0000\u0104\u0105\u0005n\u0000\u0000\u0105\u0106\u0005g\u0000\u0000\u0106"+
		"C\u0001\u0000\u0000\u0000\u0107\u0108\u0005v\u0000\u0000\u0108\u0109\u0005"+
		"o\u0000\u0000\u0109\u010a\u0005i\u0000\u0000\u010a\u010b\u0005d\u0000"+
		"\u0000\u010bE\u0001\u0000\u0000\u0000\u010c\u010d\u0005r\u0000\u0000\u010d"+
		"\u010e\u0005e\u0000\u0000\u010e\u010f\u0005t\u0000\u0000\u010f\u0110\u0005"+
		"u\u0000\u0000\u0110\u0111\u0005r\u0000\u0000\u0111\u0112\u0005n\u0000"+
		"\u0000\u0112G\u0001\u0000\u0000\u0000\u0113\u0114\u0005i\u0000\u0000\u0114"+
		"\u0115\u0005f\u0000\u0000\u0115I\u0001\u0000\u0000\u0000\u0116\u0117\u0005"+
		"e\u0000\u0000\u0117\u0118\u0005l\u0000\u0000\u0118\u0119\u0005s\u0000"+
		"\u0000\u0119\u011a\u0005e\u0000\u0000\u011aK\u0001\u0000\u0000\u0000\u011b"+
		"\u011c\u0005b\u0000\u0000\u011c\u011d\u0005r\u0000\u0000\u011d\u011e\u0005"+
		"e\u0000\u0000\u011e\u011f\u0005a\u0000\u0000\u011f\u0120\u0005k\u0000"+
		"\u0000\u0120M\u0001\u0000\u0000\u0000\u0121\u0122\u0005i\u0000\u0000\u0122"+
		"\u0123\u0005n\u0000\u0000\u0123\u0124\u0005t\u0000\u0000\u0124O\u0001"+
		"\u0000\u0000\u0000\u0125\u0126\u0005t\u0000\u0000\u0126\u0127\u0005y\u0000"+
		"\u0000\u0127\u0128\u0005p\u0000\u0000\u0128\u0129\u0005e\u0000\u0000\u0129"+
		"\u012a\u0005d\u0000\u0000\u012a\u012b\u0005e\u0000\u0000\u012b\u012c\u0005"+
		"f\u0000\u0000\u012cQ\u0001\u0000\u0000\u0000\u012d\u012e\u0005s\u0000"+
		"\u0000\u012e\u012f\u0005t\u0000\u0000\u012f\u0130\u0005r\u0000\u0000\u0130"+
		"\u0131\u0005u\u0000\u0000\u0131\u0132\u0005c\u0000\u0000\u0132\u0133\u0005"+
		"t\u0000\u0000\u0133S\u0001\u0000\u0000\u0000\u0134\u0135\u0005u\u0000"+
		"\u0000\u0135\u0136\u0005n\u0000\u0000\u0136\u0137\u0005i\u0000\u0000\u0137"+
		"\u0138\u0005o\u0000\u0000\u0138\u0139\u0005n\u0000\u0000\u0139U\u0001"+
		"\u0000\u0000\u0000\u013a\u013b\u0005{\u0000\u0000\u013bW\u0001\u0000\u0000"+
		"\u0000\u013c\u013d\u0005}\u0000\u0000\u013dY\u0001\u0000\u0000\u0000\u013e"+
		"\u013f\u0005(\u0000\u0000\u013f[\u0001\u0000\u0000\u0000\u0140\u0141\u0005"+
		")\u0000\u0000\u0141]\u0001\u0000\u0000\u0000\u0142\u0143\u0005[\u0000"+
		"\u0000\u0143_\u0001\u0000\u0000\u0000\u0144\u0145\u0005]\u0000\u0000\u0145"+
		"a\u0001\u0000\u0000\u0000\u0146\u0147\u0005,\u0000\u0000\u0147c\u0001"+
		"\u0000\u0000\u0000\u0148\u0149\u0005&\u0000\u0000\u0149e\u0001\u0000\u0000"+
		"\u0000\u014a\u014b\u0005|\u0000\u0000\u014bg\u0001\u0000\u0000\u0000\u014c"+
		"\u014d\u0005!\u0000\u0000\u014di\u0001\u0000\u0000\u0000\u014e\u014f\u0005"+
		";\u0000\u0000\u014fk\u0001\u0000\u0000\u0000\u0150\u0153\u0003\u0004\u0000"+
		"\u0000\u0151\u0153\u0005_\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000"+
		"\u0152\u0151\u0001\u0000\u0000\u0000\u0153\u0159\u0001\u0000\u0000\u0000"+
		"\u0154\u0158\u0003\u0006\u0001\u0000\u0155\u0158\u0003\u0004\u0000\u0000"+
		"\u0156\u0158\u0005_\u0000\u0000\u0157\u0154\u0001\u0000\u0000\u0000\u0157"+
		"\u0155\u0001\u0000\u0000\u0000\u0157\u0156\u0001\u0000\u0000\u0000\u0158"+
		"\u015b\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u0159"+
		"\u015a\u0001\u0000\u0000\u0000\u015am\u0001\u0000\u0000\u0000\u015b\u0159"+
		"\u0001\u0000\u0000\u0000\u015c\u015d\u0005\n\u0000\u0000\u015d\u015e\u0001"+
		"\u0000\u0000\u0000\u015e\u015f\u00065\u0000\u0000\u015f\u0160\u00065\u0005"+
		"\u0000\u0160o\u0001\u0000\u0000\u0000\u0161\u0162\t\u0000\u0000\u0000"+
		"\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0164\u00066\u0000\u0000\u0164"+
		"q\u0001\u0000\u0000\u0000\u0165\u0166\u0005*\u0000\u0000\u0166\u0167\u0005"+
		"/\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u0169\u00067\u0000"+
		"\u0000\u0169\u016a\u00067\u0005\u0000\u016as\u0001\u0000\u0000\u0000\u016b"+
		"\u016c\t\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u016e"+
		"\u00068\u0000\u0000\u016eu\u0001\u0000\u0000\u0000\u016f\u0170\u0005\""+
		"\u0000\u0000\u0170\u0171\u00069\u0006\u0000\u0171\u0172\u0001\u0000\u0000"+
		"\u0000\u0172\u0173\u00069\u0005\u0000\u0173w\u0001\u0000\u0000\u0000\u0174"+
		"\u0175\u0003\u001a\u000b\u0000\u0175\u0176\u0006:\u0007\u0000\u0176\u0177"+
		"\u0001\u0000\u0000\u0000\u0177\u0178\u0006:\u0000\u0000\u0178y\u0001\u0000"+
		"\u0000\u0000\u0179\u017a\u0003\u0014\b\u0000\u017a\u017b\u0006;\b\u0000"+
		"\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017d\u0006;\u0000\u0000\u017d"+
		"{\u0001\u0000\u0000\u0000\u017e\u017f\u0003\u0016\t\u0000\u017f\u0180"+
		"\u0006<\t\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0182\u0006"+
		"<\u0000\u0000\u0182}\u0001\u0000\u0000\u0000\u0183\u0184\u0003\u0018\n"+
		"\u0000\u0184\u0185\u0006=\n\u0000\u0185\u0186\u0001\u0000\u0000\u0000"+
		"\u0186\u0187\u0006=\u0000\u0000\u0187\u007f\u0001\u0000\u0000\u0000\u0011"+
		"\u0000\u0001\u0002\u0003\u008a\u008e\u0096\u0099\u00a0\u00a9\u00ae\u00b1"+
		"\u00c4\u00cf\u0152\u0157\u0159\u000b\u0006\u0000\u0000\u0005\u0001\u0000"+
		"\u0005\u0002\u0000\u0001\u0011\u0000\u0005\u0003\u0000\u0004\u0000\u0000"+
		"\u00019\u0001\u0001:\u0002\u0001;\u0003\u0001<\u0004\u0001=\u0005";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}