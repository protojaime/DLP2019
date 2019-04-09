package semantic;

import ast.FuncionInvocation;
import ast.Program;
import ast.Definition.FuncionDefinition;
import ast.Definition.VarDefinition;
import ast.expressions.Arithmetic;
import ast.expressions.ArrayInvocation;
import ast.expressions.Cast;
import ast.expressions.Comparation;
import ast.expressions.ConstantChar;
import ast.expressions.ConstantDouble;
import ast.expressions.ConstantInt;
import ast.expressions.FieldAccess;
import ast.expressions.Logical;
import ast.expressions.UnaryMinus;
import ast.expressions.UnaryNot;
import ast.expressions.Variable;
import ast.statements.Asigment;
import ast.statements.IfStatement;
import ast.statements.Input;
import ast.statements.Print;
import ast.statements.Return;
import ast.statements.WhileStatement;
import ast.types.ArrayType;
import ast.types.CharType;
import ast.types.DoubleType;
import ast.types.ErrorType;
import ast.types.Field;
import ast.types.FuncionType;
import ast.types.IntType;
import ast.types.StructType;
import ast.types.VoidType;

public interface Visitor {

	Object Visit(Arithmetic d, Object o);

	Object Visit(ArrayInvocation d, Object o);

	Object Visit(Cast d, Object o);

	Object Visit(Comparation d, Object o);

	Object Visit(FieldAccess d, Object o);

	Object Visit(Logical d, Object o);

	Object Visit(UnaryMinus d, Object o);

	Object Visit(UnaryNot d, Object o);

	Object Visit(Variable d, Object o);

	Object Visit(ConstantInt d, Object o);

	Object Visit(ConstantChar d, Object o);

	Object Visit(ConstantDouble d, Object o);

	Object Visit(FuncionDefinition d, Object o);

	Object Visit(VarDefinition d, Object o);

	Object Visit(Asigment d, Object o);

	Object Visit(IfStatement d, Object o);

	Object Visit(WhileStatement d, Object o);

	Object Visit(Input d, Object o);

	Object Visit(Print d, Object o);

	Object Visit(Return d, Object o);

	Object Visit(ArrayType d, Object o);

	Object Visit(CharType d, Object o);

	Object Visit(DoubleType d, Object o);

	Object Visit(ErrorType d, Object o);

	Object Visit(IntType d, Object o);

	Object Visit(Field d, Object o);

	Object Visit(VoidType d, Object o);

	Object Visit(StructType d, Object o);

	Object Visit(Program d, Object o);

	Object Visit(FuncionInvocation funcionInvocation, Object o);

	Object Visit(FuncionType funcionType, Object o);

}
