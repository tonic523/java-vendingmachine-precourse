package vendingmachine.validation;

public class InputValidation {
	private static final int CORRECT_SIZE = 3;

	public static void isEmpty(String input) throws IllegalArgumentException {
		if (input.isEmpty()) {
			throw new IllegalArgumentException();
		}
	}

	public static void isNumber(String input) throws IllegalArgumentException {
		isEmpty(input);
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
		isEmpty(input);
		if (input.charAt(0) != '[' || input.charAt(input.length() - 1) != ']') {
			throw new IllegalArgumentException();
		}
	}

	public static void isCorrectSize(String[] splitInput) throws IllegalArgumentException {
		if (splitInput.length != CORRECT_SIZE) {
			throw new IllegalArgumentException();
		}
	}
}
