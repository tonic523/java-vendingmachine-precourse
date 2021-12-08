package vendingmachine.validation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import vendingmachine.model.Change;

import static org.assertj.core.api.Assertions.*;

public class ChangeValidationTest {
	@DisplayName("잔돈은 최소 10원 이상이어야 한다.")
	@Test
	void validateMinMoney() {
		new Change(10);
		assertThatThrownBy(() -> ChangeValidation.validateMinMoney(9))
			.isInstanceOf(IllegalArgumentException.class);
	}

	@DisplayName("잔돈은 10의 배수이다.")
	@Test
	void validateMultipleOfTen() {
		new Change(10);
		assertThatThrownBy(() -> ChangeValidation.validateMultipleOfTen(11))
			.isInstanceOf(IllegalArgumentException.class);
	}
}
