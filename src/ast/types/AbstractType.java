package ast.types;

import java.util.List;

import ast.AbstractASTNode;

public abstract class AbstractType extends AbstractASTNode implements Type {
	int row;
	int column;

	public AbstractType(int row, int column) {
		super(row, column);
	}

	@Override
	public boolean isLogical() {

		return false;
	}

	@Override
	public Type Arithmetic(Type t) {

		return null;
	}

	@Override
	public Type Arithmetic() {

		return null;
	}

	@Override
	public Type Logical() {

		return null;
	}

	@Override
	public Type Logical(Type t) {

		return null;
	}

	@Override
	public Type Comparation(Type t) {

		return null;
	}

	@Override
	public Type canBeCast(Type t) {

		return null;
	}

	@Override
	public boolean isBuildInType() {

		return false;
	}

	@Override
	public Type Dot(String s) {

		return null;
	}

	@Override
	public Type SquareBraquets(Type t) {

		return null;
	}

	@Override
	public Type promotesTo(Type t) {
		if (t != null && t.getClass() == this.getClass())
			return t;
		return null;
	}

	@Override
	public Type Parenthesis(List<Type> lt) {

		return null;
	}

	@Override
	public int offsetSize() {
		return 0;
	}

	public String toString() {
		return this.getClass().getName();
	}

	@Override
	public String getSuffix() {
		return null;
	}
}
