package ast.expressions;

import ast.types.Type;
import semantic.Visitor;

public class ArrayInvocation extends AbstractExpression implements Expression {
	public Expression ExpressionA;
	public Expression ExpressionB;

	public ArrayInvocation(int row, int column, Expression A, Expression B) {
		super(row, column);
		ExpressionA = A;
		ExpressionB = B;

	}

	public ArrayInvocation(int row, int column, Type t, Expression A, Expression B) {
		super(row, column, t);
		ExpressionA = A;
		ExpressionB = B;
	}

	@Override
	public Object Accept(Visitor v, Object o) {
		return v.Visit(this, o);
	}

	boolean Lvalue;

	@Override
	public boolean getLvalue() {
		return Lvalue;
	}

	public Expression getExpressionA() {
		return ExpressionA;
	}

	public void setExpressionA(Expression expressionA) {
		ExpressionA = expressionA;
	}

	public Expression getExpressionB() {
		return ExpressionB;
	}

	public void setExpressionB(Expression expressionB) {
		ExpressionB = expressionB;
	}

	@Override
	public void setLvalue(boolean lvalue) {
		Lvalue = lvalue;
	}

}