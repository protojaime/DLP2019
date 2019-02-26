package ast;

import java.util.ArrayList;

import ast.Definition.Definition;

public class Program extends AbstractASTNode implements ASTNode {
	ArrayList<Definition> definitions = new ArrayList<Definition>();

	public Program(int row, int column, ArrayList<Definition> d) {
		super(row, column);
		this.definitions = d;
	}

}
