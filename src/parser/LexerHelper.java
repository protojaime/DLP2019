package parser;

public class LexerHelper {

	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static char lexemeToChar(String str) {
		char[] ListaChar = str.toCharArray();
		if (ListaChar.length > 3) {
			if (Character.isDigit(ListaChar[2])) {
				return (char) Integer.parseInt(str.subSequence(2, str.length() - 1).toString());
			} else if (ListaChar[2] == 'n') {
				return '\n';
			} else if (ListaChar[2] == 't') {
				return '\t';
			}
		}
		return ListaChar[1];

	}

	public static Double lexemeToReal(String str) {
		try {
			return Double.parseDouble(str);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		return (double) -1;
	}

	// TODO: Implement the lexemeToChar and lexemeToReal methods

}
