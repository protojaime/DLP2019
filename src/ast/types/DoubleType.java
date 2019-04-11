package ast.types;

import semantic.Visitor;

public class DoubleType extends AbstractType implements Type {

	public DoubleType(int row, int column) {
		super(row, column);
	}

	@Override
	public boolean isBuildInType() {

		return true;
	}

	@Override
	public Type Arithmetic(Type t) {
		if (t instanceof DoubleType || t instanceof ErrorType) {
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
		if (t instanceof DoubleType) {
			return new IntType(0, 0);
		}
		return null;
	}

	@Override
	public Object Accept(Visitor v, Object o) {
		return v.Visit(this, o);
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
		return 4;
	}

	@Override
	public String getSuffix() {
		return "f";
	}
}
