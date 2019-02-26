package ast.Definition;

import java.util.ArrayList;

import ast.statements.Statement;
import ast.types.Type;

public class FuncionDefinition extends AbstractDefinition implements Definition {
	ArrayList<Statement> definitions = new ArrayList<Statement>();

	public FuncionDefinition(int row, int column, String n, Type t) {
		super(row, column, n, t);
	}
}
