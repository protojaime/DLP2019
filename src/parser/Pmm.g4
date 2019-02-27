grammar Pmm;

@header {
import ast.*;
import ast.Definition.*;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;
}

program
	returns[Program ast]: (varDefinition ';')* funcionDefinition* main EOF;

main: 'def main' '():' '{' ((statement)*) '}';

funcionDefinition:
	'def' ID (
		('(' ((varDefinition (',' (varDefinition))*)?) '):')
		| ('():')
	) (simpleType)? '{' (varDefinition ';')* statement* '}';
structDefinition:
	ID ':' 'struct' '{' (
		(ID ':' (('[' expression ']')*) simpleType ';')*
	) '}' ';';
varDefinition
	returns[List<VarDefinition> ast = new ArrayList<VarDefinition>()]:
	newid = ID {
 
 $ast.add(new VarDefinition($newid.GetLine(),$newid.GetColumn(), $newid.text));
 
 } (
		',' newid2 = ID {
 
 $ast.add(new VarDefinition($newid2.GetLine(),$newid2.GetColumn(), $newid2.text));
 
 }
	)* ':' {
	ArrayList<Integer> dimensions = new ArrayList<Integer>();

} (
		(
			'[' size = INT_CONSTANT {
dimensions.add(LeserHelper.lexemeToInt($INT_CONSTANT.text)););
} ']'
		)*
	) simpleType {

Type Front = null;
Type Final= null;

if($simpleType.text=="int" ){ Front = new IntType(); }
if($simpleType.text=="double" ){ Front  = new DoubleType(); }
if($simpleType.text=="char" ){ Front  = new CharType(); }
	
if(!dimensions.isEmpty()){

Final=new ArrayType();

ArrayType current=(ArrayType)Final;

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
for(varDefinition a:$ast){
a.setType(Final);
}
};

statement
	returns[Statement ast]:
	e1 = expression '=' e2 = expression ';' {$ast = new Asigment($e1.getLine(), $e1.getCharPositionInLine()+1,$e1, $e2 );
		}
	| 'print' {
	
	ArrayList<Expression> expr = new ArrayList<Expression>();
	
	} e1 = expression {
	
	} (
		',' e2 = expression {
	  
	 }
	)* ';'
	| 'input' expression (',' expression)* ';'
	| structDefinition
	| ID '(' (expression (',' expression)*)? ')' ';'
	| ifStat
	| whileStat
	| 'return ' e1 = expression ';' {$ast = new Return($e1.getLine(), $e1.getCharPositionInLine()+1,$e1 );
		};

expression
	returns[Expression ast]:
	ID {
List<Expression> expr = new ArrayList<Expression>();} '(' (
		(
			e1 = expression {expr.add($e1.ast);} (
				',' (eplus = expression {expr.add($eplus.ast);})
			)*
		)?
	) ')' {$ast = new FuncionInvocation($ID.getLine(), $ID.getCharPositionInLine()+1,expr, $ID );}
	| '(' expression ')'
	| ID '[' e1 = expression ']' (('[' e2 = expression ']')?) {$ast = new ArrayInvocation($ID.getLine(), $ID.getCharPositionInLine()+1,$e1.ast, $e2.ast );
		}
	| e1=expression '.' e2=expression{$ast = new FieldAccess($e1.ast.getLine(), $e1.ast.getColumn(),$e1.ast, $e2.ast);
	}
	
	
	
	| '(' t = simpleType ')' e1 = expression {
	if($simpleType.text=="int" ){$ast = new Cast($e1.start.getLine(), $e1.start.getCharPositionInLine()+1,$e1.ast,new IntType() ); }
	if($simpleType.text=="double" ){$ast = new Cast($e1.start.getLine(), $e1.start.getCharPositionInLine()+1,$e1.ast,new DoubleType()); }
	if($simpleType.text=="char" ){$ast = new Cast($e1.start.getLine(), $e1.start.getCharPositionInLine()+1,$e1.ast,new CharType() ); }
	
	
	}
	| '-' e1 = expression {$ast = new UnaryMinus($e1.start.getLine(), $e1.start.getCharPositionInLine()+1,$e1.ast );
		}
	| '!' e1 = expression {$ast = new UnaryNot($e1.start.getLine(), $e1.start.getCharPositionInLine()+1,$e1.ast );
		}
	| e1 = expression o = ('*' | '/' | '%') e2 = expression {$ast = new Arithmetic($e1.ast.getLine(), $e1.ast.getColumn(),$e1.ast, $e2.ast,$o.text  );
		}
	| e1 = expression o = ('+' | '-') e2 = expression {$ast = new Arithmetic($e1.ast.getLine(), $e1.ast.getColumn(),$e1.ast, $e2.ast,$o.text  );
		}
	| e1 = expression o = ('<' | '<=' | '>' | '>=' | '==' | '!=') e2 = expression {$ast = new Comparation($e1.ast.getLine(), $e1.ast.getColumn(),$e1.ast, $e2.ast,$o.text  );
		}
	| e1 = expression o = ('||' | '&&') e2 = expression {$ast = new Logical($e1.ast.getLine(), $e1.ast.getColumn(),$e1.ast, $e2.ast,$o.text  );
		}
	| e1 = expression ('=') e2 = expression {$ast = new Asigment($e1.ast.getLine(), $e1.ast.getColumn(),$e1.ast, $e2.ast);
		}
	| INT_CONSTANT {$ast = new ConstantInt($INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine()+1, LeserHelper.lexemeToInt($INT_CONSTANT.text));
		}
	| REAL_CONSTANT {$ast = new ConstantDouble($REAL_CONSTANT.getLine(), $REAL_CONSTANT.getCharPositionInLine()+1, LeserHelper.lexemeToDouble($REAL_CONSTANT.text));
		}
	| CHAR_CONSTANT {$ast = new ConstantChar($CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPositionInLine()+1, LeserHelper.lexemeToChar($CHAR_CONSTANT.text));
		}
	| ID {$ast = new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text);};

ifStat
	returns[IfStatement ast]:
	'if ' e = expression ':' (
		{ArrayList<Statement> TempBody = new ArrayList<Statement>();
ArrayList<Statement> TempElseBody = new ArrayList<Statement>();
 } (
			(
				'{' s1 = statement {
		
		TempBody.add($s1);
		
		} (
					splus = statement {
		
		TempBody.add($splus);
		
		}
				)+ '}'
			)
			| (
				s2 = statement {
		TempBody.add($s2);
		}
			)
		) (
			'else ' (
				(
					(
						'{' s1e = statement {
		
		TempElseBody.add($s1e);
		
		} (
							spluse = statement {
		
		TempElseBody.add($spluse);
		
		}
						)+ '}'
					)
					| (
						s2e = statement {
		TempElseBody.add($s2e);
		}
					)
				)
			)
		)?
	) {$ast= new IfStatement($e.start.getLine(), $e.start.getCharPositionInLine()+1,$e.ast,TempBody,TempElseBody  );
		};

whileStat:
	'while ' expression ':' (
		('{' statement statement+ '}')
		| ( statement)
	)?;

simpleType: ('int' | 'double' | 'char');
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