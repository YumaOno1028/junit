package junit.tutorial.ex02.e03;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RangeTest {

	@Nested
	class case1 {
		Range range = new Range(0.0, 10.5);

		@ParameterizedTest
		@ValueSource(doubles = { 0.0, 10.5 })
		void test(double d) {

			boolean result = range.contains(d);
			assertTrue(result);
		}

		@ParameterizedTest
		@ValueSource(doubles = { -0.1, 10.6 })
		void test2(double d) {
			boolean result = range.contains(d);
			assertFalse(result);
		}
	}

	@Nested
	class case2 {
		Range range = new Range(-5.1, 5.1);

		@ParameterizedTest
		@ValueSource(doubles = { -5.1, 5.1 })
		void test3(double d) {
			boolean result = range.contains(d);
			assertTrue(result);

		}

		@ParameterizedTest
		@ValueSource(doubles = { -5.2, 5.2})
		void test4(double d) {
			boolean result = range.contains(d);
			assertFalse(result);

		}
	}
}
