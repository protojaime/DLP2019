package codegeneration;

import ast.FuncionInvocation;
import ast.Program;
import ast.Definition.Definition;
import ast.Definition.FuncionDefinition;
import ast.Definition.VarDefinition;
import ast.expressions.ArrayInvocation;
import ast.expressions.ConstantInt;
import ast.expressions.Expression;
import ast.statements.Asigment;
import ast.statements.IfStatement;
import ast.statements.Input;
import ast.statements.Print;
import ast.statements.Return;
import ast.statements.Statement;
import ast.statements.WhileStatement;
import ast.types.ArrayType;
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
		this.cg.line(d.getLine());
		this.cg.label(d.getName());
		this.cg.print("\t' * Parameters");
		for (VarDefinition def : ((FuncionType) d.getType()).getVars()) {
			def.Accept(this, o);
		}
		if (d.getStatements().size() > 0 && d.getStatements().toArray()[0] instanceof VarDefinition) {
			this.cg.print("\t' * Local variables");
			this.cg.enter(Math.abs(d.getBytesLocalVariables()));
		}

		for (Statement def : d.getStatements()) {
			def.Accept(this, d);
		}

		if (((FuncionType) d.getType()).getReturnType() instanceof VoidType) {
			this.cg.Return(0, Math.abs(d.getBytesLocalVariables()), d.getBytesParameters());
		}
		return null;
	}

	@Override
	public Object Visit(VarDefinition d, Object o) {
		this.cg.print("\t' * " + d.getType().toString() + " " + d.getName() + " (offset " + d.getOffset() + ")");
		return null;
	}

	@Override
	public Object Visit(Asigment d, Object o) {
		this.cg.line(d.getLine());
		this.cg.print("\t' * Assignment");
//arrays
		if (d.getExpressionA().getType() instanceof ArrayType) {
			ArrayType ar = ((ArrayType) d.getExpressionA().getType());
			ArrayType ar2 = ((ArrayType) d.getExpressionB().getType());
			int i = 0;
			for (; i < (ar).getSize(); i++) {

				// hacemos una version falsa de ArrayInvocation
				ArrayInvocation dummyar1 = new ArrayInvocation(d.getExpressionA().getLine(),
						d.getExpressionA().getColumn(), ar.getType(), d.getExpressionA(),
						new ConstantInt(d.getExpressionA().getLine(), d.getExpressionA().getColumn(), i));
				ArrayInvocation dummyar2 = new ArrayInvocation(d.getExpressionB().getLine(),
						d.getExpressionB().getColumn(), ar2.getType(), d.getExpressionB(),
						new ConstantInt(d.getExpressionB().getLine(), d.getExpressionB().getColumn(), i));
				// el resto es igual que el normal
				dummyar1.Accept(av, o);
				dummyar2.Accept(vv, o);
				this.cg.store(dummyar1.getType().getSuffix());
			}

		}
//normal
		else {
			d.ExpressionA.Accept(av, o);
			d.ExpressionB.Accept(vv, o);
			this.cg.store(d.ExpressionA.getType().getSuffix());
		}
		return null;
	}

	@Override
	public Object Visit(IfStatement d, Object o) {
		this.cg.print("\t' * If statement");
		String Else = this.cg.AutoGeneratedLabel("elseBody");
		String End = this.cg.AutoGeneratedLabel("endIf");
		d.getExpression().Accept(vv, o);
		this.cg.jumpIfZero(Else);
		for (Statement s : d.getBody()) {
			s.Accept(this, o);
		}
		this.cg.jump(End);

		this.cg.label(Else);
		if (d.getElseBody() != null) {
			this.cg.print("\t' * else body");
			for (Statement s : d.getElseBody()) {
				s.Accept(this, o);
			}
		}
		this.cg.label(End);
		return null;
	}

	@Override
	public Object Visit(WhileStatement d, Object o) {
		this.cg.print("\t' * While statement");
		String Start = this.cg.AutoGeneratedLabel("startWhile");
		String End = this.cg.AutoGeneratedLabel("startWhile");

		this.cg.label(Start);
		d.getExpression().Accept(vv, o);
		this.cg.jumpIfZero(End);
		for (Statement s : d.getBody()) {
			s.Accept(this, o);
		}
		this.cg.jump(Start);
		this.cg.label(End);

		return null;
	}

	@Override
	public Object Visit(Input d, Object o) {

		for (Expression def : d.getExp()) {
			def.Accept(av, o);
			this.cg.in(def.getType().getSuffix());
			this.cg.store(def.getType().getSuffix());
		}

		return null;
	}

	@Override
	public Object Visit(Print d, Object o) {

		for (Expression def : d.getExp()) {
			this.cg.print("\t' * Write");

			if (def.getType() instanceof ArrayType) {
				ArrayType ar = ((ArrayType) def.getType());
				for (int i = 0; i < (ar).getSize(); i++) {
					// hacemos una version falsa de ArrayInvocation
					ArrayInvocation dummyar = new ArrayInvocation(def.getLine(), def.getColumn(), ar.getType(), def,
							new ConstantInt(def.getLine(), def.getColumn(), i));
					// llamamos a su valuevisitor para obtener valor
					dummyar.Accept(vv, d);
					// lo imprimimos
					this.cg.out(ar.getType().getSuffix());
				}
			} else {
				def.Accept(vv, d);
				this.cg.out(def.getType().getSuffix());
			}
		}
		return null;
	}

	@Override
	public Object Visit(Return d, Object o) {
		d.getExpression().Accept(vv, o);
		FuncionDefinition funDefinition = (FuncionDefinition) o;

		this.cg.Return(d.getExpression().getType().offsetSize(), Math.abs(funDefinition.getBytesLocalVariables()),
				funDefinition.getBytesParameters());

		return null;
	}

	@Override
	public Object Visit(FuncionInvocation funcionInvocation, Object o) {
		for (Expression def : funcionInvocation.getExpressions()) {
			def.Accept(vv, o);
		}
		this.cg.call((funcionInvocation.getVariable().getName()));
		if (!(((Expression) funcionInvocation).getType() instanceof VoidType)) {
			this.cg.pop(((Expression) funcionInvocation).getType().getSuffix());
		}
		return null;
	}
}
