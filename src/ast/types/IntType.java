package ast.types;

import semantic.Visitor;

public class IntType extends AbstractType implements Type {

	public IntType(int row, int column) {
		super(row, column);
	}

	@Override
	public Object Accept(Visitor v, Object o) {
		return v.Visit(this, o);
	}

	@Override
	public boolean isLogical() {
		return true;
	}

	@Override
	public boolean isBuildInType() {

		return true;
	}

	@Override
	public Type Arithmetic(Type t) {
		if (t instanceof IntType || t instanceof ErrorType) {
			return t;
		}
		return null;
	}

	@Override
	public Type Arithmetic() {
		return this;
	}

	@Override
	public Type Comparation(Type t) {
		if (t instanceof IntType) {
			return new IntType(this.column, this.column);
		}
		return null;
	}

	@Override
	public Type Logical(Type t) {
		if (t instanceof IntType) {
			return this;
		}
		return null;
	}

	@Override
	public Type Logical() {
		return this;
	}

	@Override
	public Type canBeCast(Type t) {
		if (t.isBuildInType()) {
			return this;
		}
		return null;
	}

	@Override
	public int offsetSize() {
		return 2;
	}

	@Override
	public String getSuffix() {
		return "i";
	}

}
