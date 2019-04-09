package ast.types;

import ast.ErrorHandler;
import semantic.Visitor;

public class ErrorType extends AbstractType implements Type {
	int line;
	int column;
	String message;

	public ErrorType(int l, int c, String m, ErrorHandler e) {
		super(l, c);
		line = l;
		column = c;
		message = m;
		e.addError(this);

	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public Object Accept(Visitor v, Object o) {
		return v.Visit(this, o);
	}
}
