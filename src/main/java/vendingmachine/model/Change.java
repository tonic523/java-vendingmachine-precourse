package vendingmachine.model;

public class Change {

	private static final int MIN_MONEY = 10;
	private static final int MULTIPLE_STANDARD = 10;

	private int money;

	public Change(int money) throws IllegalArgumentException {
		validateMultipleOfTen(money);
		validateMinMoney(money);
		this.money = money;
	}

	private static void validateMultipleOfTen(int money) throws IllegalArgumentException {
		if (money % MULTIPLE_STANDARD != 0) {
			throw new IllegalArgumentException();
		}
	}

	private static void validateMinMoney(int money) throws IllegalArgumentException {
		if (money < MIN_MONEY) {
			throw new IllegalArgumentException();
		}
	}
}
