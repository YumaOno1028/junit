package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

class StringUtilsTest {


	@Test
	void test() {
		String result = StringUtils.toSnakeCase("aaa");
		assertEquals("aaa", result);
	}
	
	@Test
	void test2() {
		String result = StringUtils.toSnakeCase("HelloWorld");
		assertEquals("hello_world", result);
	}
	
	@Test
	void test3() {
		String result = StringUtils.toSnakeCase("practiceJunit");
		assertEquals("practice_junit", result);
		
	}
	
	

}
