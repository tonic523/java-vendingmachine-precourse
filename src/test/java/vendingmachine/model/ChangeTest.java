package vendingmachine.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class ChangeTest {
	@DisplayName("실패")
	@ParameterizedTest
	@ValueSource(ints = {0, 1, 9, 11, 101})
	void validateMinMoney(int money) {
		assertThatThrownBy(() -> new Change(money))
			.isInstanceOf(IllegalArgumentException.class);
	}

	@DisplayName("성공")
	@ParameterizedTest
	@ValueSource(ints = {10, 100, 150, 500})
	void validateMultipleOfTen(int money) {
		Change change = new Change(money);
		assertThat(change.isEqualTo(money)).isTrue();
	}
}
