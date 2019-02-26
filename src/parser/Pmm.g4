
grammar Pmm;
@header{import ast.*;
}
program returns[Program ast]: (varDefinition';')* funcionDefinition* main EOF
;

main: 'def main' '():' '{' ((statement)*) '}'
	;

funcionDefinition:
	'def' ID(('(' ((varDefinition (',' (varDefinition))*)?) '):')|('():')) (simpleType)? '{' (varDefinition';')* statement* '}'
	;
structDefinition: ID ':' 'struct'
		
	 '{' ((varDefinition ';')*) '}'';'
	;
	
varDefinition: ID (',' ID)* ':' (('[' expression ']')*) simpleType 
;


statement:
	expression '=' expression ';'
	| 'print' expression (',' expression)* ';'
	| 'input' expression (',' expression)* ';'
	|structDefinition
	| funcionInvocation ';'
	| varDefinition ';'
	| ifStat
	| whileStat
	| 'return ' expression ';'
	;

expression [Expression ast]: 

    '('expression')'
	| arrayInvocation
	| expression '.' expression
	| '(' t=simpleType ')' e1=expression {$ast = new Cast($e1.start.getLine(), $e1.start.getCharPostitionInLine()+1,$e1.ast, $type );}
	| '-' e1=expression {$ast = new UnaryMinus($e1.start.getLine(), $e1.start.getCharPostitionInLine()+1,$e1.ast );}
	| '!' e1=expression  {$ast = new UnaryNot($e1.start.getLine(), $e1.start.getCharPostitionInLine()+1,$e1.ast );}
	| e1=expression o=('*' | '/' | '%') e2=expression {$ast = new Arithmetic($e1.ast.getLine(), $e1.ast.getColumn(),$e1.ast, $e2.ast,$o.text  );}
	| e1=expression o=('+' | '-') e2=expression {$ast = new Arithmetic($e1.ast.getLine(), $e1.ast.getColumn(),$e1.ast, $e2.ast,$o.text  );}
	| e1=expression o=('<' | '<=' | '>' | '>=' | '==' | '!=') e2=expression {$ast = new Comparation($e1.ast.getLine(), $e1.ast.getColumn(),$e1.ast, $e2.ast,$o.text  );}
	| e1=expression o=('||' | '&&') e2=expression {$ast = new Logical($e1.ast.getLine(), $e1.ast.getColumn(),$e1.ast, $e2.ast,$o.text  );}
	| e1=expression ('=') e2=expression {$ast = new Asigment($e1.ast.getLine(), $e1.ast.getColumn(),$e1.ast, $e2.ast,$o.text  );}
	| funcionInvocation
	| INT_CONSTANT {$ast = new IntConstant($INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPostitionInLine()+1, LeserHelper.lexemeToInt($INT_CONSTANT.text));}
	| REAL_CONSTANT {$ast = new DoubleConstant($REAL_CONSTANT.getLine(), $REAL_CONSTANT.getCharPostitionInLine()+1, LeserHelper.lexemeToDouble($REAL_CONSTANT.text));}
	|CHAR_CONSTANT{$ast = new CharConstant($CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPostitionInLine()+1, LeserHelper.lexemeToChar($CHAR_CONSTANT.text));}
	| ID	 {$ast = new Variable($ID.getLine(), $ID.getCharPostitionInLine()+1, $ID.text);}
;


ifStat: 'if ' expression ':' (
		(('{' statement statement+ '}') | (  statement)) 
		('else ' (('{' statement statement+ '}') | (  statement)))?)
		;
			
	whileStat: 'while ' expression ':' (('{' statement statement+ '}') | (  statement))?
	;

funcionInvocation:
	ID '(' ((expression (',' (expression))*)?) ')' 
	;

arrayInvocation:
	ID '[' expression ']' (('[' expression ']')?)
	;
	
simpleType:('int' | 'double' | 'char')
;
TRASH: [ \r\n\t] -> skip
;
INT_CONSTANT: [0-9]+
;
COMMENT: '#' .*? '\r'? ('\n' | EOF) -> skip
;
MULTI_COMMENT: '"""' .*? '"""' -> skip
;
REAL_CONSTANT: (
		(INT_CONSTANT) ('.') (INT_CONSTANT (('E' | 'e') ('-')? INT_CONSTANT)?)?)
	| ((INT_CONSTANT)? ('.') (INT_CONSTANT (('E' | 'e') ('-')? INT_CONSTANT)?)?)
	| (INT_CONSTANT (('E' | 'e') ('-')? INT_CONSTANT)
	)
	;
CHAR_CONSTANT:
	'\'' ([a-zA-Z0-9] | ('\\' INT_CONSTANT) | ('\\' .) | '.' | .) '\''
	;
ID: [a-zA-Z_]+ ([0-9a-zA-Z_]+)?
;