package vendingmachine.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ChangeTest {
	@DisplayName("잔돈은 최소 10원 이상이어야 한다.")
	@Test
	void validateValue() {
		new Change(10);
		assertThatThrownBy(() -> new Change(9))
			.isInstanceOf(IllegalArgumentException.class);
	}
}
