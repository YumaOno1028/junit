package junit.tutorial.ex02.e02;

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
		InputStream fileStream = new FileInputStream("junit/src/main/java/junit.tutorial/ex02/e02/Employee.txt");
		InputStream bufferedStream = new BufferedInputStream(fileStream);
	


		List<Employee> employeeList = Employee.load(systemin);
		assertEquals("Ichiro", employeeList, "firstName");
		
		
		bufferedStream.close();

	}	

}
