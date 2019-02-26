grammar Pmm;

program: (funcionDefinition|(varDefinition';'))* main EOF;

main: 'def main' '():' '{' ((statement)*) '}'
	;

funcionDefinition:
	'def' ID(('(' ((varDefinition (',' (varDefinition))*)?) '):')|('():')) (simpleType)? '{' ((statement)*) '}'
	;
structDefinition: ID ':' 'struct'
		
	 '{' ((varDefinition ';')*) '}'';'
	;
varDefinition: ID (',' ID)* ':' typePlus ;


statement:
	expression '=' expression ';'
	| 'print' expression (',' expression)* ';'
	| 'input' expression (',' expression)* ';'
	|structDefinition
	| funcionInvocation
	| varDefinition ';'
	| returnStat
	| ifStat
	| whileStat
	;

expression:

    '('expression')'
	| arrayInvocation
	| expression '.' expression
	| '(' simpleType ')' expression
	| '-' expression
	| '!' expression
	| expression ('*' | '/' | '%') expression
	| expression ('+' | '-') expression
	| expression ('<' | '<=' | '>' | '>=' | '==' | '!=') expression
	| expression ('||' | '&&') expression
	| expression ('=') expression
	
	
	| funcionInvocation
	| INT_CONSTANT
	| REAL_CONSTANT
	|CHAR_CONSTANT
	| ID	
;



funcionInvocation:
	ID '(' ((expression (',' (expression))*)?) ')' ';';

arrayInvocation:
	ID '[' expression ']' (('[' expression ']')?)
	;
typePlus: type | 'struct'
;
type: (('[' expression ']')*) simpleType;

simpleType:('int' | 'double' | 'char');
 


ifStat: 'if ' expression ':' (
		(('{' statement statement+ '}') | (  statement)) 
		('else ' (('{' statement statement+ '}') | (  statement)))?)
		;
	
	whileStat: 'while ' expression ':' (('{' statement statement+ '}') | (  statement))?
	;

returnStat: 'return ' expression ';';


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