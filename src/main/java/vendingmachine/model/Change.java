package vendingmachine.model;

import vendingmachine.validation.ChangeValidation;

public class Change extends ChangeValidation {
	private int money;

	public Change(int money) throws IllegalArgumentException {
		validateMultipleOfTen(money);
		validateMinMoney(money);
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public boolean isEqualTo(int money) {
		return this.money == money;
	}
}
