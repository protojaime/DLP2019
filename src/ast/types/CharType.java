package ast.types;

import semantic.Visitor;

public class CharType extends AbstractType implements Type {

	public CharType(int row, int column) {
		super(row, column);
	}

	@Override
	public boolean isBuildInType() {
		return true;
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
		return 1;
	}

	@Override
	public String getSuffix() {
		return "b";
	}

	@Override
	public Type Arithmetic() {
		return this;
	}

	@Override
	public Type Arithmetic(Type t) {
		if (t instanceof CharType || t instanceof ErrorType) {
			return t;
		}
		return null;
	}
}
