package ast.Definition;

import ast.types.Type;

public class VarDefinition extends AbstractDefinition implements Definition {

	public VarDefinition(int row, int column, String n, Type t) {
		super(row, column, n, t);
	}

}
