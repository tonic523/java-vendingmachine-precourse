package vendingmachine.validation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ProductValidationTest {
	@DisplayName("가격은 100보다 커야 한다.")
	@Test
	void priceMinValue() {
		assertThatThrownBy(() -> ProductValidation.moreExpensive(99))
			.isInstanceOf(IllegalArgumentException.class);
	}
}
