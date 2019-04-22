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
import ast.statements.Statement;
import ast.statements.WhileStatement;
import ast.types.ErrorType;
import ast.types.FuncionType;
import ast.types.VoidType;

public class ExecuteVisitor extends abstractCodeGeneratorVisitor {

	ValueVisitor vv;
	AddressVisitor av;

	public ExecuteVisitor(CodeGenerator c) {
		super(c);
		vv = new ValueVisitor(c);
		av = new AddressVisitor(c, vv);
		vv.setAv(av);
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
		// to allocate enough space on top of the stack for parameters
		this.cg.enter(d.getBytesParameters());

		for (VarDefinition def : ((FuncionType) d.getType()).getVars()) {
			def.Accept(this, o);
		}
		for (Statement def : d.getStatements()) {
			def.Accept(this, o);
		}

		if (((FuncionType) d.getType()).getReturnType() instanceof VoidType) {
			this.cg.Return(0, d.getBytesLocalVariables(), d.getBytesParameters());
		}
		return null;
	}

	@Override
	public Object Visit(VarDefinition d, Object o) {
		this.cg.line(d.getLine());
		this.cg.comment(d.getName() + ":" + d.getType().getClass().getName());
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
