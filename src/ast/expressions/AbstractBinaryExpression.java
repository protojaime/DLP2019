package ast.expressions;

public abstract class AbstractBinaryExpression implements Expression {
	Expression ExpressionA;
	Expression ExpressionB;

	AbstractBinaryExpression(Expression A, Expression B) {
		ExpressionA = A;
		ExpressionB = B;
	}

}
