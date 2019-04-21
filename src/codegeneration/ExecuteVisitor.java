package codegeneration;

import ast.ErrorHandler;
import ast.Program;
import ast.Definition.Definition;
import ast.Definition.FuncionDefinition;
import ast.Definition.VarDefinition;
import ast.expressions.Expression;
import ast.statements.Asigment;
import ast.statements.IfStatement;
import ast.statements.Input;
import ast.statements.Print;
import ast.statements.Return;
import ast.statements.WhileStatement;
import ast.types.ErrorType;

public class ExecuteVisitor extends abstractCodeGeneratorVisitor {

	ValueVisitor vv;
	AddressVisitor av;

	public ExecuteVisitor(CodeGenerator c) {
		super(c);
		vv = new ValueVisitor(c);
		av = new AddressVisitor(c, vv);
	}

	@Override
	public Object Visit(Program d, Object o) {
		this.cg.call("main");
		this.cg.halt();
		for (Definition def : d.definitions) {
			def.Accept(this, o);
		}
		return null;
	}

	@Override
	public Object Visit(FuncionDefinition d, Object o) {
		this.cg.label(d.getName());
		this.cg.line(d.getLine());

		return null;
	}

	@Override
	public Object Visit(VarDefinition d, Object o) {
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(Asigment d, Object o) {
		super.Visit(d, o);
		if (!d.ExpressionA.getLvalue()) {
			new ErrorType(d.getLine(), d.getColumn(), "no se puede aplicar una asignación a esta expresion",
					ErrorHandler.getEH());
		}
		return null;
	}

	@Override
	public Object Visit(IfStatement d, Object o) {
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(WhileStatement d, Object o) {
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(Input d, Object o) {
		super.Visit(d, o);
		for (Expression def : d.getExp()) {

			if (!def.getLvalue()) {
				new ErrorType(def.getLine(), def.getColumn(), "valor no valido como input introducido",
						ErrorHandler.getEH());
			}
		}

		return null;
	}

	@Override
	public Object Visit(Print d, Object o) {
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(Return d, Object o) {
		super.Visit(d, o);

		return null;
	}

}
