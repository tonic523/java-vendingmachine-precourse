package vendingmachine.validation;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class InputValidationTest {
	@DisplayName("문자열이 빈값이면 안된다.")
	@Test
	void isEmpty() {
		assertThatThrownBy(() -> InputValidation.isEmpty(""))
			.isInstanceOf(IllegalArgumentException.class);
	}


	@DisplayName("입력값은 숫자여야 한다.")
	@Test
	void isNumber() {
		assertThatThrownBy(() -> InputValidation.isNumber("a"))
			.isInstanceOf(IllegalArgumentException.class);
	}

	@DisplayName("상품 입력")
	@Nested
	class ProductInput {
		@DisplayName("[,]가 양 끝에 있어야 한다.")
		@ParameterizedTest
		@ValueSource(strings = {"abc", "[abc", "abc]", "]abc["})
		void containsSquareBrackets(String input) {
			assertThatThrownBy(() -> InputValidation.containsSquareBrackets(input))
				.isInstanceOf(IllegalArgumentException.class);
		}
	}


}
