package codegeneration;

import ast.Definition.VarDefinition;
import ast.expressions.ArrayInvocation;
import ast.expressions.FieldAccess;
import ast.expressions.Variable;
import ast.types.StructType;

public class AddressVisitor extends abstractCodeGeneratorVisitor {
	ValueVisitor vv;

	AddressVisitor(CodeGenerator c, ValueVisitor v) {
		super(c);
		vv = v;

	}

	@Override
	public Object Visit(Variable d, Object o) {
		VarDefinition v = (VarDefinition) d.getDefinition();
		if (v.getScope() == 0)
			this.cg.pusha(v.getOffset());
		else {
			this.cg.pushbp();
			this.cg.push("i", Integer.toString(v.getOffset()));
			this.cg.getOperation("+", "i");
		}
		return null;
	}

	@Override
	public Object Visit(ArrayInvocation d, Object o) {
		d.getExpressionA().Accept(this, o);
		d.getExpressionB().Accept(this.vv, o);
		this.cg.push("i", Integer.toString(d.getType().offsetSize()));
		this.cg.getOperation("*", "i");
		this.cg.getOperation("+", "i");
		return null;
	}

	@Override
	public Object Visit(FieldAccess d, Object o) {
		d.getExpression().Accept(this, o);
		int offsetField = ((StructType) d.getExpression().getType()).getFieldOffset(d.getName());
		this.cg.push("i", Integer.toString(offsetField));
		this.cg.getOperation("+", "i");
		return null;
	}
}
