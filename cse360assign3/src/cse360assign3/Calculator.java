/** Name:	Jacob Buchanan
 * 	PIN:	203
 * 	Assignment 3
 * 	Due:	2/22/16
 */

package cse360assign3;

/** Calculator: This class performs basic arithmetic operations, updating the total value each time
 * an operation is performed. It also has a class to print out the current total of classes, and
 * a class for printing out the history of. all the operations performed by the class
 * 
 * @author Jacob Buchanan
 */
public class Calculator {

	private int total;
	private String history = "0";

	/** Calculator: This is the default constructor for the Calculator class that
	 * sets the int "total" to zero
	 * 
	 * @author Jacob Buchanan
	 */
	public Calculator() {
		total = 0; // not needed - included for clarity
	}

	/** getTotal: This function returns the total of all the operations performed by Calculator
	 * 
	 * @author Jacob Buchanan
	 * @return 0
	 */
	public int getTotal() {
		return total;
	}

	/** add: Adds the value of "value" to the value of "total" and updates "history" with the 
	 * operation performed
	 * 
	 * @author Jacob Buchanan
	 * @param value
	 */
	public void add(int value) {
		total = total + value;
		
		history = history + " + " + value;
	}

	/** subtract: Subtracts the value of "value" from the value of "total" and updates "history"
	 * with the operation performed
	 * 
	 * @author Jacob Buchanan
	 * @param value
	 */
	public void subtract(int value) {
		total = total - value;
		
		history = history + " - " + value;
	}

	/** multiply: Multiplies the value of "value" with the value of "total" and updates "history"
	 * with the operation performed
	 * 
	 * @author Jacob Buchanan
	 * @param value
	 */
	public void multiply(int value) {
		total = total * value;
		
		history = history + " * " + value;
	}

	/** Divides the value of "total" by the value of "value" and updates "history" with the
	 * operation performed
	 * 
	 * @author Jacob Buchanan
	 * @param value
	 */
	public void divide(int value) {
		if(value == 0) {
			total = 0;
		}
		else {
			total = total / value;
		}
		
		history = history + " / " + value;
	}

	/** getHistory: Returns the history of all of the operations performed by the Calculator
	 * 
	 * @author Jacob Buchanan
	 * @return history
	 */
	public String getHistory() {		
		return history;
	}
	
}
