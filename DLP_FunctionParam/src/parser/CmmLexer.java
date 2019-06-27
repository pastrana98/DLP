// Generated from src/parser/Cmm.g4 by ANTLR 4.7
package parser;

	import ast.*;
	import ast.definitions.*;
	import ast.expressions.*;
	import ast.expressions.binary.*;
	import ast.expressions.literals.*;
	import ast.expressions.unary.*;
	
	import ast.statements.*;
	
	import ast.types.*;
	
	
	

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, INT_CONSTANT=37, CHAR_CONSTANT=38, 
		REAL_CONSTANT=39, ID=40, COMMENT=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "INT_CONSTANT", "CHAR_CONSTANT", "REAL_CONSTANT", 
		"ID", "ONE_LINE_COMMENT", "MULTI_LINE_COMMENT", "COMMENT", "WHITE_SPACES", 
		"LETTER", "REAL_BASIC"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "';'", "'('", "')'", "'{'", "'}'", "'while'", "'if'", "'else'", 
		"'read'", "'write'", "'return'", "'='", "'void'", "'Func'", "'<'", "'>'", 
		"'struct'", "'['", "']'", "'double'", "'int'", "'char'", "'-'", "'.'", 
		"'*'", "'/'", "'%'", "'+'", "'>='", "'<='", "'!='", "'=='", "'&&'", "'||'", 
		"'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "INT_CONSTANT", "CHAR_CONSTANT", "REAL_CONSTANT", "ID", "COMMENT"
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


	public CmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cmm.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u0143\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3"+
		"\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3&\7&"+
		"\u00da\n&\f&\16&\u00dd\13&\5&\u00df\n&\3\'\3\'\7\'\u00e3\n\'\f\'\16\'"+
		"\u00e6\13\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\5\'\u00f9\n\'\3(\3(\3(\3(\5(\u00ff\n(\3(\3(\3(\3(\3(\3(\5("+
		"\u0107\n(\3)\3)\5)\u010b\n)\3)\3)\7)\u010f\n)\f)\16)\u0112\13)\3*\3*\3"+
		"*\3*\7*\u0118\n*\f*\16*\u011b\13*\3*\5*\u011e\n*\3*\5*\u0121\n*\3+\3+"+
		"\3+\3+\7+\u0127\n+\f+\16+\u012a\13+\3+\3+\3+\3,\3,\3,\5,\u0132\n,\3,\3"+
		",\3-\3-\3.\3.\3/\5/\u013b\n/\3/\3/\7/\u013f\n/\f/\16/\u0142\13/\5\u00e4"+
		"\u0119\u0128\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S\2U\2W+Y\2[\2]\2\3\2\t\3\2\63"+
		";\3\2\62;\4\2GGgg\4\2\62;aa\3\3\f\f\5\2\13\f\17\17\"\"\4\2C\\c|\2\u014e"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2W\3\2\2\2\3"+
		"_\3\2\2\2\5a\3\2\2\2\7c\3\2\2\2\te\3\2\2\2\13g\3\2\2\2\ri\3\2\2\2\17k"+
		"\3\2\2\2\21q\3\2\2\2\23t\3\2\2\2\25y\3\2\2\2\27~\3\2\2\2\31\u0084\3\2"+
		"\2\2\33\u008b\3\2\2\2\35\u008d\3\2\2\2\37\u0092\3\2\2\2!\u0097\3\2\2\2"+
		"#\u0099\3\2\2\2%\u009b\3\2\2\2\'\u00a2\3\2\2\2)\u00a4\3\2\2\2+\u00a6\3"+
		"\2\2\2-\u00ad\3\2\2\2/\u00b1\3\2\2\2\61\u00b6\3\2\2\2\63\u00b8\3\2\2\2"+
		"\65\u00ba\3\2\2\2\67\u00bc\3\2\2\29\u00be\3\2\2\2;\u00c0\3\2\2\2=\u00c2"+
		"\3\2\2\2?\u00c5\3\2\2\2A\u00c8\3\2\2\2C\u00cb\3\2\2\2E\u00ce\3\2\2\2G"+
		"\u00d1\3\2\2\2I\u00d4\3\2\2\2K\u00de\3\2\2\2M\u00f8\3\2\2\2O\u0106\3\2"+
		"\2\2Q\u010a\3\2\2\2S\u0113\3\2\2\2U\u0122\3\2\2\2W\u0131\3\2\2\2Y\u0135"+
		"\3\2\2\2[\u0137\3\2\2\2]\u013a\3\2\2\2_`\7.\2\2`\4\3\2\2\2ab\7=\2\2b\6"+
		"\3\2\2\2cd\7*\2\2d\b\3\2\2\2ef\7+\2\2f\n\3\2\2\2gh\7}\2\2h\f\3\2\2\2i"+
		"j\7\177\2\2j\16\3\2\2\2kl\7y\2\2lm\7j\2\2mn\7k\2\2no\7n\2\2op\7g\2\2p"+
		"\20\3\2\2\2qr\7k\2\2rs\7h\2\2s\22\3\2\2\2tu\7g\2\2uv\7n\2\2vw\7u\2\2w"+
		"x\7g\2\2x\24\3\2\2\2yz\7t\2\2z{\7g\2\2{|\7c\2\2|}\7f\2\2}\26\3\2\2\2~"+
		"\177\7y\2\2\177\u0080\7t\2\2\u0080\u0081\7k\2\2\u0081\u0082\7v\2\2\u0082"+
		"\u0083\7g\2\2\u0083\30\3\2\2\2\u0084\u0085\7t\2\2\u0085\u0086\7g\2\2\u0086"+
		"\u0087\7v\2\2\u0087\u0088\7w\2\2\u0088\u0089\7t\2\2\u0089\u008a\7p\2\2"+
		"\u008a\32\3\2\2\2\u008b\u008c\7?\2\2\u008c\34\3\2\2\2\u008d\u008e\7x\2"+
		"\2\u008e\u008f\7q\2\2\u008f\u0090\7k\2\2\u0090\u0091\7f\2\2\u0091\36\3"+
		"\2\2\2\u0092\u0093\7H\2\2\u0093\u0094\7w\2\2\u0094\u0095\7p\2\2\u0095"+
		"\u0096\7e\2\2\u0096 \3\2\2\2\u0097\u0098\7>\2\2\u0098\"\3\2\2\2\u0099"+
		"\u009a\7@\2\2\u009a$\3\2\2\2\u009b\u009c\7u\2\2\u009c\u009d\7v\2\2\u009d"+
		"\u009e\7t\2\2\u009e\u009f\7w\2\2\u009f\u00a0\7e\2\2\u00a0\u00a1\7v\2\2"+
		"\u00a1&\3\2\2\2\u00a2\u00a3\7]\2\2\u00a3(\3\2\2\2\u00a4\u00a5\7_\2\2\u00a5"+
		"*\3\2\2\2\u00a6\u00a7\7f\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7w\2\2\u00a9"+
		"\u00aa\7d\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7g\2\2\u00ac,\3\2\2\2\u00ad"+
		"\u00ae\7k\2\2\u00ae\u00af\7p\2\2\u00af\u00b0\7v\2\2\u00b0.\3\2\2\2\u00b1"+
		"\u00b2\7e\2\2\u00b2\u00b3\7j\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7t\2\2"+
		"\u00b5\60\3\2\2\2\u00b6\u00b7\7/\2\2\u00b7\62\3\2\2\2\u00b8\u00b9\7\60"+
		"\2\2\u00b9\64\3\2\2\2\u00ba\u00bb\7,\2\2\u00bb\66\3\2\2\2\u00bc\u00bd"+
		"\7\61\2\2\u00bd8\3\2\2\2\u00be\u00bf\7\'\2\2\u00bf:\3\2\2\2\u00c0\u00c1"+
		"\7-\2\2\u00c1<\3\2\2\2\u00c2\u00c3\7@\2\2\u00c3\u00c4\7?\2\2\u00c4>\3"+
		"\2\2\2\u00c5\u00c6\7>\2\2\u00c6\u00c7\7?\2\2\u00c7@\3\2\2\2\u00c8\u00c9"+
		"\7#\2\2\u00c9\u00ca\7?\2\2\u00caB\3\2\2\2\u00cb\u00cc\7?\2\2\u00cc\u00cd"+
		"\7?\2\2\u00cdD\3\2\2\2\u00ce\u00cf\7(\2\2\u00cf\u00d0\7(\2\2\u00d0F\3"+
		"\2\2\2\u00d1\u00d2\7~\2\2\u00d2\u00d3\7~\2\2\u00d3H\3\2\2\2\u00d4\u00d5"+
		"\7#\2\2\u00d5J\3\2\2\2\u00d6\u00df\7\62\2\2\u00d7\u00db\t\2\2\2\u00d8"+
		"\u00da\t\3\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00de"+
		"\u00d6\3\2\2\2\u00de\u00d7\3\2\2\2\u00dfL\3\2\2\2\u00e0\u00e4\7)\2\2\u00e1"+
		"\u00e3\13\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e5\3"+
		"\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7"+
		"\u00f9\7)\2\2\u00e8\u00e9\7)\2\2\u00e9\u00ea\7\"\2\2\u00ea\u00eb\7K\2"+
		"\2\u00eb\u00ec\7P\2\2\u00ec\u00ed\7V\2\2\u00ed\u00ee\7a\2\2\u00ee\u00ef"+
		"\7E\2\2\u00ef\u00f0\7Q\2\2\u00f0\u00f1\7P\2\2\u00f1\u00f2\7U\2\2\u00f2"+
		"\u00f3\7V\2\2\u00f3\u00f4\7C\2\2\u00f4\u00f5\7P\2\2\u00f5\u00f6\7V\2\2"+
		"\u00f6\u00f7\7\"\2\2\u00f7\u00f9\7)\2\2\u00f8\u00e0\3\2\2\2\u00f8\u00e8"+
		"\3\2\2\2\u00f9N\3\2\2\2\u00fa\u0107\5]/\2\u00fb\u00fc\5]/\2\u00fc\u00fe"+
		"\t\4\2\2\u00fd\u00ff\7/\2\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0101\5K&\2\u0101\u0107\3\2\2\2\u0102\u0103\5K&\2"+
		"\u0103\u0104\t\4\2\2\u0104\u0105\5K&\2\u0105\u0107\3\2\2\2\u0106\u00fa"+
		"\3\2\2\2\u0106\u00fb\3\2\2\2\u0106\u0102\3\2\2\2\u0107P\3\2\2\2\u0108"+
		"\u010b\5[.\2\u0109\u010b\7a\2\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2"+
		"\2\u010b\u0110\3\2\2\2\u010c\u010f\5[.\2\u010d\u010f\t\5\2\2\u010e\u010c"+
		"\3\2\2\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111R\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7\61\2\2"+
		"\u0114\u0115\7\61\2\2\u0115\u0119\3\2\2\2\u0116\u0118\13\2\2\2\u0117\u0116"+
		"\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a"+
		"\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011e\7\17\2\2\u011d\u011c\3"+
		"\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u0121\t\6\2\2\u0120"+
		"\u011f\3\2\2\2\u0121T\3\2\2\2\u0122\u0123\7\61\2\2\u0123\u0124\7,\2\2"+
		"\u0124\u0128\3\2\2\2\u0125\u0127\13\2\2\2\u0126\u0125\3\2\2\2\u0127\u012a"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012b\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012b\u012c\7,\2\2\u012c\u012d\7\61\2\2\u012dV\3\2\2\2"+
		"\u012e\u0132\5Y-\2\u012f\u0132\5S*\2\u0130\u0132\5U+\2\u0131\u012e\3\2"+
		"\2\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0134\b,\2\2\u0134X\3\2\2\2\u0135\u0136\t\7\2\2\u0136Z\3\2\2\2\u0137"+
		"\u0138\t\b\2\2\u0138\\\3\2\2\2\u0139\u013b\5K&\2\u013a\u0139\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u0140\7\60\2\2\u013d\u013f\t"+
		"\3\2\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141^\3\2\2\2\u0142\u0140\3\2\2\2\23\2\u00db\u00de\u00e4"+
		"\u00f8\u00fe\u0106\u010a\u010e\u0110\u0119\u011d\u0120\u0128\u0131\u013a"+
		"\u0140\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}