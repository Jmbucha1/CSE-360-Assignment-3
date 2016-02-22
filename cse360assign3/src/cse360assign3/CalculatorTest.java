//	Name: Jacob Buchanan
//	PIN: 203
//	Assignment 3
//	Due: 2/22/16

package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {								// Tests the constructor to see if total is set to 0
		Calculator calculator = new Calculator();
		
		assertNotNull(calculator);
	}
	
	@Test
	public void testGetTotal() {								// Tests to see if calling getTotal() returns the value of "total"
		Calculator calculator = new Calculator();
		int testValue = calculator.getTotal();
		
		assertEquals(testValue, 0);
	}
	
	@Test
	public void testAdd() {										// Tests the add() method to see if 10 is added to "total"
		Calculator calculator = new Calculator();
		calculator.add(10);
		int testValue = calculator.getTotal();
		
		assertEquals(testValue, 10);
	}
	
	@Test
	public void testSubtract() {								// Tests the subtract() method to see if 10 is subtracted from the total
		Calculator calculator = new Calculator();
		calculator.subtract(10);
		int testValue = calculator.getTotal();
		
		assertEquals(testValue, -10);
	}
	
	@Test
	public void testMultiply() {								// Tests the multiply() method to see if 10 is multiplied to the total of 10
		Calculator calculator = new Calculator();		
		calculator.add(10);
		calculator.multiply(10);
		int testValue = calculator.getTotal();
		
		assertEquals(testValue, 100);
	}
	
	@Test
	public void testDivide_DivideByZero() {						// Tests the divide() method to check if dividing by 0 sets "total" equal to 0
		Calculator calculator = new Calculator();
		calculator.add(10);
		calculator.divide(0);
		int testValue = calculator.getTotal();
		
		assertEquals(testValue, 0);
	}
	
	@Test
	public void testDivide_DivideByNonZero() {					// Test the divide() method to check if the total is divided by 10
		Calculator calculator = new Calculator();
		calculator.add(10);
		calculator.divide(10);
		int testValue = calculator.getTotal();
		
		assertEquals(testValue, 1);
	}
	
	@Test
	public void testGetHistory_printEmpty() {
		Calculator calculator = new Calculator();
		String testString = calculator.getHistory();
		
		assertEquals(testString, "0");
	}
	
	@Test
	public void testGetHistory_printHistory() {								// Test the getHistory() method to check if it prints the history of operations
		Calculator calculator = new Calculator();
		calculator.add(10);
		calculator.subtract(20);
		calculator.add(110);
		calculator.multiply(100);
		calculator.divide(1000);
		String testString = calculator.getHistory();
		
		assertEquals(testString, "0 + 10 - 20 + 110 * 100 / 1000");
	}

}
