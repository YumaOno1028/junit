package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CounterTest {

	@Test
	void test() {
		Counter counter = new Counter();
		int result = counter.increment();
		assertEquals(1, result);
	}
	
	@Test
	void test2() {
		Counter counter = new Counter();
		int result = counter.increment();
		result = counter.increment();
		assertEquals(2, result);
	}
	
	
	@Test
	void test3() {
		Counter counter = new Counter();
		int result;
		for(int i = 1; i <= 50; i++) {
			result = counter.increment();
		}
		result = counter.increment();
		assertEquals(51, result);
		
	}

}
