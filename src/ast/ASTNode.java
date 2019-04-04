package ast;

import semantic.Visitor;

public interface ASTNode {
	int getLine();

	int getColumn();

	public Object Accept(Visitor v, Object o);

}