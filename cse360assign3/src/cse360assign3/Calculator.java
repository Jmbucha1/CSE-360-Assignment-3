/** Name:	Jacob Buchanan
 * 	PIN:	203
 * 	Assignment 3
 * 	Due:	2/22/16
 */

package cse360assign3;

public class Calculator {

	private int total;

	/** Calculator: This is the default constructor for the Calculator class that
	 * sets the int "total" to zero
	 * 
	 * @author Jacob Buchanan
	 */
	public Calculator() {
		total = 0; // not needed - included for clarity
	}

	/** getTotal: This function returns an integer 0
	 * 
	 * @author Jacob Buchanan
	 * @return 0
	 */
	public int getTotal() {
		return total;
	}

	/** add: Adds the value of "value" to the value of "total"
	 * 
	 * @author Jacob Buchanan
	 * @param value
	 */
	public void add(int value) {
		total = total + value;
	}

	/** subtract: Subtracts the value of "value" from the value of "total"
	 * 
	 * @author Jacob Buchanan
	 * @param value
	 */
	public void subtract(int value) {
		total = total - value;
	}

	/** multiply: Multiplies the value of "value" with the value of "total"
	 * 
	 * @author Jacob Buchanan
	 * @param value
	 */
	public void multiply(int value) {
		total = total * value;
	}

	/** Divides the value of "total" by the value of "value"
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
	}

	/** getHistory: Returns an empty String
	 * 
	 * @author Jacob Buchanan
	 * @return ""
	 */
	public String getHistory() {
		return "";
	}
}
