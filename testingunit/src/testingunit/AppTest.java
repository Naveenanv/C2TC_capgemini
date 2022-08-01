package testingunit;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AppTest {

	@Test
	void testOnDev()
	{
		System.setProperty("ENV","DEV");
		Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
	}

	@Test
	void testOnProd() 
	{
		System.setProperty("ENV","PROD");
		Assumptions.assumeTrue("PROD".equals (System.getProperty("ENV")));
	}
}