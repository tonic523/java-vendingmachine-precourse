package vendingmachine.validation;

public class InputValidation {

	public static void isNumber(String input) throws IllegalArgumentException {
		for (int i = 0; i < input.length(); i++) {
			isNumber(input.charAt(i));
		}
	}

	public static void isNumber(char c) throws IllegalArgumentException {
		if (!Character.isDigit(c)) {
			throw new IllegalArgumentException();
		}
	}

	public static void containsSquareBrackets(String input) throws IllegalArgumentException {
		if (input.charAt(0) != '[' || input.charAt(input.length() - 1) != ']') {
			throw new IllegalArgumentException();
		}
	}
}
