package junit.tutorial.ex03.e03;

import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class NetworkResourcesTest {
	
	@InjectMocks
	NetworkResources resources = new NetworkResources();
	
	@Mock
	NetworkLoader loader = new NetworkLoader();

	
	@Test
	void test() throws Exception{
		String hello = "Hello World";
		
		
		
	}

}
