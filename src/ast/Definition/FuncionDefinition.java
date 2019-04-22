package ast.Definition;

import java.util.ArrayList;

import ast.statements.Statement;
import ast.types.Type;
import semantic.Visitor;

public class FuncionDefinition extends AbstractDefinition implements Definition {
	private int BytesParameters;
	private int BytesLocalVariables;

	public int getBytesParameters() {
		return BytesParameters;
	}

	public void setBytesParameters(int bytesParameters) {
		BytesParameters = bytesParameters;
	}

	public int getBytesLocalVariables() {
		return BytesLocalVariables;
	}

	public void setBytesLocalVariables(int bytesLocalVariables) {
		BytesLocalVariables = bytesLocalVariables;
	}

	ArrayList<Statement> statements = new ArrayList<Statement>();

	public ArrayList<Statement> getStatements() {
		return statements;
	}

	public void setStatements(ArrayList<Statement> statements) {
		this.statements = statements;
	}

	public FuncionDefinition(int row, int column, String n, ArrayList<Statement> s, Type t) {
		super(row, column, n, t);
		statements = s;
	}

	@Override
	public Object Accept(Visitor v, Object o) {
		return v.Visit(this, o);
	}
}
