package vendingmachine.service;

import vendingmachine.domain.Money;
import vendingmachine.utils.validator.RequestValidator;

public class MoneyService {
	public static Money toService(String request) throws IllegalArgumentException {
		RequestValidator.isNumber(request);
		return new Money(Integer.parseInt(request));
	}
}
