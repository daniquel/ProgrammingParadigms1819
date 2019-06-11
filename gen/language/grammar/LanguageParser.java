// Generated from C:/Users/xTove/Documents/Repositories/ProgrammingParadigms1819/src/language/grammar\Language.g4 by ANTLR 4.7.2
package language.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQ=1, GE=2, GT=3, LE=4, LT=5, NE=6, LCURLY=7, RCURLY=8, LPAR=9, RPAR=10, 
		LSQ=11, RSQ=12, MINUS=13, NOT=14, OR=15, PLUS=16, AND=17, ASSIGN=18, TIMES=19, 
		SEMI=20, BOOL=21, INT=22, VOID=23, WHILE=24, IF=25, ELSE=26, TRUE=27, 
		FALSE=28, FUNCTION=29, MAIN=30, JOIN=31, FORK=32, CLASS=33, GLOBAL=34, 
		NUM=35, ID=36, CHARACTER=37, WS=38;
	public static final int
		RULE_program = 0, RULE_body = 1, RULE_main = 2, RULE_programVarDeclaration = 3, 
		RULE_varDeclaration = 4, RULE_stat = 5, RULE_expr = 6, RULE_type = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "body", "main", "programVarDeclaration", "varDeclaration", 
			"stat", "expr", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'gelijk aan'", "'groter of gelijk aan'", "'groter dan'", "'kleiner of gelijk aan'", 
			"'kleiner dan'", "'niet gelijk aan'", "'{'", "'}'", "'('", "')'", "'['", 
			"']'", "'min'", "'niet'", "'of'", "'plus'", "'en'", "'is'", "'keer'", 
			"';'", "'truefalsewaarde'", "'getal'", "'niks'", "'zolang dat'", "'wanneer'", 
			"'anders'", "'ja'", "'nee'", "'functie'", "'voeruit'", "'samenvoegen'", 
			"'splitsen'", "'klasse'", "'globaal'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQ", "GE", "GT", "LE", "LT", "NE", "LCURLY", "RCURLY", "LPAR", 
			"RPAR", "LSQ", "RSQ", "MINUS", "NOT", "OR", "PLUS", "AND", "ASSIGN", 
			"TIMES", "SEMI", "BOOL", "INT", "VOID", "WHILE", "IF", "ELSE", "TRUE", 
			"FALSE", "FUNCTION", "MAIN", "JOIN", "FORK", "CLASS", "GLOBAL", "NUM", 
			"ID", "CHARACTER", "WS"
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
	public String getGrammarFileName() { return "Language.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(LanguageParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode LCURLY() { return getToken(LanguageParser.LCURLY, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(LanguageParser.RCURLY, 0); }
		public TerminalNode EOF() { return getToken(LanguageParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(CLASS);
			setState(17);
			match(ID);
			setState(18);
			match(LCURLY);
			setState(19);
			body();
			setState(20);
			match(RCURLY);
			setState(21);
			match(EOF);
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

	public static class BodyContext extends ParserRuleContext {
		public List<ProgramVarDeclarationContext> programVarDeclaration() {
			return getRuleContexts(ProgramVarDeclarationContext.class);
		}
		public ProgramVarDeclarationContext programVarDeclaration(int i) {
			return getRuleContext(ProgramVarDeclarationContext.class,i);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GLOBAL) {
				{
				{
				setState(23);
				programVarDeclaration();
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAIN) {
				{
				setState(29);
				main();
				}
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(LanguageParser.MAIN, 0); }
		public TerminalNode LPAR() { return getToken(LanguageParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LanguageParser.RPAR, 0); }
		public TerminalNode LCURLY() { return getToken(LanguageParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(LanguageParser.RCURLY, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(MAIN);
			setState(33);
			match(LPAR);
			setState(34);
			match(RPAR);
			setState(35);
			match(LCURLY);
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				stat();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LCURLY) | (1L << BOOL) | (1L << INT) | (1L << VOID) | (1L << WHILE) | (1L << IF) | (1L << ID))) != 0) );
			setState(41);
			match(RCURLY);
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

	public static class ProgramVarDeclarationContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(LanguageParser.GLOBAL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(LanguageParser.SEMI, 0); }
		public TerminalNode ASSIGN() { return getToken(LanguageParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ProgramVarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programVarDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterProgramVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitProgramVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitProgramVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramVarDeclarationContext programVarDeclaration() throws RecognitionException {
		ProgramVarDeclarationContext _localctx = new ProgramVarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_programVarDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(GLOBAL);
			setState(44);
			type();
			setState(45);
			match(ID);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(46);
				match(ASSIGN);
				setState(47);
				expr(0);
				}
			}

			setState(50);
			match(SEMI);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(LanguageParser.SEMI, 0); }
		public TerminalNode ASSIGN() { return getToken(LanguageParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			type();
			setState(53);
			match(ID);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(54);
				match(ASSIGN);
				setState(55);
				expr(0);
				}
			}

			setState(58);
			match(SEMI);
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStatContext extends StatContext {
		public TerminalNode IF() { return getToken(LanguageParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(LanguageParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(LanguageParser.RPAR, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(LanguageParser.ELSE, 0); }
		public IfStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStatContext extends StatContext {
		public TerminalNode LCURLY() { return getToken(LanguageParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(LanguageParser.RCURLY, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBlockStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBlockStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitBlockStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclStatContext extends StatContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public DeclStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterDeclStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitDeclStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitDeclStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignStatContext extends StatContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(LanguageParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(LanguageParser.SEMI, 0); }
		public AssignStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterAssignStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitAssignStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitAssignStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStatContext extends StatContext {
		public TerminalNode WHILE() { return getToken(LanguageParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(LanguageParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(LanguageParser.RPAR, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public WhileStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterWhileStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitWhileStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitWhileStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stat);
		int _la;
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case INT:
			case VOID:
				_localctx = new DeclStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				varDeclaration();
				}
				break;
			case ID:
				_localctx = new AssignStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(ID);
				setState(62);
				match(ASSIGN);
				setState(63);
				expr(0);
				setState(64);
				match(SEMI);
				}
				break;
			case IF:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				match(IF);
				setState(67);
				match(LPAR);
				setState(68);
				expr(0);
				setState(69);
				match(RPAR);
				setState(70);
				stat();
				setState(73);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(71);
					match(ELSE);
					setState(72);
					stat();
					}
					break;
				}
				}
				break;
			case WHILE:
				_localctx = new WhileStatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				match(WHILE);
				setState(76);
				match(LPAR);
				setState(77);
				expr(0);
				setState(78);
				match(RPAR);
				setState(79);
				stat();
				}
				break;
			case LCURLY:
				_localctx = new BlockStatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				match(LCURLY);
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LCURLY) | (1L << BOOL) | (1L << INT) | (1L << VOID) | (1L << WHILE) | (1L << IF) | (1L << ID))) != 0)) {
					{
					{
					setState(82);
					stat();
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(88);
				match(RCURLY);
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
	public static class ParExprContext extends ExprContext {
		public TerminalNode LPAR() { return getToken(LanguageParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(LanguageParser.RPAR, 0); }
		public ParExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitParExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitParExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExprContext extends ExprContext {
		public TerminalNode NOT() { return getToken(LanguageParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(LanguageParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LanguageParser.MINUS, 0); }
		public AddExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(LanguageParser.LT, 0); }
		public TerminalNode GT() { return getToken(LanguageParser.GT, 0); }
		public TerminalNode EQ() { return getToken(LanguageParser.EQ, 0); }
		public TerminalNode NE() { return getToken(LanguageParser.NE, 0); }
		public TerminalNode LE() { return getToken(LanguageParser.LE, 0); }
		public TerminalNode GE() { return getToken(LanguageParser.GE, 0); }
		public CompExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitCompExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitCompExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(LanguageParser.OR, 0); }
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusExprContext extends ExprContext {
		public TerminalNode MINUS() { return getToken(LanguageParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MinusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitMinusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitMinusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(LanguageParser.TIMES, 0); }
		public MultExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterMultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitMultExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitMultExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumExprContext extends ExprContext {
		public TerminalNode NUM() { return getToken(LanguageParser.NUM, 0); }
		public NumExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterNumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitNumExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitNumExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstExprContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(LanguageParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LanguageParser.FALSE, 0); }
		public ConstExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterConstExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitConstExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitConstExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(LanguageParser.AND, 0); }
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitAndExpr(this);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(92);
				match(NOT);
				setState(93);
				expr(11);
				}
				break;
			case MINUS:
				{
				_localctx = new MinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(94);
				match(MINUS);
				setState(95);
				expr(10);
				}
				break;
			case LPAR:
				{
				_localctx = new ParExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				match(LPAR);
				setState(97);
				expr(0);
				setState(98);
				match(RPAR);
				}
				break;
			case TRUE:
			case FALSE:
				{
				_localctx = new ConstExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case NUM:
				{
				_localctx = new NumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				match(NUM);
				}
				break;
			case ID:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(120);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(105);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(106);
						_la = _input.LA(1);
						if ( !(_la==MINUS || _la==PLUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(107);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new MultExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(108);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(109);
						match(TIMES);
						setState(110);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new CompExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(111);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(112);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << GE) | (1L << GT) | (1L << LE) | (1L << LT) | (1L << NE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(113);
						expr(8);
						}
						break;
					case 4:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(114);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(115);
						match(AND);
						setState(116);
						expr(7);
						}
						break;
					case 5:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(117);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(118);
						match(OR);
						setState(119);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleanTypeContext extends TypeContext {
		public TerminalNode BOOL() { return getToken(LanguageParser.BOOL, 0); }
		public BooleanTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBooleanType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitBooleanType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerTypeContext extends TypeContext {
		public TerminalNode INT() { return getToken(LanguageParser.INT, 0); }
		public IntegerTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterIntegerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitIntegerType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitIntegerType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VoidTypeContext extends TypeContext {
		public TerminalNode VOID() { return getToken(LanguageParser.VOID, 0); }
		public VoidTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterVoidType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitVoidType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitVoidType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntegerTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(INT);
				}
				break;
			case BOOL:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(BOOL);
				}
				break;
			case VOID:
				_localctx = new VoidTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				match(VOID);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u0085\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\3\5\3!\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\6\4(\n\4\r\4\16\4)\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5\63\n\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\5\6;\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7L\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7V\n\7"+
		"\f\7\16\7Y\13\7\3\7\5\7\\\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\bj\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\7\b{\n\b\f\b\16\b~\13\b\3\t\3\t\3\t\5\t\u0083\n\t\3\t\2\3\16"+
		"\n\2\4\6\b\n\f\16\20\2\5\3\2\35\36\4\2\17\17\22\22\3\2\3\b\2\u0093\2\22"+
		"\3\2\2\2\4\34\3\2\2\2\6\"\3\2\2\2\b-\3\2\2\2\n\66\3\2\2\2\f[\3\2\2\2\16"+
		"i\3\2\2\2\20\u0082\3\2\2\2\22\23\7#\2\2\23\24\7&\2\2\24\25\7\t\2\2\25"+
		"\26\5\4\3\2\26\27\7\n\2\2\27\30\7\2\2\3\30\3\3\2\2\2\31\33\5\b\5\2\32"+
		"\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35 \3\2\2\2\36\34"+
		"\3\2\2\2\37!\5\6\4\2 \37\3\2\2\2 !\3\2\2\2!\5\3\2\2\2\"#\7 \2\2#$\7\13"+
		"\2\2$%\7\f\2\2%\'\7\t\2\2&(\5\f\7\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*"+
		"\3\2\2\2*+\3\2\2\2+,\7\n\2\2,\7\3\2\2\2-.\7$\2\2./\5\20\t\2/\62\7&\2\2"+
		"\60\61\7\24\2\2\61\63\5\16\b\2\62\60\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2"+
		"\2\64\65\7\26\2\2\65\t\3\2\2\2\66\67\5\20\t\2\67:\7&\2\289\7\24\2\29;"+
		"\5\16\b\2:8\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\7\26\2\2=\13\3\2\2\2>\\\5\n"+
		"\6\2?@\7&\2\2@A\7\24\2\2AB\5\16\b\2BC\7\26\2\2C\\\3\2\2\2DE\7\33\2\2E"+
		"F\7\13\2\2FG\5\16\b\2GH\7\f\2\2HK\5\f\7\2IJ\7\34\2\2JL\5\f\7\2KI\3\2\2"+
		"\2KL\3\2\2\2L\\\3\2\2\2MN\7\32\2\2NO\7\13\2\2OP\5\16\b\2PQ\7\f\2\2QR\5"+
		"\f\7\2R\\\3\2\2\2SW\7\t\2\2TV\5\f\7\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX"+
		"\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z\\\7\n\2\2[>\3\2\2\2[?\3\2\2\2[D\3\2\2\2"+
		"[M\3\2\2\2[S\3\2\2\2\\\r\3\2\2\2]^\b\b\1\2^_\7\20\2\2_j\5\16\b\r`a\7\17"+
		"\2\2aj\5\16\b\fbc\7\13\2\2cd\5\16\b\2de\7\f\2\2ej\3\2\2\2fj\t\2\2\2gj"+
		"\7%\2\2hj\7&\2\2i]\3\2\2\2i`\3\2\2\2ib\3\2\2\2if\3\2\2\2ig\3\2\2\2ih\3"+
		"\2\2\2j|\3\2\2\2kl\f\13\2\2lm\t\3\2\2m{\5\16\b\fno\f\n\2\2op\7\25\2\2"+
		"p{\5\16\b\13qr\f\t\2\2rs\t\4\2\2s{\5\16\b\ntu\f\b\2\2uv\7\23\2\2v{\5\16"+
		"\b\twx\f\7\2\2xy\7\21\2\2y{\5\16\b\bzk\3\2\2\2zn\3\2\2\2zq\3\2\2\2zt\3"+
		"\2\2\2zw\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\17\3\2\2\2~|\3\2\2\2\177"+
		"\u0083\7\30\2\2\u0080\u0083\7\27\2\2\u0081\u0083\7\31\2\2\u0082\177\3"+
		"\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\21\3\2\2\2\16\34"+
		" )\62:KW[iz|\u0082";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}