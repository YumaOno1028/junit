package junit.tutorial.ex02.e02;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void test() throws IOException {
		InputStream systemin = System.in;
		InputStream fileStream = new FileInputStream("/Users/oonoyuuma/spring-workspace/junit/src/main/java/junit/tutorial/ex02/e02/Employee.txt");
		InputStream bufferedStream = new BufferedInputStream(fileStream);
		List<Employee> empList = Employee.load(bufferedStream);
		Employee emp = empList.get(0);
		
		assertAll(
		() -> assertEquals("Ichiro", emp.getFirstName()),
		() -> assertEquals("Tanaka", emp.getLastName()),
		() -> assertEquals("ichiro@example.com", emp.getEmail())
		);
		
		bufferedStream.close();

	}	

}
