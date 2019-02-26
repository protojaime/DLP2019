package ast.expressions;

public class FieldAccess extends AbstractBinaryExpression implements Expression {

	FieldAccess(Expression A, Expression B) {
		super(A, B);
	}
}