package ast;

import java.util.ArrayList;

import ast.Definition.Definition;
import semantic.Visitor;

public class Program extends AbstractASTNode implements ASTNode {
	public ArrayList<Definition> definitions = new ArrayList<Definition>();

	public Program(int row, int column, ArrayList<Definition> d) {
		super(row, column);
		this.definitions = d;
	}

	@Override
	public Object Accept(Visitor v, Object o) {
		return v.Visit(this, o);
	}

}
