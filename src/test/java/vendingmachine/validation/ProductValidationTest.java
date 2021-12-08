package vendingmachine.validation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ProductValidationTest {
	@DisplayName("상품 가격은 100원보다 비싸다.")
	@Test
	void priceMinValue() {
		assertThatThrownBy(() -> ProductValidation.moreExpensive(99))
			.isInstanceOf(IllegalArgumentException.class);
	}

	@DisplayName("상품 가격은 10의 배수이다.")
	@Test
	void validateMultipleOfTen() {
		assertThatThrownBy(() -> ProductValidation.validateMultipleOfTen(101))
			.isInstanceOf(IllegalArgumentException.class);
	}
}
