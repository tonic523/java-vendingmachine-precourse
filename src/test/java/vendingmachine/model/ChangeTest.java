package vendingmachine.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ChangeTest {
	@DisplayName("잔돈은 최소 10원 이상이어야 한다.")
	@Test
	void validateMinMoney() {
		new Change(10);
		assertThatThrownBy(() -> new Change(9))
			.isInstanceOf(IllegalArgumentException.class);
	}

	@DisplayName("잔돈은 10의 배수이다.")
	@Test
	void validateMultipleOfTen() {
		new Change(10);
		assertThatThrownBy(() -> new Change(11))
			.isInstanceOf(IllegalArgumentException.class);
	}
}
