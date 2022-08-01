package testingunit;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
public class Lifecycle {
 Private static final String 'True' = null;static final String 'true' = null;
@BeforeAll
static void initializationResources()
{
  System.out.println("initializing external resources...");
}
@BeforeAll
void initializeMockobjects()
{
System.out.println("initializing mock objects...");
}
@Test
void othertest()
{
	assumeTrue(true );
	 System.out.println("running another test...");
	 assertNotEquals(1,4,"why would these be the some?");
}
@Test
void someTest()
{
	 System.out.println("Running some test...");
	 assertTrue(true);
}

@Test
@Disabled
void disabledTest()
{
	System.exit(1); 
}
@AfterEach
void tearDown()
{
	 System.out.println("Tearing down...");
}
static void freeExternalResources()
{
	 System.out.println("Freeing external resources...");
}
}
