package ast.expressions;

public class Comparation extends AbstractBinaryExpression implements Expression {
	String Comparatior;

	Comparation(Expression A, Expression B, String comparatior) {
		super(A, B);
		Comparatior = comparatior;
	}
}