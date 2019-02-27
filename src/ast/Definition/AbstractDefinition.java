package ast.Definition;

import ast.AbstractASTNode;
import ast.types.Type;

public abstract class AbstractDefinition extends AbstractASTNode implements Definition {

	String Name;
	Type type;

	public void setType(Type type) {
		this.type = type;
	}

	public AbstractDefinition(int row, int column, String n, Type t) {
		super(row, column);
		Name = n;
		type = t;
	}

	public AbstractDefinition(int row, int column, String n) {
		super(row, column);
		Name = n;

	}

	@Override
	public String getName() {
		return Name;
	}

	@Override
	public Type getType() {
		return type;
	}

	@Override
	public int getScope() {
		// TODO Auto-generated method stub
		return 0;
	}

}
