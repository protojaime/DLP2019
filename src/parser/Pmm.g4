grammar Pmm;

@header {
import ast.*;
import ast.Definition.*;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;
import parser.LexerHelper;
}

program
	returns[Program ast]:
	{
	ArrayList<Definition> Defs = new ArrayList<Definition>();
	} (
		v2 = varDefinition ';' {
	for(VarDefinition s :$v2.ast){
	Defs.add((Definition)s);
	}
		}
		| f = funcionDefinition {
	Defs.add((Definition)$f.ast);
	}
	)* m = main {
	Defs.add((Definition)$m.ast);
	$ast= new Program(0, 0, Defs);
	} EOF;

main
	returns[FuncionDefinition ast]:
	{
ArrayList<Statement> TempStat = new ArrayList<Statement>();
} d = 'def main' '():' '{' (
		v = varDefinitionStat {
	for(Statement s :$v.ast){
	TempStat.add(s);
	}
		}
	)* (
		s = statement {
	TempStat.add($s.ast);
	
	}
	)* '}' {
FuncionType FuncType=new FuncionType($d.getLine(),$d.getCharPositionInLine()+1,new ArrayList<VarDefinition>(),new VoidType($d.getLine(),$d.getCharPositionInLine()+1));
	$ast = new FuncionDefinition($d.getLine(), $d.getCharPositionInLine()+1,"main",TempStat,FuncType);
};

funcionDefinition
	returns[FuncionDefinition ast]:
	{
	ArrayList<Statement> TempStat = new ArrayList<Statement>();
	ArrayList<VarDefinition> TempVarDefinition = new ArrayList<VarDefinition>();
	
	} 'def' id = ID {
	Type temporalType=new VoidType($id.getLine(),$id.getCharPositionInLine()+1);
	} (
		(
			'(' (
				(
					v1 = varDefinition {
		TempVarDefinition.addAll($v1.ast);
		} (
						',' (
							vplus = varDefinition {
		TempVarDefinition.addAll($vplus.ast);
		}
						)
					)*
				)?
			) ')' ':'
		)
		| ('():')
	) (
		simpleType {
temporalType=$simpleType.ast;

	
	
	
	}
	)? '{' (
		v = varDefinitionStat {
	for(Statement s :$v.ast){
	TempStat.add(s);
	}
		}
	)* (
		s = statement {
	TempStat.add($s.ast);
	
	}
	)* '}' {
	FuncionType FuncType=new FuncionType($id.getLine(),$id.getCharPositionInLine()+1, TempVarDefinition,temporalType);
	$ast = new FuncionDefinition($id.getLine(), $id.getCharPositionInLine()+1, $id.getText(),TempStat,FuncType);
	};

varDefinitionStat
	returns[ArrayList<Statement> ast= new ArrayList<Statement>()]:
	(
		v2 = varDefinition ';' {
	for(VarDefinition s :$v2.ast){
	$ast.add((Statement)s);
	}
	}
	)
	| (
		Sid = ID ':' structTypeDefinition {	
	$ast.add((Statement)new VarDefinition($Sid.getLine(),$Sid.getCharPositionInLine()+1, $Sid.text,$structTypeDefinition.ast));
	}
	) ';';

complexType
	returns[Type ast]:
	structTypeDefinition {$ast=$structTypeDefinition.ast;}
	| (simpleType {$ast=$simpleType.ast;});

