package semantic;

import ast.FuncionInvocation;
import ast.Program;
import ast.Definition.Definition;
import ast.Definition.FuncionDefinition;
import ast.Definition.VarDefinition;
import ast.expressions.Arithmetic;
import ast.expressions.ArrayInvocation;
import ast.expressions.Cast;
import ast.expressions.Comparation;
import ast.expressions.ConstantChar;
import ast.expressions.ConstantDouble;
import ast.expressions.ConstantInt;
import ast.expressions.Expression;
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
import ast.statements.Statement;
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

public abstract class AbstractVisitor implements Visitor {

	@Override
	public Object Visit(Program d, Object o) {
		for (Definition def : d.definitions) {
			def.Accept(this, o);
		}
		return null;
	}

	@Override
	public Object Visit(Arithmetic d, Object o) {
		d.getExpressionA().Accept(this, o);
		d.getExpressionB().Accept(this, o);
		return null;
	}

	@Override
	public Object Visit(ArrayInvocation d, Object o) {
		d.getExpressionA().Accept(this, o);
		d.getExpressionB().Accept(this, o);
		return null;
	}

	@Override
	public Object Visit(Cast d, Object o) {
		d.getEx().Accept(this, o);
		d.getImplementedType().Accept(this, o);
		return null;
	}

	@Override
	public Object Visit(Comparation d, Object o) {
		d.getExpressionA().Accept(this, o);
		d.getExpressionB().Accept(this, o);
		return null;
	}

	@Override
	public Object Visit(FieldAccess d, Object o) {

		d.getExpression().Accept(this, o);
		// d.getExpression().getType().Accept(this, o);
		return null;
	}

	@Override
	public Object Visit(Logical d, Object o) {
		d.getExpressionA().Accept(this, o);
		d.getExpressionB().Accept(this, o);
		return null;
	}

	@Override
	public Object Visit(UnaryMinus d, Object o) {
		d.getExpression().Accept(this, o);
		return null;
	}

	@Override
	public Object Visit(UnaryNot d, Object o) {
		d.getExpression().Accept(this, o);
		return null;
	}

	@Override
	public Object Visit(Variable d, Object o) {

		return null;
	}

	@Override
	public Object Visit(ConstantInt d, Object o) {

		return null;
	}

	@Override
	public Object Visit(ConstantChar d, Object o) {

		return null;
	}

	@Override
	public Object Visit(ConstantDouble d, Object o) {

		return null;
	}

	@Override
	public Object Visit(FuncionDefinition d, Object o) {
		d.getType().Accept(this, o);
		for (Statement def : d.getStatements()) {
			def.Accept(this, o);
		}

		return null;
	}

	@Override
	public Object Visit(VarDefinition d, Object o) {
		d.getType().Accept(this, o);
		return null;
	}

	@Override
	public Object Visit(Asigment d, Object o) {
		d.getExpressionA().Accept(this, o);
		d.getExpressionB().Accept(this, o);
		return null;
	}

	@Override
	public Object Visit(IfStatement d, Object o) {
		d.getExpression().Accept(this, o);
		for (Statement def : d.getBody()) {
			def.Accept(this, o);
		}
		for (Statement def : d.getElseBody()) {
			def.Accept(this, o);
		}
		return null;
	}

	@Override
	public Object Visit(WhileStatement d, Object o) {
		d.getExpression().Accept(this, o);
		for (Statement def : d.getBody()) {
			def.Accept(this, o);
		}
		return null;
	}

	@Override
	public Object Visit(Input d, Object o) {
		for (Expression def : d.getExp()) {
			def.Accept(this, o);
		}

		return null;
	}

	@Override
	public Object Visit(Print d, Object o) {
		for (Expression def : d.getExp()) {
			def.Accept(this, o);
		}
		return null;
	}

	@Override
	public Object Visit(Return d, Object o) {

		d.Expression.Accept(this, o);

		return null;
	}

	@Override
	public Object Visit(ArrayType d, Object o) {
		d.getType().Accept(this, o);
		return null;
	}

	@Override
	public Object Visit(CharType d, Object o) {

		return null;
	}

	@Override
	public Object Visit(DoubleType d, Object o) {

		return null;
	}

	@Override
	public Object Visit(ErrorType d, Object o) {

		return null;
	}

	@Override
	public Object Visit(IntType d, Object o) {

		return null;
	}

	@Override
	public Object Visit(Field d, Object o) {
		d.getType().Accept(this, o);
		return null;
	}

	@Override
	public Object Visit(VoidType d, Object o) {

		return null;
	}

	@Override
	public Object Visit(StructType d, Object o) {

		for (Field def : d.getFieldlist()) {
			def.Accept(this, o);
		}
		return null;
	}

	@Override
	public Object Visit(FuncionInvocation funcionInvocation, Object o) {
		funcionInvocation.getVariable().Accept(this, o);

		for (Expression def : funcionInvocation.getExpressions()) {
			def.Accept(this, o);
		}

		return null;
	}

	@Override
	public Object Visit(FuncionType funcionType, Object o) {
		funcionType.getReturnType().Accept(this, o);
		for (VarDefinition def : funcionType.getVars()) {
			def.Accept(this, o);
		}
		return null;
	}
}
