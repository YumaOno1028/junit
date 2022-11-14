package junit.tutorial.ex03.e01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class MonthlyCalendarTest {
	
	@Test
	void test() {
		MonthlyCalendar monthlyCalendar = new MonthlyCalendar(LocalDate.of(2012, 1, 31));
		int result = monthlyCalendar.getRemainingDays();
		assertEquals(0, result);
	}
	
	@Test
	void test2() {
		MonthlyCalendar monthlyCalendar = new MonthlyCalendar(LocalDate.of(2012, 1, 30));
		int result = monthlyCalendar.getRemainingDays();
		assertEquals(1, result);
	}	

	@Test
	void test3() {
		MonthlyCalendar monthlyCalendar = new MonthlyCalendar(LocalDate.of(2012, 2, 1));
		int result = monthlyCalendar.getRemainingDays();
		assertEquals(28, result);
	}
	
}
