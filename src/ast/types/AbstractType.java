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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Type Arithmetic(Type t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type Arithmetic() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type Logical() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type Logical(Type t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type Comparation(Type t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type canBeCast(Type t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isBuildInType() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Type Dot(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type SquareBraquets(Type t) {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		return 0;
	}

}
