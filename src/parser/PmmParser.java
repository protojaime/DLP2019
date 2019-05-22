// Generated from src/parser/Pmm.g4 by ANTLR 4.7
package parser;

import ast.*;
import ast.Definition.*;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;
import parser.LexerHelper;

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
		TRASH=39, INT_CONSTANT=40, COMMENT=41, MULTI_COMMENT=42, REAL_CONSTANT=43, 
		CHAR_CONSTANT=44, ID=45;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_funcionDefinition = 2, RULE_varDefinitionStat = 3, 
		RULE_complexType = 4, RULE_structTypeDefinition = 5, RULE_varDefinition = 6, 
		RULE_expression = 7, RULE_statement = 8, RULE_simpleType = 9;
	public static final String[] ruleNames = {
		"program", "main", "funcionDefinition", "varDefinitionStat", "complexType", 
		"structTypeDefinition", "varDefinition", "expression", "statement", "simpleType"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'def main'", "'():'", "'{'", "'}'", "'def'", "'('", "','", 
		"')'", "':'", "'struct'", "'['", "']'", "'.'", "'-'", "'!'", "'*'", "'/'", 
		"'%'", "'+'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'||'", "'&&'", 
		"'='", "'print'", "'input'", "'if'", "'else'", "'while'", "'return'", 
		"'int'", "'double'", "'char'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "TRASH", "INT_CONSTANT", "COMMENT", "MULTI_COMMENT", 
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
		public VarDefinitionContext v2;
		public FuncionDefinitionContext f;
		public MainContext m;
		public TerminalNode EOF() { return getToken(PmmParser.EOF, 0); }
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
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

				ArrayList<Definition> Defs = new ArrayList<Definition>();
				
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==ID) {
				{
				setState(28);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(21);
					((ProgramContext)_localctx).v2 = varDefinition();
					setState(22);
					match(T__0);

						for(VarDefinition s :((ProgramContext)_localctx).v2.ast){
						Defs.add((Definition)s);
						}
							
					}
					break;
				case T__5:
					{
					setState(25);
					((ProgramContext)_localctx).f = funcionDefinition();

						Defs.add((Definition)((ProgramContext)_localctx).f.ast);
						
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
			((ProgramContext)_localctx).m = main();

				Defs.add((Definition)((ProgramContext)_localctx).m.ast);
				((ProgramContext)_localctx).ast =  new Program(0, 0, Defs);
				
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
		public FuncionDefinition ast;
		public Token d;
		public VarDefinitionStatContext v;
		public StatementContext s;
		public List<VarDefinitionStatContext> varDefinitionStat() {
			return getRuleContexts(VarDefinitionStatContext.class);
		}
		public VarDefinitionStatContext varDefinitionStat(int i) {
			return getRuleContext(VarDefinitionStatContext.class,i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{

			ArrayList<Statement> TempStat = new ArrayList<Statement>();

			setState(38);
			((MainContext)_localctx).d = match(T__1);
			setState(39);
			match(T__2);
			setState(40);
			match(T__3);
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(41);
					((MainContext)_localctx).v = varDefinitionStat();

						for(Statement s :((MainContext)_localctx).v.ast){
						TempStat.add(s);
						}
							
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__14) | (1L << T__15) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__33) | (1L << T__34) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
				{
				{
				setState(49);
				((MainContext)_localctx).s = statement();

					TempStat.add(((MainContext)_localctx).s.ast);
					
					
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(T__4);

			FuncionType FuncType=new FuncionType(((MainContext)_localctx).d.getLine(),((MainContext)_localctx).d.getCharPositionInLine()+1,new ArrayList<VarDefinition>(),new VoidType(((MainContext)_localctx).d.getLine(),((MainContext)_localctx).d.getCharPositionInLine()+1));
				((MainContext)_localctx).ast =  new FuncionDefinition(((MainContext)_localctx).d.getLine(), ((MainContext)_localctx).d.getCharPositionInLine()+1,"main",TempStat,FuncType);

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
		public FuncionDefinition ast;
		public Token id;
		public VarDefinitionContext v1;
		public VarDefinitionContext vplus;
		public SimpleTypeContext simpleType;
		public VarDefinitionStatContext v;
		public StatementContext s;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public List<VarDefinitionStatContext> varDefinitionStat() {
			return getRuleContexts(VarDefinitionStatContext.class);
		}
		public VarDefinitionStatContext varDefinitionStat(int i) {
			return getRuleContext(VarDefinitionStatContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
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

				ArrayList<Statement> TempStat = new ArrayList<Statement>();
				ArrayList<VarDefinition> TempVarDefinition = new ArrayList<VarDefinition>();
				
				
			setState(61);
			match(T__5);
			setState(62);
			((FuncionDefinitionContext)_localctx).id = match(ID);

				Type temporalType=new VoidType(((FuncionDefinitionContext)_localctx).id.getLine(),((FuncionDefinitionContext)_localctx).id.getCharPositionInLine()+1);
				
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				{
				setState(64);
				match(T__6);
				{
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(65);
					((FuncionDefinitionContext)_localctx).v1 = varDefinition();

							TempVarDefinition.addAll(((FuncionDefinitionContext)_localctx).v1.ast);
							
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(67);
						match(T__7);
						{
						setState(68);
						((FuncionDefinitionContext)_localctx).vplus = varDefinition();

								TempVarDefinition.addAll(((FuncionDefinitionContext)_localctx).vplus.ast);
								
						}
						}
						}
						setState(75);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				setState(78);
				match(T__8);
				setState(79);
				match(T__9);
				}
				}
				break;
			case T__2:
				{
				{
				setState(80);
				match(T__2);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) {
				{
				setState(83);
				((FuncionDefinitionContext)_localctx).simpleType = simpleType();

				temporalType=((FuncionDefinitionContext)_localctx).simpleType.ast;

					
					
					
					
				}
			}

			setState(88);
			match(T__3);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(89);
					((FuncionDefinitionContext)_localctx).v = varDefinitionStat();

						for(Statement s :((FuncionDefinitionContext)_localctx).v.ast){
						TempStat.add(s);
						}
							
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__14) | (1L << T__15) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__33) | (1L << T__34) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
				{
				{
				setState(97);
				((FuncionDefinitionContext)_localctx).s = statement();

					TempStat.add(((FuncionDefinitionContext)_localctx).s.ast);
					
					
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			match(T__4);

				FuncionType FuncType=new FuncionType(((FuncionDefinitionContext)_localctx).id.getLine(),((FuncionDefinitionContext)_localctx).id.getCharPositionInLine()+1, TempVarDefinition,temporalType);
				((FuncionDefinitionContext)_localctx).ast =  new FuncionDefinition(((FuncionDefinitionContext)_localctx).id.getLine(), ((FuncionDefinitionContext)_localctx).id.getCharPositionInLine()+1, ((FuncionDefinitionContext)_localctx).id.getText(),TempStat,FuncType);
				
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

	public static class VarDefinitionStatContext extends ParserRuleContext {
		public ArrayList<Statement> ast = new ArrayList<Statement>();
		public VarDefinitionContext v2;
		public Token Sid;
		public StructTypeDefinitionContext structTypeDefinition;
		public VarDefinitionContext varDefinition() {
			return getRuleContext(VarDefinitionContext.class,0);
		}
		public StructTypeDefinitionContext structTypeDefinition() {
			return getRuleContext(StructTypeDefinitionContext.class,0);
		}
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public VarDefinitionStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinitionStat; }
	}

	public final VarDefinitionStatContext varDefinitionStat() throws RecognitionException {
		VarDefinitionStatContext _localctx = new VarDefinitionStatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDefinitionStat);
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(108);
				((VarDefinitionStatContext)_localctx).v2 = varDefinition();
				setState(109);
				match(T__0);

					for(VarDefinition s :((VarDefinitionStatContext)_localctx).v2.ast){
					_localctx.ast.add((Statement)s);
					}
					
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(112);
				((VarDefinitionStatContext)_localctx).Sid = match(ID);
				setState(113);
				match(T__9);
				setState(114);
				((VarDefinitionStatContext)_localctx).structTypeDefinition = structTypeDefinition();
					
					_localctx.ast.add((Statement)new VarDefinition(((VarDefinitionStatContext)_localctx).Sid.getLine(),((VarDefinitionStatContext)_localctx).Sid.getCharPositionInLine()+1, (((VarDefinitionStatContext)_localctx).Sid!=null?((VarDefinitionStatContext)_localctx).Sid.getText():null),((VarDefinitionStatContext)_localctx).structTypeDefinition.ast));
					
				}
				setState(117);
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

	public static class ComplexTypeContext extends ParserRuleContext {
		public Type ast;
		public StructTypeDefinitionContext structTypeDefinition;
		public SimpleTypeContext simpleType;
		public StructTypeDefinitionContext structTypeDefinition() {
			return getRuleContext(StructTypeDefinitionContext.class,0);
		}
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public ComplexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexType; }
	}

	public final ComplexTypeContext complexType() throws RecognitionException {
		ComplexTypeContext _localctx = new ComplexTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_complexType);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				((ComplexTypeContext)_localctx).structTypeDefinition = structTypeDefinition();
				((ComplexTypeContext)_localctx).ast = ((ComplexTypeContext)_localctx).structTypeDefinition.ast;
				}
				break;
			case T__35:
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(124);
				((ComplexTypeContext)_localctx).simpleType = simpleType();
				((ComplexTypeContext)_localctx).ast = ((ComplexTypeContext)_localctx).simpleType.ast;
				}
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

	public static class StructTypeDefinitionContext extends ParserRuleContext {
		public StructType ast;
		public Token a;
		public Token newid;
		public Token newid2;
		public Token size;
		public ComplexTypeContext complexType;
		public List<ComplexTypeContext> complexType() {
			return getRuleContexts(ComplexTypeContext.class);
		}
		public ComplexTypeContext complexType(int i) {
			return getRuleContext(ComplexTypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public List<TerminalNode> INT_CONSTANT() { return getTokens(PmmParser.INT_CONSTANT); }
		public TerminalNode INT_CONSTANT(int i) {
			return getToken(PmmParser.INT_CONSTANT, i);
		}
		public StructTypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structTypeDefinition; }
	}

	public final StructTypeDefinitionContext structTypeDefinition() throws RecognitionException {
		StructTypeDefinitionContext _localctx = new StructTypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_structTypeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			((StructTypeDefinitionContext)_localctx).a = match(T__10);
			setState(130);
			match(T__3);
			{

					
				 ArrayList<Field>FinalFields = new ArrayList <Field>();			
				 	ArrayList<Field> Fields = new ArrayList<Field>();
				 
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{

							ArrayList <Integer> dimensionsStruct = new ArrayList <Integer>();
							Fields = new ArrayList<Field>();
							
				setState(133);
				((StructTypeDefinitionContext)_localctx).newid = match(ID);


				 Fields.add(new Field(((StructTypeDefinitionContext)_localctx).newid.getLine(), ((StructTypeDefinitionContext)_localctx).newid.getCharPositionInLine()+1,(((StructTypeDefinitionContext)_localctx).newid!=null?((StructTypeDefinitionContext)_localctx).newid.getText():null)));
				 
				 
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(135);
					match(T__7);
					setState(136);
					((StructTypeDefinitionContext)_localctx).newid2 = match(ID);

					 
					 Fields.add(new Field(((StructTypeDefinitionContext)_localctx).newid2.getLine(), ((StructTypeDefinitionContext)_localctx).newid2.getCharPositionInLine()+1,(((StructTypeDefinitionContext)_localctx).newid2!=null?((StructTypeDefinitionContext)_localctx).newid2.getText():null)));
					 
					 
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(143);
				match(T__9);
				{
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(144);
					match(T__11);
					setState(145);
					((StructTypeDefinitionContext)_localctx).size = match(INT_CONSTANT);

					dimensionsStruct.add(LexerHelper.lexemeToInt((((StructTypeDefinitionContext)_localctx).size!=null?((StructTypeDefinitionContext)_localctx).size.getText():null)));

					setState(147);
					match(T__12);
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(153);
				((StructTypeDefinitionContext)_localctx).complexType = complexType();


				Type Front = null;
				Type Final= null;

				Front=((StructTypeDefinitionContext)_localctx).complexType.ast;
					
				if(!dimensionsStruct.isEmpty()){

				Final=new ArrayType(((StructTypeDefinitionContext)_localctx).newid.getLine(),((StructTypeDefinitionContext)_localctx).newid.getCharPositionInLine()+1);

				ArrayType current=(ArrayType)Final;

				for(int i=0;i< dimensionsStruct.size();i++){

				current.setSize(dimensionsStruct.get(i));
				if(i+1<dimensionsStruct.size()){
				ArrayType temp=new ArrayType(((StructTypeDefinitionContext)_localctx).newid.getLine(),((StructTypeDefinitionContext)_localctx).newid.getCharPositionInLine()+1);
				current.setType(temp);
				current=temp;
				}
				}
				current.setType(Front);

				}else{
				Final=Front;
				}	
				for(Field a:Fields){
				a.setType(Final);
				}
					
				setState(155);
				match(T__0);
				 FinalFields.addAll(Fields);
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			match(T__4);

					StructType baseType=new StructType(((StructTypeDefinitionContext)_localctx).a.getLine(),((StructTypeDefinitionContext)_localctx).a.getCharPositionInLine()+1);
					
			for(Field a:FinalFields){
			baseType.FieldlistAdd(a);
			}
					
					
					
				
				((StructTypeDefinitionContext)_localctx).ast = baseType;

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

	public static class VarDefinitionContext extends ParserRuleContext {
		public ArrayList<VarDefinition> ast;
		public Token newid;
		public Token newid2;
		public Token size;
		public ComplexTypeContext complexType;
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
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
		enterRule(_localctx, 12, RULE_varDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(166);
			((VarDefinitionContext)_localctx).newid = match(ID);

			 ArrayList<VarDefinition> temparr= new ArrayList<VarDefinition>();
			 temparr.add(new VarDefinition(((VarDefinitionContext)_localctx).newid.getLine(),((VarDefinitionContext)_localctx).newid.getCharPositionInLine()+1, (((VarDefinitionContext)_localctx).newid!=null?((VarDefinitionContext)_localctx).newid.getText():null)));
			 	ArrayList<Integer> dimensions = new ArrayList<Integer>();
			 
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(168);
				match(T__7);
				setState(169);
				((VarDefinitionContext)_localctx).newid2 = match(ID);

				 
				 temparr.add(new VarDefinition(((VarDefinitionContext)_localctx).newid2.getLine(),((VarDefinitionContext)_localctx).newid2.getCharPositionInLine()+1, (((VarDefinitionContext)_localctx).newid2!=null?((VarDefinitionContext)_localctx).newid2.getText():null)));
				 
				 
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			match(T__9);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(177);
				match(T__11);
				setState(178);
				((VarDefinitionContext)_localctx).size = match(INT_CONSTANT);

				dimensions.add(LexerHelper.lexemeToInt((((VarDefinitionContext)_localctx).size!=null?((VarDefinitionContext)_localctx).size.getText():null)));

				setState(180);
				match(T__12);
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			((VarDefinitionContext)_localctx).complexType = complexType();


			Type Front =null;
			Type Final= null;

			Front=((VarDefinitionContext)_localctx).complexType.ast;
				
			if(!dimensions.isEmpty()){

			Final=new ArrayType(((VarDefinitionContext)_localctx).newid.getLine(),((VarDefinitionContext)_localctx).newid.getCharPositionInLine()+1);

			ArrayType current=(ArrayType)Final;

			for(int i=0;i< dimensions.size();i++){

			current.setSize(dimensions.get(i));
			if(i+1<dimensions.size()){
			ArrayType temp=new ArrayType(((VarDefinitionContext)_localctx).newid.getLine(),((VarDefinitionContext)_localctx).newid.getCharPositionInLine()+1);
			current.setType(temp);
			current=temp;
			}
			}
			current.setType(Front);

			}else{
			Final=Front;
			}	
			for(VarDefinition a:temparr){
			a.setType(Final);
			}
			((VarDefinitionContext)_localctx).ast = temparr;

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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext e1;
		public Token ID;
		public ExpressionContext expression;
		public ExpressionContext eplus;
		public SimpleTypeContext t;
		public SimpleTypeContext simpleType;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token o;
		public ExpressionContext e2;
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(190);
				((ExpressionContext)_localctx).ID = match(ID);

				ArrayList<Expression> expr = new ArrayList<Expression>();
				setState(192);
				match(T__6);
				{
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__14) | (1L << T__15) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
					{
					setState(193);
					((ExpressionContext)_localctx).e1 = ((ExpressionContext)_localctx).expression = expression(0);
					expr.add(((ExpressionContext)_localctx).e1.ast);
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(195);
						match(T__7);
						{
						setState(196);
						((ExpressionContext)_localctx).eplus = ((ExpressionContext)_localctx).expression = expression(0);
						expr.add(((ExpressionContext)_localctx).eplus.ast);
						}
						}
						}
						setState(203);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				setState(206);
				match(T__8);
				((ExpressionContext)_localctx).ast =  new FuncionInvocation(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,expr, new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,((ExpressionContext)_localctx).ID.getText()) );
					
						
				}
				break;
			case 2:
				{
				setState(208);
				match(T__6);
				setState(209);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(210);
				match(T__8);
				 ((ExpressionContext)_localctx).ast = ((ExpressionContext)_localctx).expression.ast;
				}
				break;
			case 3:
				{
				setState(213);
				match(T__6);
				setState(214);
				((ExpressionContext)_localctx).t = ((ExpressionContext)_localctx).simpleType = simpleType();
				setState(215);
				match(T__8);
				setState(216);
				((ExpressionContext)_localctx).e1 = ((ExpressionContext)_localctx).expression = expression(11);

					((ExpressionContext)_localctx).ast =  new Cast((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast,((ExpressionContext)_localctx).simpleType.ast );
					
				}
				break;
			case 4:
				{
				setState(219);
				match(T__14);
				setState(220);
				((ExpressionContext)_localctx).e1 = ((ExpressionContext)_localctx).expression = expression(10);
				((ExpressionContext)_localctx).ast =  new UnaryMinus((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast );
						
				}
				break;
			case 5:
				{
				setState(223);
				match(T__15);
				setState(224);
				((ExpressionContext)_localctx).e1 = ((ExpressionContext)_localctx).expression = expression(9);
				((ExpressionContext)_localctx).ast =  new UnaryNot((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast );
						
				}
				break;
			case 6:
				{
				setState(227);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new ConstantInt(((ExpressionContext)_localctx).INT_CONSTANT.getLine(), ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)));
						
				}
				break;
			case 7:
				{
				setState(229);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new ConstantDouble(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(), ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)));
						
				}
				break;
			case 8:
				{
				setState(231);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new ConstantChar(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(), ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)));
						
				}
				break;
			case 9:
				{
				setState(233);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(267);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(237);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(238);
						((ExpressionContext)_localctx).o = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
							((ExpressionContext)_localctx).o = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(239);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(9);
						((ExpressionContext)_localctx).ast =  new Arithmetic((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast,(((ExpressionContext)_localctx).o!=null?((ExpressionContext)_localctx).o.getText():null)  );
						          		
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(242);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(243);
						((ExpressionContext)_localctx).o = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==T__19) ) {
							((ExpressionContext)_localctx).o = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(244);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(8);
						((ExpressionContext)_localctx).ast =  new Arithmetic((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast,(((ExpressionContext)_localctx).o!=null?((ExpressionContext)_localctx).o.getText():null)  );
						          		
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(247);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(248);
						((ExpressionContext)_localctx).o = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
							((ExpressionContext)_localctx).o = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(249);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(7);
						((ExpressionContext)_localctx).ast =  new Comparation(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(),((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast,(((ExpressionContext)_localctx).o!=null?((ExpressionContext)_localctx).o.getText():null)  );
						          		
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(252);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(253);
						((ExpressionContext)_localctx).o = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__26 || _la==T__27) ) {
							((ExpressionContext)_localctx).o = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(254);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(6);
						((ExpressionContext)_localctx).ast =  new Logical(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(),((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast,(((ExpressionContext)_localctx).o!=null?((ExpressionContext)_localctx).o.getText():null)  );
						          		
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(257);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(258);
						match(T__11);
						setState(259);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(0);
						setState(260);
						match(T__12);
						((ExpressionContext)_localctx).ast =  new ArrayInvocation((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast );
						          		
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(263);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(264);
						match(T__13);
						setState(265);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast =  new FieldAccess(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(),((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
						          	
						}
						break;
					}
					} 
				}
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class StatementContext extends ParserRuleContext {
		public Statement ast;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public Token ID;
		public ExpressionContext eplus;
		public Token f;
		public ExpressionContext e;
		public StatementContext splus;
		public StatementContext s2;
		public StatementContext spluse;
		public StatementContext s2e;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				((StatementContext)_localctx).e1 = expression(0);
				setState(273);
				match(T__28);
				setState(274);
				((StatementContext)_localctx).e2 = expression(0);
				setState(275);
				match(T__0);
				((StatementContext)_localctx).ast =  new Asigment((((StatementContext)_localctx).e1!=null?(((StatementContext)_localctx).e1.start):null).getLine(), (((StatementContext)_localctx).e1!=null?(((StatementContext)_localctx).e1.start):null).getCharPositionInLine()+1,((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).e2.ast );
						
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(T__29);

					
					ArrayList<Expression> expr = new ArrayList<Expression>();
					
					
				setState(280);
				((StatementContext)_localctx).e1 = expression(0);

					expr.add(((StatementContext)_localctx).e1.ast);
					
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(282);
					match(T__7);
					setState(283);
					((StatementContext)_localctx).e2 = expression(0);

						  expr.add(((StatementContext)_localctx).e2.ast);
						 
					}
					}
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

					((StatementContext)_localctx).ast =  new Print((((StatementContext)_localctx).e1!=null?(((StatementContext)_localctx).e1.start):null).getLine(), (((StatementContext)_localctx).e1!=null?(((StatementContext)_localctx).e1.start):null).getCharPositionInLine()+1,expr);
					
				setState(292);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				match(T__30);

					
					ArrayList<Expression> expr = new ArrayList<Expression>();
					
					
				setState(296);
				((StatementContext)_localctx).e1 = expression(0);

					expr.add(((StatementContext)_localctx).e1.ast);
					
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(298);
					match(T__7);
					setState(299);
					((StatementContext)_localctx).e2 = expression(0);

						  expr.add(((StatementContext)_localctx).e2.ast);
						 
					}
					}
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

					((StatementContext)_localctx).ast =  new Input((((StatementContext)_localctx).e1!=null?(((StatementContext)_localctx).e1.start):null).getLine(), (((StatementContext)_localctx).e1!=null?(((StatementContext)_localctx).e1.start):null).getCharPositionInLine()+1,expr);
					
				setState(308);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(310);
				((StatementContext)_localctx).ID = match(ID);

				ArrayList<Expression> expr = new ArrayList<Expression>();
				setState(312);
				match(T__6);
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__14) | (1L << T__15) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
					{
					setState(313);
					((StatementContext)_localctx).e1 = expression(0);
					expr.add(((StatementContext)_localctx).e1.ast);
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(315);
						match(T__7);
						{
						setState(316);
						((StatementContext)_localctx).eplus = expression(0);
						expr.add(((StatementContext)_localctx).eplus.ast);
						}
						}
						}
						setState(323);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(326);
				match(T__8);
				setState(327);
				match(T__0);
				((StatementContext)_localctx).ast =  new FuncionInvocation(((StatementContext)_localctx).ID.getLine(), ((StatementContext)_localctx).ID.getCharPositionInLine()+1,expr, new Variable(((StatementContext)_localctx).ID.getLine(), ((StatementContext)_localctx).ID.getCharPositionInLine()+1,((StatementContext)_localctx).ID.getText()) );
						
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				ArrayList<Statement> TempBody = new ArrayList<Statement>();
				ArrayList<Statement> TempElseBody = new ArrayList<Statement>();

				 
				setState(330);
				((StatementContext)_localctx).f = match(T__31);
				{
				setState(331);
				((StatementContext)_localctx).e = expression(0);
				setState(332);
				match(T__9);
				}
				setState(347);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
					{
					{
					setState(334);
					match(T__3);
					setState(338); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(335);
						((StatementContext)_localctx).splus = statement();

								
								TempBody.add(((StatementContext)_localctx).splus.ast);
								
								
						}
						}
						setState(340); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__14) | (1L << T__15) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__33) | (1L << T__34) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0) );
					setState(342);
					match(T__4);
					}
					}
					break;
				case T__6:
				case T__14:
				case T__15:
				case T__29:
				case T__30:
				case T__31:
				case T__33:
				case T__34:
				case INT_CONSTANT:
				case REAL_CONSTANT:
				case CHAR_CONSTANT:
				case ID:
					{
					{
					setState(344);
					((StatementContext)_localctx).s2 = statement();

							TempBody.add(((StatementContext)_localctx).s2.ast);
							
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(365);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(349);
					match(T__32);
					{
					setState(363);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__3:
						{
						{
						setState(350);
						match(T__3);
						setState(354); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(351);
							((StatementContext)_localctx).spluse = statement();

									
									TempElseBody.add(((StatementContext)_localctx).spluse.ast);
									
									
							}
							}
							setState(356); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__14) | (1L << T__15) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__33) | (1L << T__34) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0) );
						setState(358);
						match(T__4);
						}
						}
						break;
					case T__6:
					case T__14:
					case T__15:
					case T__29:
					case T__30:
					case T__31:
					case T__33:
					case T__34:
					case INT_CONSTANT:
					case REAL_CONSTANT:
					case CHAR_CONSTANT:
					case ID:
						{
						{
						setState(360);
						((StatementContext)_localctx).s2e = statement();

								TempElseBody.add(((StatementContext)_localctx).s2e.ast);
								
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					break;
				}

				((StatementContext)_localctx).ast =  new IfStatement(((StatementContext)_localctx).f.getLine(), ((StatementContext)_localctx).f.getCharPositionInLine()+1,((StatementContext)_localctx).e.ast,TempBody,TempElseBody  );
						
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				ArrayList<Statement> TempBody = new ArrayList<Statement>();

				 
				setState(370);
				((StatementContext)_localctx).f = match(T__33);
				setState(371);
				((StatementContext)_localctx).e = expression(0);
				setState(372);
				match(T__9);
				{
				setState(386);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
					{
					{
					setState(373);
					match(T__3);
					setState(377); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(374);
						((StatementContext)_localctx).splus = statement();

								
								TempBody.add(((StatementContext)_localctx).splus.ast);
								
								
						}
						}
						setState(379); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__14) | (1L << T__15) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__33) | (1L << T__34) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0) );
					setState(381);
					match(T__4);
					}
					}
					break;
				case T__6:
				case T__14:
				case T__15:
				case T__29:
				case T__30:
				case T__31:
				case T__33:
				case T__34:
				case INT_CONSTANT:
				case REAL_CONSTANT:
				case CHAR_CONSTANT:
				case ID:
					{
					{
					setState(383);
					((StatementContext)_localctx).s2 = statement();

							TempBody.add(((StatementContext)_localctx).s2.ast);
							
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}

				((StatementContext)_localctx).ast =  new WhileStatement(((StatementContext)_localctx).f.getLine(), ((StatementContext)_localctx).f.getCharPositionInLine()+1,((StatementContext)_localctx).e.ast,TempBody  );
						
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(390);
				match(T__34);
				setState(391);
				((StatementContext)_localctx).e1 = expression(0);
				setState(392);
				match(T__0);
				((StatementContext)_localctx).ast =  new Return((((StatementContext)_localctx).e1!=null?(((StatementContext)_localctx).e1.start):null).getLine(), (((StatementContext)_localctx).e1!=null?(((StatementContext)_localctx).e1.start):null).getCharPositionInLine()+1,((StatementContext)_localctx).e1.ast );
						
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

	public static class SimpleTypeContext extends ParserRuleContext {
		public Type ast;
		public Token a;
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_simpleType);
		try {
			setState(403);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				((SimpleTypeContext)_localctx).a = match(T__35);
				((SimpleTypeContext)_localctx).ast =  new IntType(((SimpleTypeContext)_localctx).a.getLine(), ((SimpleTypeContext)_localctx).a.getCharPositionInLine()+1);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				((SimpleTypeContext)_localctx).a = match(T__36);
				((SimpleTypeContext)_localctx).ast =  new DoubleType(((SimpleTypeContext)_localctx).a.getLine(), ((SimpleTypeContext)_localctx).a.getCharPositionInLine()+1);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(401);
				((SimpleTypeContext)_localctx).a = match(T__37);
				((SimpleTypeContext)_localctx).ast =  new CharType(((SimpleTypeContext)_localctx).a.getLine(), ((SimpleTypeContext)_localctx).a.getCharPositionInLine()+1);
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
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0198\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3/\n\3\f\3\16\3\62\13\3\3\3\3\3"+
		"\3\3\7\3\67\n\3\f\3\16\3:\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\7\4J\n\4\f\4\16\4M\13\4\5\4O\n\4\3\4\3\4\3\4\5\4T\n\4"+
		"\3\4\3\4\3\4\5\4Y\n\4\3\4\3\4\3\4\3\4\7\4_\n\4\f\4\16\4b\13\4\3\4\3\4"+
		"\3\4\7\4g\n\4\f\4\16\4j\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5z\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0082\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u008d\n\7\f\7\16\7\u0090\13\7\3\7\3\7"+
		"\3\7\3\7\3\7\7\7\u0097\n\7\f\7\16\7\u009a\13\7\3\7\3\7\3\7\3\7\3\7\7\7"+
		"\u00a1\n\7\f\7\16\7\u00a4\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b\u00ae"+
		"\n\b\f\b\16\b\u00b1\13\b\3\b\3\b\3\b\3\b\3\b\7\b\u00b8\n\b\f\b\16\b\u00bb"+
		"\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00ca\n"+
		"\t\f\t\16\t\u00cd\13\t\5\t\u00cf\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u00ee\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\7\t\u010e\n\t\f\t\16\t\u0111\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0121\n\n\f\n\16\n\u0124\13\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0131\n\n\f\n\16\n\u0134\13\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0142\n\n\f\n\16\n"+
		"\u0145\13\n\5\n\u0147\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\6\n\u0155\n\n\r\n\16\n\u0156\3\n\3\n\3\n\3\n\3\n\5\n\u015e\n\n\3"+
		"\n\3\n\3\n\3\n\3\n\6\n\u0165\n\n\r\n\16\n\u0166\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u016e\n\n\5\n\u0170\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n"+
		"\u017c\n\n\r\n\16\n\u017d\3\n\3\n\3\n\3\n\3\n\5\n\u0185\n\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\u018e\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0196"+
		"\n\13\3\13\2\3\20\f\2\4\6\b\n\f\16\20\22\24\2\6\3\2\23\25\4\2\21\21\26"+
		"\26\3\2\27\34\3\2\35\36\2\u01c1\2\26\3\2\2\2\4\'\3\2\2\2\6>\3\2\2\2\b"+
		"y\3\2\2\2\n\u0081\3\2\2\2\f\u0083\3\2\2\2\16\u00a8\3\2\2\2\20\u00ed\3"+
		"\2\2\2\22\u018d\3\2\2\2\24\u0195\3\2\2\2\26 \b\2\1\2\27\30\5\16\b\2\30"+
		"\31\7\3\2\2\31\32\b\2\1\2\32\37\3\2\2\2\33\34\5\6\4\2\34\35\b\2\1\2\35"+
		"\37\3\2\2\2\36\27\3\2\2\2\36\33\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2"+
		"\2\2!#\3\2\2\2\" \3\2\2\2#$\5\4\3\2$%\b\2\1\2%&\7\2\2\3&\3\3\2\2\2\'("+
		"\b\3\1\2()\7\4\2\2)*\7\5\2\2*\60\7\6\2\2+,\5\b\5\2,-\b\3\1\2-/\3\2\2\2"+
		".+\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\618\3\2\2\2\62\60\3\2"+
		"\2\2\63\64\5\22\n\2\64\65\b\3\1\2\65\67\3\2\2\2\66\63\3\2\2\2\67:\3\2"+
		"\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7\7\2\2<=\b\3\1\2=\5"+
		"\3\2\2\2>?\b\4\1\2?@\7\b\2\2@A\7/\2\2AS\b\4\1\2BN\7\t\2\2CD\5\16\b\2D"+
		"K\b\4\1\2EF\7\n\2\2FG\5\16\b\2GH\b\4\1\2HJ\3\2\2\2IE\3\2\2\2JM\3\2\2\2"+
		"KI\3\2\2\2KL\3\2\2\2LO\3\2\2\2MK\3\2\2\2NC\3\2\2\2NO\3\2\2\2OP\3\2\2\2"+
		"PQ\7\13\2\2QT\7\f\2\2RT\7\5\2\2SB\3\2\2\2SR\3\2\2\2TX\3\2\2\2UV\5\24\13"+
		"\2VW\b\4\1\2WY\3\2\2\2XU\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z`\7\6\2\2[\\\5\b"+
		"\5\2\\]\b\4\1\2]_\3\2\2\2^[\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ah\3"+
		"\2\2\2b`\3\2\2\2cd\5\22\n\2de\b\4\1\2eg\3\2\2\2fc\3\2\2\2gj\3\2\2\2hf"+
		"\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7\7\2\2lm\b\4\1\2m\7\3\2\2\2"+
		"no\5\16\b\2op\7\3\2\2pq\b\5\1\2qz\3\2\2\2rs\7/\2\2st\7\f\2\2tu\5\f\7\2"+
		"uv\b\5\1\2vw\3\2\2\2wx\7\3\2\2xz\3\2\2\2yn\3\2\2\2yr\3\2\2\2z\t\3\2\2"+
		"\2{|\5\f\7\2|}\b\6\1\2}\u0082\3\2\2\2~\177\5\24\13\2\177\u0080\b\6\1\2"+
		"\u0080\u0082\3\2\2\2\u0081{\3\2\2\2\u0081~\3\2\2\2\u0082\13\3\2\2\2\u0083"+
		"\u0084\7\r\2\2\u0084\u0085\7\6\2\2\u0085\u00a2\b\7\1\2\u0086\u0087\b\7"+
		"\1\2\u0087\u0088\7/\2\2\u0088\u008e\b\7\1\2\u0089\u008a\7\n\2\2\u008a"+
		"\u008b\7/\2\2\u008b\u008d\b\7\1\2\u008c\u0089\3\2\2\2\u008d\u0090\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0098\7\f\2\2\u0092\u0093\7\16\2\2\u0093\u0094\7"+
		"*\2\2\u0094\u0095\b\7\1\2\u0095\u0097\7\17\2\2\u0096\u0092\3\2\2\2\u0097"+
		"\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2"+
		"\2\2\u009a\u0098\3\2\2\2\u009b\u009c\5\n\6\2\u009c\u009d\b\7\1\2\u009d"+
		"\u009e\7\3\2\2\u009e\u009f\b\7\1\2\u009f\u00a1\3\2\2\2\u00a0\u0086\3\2"+
		"\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7\7\2\2\u00a6\u00a7\b\7"+
		"\1\2\u00a7\r\3\2\2\2\u00a8\u00a9\7/\2\2\u00a9\u00af\b\b\1\2\u00aa\u00ab"+
		"\7\n\2\2\u00ab\u00ac\7/\2\2\u00ac\u00ae\b\b\1\2\u00ad\u00aa\3\2\2\2\u00ae"+
		"\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b9\7\f\2\2\u00b3\u00b4\7\16\2\2\u00b4"+
		"\u00b5\7*\2\2\u00b5\u00b6\b\b\1\2\u00b6\u00b8\7\17\2\2\u00b7\u00b3\3\2"+
		"\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\5\n\6\2\u00bd\u00be\b\b"+
		"\1\2\u00be\17\3\2\2\2\u00bf\u00c0\b\t\1\2\u00c0\u00c1\7/\2\2\u00c1\u00c2"+
		"\b\t\1\2\u00c2\u00ce\7\t\2\2\u00c3\u00c4\5\20\t\2\u00c4\u00cb\b\t\1\2"+
		"\u00c5\u00c6\7\n\2\2\u00c6\u00c7\5\20\t\2\u00c7\u00c8\b\t\1\2\u00c8\u00ca"+
		"\3\2\2\2\u00c9\u00c5\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00c3\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\7\13\2\2\u00d1"+
		"\u00ee\b\t\1\2\u00d2\u00d3\7\t\2\2\u00d3\u00d4\5\20\t\2\u00d4\u00d5\7"+
		"\13\2\2\u00d5\u00d6\b\t\1\2\u00d6\u00ee\3\2\2\2\u00d7\u00d8\7\t\2\2\u00d8"+
		"\u00d9\5\24\13\2\u00d9\u00da\7\13\2\2\u00da\u00db\5\20\t\r\u00db\u00dc"+
		"\b\t\1\2\u00dc\u00ee\3\2\2\2\u00dd\u00de\7\21\2\2\u00de\u00df\5\20\t\f"+
		"\u00df\u00e0\b\t\1\2\u00e0\u00ee\3\2\2\2\u00e1\u00e2\7\22\2\2\u00e2\u00e3"+
		"\5\20\t\13\u00e3\u00e4\b\t\1\2\u00e4\u00ee\3\2\2\2\u00e5\u00e6\7*\2\2"+
		"\u00e6\u00ee\b\t\1\2\u00e7\u00e8\7-\2\2\u00e8\u00ee\b\t\1\2\u00e9\u00ea"+
		"\7.\2\2\u00ea\u00ee\b\t\1\2\u00eb\u00ec\7/\2\2\u00ec\u00ee\b\t\1\2\u00ed"+
		"\u00bf\3\2\2\2\u00ed\u00d2\3\2\2\2\u00ed\u00d7\3\2\2\2\u00ed\u00dd\3\2"+
		"\2\2\u00ed\u00e1\3\2\2\2\u00ed\u00e5\3\2\2\2\u00ed\u00e7\3\2\2\2\u00ed"+
		"\u00e9\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u010f\3\2\2\2\u00ef\u00f0\f\n"+
		"\2\2\u00f0\u00f1\t\2\2\2\u00f1\u00f2\5\20\t\13\u00f2\u00f3\b\t\1\2\u00f3"+
		"\u010e\3\2\2\2\u00f4\u00f5\f\t\2\2\u00f5\u00f6\t\3\2\2\u00f6\u00f7\5\20"+
		"\t\n\u00f7\u00f8\b\t\1\2\u00f8\u010e\3\2\2\2\u00f9\u00fa\f\b\2\2\u00fa"+
		"\u00fb\t\4\2\2\u00fb\u00fc\5\20\t\t\u00fc\u00fd\b\t\1\2\u00fd\u010e\3"+
		"\2\2\2\u00fe\u00ff\f\7\2\2\u00ff\u0100\t\5\2\2\u0100\u0101\5\20\t\b\u0101"+
		"\u0102\b\t\1\2\u0102\u010e\3\2\2\2\u0103\u0104\f\17\2\2\u0104\u0105\7"+
		"\16\2\2\u0105\u0106\5\20\t\2\u0106\u0107\7\17\2\2\u0107\u0108\b\t\1\2"+
		"\u0108\u010e\3\2\2\2\u0109\u010a\f\16\2\2\u010a\u010b\7\20\2\2\u010b\u010c"+
		"\7/\2\2\u010c\u010e\b\t\1\2\u010d\u00ef\3\2\2\2\u010d\u00f4\3\2\2\2\u010d"+
		"\u00f9\3\2\2\2\u010d\u00fe\3\2\2\2\u010d\u0103\3\2\2\2\u010d\u0109\3\2"+
		"\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\21\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113\5\20\t\2\u0113\u0114\7\37"+
		"\2\2\u0114\u0115\5\20\t\2\u0115\u0116\7\3\2\2\u0116\u0117\b\n\1\2\u0117"+
		"\u018e\3\2\2\2\u0118\u0119\7 \2\2\u0119\u011a\b\n\1\2\u011a\u011b\5\20"+
		"\t\2\u011b\u0122\b\n\1\2\u011c\u011d\7\n\2\2\u011d\u011e\5\20\t\2\u011e"+
		"\u011f\b\n\1\2\u011f\u0121\3\2\2\2\u0120\u011c\3\2\2\2\u0121\u0124\3\2"+
		"\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0125\u0126\b\n\1\2\u0126\u0127\7\3\2\2\u0127\u018e\3\2"+
		"\2\2\u0128\u0129\7!\2\2\u0129\u012a\b\n\1\2\u012a\u012b\5\20\t\2\u012b"+
		"\u0132\b\n\1\2\u012c\u012d\7\n\2\2\u012d\u012e\5\20\t\2\u012e\u012f\b"+
		"\n\1\2\u012f\u0131\3\2\2\2\u0130\u012c\3\2\2\2\u0131\u0134\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0132\3\2"+
		"\2\2\u0135\u0136\b\n\1\2\u0136\u0137\7\3\2\2\u0137\u018e\3\2\2\2\u0138"+
		"\u0139\7/\2\2\u0139\u013a\b\n\1\2\u013a\u0146\7\t\2\2\u013b\u013c\5\20"+
		"\t\2\u013c\u0143\b\n\1\2\u013d\u013e\7\n\2\2\u013e\u013f\5\20\t\2\u013f"+
		"\u0140\b\n\1\2\u0140\u0142\3\2\2\2\u0141\u013d\3\2\2\2\u0142\u0145\3\2"+
		"\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0147\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0146\u013b\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2"+
		"\2\2\u0148\u0149\7\13\2\2\u0149\u014a\7\3\2\2\u014a\u018e\b\n\1\2\u014b"+
		"\u014c\b\n\1\2\u014c\u014d\7\"\2\2\u014d\u014e\5\20\t\2\u014e\u014f\7"+
		"\f\2\2\u014f\u015d\3\2\2\2\u0150\u0154\7\6\2\2\u0151\u0152\5\22\n\2\u0152"+
		"\u0153\b\n\1\2\u0153\u0155\3\2\2\2\u0154\u0151\3\2\2\2\u0155\u0156\3\2"+
		"\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u0159\7\7\2\2\u0159\u015e\3\2\2\2\u015a\u015b\5\22\n\2\u015b\u015c\b"+
		"\n\1\2\u015c\u015e\3\2\2\2\u015d\u0150\3\2\2\2\u015d\u015a\3\2\2\2\u015e"+
		"\u016f\3\2\2\2\u015f\u016d\7#\2\2\u0160\u0164\7\6\2\2\u0161\u0162\5\22"+
		"\n\2\u0162\u0163\b\n\1\2\u0163\u0165\3\2\2\2\u0164\u0161\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\3\2"+
		"\2\2\u0168\u0169\7\7\2\2\u0169\u016e\3\2\2\2\u016a\u016b\5\22\n\2\u016b"+
		"\u016c\b\n\1\2\u016c\u016e\3\2\2\2\u016d\u0160\3\2\2\2\u016d\u016a\3\2"+
		"\2\2\u016e\u0170\3\2\2\2\u016f\u015f\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\u0172\b\n\1\2\u0172\u018e\3\2\2\2\u0173\u0174\b\n"+
		"\1\2\u0174\u0175\7$\2\2\u0175\u0176\5\20\t\2\u0176\u0184\7\f\2\2\u0177"+
		"\u017b\7\6\2\2\u0178\u0179\5\22\n\2\u0179\u017a\b\n\1\2\u017a\u017c\3"+
		"\2\2\2\u017b\u0178\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017b\3\2\2\2\u017d"+
		"\u017e\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\7\7\2\2\u0180\u0185\3\2"+
		"\2\2\u0181\u0182\5\22\n\2\u0182\u0183\b\n\1\2\u0183\u0185\3\2\2\2\u0184"+
		"\u0177\3\2\2\2\u0184\u0181\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\b\n"+
		"\1\2\u0187\u018e\3\2\2\2\u0188\u0189\7%\2\2\u0189\u018a\5\20\t\2\u018a"+
		"\u018b\7\3\2\2\u018b\u018c\b\n\1\2\u018c\u018e\3\2\2\2\u018d\u0112\3\2"+
		"\2\2\u018d\u0118\3\2\2\2\u018d\u0128\3\2\2\2\u018d\u0138\3\2\2\2\u018d"+
		"\u014b\3\2\2\2\u018d\u0173\3\2\2\2\u018d\u0188\3\2\2\2\u018e\23\3\2\2"+
		"\2\u018f\u0190\7&\2\2\u0190\u0196\b\13\1\2\u0191\u0192\7\'\2\2\u0192\u0196"+
		"\b\13\1\2\u0193\u0194\7(\2\2\u0194\u0196\b\13\1\2\u0195\u018f\3\2\2\2"+
		"\u0195\u0191\3\2\2\2\u0195\u0193\3\2\2\2\u0196\25\3\2\2\2%\36 \608KNS"+
		"X`hy\u0081\u008e\u0098\u00a2\u00af\u00b9\u00cb\u00ce\u00ed\u010d\u010f"+
		"\u0122\u0132\u0143\u0146\u0156\u015d\u0166\u016d\u016f\u017d\u0184\u018d"+
		"\u0195";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}