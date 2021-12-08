package vendingmachine.validation;

public class ChangeValidation {
	private static final int MIN_MONEY = 10;
	private static final int MULTIPLE_STANDARD = 10;

	public static void validateMultipleOfTen(int money) throws IllegalArgumentException {
		if (money % MULTIPLE_STANDARD != 0) {
			throw new IllegalArgumentException();
		}
	}

	public static void validateMinMoney(int money) throws IllegalArgumentException {
		if (money < MIN_MONEY) {
			throw new IllegalArgumentException();
		}
	}
}
