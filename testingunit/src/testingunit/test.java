package testingunit;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
 
public class test {
private Calculator Calculator;

@BeforeEach
void setUp() throws Exception()
{
 Calculator = new Calculator();
}
@RepeatedTest(5)
@DisplayName("Ensure correct handling of zero")
void testMultiplyWithZero()
{
	Assumptions.assumeFalse(System.getProperty("os.name").contains("Linux"));
	assertEquals(Calculator.multiply(0,5), 0, "Multiple with zero should be Zero");
	assertEquals(Calculator.multiply(5,0), 0, "Multiple with zero should be Zero");
 }
}