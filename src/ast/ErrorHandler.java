package ast;

import java.io.PrintStream;
import java.util.ArrayList;

import ast.types.ErrorType;

public class ErrorHandler {

	private ArrayList<ErrorType> errors = new ArrayList<ErrorType>();
	private static ErrorHandler instance;

	public void showErrors(PrintStream stream) {
		for (ErrorType error : errors)
			stream.println("line " + error.getLine() + ", column " + error.getColumn() + ": " + error.getMessage());
	}

	public boolean hasErrors() {
		return errors.size() > 0;
	}

	public static ErrorHandler getEH() {
		if (instance == null)
			instance = new ErrorHandler();
		return instance;
	}

	public void addError(ErrorType errorType) {
		errors.add(errorType);
	}
}
