package junit.tutorial.ex03.e02;

import static org.junit.jupiter.api.Assertions.assertThrows;
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
		doThrow(new IOException()).when(logLoader).load(file);
		assertThrows(AnalyzeException.class, ()-> logAnalyzer.analyze(file));

	}

}
