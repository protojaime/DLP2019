package ast.expressions;

public class Arithmetic extends AbstractBinaryExpression implements Expression {
	String Operator;

	Arithmetic(Expression A, Expression B, String operator) {
		super(A, B);
		Operator = operator;
	}

}