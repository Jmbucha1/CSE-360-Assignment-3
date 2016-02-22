package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator calculator = new Calculator();
		
		assertNotNull(calculator);
	}
	
	@Test
	public void testGetTotal() {
		Calculator calculator = new Calculator();
		int testValue = calculator.getTotal();
		
		assertEquals(testValue, 0);
	}
	
	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		calculator.add(10);
		int testValue = calculator.getTotal();
		
		assertEquals(testValue, 10);
	}
	
	@Test
	public void testSubtract() {
		Calculator calculator = new Calculator();
		calculator.subtract(10);
		int testValue = calculator.getTotal();
		
		assertEquals(testValue, -10);
	}
	
	@Test
	public void testMultiply() {
		Calculator calculator = new Calculator();		
		calculator.add(10);
		calculator.multiply(10);
		int testValue = calculator.getTotal();
		
		assertEquals(testValue, 100);
	}
	
	@Test
	public void testDivide_DivideByZero() {
		Calculator calculator = new Calculator();
		calculator.add(10);
		calculator.divide(0);
		int testValue = calculator.getTotal();
		
		assertEquals(testValue, 0);
	}
	
	@Test
	public void testDivide_DivideByNonZero() {
		Calculator calculator = new Calculator();
		calculator.add(10);
		calculator.divide(10);
		int testValue = calculator.getTotal();
		
		assertEquals(testValue, 1);
	}
	
	@Test
	public void testGetHistory() {
		Calculator calculator = new Calculator();
		String testString = calculator.getHistory();
		
		assertEquals(testString, "");
	}

}
