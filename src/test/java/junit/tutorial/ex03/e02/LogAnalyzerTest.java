package junit.tutorial.ex03.e02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.doThrow;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class LogAnalyzerTest {
	
	@InjectMocks
	LogAnalyzer logAnalyzer;

	@Mock
	LogLoader logLoader;
	

	private static final String file = "file"; 
	
	@Test
	void test()throws Exception {
		doThrow(new IOException("error by stub")).when(logLoader).load(file);
		AnalyzeException e = assertThrows(AnalyzeException.class, ()-> logAnalyzer.analyze(file));

		Throwable throwable = e.getCause();
		assertTrue(throwable instanceof IOException);
		assertEquals("error by stub", throwable.getMessage());
		
	}

}
