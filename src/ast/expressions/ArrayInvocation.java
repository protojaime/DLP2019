package ast.expressions;

public class ArrayInvocation extends AbstractBinaryExpression implements Expression {

	ArrayInvocation(Expression A, Expression B) {
		super(A, B);
	}

}