package vendingmachine.model;

public class Change {

	private static final int MIN_MONEY = 10;

	private int money;

	public Change(int money) throws IllegalArgumentException {
		validateMinMoney(money);
		this.money = money;
	}

	private static void validateMinMoney(int money) throws IllegalArgumentException {
		if (money < MIN_MONEY) {
			throw new IllegalArgumentException();
		}
	}
}
