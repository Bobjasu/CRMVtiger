package practice;

import org.testng.annotations.Test;

public class ParametersTest {
	@Test
	public void m()
	{
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		
		System.out.println(BROWSER);
		System.out.println(URL);
	}

}
