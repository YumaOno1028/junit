package junit.tutorial.ex01.e04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NumberUtilsTest {

	@Test
	void test() {
		boolean result = NumberUtils.isEven(10);
		assertEquals(true, result);
	}

	@Test
	void test2() {
		boolean result = NumberUtils.isEven(7);
		assertEquals(false, result);
	}
	
}