structTypeDefinition
	returns[StructType ast]:
	a = 'struct' '{' (
		{
		
	 ArrayList<Field>FinalFields = new ArrayList <Field>();			
	 	ArrayList<Field> Fields = new ArrayList<Field>();
	 } (
			{
			ArrayList <Integer> dimensionsStruct = new ArrayList <Integer>();
			Fields = new ArrayList<Field>();
			} newid = ID {

 Fields.add(new Field($newid.getLine(), $newid.getCharPositionInLine()+1,$newid.text));
 
 } (
				',' newid2 = ID {
 
 Fields.add(new Field($newid2.getLine(), $newid2.getCharPositionInLine()+1,$newid2.text));
 
 }
			)* ':' (
				(
					'[' size = INT_CONSTANT {
dimensionsStruct.add(LexerHelper.lexemeToInt($size.text));
} ']'
				)*
			) complexType {

Type Front = null;
Type Final= null;

Front=$complexType.ast;
	
if(!dimensionsStruct.isEmpty()){

Final=new ArrayType($newid.getLine(),$newid.getCharPositionInLine()+1);

ArrayType current=(ArrayType)Final;

for(int i=0;i< dimensionsStruct.size();i++){

current.setSize(dimensionsStruct.get(i));
if(i+1<dimensionsStruct.size()){
ArrayType temp=new ArrayType($newid.getLine(),$newid.getCharPositionInLine()+1);
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
	} ';' { FinalFields.addAll(Fields);}
		
		)* '}' {
		StructType baseType=new StructType($a.getLine(),$a.getCharPositionInLine()+1);
		
for(Field a:FinalFields){
baseType.FieldlistAdd(a);
}
		
		
		
	
	$ast=baseType;
}
	);

varDefinition
	returns[ArrayList<VarDefinition> ast]:
	(
		newid = ID {
 ArrayList<VarDefinition> temparr= new ArrayList<VarDefinition>();
 temparr.add(new VarDefinition($newid.getLine(),$newid.getCharPositionInLine()+1, $newid.text));
 	ArrayList<Integer> dimensions = new ArrayList<Integer>();
 } (
			',' newid2 = ID {
 
 temparr.add(new VarDefinition($newid2.getLine(),$newid2.getCharPositionInLine()+1, $newid2.text));
 
 }
		)* ':' (
			'[' size = INT_CONSTANT {
dimensions.add(LexerHelper.lexemeToInt($size.text));
} ']'
		)* complexType {

Type Front =null;
Type Final= null;

Front=$complexType.ast;
	
if(!dimensions.isEmpty()){

Final=new ArrayType($newid.getLine(),$newid.getCharPositionInLine()+1);

ArrayType current=(ArrayType)Final;

for(int i=0;i< dimensions.size();i++){

current.setSize(dimensions.get(i));
if(i+1<dimensions.size()){
ArrayType temp=new ArrayType($newid.getLine(),$newid.getCharPositionInLine()+1);
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
$ast=temparr;
}
	);

expression
	returns[Expression ast]:
	ID {
ArrayList<Expression> expr = new ArrayList<Expression>();} '(' (
		(
			e1 = expression {expr.add($e1.ast);} (
				',' (eplus = expression {expr.add($eplus.ast);})
			)*
		)?
	) ')' {$ast = new FuncionInvocation($ID.getLine(), $ID.getCharPositionInLine()+1,expr, new Variable($ID.getLine(), $ID.getCharPositionInLine()+1,$ID.getText()) );
	
		}
	| '(' expression ')' { $ast =$expression.ast;}
	| e1 = expression '[' e2 = expression ']' {$ast = new ArrayInvocation($e1.start.getLine(), $e1.start.getCharPositionInLine()+1,$e1.ast, $e2.ast );
		}
	|  ID '++'  {$ast = new OneDigitMod($ID.getLine(), $ID.getCharPositionInLine()+1,new Variable($ID.getLine(), $ID.getCharPositionInLine()+1,$ID.getText()), "+" );
		}
	|  ID '--'  {$ast = new OneDigitMod($ID.getLine(), $ID.getCharPositionInLine()+1,new Variable($ID.getLine(), $ID.getCharPositionInLine()+1,$ID.getText()), "-" );
		}
	| e1 = expression '.' ID {$ast = new FieldAccess($e1.ast.getLine(), $e1.ast.getColumn(),$e1.ast, $ID.text);
	}
	| '(' t = simpleType ')' e1 = expression {
	$ast = new Cast($e1.start.getLine(), $e1.start.getCharPositionInLine()+1,$e1.ast,$simpleType.ast );
	}
	| '-' e1 = expression {$ast = new UnaryMinus($e1.start.getLine(), $e1.start.getCharPositionInLine()+1,$e1.ast );
		}
	| '!' e1 = expression {$ast = new UnaryNot($e1.start.getLine(), $e1.start.getCharPositionInLine()+1,$e1.ast );
		}
	| e1 = expression o = ('*' | '/' | '%') e2 = expression {$ast = new Arithmetic($e1.start.getLine(), $e1.start.getCharPositionInLine()+1,$e1.ast, $e2.ast,$o.text  );
		}
	| e1 = expression o = ('+' | '-') e2 = expression {$ast = new Arithmetic($e1.start.getLine(), $e1.start.getCharPositionInLine()+1,$e1.ast, $e2.ast,$o.text  );
		}
	| e1 = expression o = ('<' | '<=' | '>' | '>=' | '==' | '!=') e2 = expression {$ast = new Comparation($e1.ast.getLine(), $e1.ast.getColumn(),$e1.ast, $e2.ast,$o.text  );
		}
	| e1 = expression o = ('||' | '&&') e2 = expression {$ast = new Logical($e1.ast.getLine(), $e1.ast.getColumn(),$e1.ast, $e2.ast,$o.text  );
		}
	| INT_CONSTANT {$ast = new ConstantInt($INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt($INT_CONSTANT.text));
		}
	| REAL_CONSTANT {$ast = new ConstantDouble($REAL_CONSTANT.getLine(), $REAL_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal($REAL_CONSTANT.text));
		}
	| CHAR_CONSTANT {$ast = new ConstantChar($CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar($CHAR_CONSTANT.text));
		}
	| ID {$ast = new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text);};

statement
	returns[Statement ast]:
	e1 = expression '=' e2 = expression ';' {$ast = new Asigment($e1.start.getLine(), $e1.start.getCharPositionInLine()+1,$e1.ast, $e2.ast );
		}
	| 'print' {
	
	ArrayList<Expression> expr = new ArrayList<Expression>();
	
	} e1 = expression {
	expr.add($e1.ast);
	} (
		',' e2 = expression {
	  expr.add($e2.ast);
	 }
	)* {
	$ast= new Print($e1.start.getLine(), $e1.start.getCharPositionInLine()+1,expr);
	} ';'
	| 'input' {
	
	ArrayList<Expression> expr = new ArrayList<Expression>();
	
	} e1 = expression {
	expr.add($e1.ast);
	} (
		',' e2 = expression {
	  expr.add($e2.ast);
	 }
	)* {
	$ast= new Input($e1.start.getLine(), $e1.start.getCharPositionInLine()+1,expr);
	} ';'
	| ID {
ArrayList<Expression> expr = new ArrayList<Expression>();} '(' (
		e1 = expression {expr.add($e1.ast);} (
			',' (eplus = expression {expr.add($eplus.ast);})
		)*
	)? ')' ';' {$ast = new FuncionInvocation($ID.getLine(), $ID.getCharPositionInLine()+1,expr, new Variable($ID.getLine(), $ID.getCharPositionInLine()+1,$ID.getText()) );
		}
	|  ID '++'  ';'{$ast = new OneDigitMod($ID.getLine(), $ID.getCharPositionInLine()+1,new Variable($ID.getLine(), $ID.getCharPositionInLine()+1,$ID.getText()), "+" );
		}
	|  ID '--'  ';'{$ast = new OneDigitMod($ID.getLine(), $ID.getCharPositionInLine()+1,new Variable($ID.getLine(), $ID.getCharPositionInLine()+1,$ID.getText()), "-" );
		}
	| {ArrayList<Statement> TempBody = new ArrayList<Statement>();
ArrayList<Statement> TempElseBody = new ArrayList<Statement>();

 } f = 'if' (e = expression ':') (
		(
			'{' (
				splus = statement {
		
		TempBody.add($splus.ast);
		
		}
			)+ '}'
		)
		| (
			s2 = statement {
		TempBody.add($s2.ast);
		}
		)
	) (
		'else' (
			(
				(
					'{' (
						spluse = statement {
		
		TempElseBody.add($spluse.ast);
		
		}
					)+ '}'
				)
				| (
					s2e = statement {
		TempElseBody.add($s2e.ast);
		}
				)
			)
		)
	)? {
$ast= new IfStatement($f.getLine(), $f.getCharPositionInLine()+1,$e.ast,TempBody,TempElseBody  );
		}
	| {ArrayList<Statement> TempBody = new ArrayList<Statement>();

 } f = 'while' e = expression ':' (
		(
			(
				'{' (
					splus = statement {
		
		TempBody.add($splus.ast);
		
		}
				)+ '}'
			)
			| (
				s2 = statement {
		TempBody.add($s2.ast);
		}
			)
		)
	) {
$ast= new WhileStatement($f.getLine(), $f.getCharPositionInLine()+1,$e.ast,TempBody  );
		}
	| 'return' e1 = expression ';' {$ast = new Return($e1.start.getLine(), $e1.start.getCharPositionInLine()+1,$e1.ast );
		};

simpleType
	returns[Type ast]:
	a = 'int' {$ast= new IntType($a.getLine(), $a.getCharPositionInLine()+1);}
	| a = 'double' {$ast= new DoubleType($a.getLine(), $a.getCharPositionInLine()+1);}
	| a = 'char' {$ast= new CharType($a.getLine(), $a.getCharPositionInLine()+1);};

TRASH: [ \r\n\t] -> skip;
INT_CONSTANT: [0-9]+;
COMMENT: '#' .*? '\r'? ('\n' | EOF) -> skip;
MULTI_COMMENT: '"""' .*? '"""' -> skip;
REAL_CONSTANT: (
		(INT_CONSTANT) ('.') (
			INT_CONSTANT (('E' | 'e') ('-')? INT_CONSTANT)?
		)?
	)
	| (
		(INT_CONSTANT)? ('.') (
			INT_CONSTANT (('E' | 'e') ('-')? INT_CONSTANT)?
		)?
	)
	| (INT_CONSTANT (('E' | 'e') ('-')? INT_CONSTANT));
CHAR_CONSTANT:
	'\'' ([a-zA-Z0-9] | ('\\' INT_CONSTANT) | ('\\' .) | '.' | .) '\'';
ID: [a-zA-Z_]+ ([0-9a-zA-Z_]+)?;