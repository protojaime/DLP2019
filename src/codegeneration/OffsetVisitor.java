package codegeneration;

import ast.Definition.FuncionDefinition;
import ast.Definition.VarDefinition;
import ast.types.FuncionType;
import semantic.AbstractVisitor;

public class OffsetVisitor extends AbstractVisitor {

	int globalOffset = 0;
	private int LocalOffset = 0;
	private int parameterOffset = 4;

	@Override
	public Object Visit(FuncionDefinition d, Object o) {
		super.Visit(d, o);
		d.setBytesLocalVariables(LocalOffset);
		d.setBytesParameters(parameterOffset);

		LocalOffset = 0;
		parameterOffset = 4;
		return null;
	}

	@Override
	public Object Visit(VarDefinition d, Object o) {
		super.Visit(d, o);
		if (d.getScope() == 0) {
			d.setOffset(globalOffset);
			globalOffset += d.getType().offsetSize();
		} else {
			if (o instanceof Boolean && (Boolean) o) {
				d.setOffset(parameterOffset);
				parameterOffset += d.getType().offsetSize();
			} else {
				LocalOffset -= d.getType().offsetSize();

				d.setOffset(LocalOffset);
			}
		}
		return null;
	}

	@Override
	public Object Visit(FuncionType d, Object p) {
		d.getReturnType().Accept(this, p);
		for (int i = d.getVars().size() - 1; i >= 0; i--) {
			d.getVars().get(i).Accept(this, true);
		}
		return null;
	}

}
