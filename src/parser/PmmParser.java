// Generated from src/parser/Pmm.g4 by ANTLR 4.7
package parser;

import ast.*;
import ast.Definition.*;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;




import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, TRASH=40, INT_CONSTANT=41, COMMENT=42, MULTI_COMMENT=43, REAL_CONSTANT=44, 
		CHAR_CONSTANT=45, ID=46;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_funcionDefinition = 2, RULE_structDefinition = 3, 
		RULE_varDefinition = 4, RULE_statement = 5, RULE_expression = 6, RULE_ifStat = 7, 
		RULE_whileStat = 8, RULE_simpleType = 9;
	public static final String[] ruleNames = {
		"program", "main", "funcionDefinition", "structDefinition", "varDefinition", 
		"statement", "expression", "ifStat", "whileStat", "simpleType"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'def main'", "'():'", "'{'", "'}'", "'def'", "'('", "','", 
		"'):'", "':'", "'struct'", "'['", "']'", "'='", "'print'", "'input'", 
		"')'", "'return '", "'.'", "'-'", "'!'", "'*'", "'/'", "'%'", "'+'", "'<'", 
		"'<='", "'>'", "'>='", "'=='", "'!='", "'||'", "'&&'", "'if '", "'else '", 
		"'while '", "'int'", "'double'", "'char'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "TRASH", "INT_CONSTANT", "COMMENT", "MULTI_COMMENT", 
		"REAL_CONSTANT", "CHAR_CONSTANT", "ID"
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
	public String getGrammarFileName() { return "Pmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PmmParser.EOF, 0); }
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public List<FuncionDefinitionContext> funcionDefinition() {
			return getRuleContexts(FuncionDefinitionContext.class);
		}
		public FuncionDefinitionContext funcionDefinition(int i) {
			return getRuleContext(FuncionDefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(20);
				varDefinition();
				setState(21);
				match(T__0);
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(28);
				funcionDefinition();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			main();
			setState(35);
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

	public static class MainContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__1);
			setState(38);
			match(T__2);
			setState(39);
			match(T__3);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__33) | (1L << T__35) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
				{
				{
				setState(40);
				statement();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(46);
			match(T__4);
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

	public static class FuncionDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FuncionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionDefinition; }
	}

	public final FuncionDefinitionContext funcionDefinition() throws RecognitionException {
		FuncionDefinitionContext _localctx = new FuncionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcionDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__5);
			setState(49);
			match(ID);
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				{
				setState(50);
				match(T__6);
				{
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(51);
					varDefinition();
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(52);
						match(T__7);
						{
						setState(53);
						varDefinition();
						}
						}
						}
						setState(58);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				setState(61);
				match(T__8);
				}
				}
				break;
			case T__2:
				{
				{
				setState(62);
				match(T__2);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) {
				{
				setState(65);
				simpleType();
				}
			}

			setState(68);
			match(T__3);
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(69);
					varDefinition();
					setState(70);
					match(T__0);
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__33) | (1L << T__35) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
				{
				{
				setState(77);
				statement();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			match(T__4);
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

	public static class StructDefinitionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public List<SimpleTypeContext> simpleType() {
			return getRuleContexts(SimpleTypeContext.class);
		}
		public SimpleTypeContext simpleType(int i) {
			return getRuleContext(SimpleTypeContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StructDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefinition; }
	}

	public final StructDefinitionContext structDefinition() throws RecognitionException {
		StructDefinitionContext _localctx = new StructDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_structDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(ID);
			setState(86);
			match(T__9);
			setState(87);
			match(T__10);
			setState(88);
			match(T__3);
			{
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(89);
				match(ID);
				setState(90);
				match(T__9);
				{
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(91);
					match(T__11);
					setState(92);
					expression(0);
					setState(93);
					match(T__12);
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(100);
				simpleType();
				setState(101);
				match(T__0);
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(108);
			match(T__4);
			setState(109);
			match(T__0);
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

	public static class VarDefinitionContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();
		public Token newid;
		public Token newid2;
		public Token size;
		public SimpleTypeContext simpleType;
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public List<TerminalNode> INT_CONSTANT() { return getTokens(PmmParser.INT_CONSTANT); }
		public TerminalNode INT_CONSTANT(int i) {
			return getToken(PmmParser.INT_CONSTANT, i);
		}
		public VarDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinition; }
	}

	public final VarDefinitionContext varDefinition() throws RecognitionException {
		VarDefinitionContext _localctx = new VarDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			((VarDefinitionContext)_localctx).newid = match(ID);

			 
			 ast.add(new VarDefinition(((VarDefinitionContext)_localctx).newid.GetLine(),((VarDefinitionContext)_localctx).newid.GetColumn(), (((VarDefinitionContext)_localctx).newid!=null?((VarDefinitionContext)_localctx).newid.getText():null)));
			 
			 
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(113);
				match(T__7);
				setState(114);
				((VarDefinitionContext)_localctx).newid2 = match(ID);

				 
				 ast.add(new VarDefinition(((VarDefinitionContext)_localctx).newid2.GetLine(),((VarDefinitionContext)_localctx).newid2.GetColumn(), (((VarDefinitionContext)_localctx).newid2!=null?((VarDefinitionContext)_localctx).newid2.getText():null)));
				 
				 
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			match(T__9);

				ArrayList<Integer> dimensions = new ArrayList<Integer>();


			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(123);
				match(T__11);
				setState(124);
				((VarDefinitionContext)_localctx).size = match(INT_CONSTANT);

				dimensions.add(LeserHelper.lexemeToInt((((VarDefinitionContext)_localctx).INT_CONSTANT!=null?((VarDefinitionContext)_localctx).INT_CONSTANT.getText():null))););

				setState(126);
				match(T__12);
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(132);
			((VarDefinitionContext)_localctx).simpleType = simpleType();


			Type Front = null;
			Type Final= null;

			if((((VarDefinitionContext)_localctx).simpleType!=null?_input.getText(((VarDefinitionContext)_localctx).simpleType.start,((VarDefinitionContext)_localctx).simpleType.stop):null)=="int" ){ Front = new IntType(); }
			if((((VarDefinitionContext)_localctx).simpleType!=null?_input.getText(((VarDefinitionContext)_localctx).simpleType.start,((VarDefinitionContext)_localctx).simpleType.stop):null)=="double" ){ Front  = new DoubleType(); }
			if((((VarDefinitionContext)_localctx).simpleType!=null?_input.getText(((VarDefinitionContext)_localctx).simpleType.start,((VarDefinitionContext)_localctx).simpleType.stop):null)=="char" ){ Front  = new CharType(); }
				
			if(!dimensions.isEmpty()){

			Final=new ArrayType();

			ArrayType current=Final;

			for(int i=0;i< dimensions.size();i++){

			current.setSize(dimensions.get(i));
			if(i+1<dimensions.size()){
			ArrayType temp=new ArrayType();
			current.setType(temp);
			current=temp;
			}
			}
			current.setType(Front);

			}else{
			Final=Front;
			}	
			foreach(varDefinition a:ast){
			a.setType(Final);
			}

			 new FuncionInvocation(((VarDefinitionContext)_localctx).ID.getLine(), ((VarDefinitionContext)_localctx).ID.getCharPositionInLine()+1,expr, ((VarDefinitionContext)_localctx).ID );
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

	public static class StatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
		}
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public WhileStatContext whileStat() {
			return getRuleContext(WhileStatContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		int _la;
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				expression(0);
				setState(137);
				match(T__13);
				setState(138);
				expression(0);
				setState(139);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(T__14);
				setState(142);
				expression(0);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(143);
					match(T__7);
					setState(144);
					expression(0);
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(150);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				match(T__15);
				setState(153);
				expression(0);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(154);
					match(T__7);
					setState(155);
					expression(0);
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(161);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				structDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				match(ID);
				setState(165);
				match(T__6);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
					{
					setState(166);
					expression(0);
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(167);
						match(T__7);
						setState(168);
						expression(0);
						}
						}
						setState(173);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(176);
				match(T__16);
				setState(177);
				match(T__0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(178);
				ifStat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(179);
				whileStat();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(180);
				match(T__17);
				setState(181);
				expression(0);
				setState(182);
				match(T__0);
				}
				break;
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext e1;
		public Token ID;
		public ExpressionContext eplus;
		public ExpressionContext e2;
		public SimpleTypeContext t;
		public SimpleTypeContext simpleType;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token o;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(PmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(PmmParser.CHAR_CONSTANT, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(187);
				((ExpressionContext)_localctx).ID = match(ID);

				List<Expression> expr = new ArrayList<Expression>();
				setState(189);
				match(T__6);
				{
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
					{
					setState(190);
					((ExpressionContext)_localctx).e1 = expression(0);
					expr.add(((ExpressionContext)_localctx).e1.ast);
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(192);
						match(T__7);
						{
						setState(193);
						((ExpressionContext)_localctx).eplus = expression(0);
						expr.add(((ExpressionContext)_localctx).eplus.ast);
						}
						}
						}
						setState(200);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				setState(203);
				match(T__16);
				((ExpressionContext)_localctx).ast =  new FuncionInvocation(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,expr, ((ExpressionContext)_localctx).ID );
				}
				break;
			case 2:
				{
				setState(205);
				match(T__6);
				setState(206);
				expression(0);
				setState(207);
				match(T__16);
				}
				break;
			case 3:
				{
				setState(209);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(210);
				match(T__11);
				setState(211);
				((ExpressionContext)_localctx).e1 = expression(0);
				setState(212);
				match(T__12);
				{
				setState(217);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(213);
					match(T__11);
					setState(214);
					((ExpressionContext)_localctx).e2 = expression(0);
					setState(215);
					match(T__12);
					}
					break;
				}
				}
				((ExpressionContext)_localctx).ast =  new ArrayInvocation(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast );
				}
				break;
			case 4:
				{
				setState(221);
				match(T__6);
				setState(222);
				((ExpressionContext)_localctx).t = ((ExpressionContext)_localctx).simpleType = simpleType();
				setState(223);
				match(T__16);
				setState(224);
				((ExpressionContext)_localctx).e1 = expression(12);

					if((((ExpressionContext)_localctx).simpleType!=null?_input.getText(((ExpressionContext)_localctx).simpleType.start,((ExpressionContext)_localctx).simpleType.stop):null)=="int" ){((ExpressionContext)_localctx).ast =  new Cast((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast,new IntType() ); }
					if((((ExpressionContext)_localctx).simpleType!=null?_input.getText(((ExpressionContext)_localctx).simpleType.start,((ExpressionContext)_localctx).simpleType.stop):null)=="double" ){((ExpressionContext)_localctx).ast =  new Cast((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast,new DoubleType()); }
					if((((ExpressionContext)_localctx).simpleType!=null?_input.getText(((ExpressionContext)_localctx).simpleType.start,((ExpressionContext)_localctx).simpleType.stop):null)=="char" ){((ExpressionContext)_localctx).ast =  new Cast((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast,new CharType() ); }
					
					
					
				}
				break;
			case 5:
				{
				setState(227);
				match(T__19);
				setState(228);
				((ExpressionContext)_localctx).e1 = expression(11);
				((ExpressionContext)_localctx).ast =  new UnaryMinus((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast );
				}
				break;
			case 6:
				{
				setState(231);
				match(T__20);
				setState(232);
				((ExpressionContext)_localctx).e1 = expression(10);
				((ExpressionContext)_localctx).ast =  new UnaryNot((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast );
				}
				break;
			case 7:
				{
				setState(235);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntConstant(((ExpressionContext)_localctx).INT_CONSTANT.getLine(), ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1, LeserHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)));
				}
				break;
			case 8:
				{
				setState(237);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new DoubleConstant(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(), ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1, LeserHelper.lexemeToDouble((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)));
				}
				break;
			case 9:
				{
				setState(239);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharConstant(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(), ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1, LeserHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)));
				}
				break;
			case 10:
				{
				setState(241);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(273);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(245);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(246);
						match(T__18);
						setState(247);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(248);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(249);
						((ExpressionContext)_localctx).o = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
							((ExpressionContext)_localctx).o = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(250);
						((ExpressionContext)_localctx).e2 = expression(10);
						((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(),((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast,(((ExpressionContext)_localctx).o!=null?((ExpressionContext)_localctx).o.getText():null)  );
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(253);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(254);
						((ExpressionContext)_localctx).o = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__24) ) {
							((ExpressionContext)_localctx).o = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(255);
						((ExpressionContext)_localctx).e2 = expression(9);
						((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(),((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast,(((ExpressionContext)_localctx).o!=null?((ExpressionContext)_localctx).o.getText():null)  );
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(258);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(259);
						((ExpressionContext)_localctx).o = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) ) {
							((ExpressionContext)_localctx).o = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(260);
						((ExpressionContext)_localctx).e2 = expression(8);
						((ExpressionContext)_localctx).ast =  new Comparation(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(),((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast,(((ExpressionContext)_localctx).o!=null?((ExpressionContext)_localctx).o.getText():null)  );
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(263);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(264);
						((ExpressionContext)_localctx).o = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__31 || _la==T__32) ) {
							((ExpressionContext)_localctx).o = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(265);
						((ExpressionContext)_localctx).e2 = expression(7);
						((ExpressionContext)_localctx).ast =  new Logical(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(),((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast,(((ExpressionContext)_localctx).o!=null?((ExpressionContext)_localctx).o.getText():null)  );
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(268);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						{
						setState(269);
						match(T__13);
						}
						setState(270);
						((ExpressionContext)_localctx).e2 = expression(6);
						((ExpressionContext)_localctx).ast =  new Asigment(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(),((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					}
					} 
				}
				setState(277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class IfStatContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(T__33);
			setState(279);
			expression(0);
			setState(280);
			match(T__9);
			{
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				{
				setState(281);
				match(T__3);
				setState(282);
				statement();
				setState(284); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(283);
					statement();
					}
					}
					setState(286); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__33) | (1L << T__35) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0) );
				setState(288);
				match(T__4);
				}
				}
				break;
			case T__6:
			case T__14:
			case T__15:
			case T__17:
			case T__19:
			case T__20:
			case T__33:
			case T__35:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case ID:
				{
				{
				setState(290);
				statement();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(293);
				match(T__34);
				setState(304);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
					{
					{
					setState(294);
					match(T__3);
					setState(295);
					statement();
					setState(297); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(296);
						statement();
						}
						}
						setState(299); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__33) | (1L << T__35) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0) );
					setState(301);
					match(T__4);
					}
					}
					break;
				case T__6:
				case T__14:
				case T__15:
				case T__17:
				case T__19:
				case T__20:
				case T__33:
				case T__35:
				case INT_CONSTANT:
				case REAL_CONSTANT:
				case CHAR_CONSTANT:
				case ID:
					{
					{
					setState(303);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
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

	public static class WhileStatContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStat; }
	}

	public final WhileStatContext whileStat() throws RecognitionException {
		WhileStatContext _localctx = new WhileStatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whileStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(T__35);
			setState(309);
			expression(0);
			setState(310);
			match(T__9);
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				{
				setState(311);
				match(T__3);
				setState(312);
				statement();
				setState(314); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(313);
					statement();
					}
					}
					setState(316); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__33) | (1L << T__35) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0) );
				setState(318);
				match(T__4);
				}
				}
				break;
			case 2:
				{
				{
				setState(320);
				statement();
				}
				}
				break;
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

	public static class SimpleTypeContext extends ParserRuleContext {
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_simpleType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0148\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\7\2 \n\2\f\2\16\2#\13"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3,\n\3\f\3\16\3/\13\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\7\49\n\4\f\4\16\4<\13\4\5\4>\n\4\3\4\3\4\5\4B\n\4\3\4"+
		"\5\4E\n\4\3\4\3\4\3\4\3\4\7\4K\n\4\f\4\16\4N\13\4\3\4\7\4Q\n\4\f\4\16"+
		"\4T\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5b\n\5\f\5"+
		"\16\5e\13\5\3\5\3\5\3\5\7\5j\n\5\f\5\16\5m\13\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\7\6w\n\6\f\6\16\6z\13\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0082\n"+
		"\6\f\6\16\6\u0085\13\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\7\7\u0094\n\7\f\7\16\7\u0097\13\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u009f"+
		"\n\7\f\7\16\7\u00a2\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00ac\n\7"+
		"\f\7\16\7\u00af\13\7\5\7\u00b1\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u00bb\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00c7\n\b\f\b\16"+
		"\b\u00ca\13\b\5\b\u00cc\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u00dc\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00f6\n\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0114\n\b\f\b\16\b\u0117"+
		"\13\b\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u011f\n\t\r\t\16\t\u0120\3\t\3\t\3\t"+
		"\5\t\u0126\n\t\3\t\3\t\3\t\3\t\6\t\u012c\n\t\r\t\16\t\u012d\3\t\3\t\3"+
		"\t\5\t\u0133\n\t\5\t\u0135\n\t\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u013d\n\n\r"+
		"\n\16\n\u013e\3\n\3\n\3\n\5\n\u0144\n\n\3\13\3\13\3\13\2\3\16\f\2\4\6"+
		"\b\n\f\16\20\22\24\2\7\3\2\30\32\4\2\26\26\33\33\3\2\34!\3\2\"#\3\2\'"+
		")\2\u016f\2\33\3\2\2\2\4\'\3\2\2\2\6\62\3\2\2\2\bW\3\2\2\2\nq\3\2\2\2"+
		"\f\u00ba\3\2\2\2\16\u00f5\3\2\2\2\20\u0118\3\2\2\2\22\u0136\3\2\2\2\24"+
		"\u0145\3\2\2\2\26\27\5\n\6\2\27\30\7\3\2\2\30\32\3\2\2\2\31\26\3\2\2\2"+
		"\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34!\3\2\2\2\35\33\3\2\2\2\36"+
		" \5\6\4\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!"+
		"\3\2\2\2$%\5\4\3\2%&\7\2\2\3&\3\3\2\2\2\'(\7\4\2\2()\7\5\2\2)-\7\6\2\2"+
		"*,\5\f\7\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2"+
		"\2\60\61\7\7\2\2\61\5\3\2\2\2\62\63\7\b\2\2\63A\7\60\2\2\64=\7\t\2\2\65"+
		":\5\n\6\2\66\67\7\n\2\2\679\5\n\6\28\66\3\2\2\29<\3\2\2\2:8\3\2\2\2:;"+
		"\3\2\2\2;>\3\2\2\2<:\3\2\2\2=\65\3\2\2\2=>\3\2\2\2>?\3\2\2\2?B\7\13\2"+
		"\2@B\7\5\2\2A\64\3\2\2\2A@\3\2\2\2BD\3\2\2\2CE\5\24\13\2DC\3\2\2\2DE\3"+
		"\2\2\2EF\3\2\2\2FL\7\6\2\2GH\5\n\6\2HI\7\3\2\2IK\3\2\2\2JG\3\2\2\2KN\3"+
		"\2\2\2LJ\3\2\2\2LM\3\2\2\2MR\3\2\2\2NL\3\2\2\2OQ\5\f\7\2PO\3\2\2\2QT\3"+
		"\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7\7\2\2V\7\3\2\2\2WX"+
		"\7\60\2\2XY\7\f\2\2YZ\7\r\2\2Zk\7\6\2\2[\\\7\60\2\2\\c\7\f\2\2]^\7\16"+
		"\2\2^_\5\16\b\2_`\7\17\2\2`b\3\2\2\2a]\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3"+
		"\2\2\2df\3\2\2\2ec\3\2\2\2fg\5\24\13\2gh\7\3\2\2hj\3\2\2\2i[\3\2\2\2j"+
		"m\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7\7\2\2op\7\3\2\2"+
		"p\t\3\2\2\2qr\7\60\2\2rx\b\6\1\2st\7\n\2\2tu\7\60\2\2uw\b\6\1\2vs\3\2"+
		"\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7\f\2\2|\u0083"+
		"\b\6\1\2}~\7\16\2\2~\177\7+\2\2\177\u0080\b\6\1\2\u0080\u0082\7\17\2\2"+
		"\u0081}\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3"+
		"\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\5\24\13\2\u0087"+
		"\u0088\b\6\1\2\u0088\u0089\b\6\1\2\u0089\13\3\2\2\2\u008a\u008b\5\16\b"+
		"\2\u008b\u008c\7\20\2\2\u008c\u008d\5\16\b\2\u008d\u008e\7\3\2\2\u008e"+
		"\u00bb\3\2\2\2\u008f\u0090\7\21\2\2\u0090\u0095\5\16\b\2\u0091\u0092\7"+
		"\n\2\2\u0092\u0094\5\16\b\2\u0093\u0091\3\2\2\2\u0094\u0097\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0098\u0099\7\3\2\2\u0099\u00bb\3\2\2\2\u009a\u009b\7\22\2\2\u009b"+
		"\u00a0\5\16\b\2\u009c\u009d\7\n\2\2\u009d\u009f\5\16\b\2\u009e\u009c\3"+
		"\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7\3\2\2\u00a4\u00bb\3\2"+
		"\2\2\u00a5\u00bb\5\b\5\2\u00a6\u00a7\7\60\2\2\u00a7\u00b0\7\t\2\2\u00a8"+
		"\u00ad\5\16\b\2\u00a9\u00aa\7\n\2\2\u00aa\u00ac\5\16\b\2\u00ab\u00a9\3"+
		"\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00a8\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\7\23\2\2\u00b3\u00bb\7\3\2\2\u00b4"+
		"\u00bb\5\20\t\2\u00b5\u00bb\5\22\n\2\u00b6\u00b7\7\24\2\2\u00b7\u00b8"+
		"\5\16\b\2\u00b8\u00b9\7\3\2\2\u00b9\u00bb\3\2\2\2\u00ba\u008a\3\2\2\2"+
		"\u00ba\u008f\3\2\2\2\u00ba\u009a\3\2\2\2\u00ba\u00a5\3\2\2\2\u00ba\u00a6"+
		"\3\2\2\2\u00ba\u00b4\3\2\2\2\u00ba\u00b5\3\2\2\2\u00ba\u00b6\3\2\2\2\u00bb"+
		"\r\3\2\2\2\u00bc\u00bd\b\b\1\2\u00bd\u00be\7\60\2\2\u00be\u00bf\b\b\1"+
		"\2\u00bf\u00cb\7\t\2\2\u00c0\u00c1\5\16\b\2\u00c1\u00c8\b\b\1\2\u00c2"+
		"\u00c3\7\n\2\2\u00c3\u00c4\5\16\b\2\u00c4\u00c5\b\b\1\2\u00c5\u00c7\3"+
		"\2\2\2\u00c6\u00c2\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00c0\3\2"+
		"\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\7\23\2\2\u00ce"+
		"\u00f6\b\b\1\2\u00cf\u00d0\7\t\2\2\u00d0\u00d1\5\16\b\2\u00d1\u00d2\7"+
		"\23\2\2\u00d2\u00f6\3\2\2\2\u00d3\u00d4\7\60\2\2\u00d4\u00d5\7\16\2\2"+
		"\u00d5\u00d6\5\16\b\2\u00d6\u00db\7\17\2\2\u00d7\u00d8\7\16\2\2\u00d8"+
		"\u00d9\5\16\b\2\u00d9\u00da\7\17\2\2\u00da\u00dc\3\2\2\2\u00db\u00d7\3"+
		"\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\b\b\1\2\u00de"+
		"\u00f6\3\2\2\2\u00df\u00e0\7\t\2\2\u00e0\u00e1\5\24\13\2\u00e1\u00e2\7"+
		"\23\2\2\u00e2\u00e3\5\16\b\16\u00e3\u00e4\b\b\1\2\u00e4\u00f6\3\2\2\2"+
		"\u00e5\u00e6\7\26\2\2\u00e6\u00e7\5\16\b\r\u00e7\u00e8\b\b\1\2\u00e8\u00f6"+
		"\3\2\2\2\u00e9\u00ea\7\27\2\2\u00ea\u00eb\5\16\b\f\u00eb\u00ec\b\b\1\2"+
		"\u00ec\u00f6\3\2\2\2\u00ed\u00ee\7+\2\2\u00ee\u00f6\b\b\1\2\u00ef\u00f0"+
		"\7.\2\2\u00f0\u00f6\b\b\1\2\u00f1\u00f2\7/\2\2\u00f2\u00f6\b\b\1\2\u00f3"+
		"\u00f4\7\60\2\2\u00f4\u00f6\b\b\1\2\u00f5\u00bc\3\2\2\2\u00f5\u00cf\3"+
		"\2\2\2\u00f5\u00d3\3\2\2\2\u00f5\u00df\3\2\2\2\u00f5\u00e5\3\2\2\2\u00f5"+
		"\u00e9\3\2\2\2\u00f5\u00ed\3\2\2\2\u00f5\u00ef\3\2\2\2\u00f5\u00f1\3\2"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f6\u0115\3\2\2\2\u00f7\u00f8\f\17\2\2\u00f8"+
		"\u00f9\7\25\2\2\u00f9\u0114\5\16\b\20\u00fa\u00fb\f\13\2\2\u00fb\u00fc"+
		"\t\2\2\2\u00fc\u00fd\5\16\b\f\u00fd\u00fe\b\b\1\2\u00fe\u0114\3\2\2\2"+
		"\u00ff\u0100\f\n\2\2\u0100\u0101\t\3\2\2\u0101\u0102\5\16\b\13\u0102\u0103"+
		"\b\b\1\2\u0103\u0114\3\2\2\2\u0104\u0105\f\t\2\2\u0105\u0106\t\4\2\2\u0106"+
		"\u0107\5\16\b\n\u0107\u0108\b\b\1\2\u0108\u0114\3\2\2\2\u0109\u010a\f"+
		"\b\2\2\u010a\u010b\t\5\2\2\u010b\u010c\5\16\b\t\u010c\u010d\b\b\1\2\u010d"+
		"\u0114\3\2\2\2\u010e\u010f\f\7\2\2\u010f\u0110\7\20\2\2\u0110\u0111\5"+
		"\16\b\b\u0111\u0112\b\b\1\2\u0112\u0114\3\2\2\2\u0113\u00f7\3\2\2\2\u0113"+
		"\u00fa\3\2\2\2\u0113\u00ff\3\2\2\2\u0113\u0104\3\2\2\2\u0113\u0109\3\2"+
		"\2\2\u0113\u010e\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\17\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\7$\2\2"+
		"\u0119\u011a\5\16\b\2\u011a\u0125\7\f\2\2\u011b\u011c\7\6\2\2\u011c\u011e"+
		"\5\f\7\2\u011d\u011f\5\f\7\2\u011e\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\7\7"+
		"\2\2\u0123\u0126\3\2\2\2\u0124\u0126\5\f\7\2\u0125\u011b\3\2\2\2\u0125"+
		"\u0124\3\2\2\2\u0126\u0134\3\2\2\2\u0127\u0132\7%\2\2\u0128\u0129\7\6"+
		"\2\2\u0129\u012b\5\f\7\2\u012a\u012c\5\f\7\2\u012b\u012a\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\u0130\7\7\2\2\u0130\u0133\3\2\2\2\u0131\u0133\5\f\7\2\u0132"+
		"\u0128\3\2\2\2\u0132\u0131\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0127\3\2"+
		"\2\2\u0134\u0135\3\2\2\2\u0135\21\3\2\2\2\u0136\u0137\7&\2\2\u0137\u0138"+
		"\5\16\b\2\u0138\u0143\7\f\2\2\u0139\u013a\7\6\2\2\u013a\u013c\5\f\7\2"+
		"\u013b\u013d\5\f\7\2\u013c\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013c"+
		"\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\7\7\2\2\u0141"+
		"\u0144\3\2\2\2\u0142\u0144\5\f\7\2\u0143\u0139\3\2\2\2\u0143\u0142\3\2"+
		"\2\2\u0143\u0144\3\2\2\2\u0144\23\3\2\2\2\u0145\u0146\t\6\2\2\u0146\25"+
		"\3\2\2\2!\33!-:=ADLRckx\u0083\u0095\u00a0\u00ad\u00b0\u00ba\u00c8\u00cb"+
		"\u00db\u00f5\u0113\u0115\u0120\u0125\u012d\u0132\u0134\u013e\u0143";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}