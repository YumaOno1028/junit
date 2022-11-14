package junit.tutorial.ex02.e01;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	FizzBuzz fizzBuzz = new FizzBuzz();

	@Test
	void test() {
		List<String> result = fizzBuzz.createFizzBuzzList(16);
		List<String> ans = new ArrayList<>();
		ans.addAll(Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz","16"));
		assertIterableEquals(ans, result);
	}

}
