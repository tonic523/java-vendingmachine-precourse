package vendingmachine.validation;

public class ProductValidation {
	private static final int MIN_PRICE = 100;
	private static final int MULTIPLE_STANDARD = 10;

	public static void moreExpensive(int price) throws IllegalArgumentException {
		if (price < MIN_PRICE) {
			throw new IllegalArgumentException();
		}
	}

	public static void validateMultipleOfTen(int price) throws IllegalArgumentException {
		if (price % MULTIPLE_STANDARD != 0) {
			throw new IllegalArgumentException();
		}
	}
}
