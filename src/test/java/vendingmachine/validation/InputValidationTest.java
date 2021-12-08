package vendingmachine.validation;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InputValidationTest {
	@DisplayName("입력값은 숫자여야 한다.")
	@Test
	void isNumber() {
		Assertions.assertThatThrownBy(() -> InputValidation.isNumber("a"))
			.isInstanceOf(IllegalArgumentException.class);
	}
}
