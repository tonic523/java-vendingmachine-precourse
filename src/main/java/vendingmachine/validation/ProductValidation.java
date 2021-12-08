package vendingmachine.validation;

public class ProductValidation {
	private static final int MIN_PRICE = 100;

	public static void moreExpensive(int price) throws IllegalArgumentException {
		if (price < MIN_PRICE) {
			throw new IllegalArgumentException();
		}
	}
}
