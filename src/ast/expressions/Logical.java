package ast.expressions;

public class Logical extends AbstractBinaryExpression implements Expression {
	String LogicSymbol;

	Logical(Expression A, Expression B, String logicSymbol) {
		super(A, B);
		LogicSymbol = logicSymbol;
	}
}