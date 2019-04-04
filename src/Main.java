import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import ast.ErrorHandler;
import ast.Program;
import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorTree;
import parser.PmmLexer;
import parser.PmmParser;
import semantic.EvalVisitor;
import semantic.TypeCheckingVisitor;
import semantic.identificationVisitor;

public class Main {

	public static void main(String... args) throws Exception {
		if (args.length < 1) {
			System.err.println("Please, pass me the input file.");
			return;
		}
		/**
		 * Array de structs print podria hacerse cn una sola expresion, simplemente
		 * necesitas generar un print con cada EXPRESION Cast y FieldAccess
		 */
		// create a lexer that feeds off of input CharStream
		CharStream input = CharStreams.fromFileName(args[0]);
		PmmLexer lexer = new PmmLexer(input);

		// create a parser that feeds off the tokens buffer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		PmmParser parser = new PmmParser(tokens);
		Program ast = parser.program().ast;

		identificationVisitor iv = new identificationVisitor();
		TypeCheckingVisitor tv = new TypeCheckingVisitor();
		EvalVisitor ev = new EvalVisitor();
		ast.Accept(iv, new Object());
		ast.Accept(ev, new Object());
		ast.Accept(tv, new Object());

		if (ErrorHandler.getEH().hasErrors()) {

			ErrorHandler.getEH().showErrors(System.out);
		}
		// * The AST is shown
		IntrospectorModel model = new IntrospectorModel("Program", ast);
		new IntrospectorTree("Introspector", model);
	}
}
