package junit.tutorial.ex01.e02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		Calculator calculator = new Calculator();
		int result = calculator.divide(4,0);
		assertEquals(0, result);
	}

}
