package junit.tutorial.ex02.e04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ConsumptionTaxTest {

	@Nested
	class case1 {
		ConsumptionTax consumptionTax = new ConsumptionTax(5);

		@ParameterizedTest
		@CsvSource({"100,105","3000,3150","50,52"})
		void test1(int price,int tax) {
			int result = consumptionTax.apply(price);
			assertEquals(tax,result);
			
		}
	}
	
	@Nested
	class case2 {
		ConsumptionTax consumptionTax = new ConsumptionTax(10);

		@ParameterizedTest
		@CsvSource({"50,55"})
		void test1(int price,int tax) {
			int result = consumptionTax.apply(price);
			assertEquals(tax,result);
			
		}
	}
	
	@Nested
	class case3 {
		ConsumptionTax consumptionTax = new ConsumptionTax(3);

		@ParameterizedTest
		@CsvSource({"50,51"})
		void test1(int price,int tax) {
			int result = consumptionTax.apply(price);
			assertEquals(tax,result);
			
		}
	}
}
