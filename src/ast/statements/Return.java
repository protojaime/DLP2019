package ast.statements;

import ast.expressions.Expression;
import semantic.Visitor;

public class Return extends AbstractStatement implements Statement {

	public Expression getExpression() {
		return Expression;
	}

	public void setExpression(Expression expression) {
		Expression = expression;
	}

	public Expression Expression;

	public Return(int row, int column, Expression A) {
		super(row, column);
		Expression = A;
	}

	@Override
	public Object Accept(Visitor v, Object o) {
		return v.Visit(this, o);
	}
}
