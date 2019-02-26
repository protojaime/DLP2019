grammar Grammar
	;

import Lexicon
	;

start
	: 'DATA' variable* 'CODE' sentence*
	;

variable
	: tipo IDENT ';'
	;

tipo
	: 'float'
	| 'int'
	;

sentence
	: 'print' expr ';'
	| expr '=' expr ';'
	;


func_definition returns [FuncDefinition ast]:
..... '{' var_definition* statement* '}'


statement returns [Statement ast]:.....................
	: 'print' expr ';'
	| expr '=' expr ';'
	;
//////OPCION A DE TRATAR LISTAS
func_definition returns [FuncDefinition ast]:
..... '{' var_definitions statements '}'

var_definitions.ast.addAll($statements.ast)



statements returns [List<Statement> ast = new ArrayList<sTATEMENT>()]:
(statement {$ast.add($statement.ast);})*
	;

statement returns [Statement ast]:.....................
	: 'print' expr ';'
	| expr '=' expr ';'
	;
//////OPCION A DE TRATAR LISTAS

//////OPCION B DE TRATAR LISTAS
func_definition returns [FuncDefinition ast]:
..... '{' var_definitions 
[List<Statement> stat = new ArrayList<sTATEMENT>()]:
(statement {stat.add($statement.ast);})* '}'

var_definitions.ast.addAll($statements.ast)



statements returns [List<Statement> ast = new ArrayList<sTATEMENT>()]:
(statement {$ast.add($statement.ast);})*
	;

statement returns [Statement ast]:.....................
	: 'print' expr ';'
	| expr '=' expr ';'
	;
//////OPCION B DE TRATAR LISTAS


expr returns [Expression ast]
	: expr ('*' | '/') expr
	| e1=expr o=('+' | '-') e2=expr {$ast = new Arithmetic($e1.start.getLine(), $e1.start.getCharPostitionInLine()+1 //////PUEDES USAR EN SU LUGAR A LA IMPLEMENTACIÓN DIRECTA EN JAVA DE LA SIGUIENTE MANERA: $e1.ast.getLine(), $e1.ast.getColumn()//////////,$e1.ast, $e2.ast,$o.text  );}
	| '(' expr ')'
	| IDENT {$ast = new Variable($ID.getLine(), $ID.getCharPostitionInLine()+1, $ID.text);}
	| INT_CONSTANT  {$ast = new IntConstant($INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPostitionInLine()+1, LeserHelper.lexemeToInt($INT_CONSTANT.text));}
	| REAL_CONSTANT
	;
