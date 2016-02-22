/** Assignment 2:	OrderedIntList.java
 *  PIN:			203
 *  Due Date:		2/8/2016 - 4:00 p.m.
 */

package cse360assign2;

public class OrderedIntList {
	private int[] array;
	private int[] newArray;
	private int counter = 0;
	
	
	/** OrderedIntList: This is the constructor that creates an array of 10 integers
	 * 
	 * @author Jacob Buchanan
	 */
	OrderedIntList() {
		array = new int[10];
	}
	
	
	/** OrderedIntList(int size):	This is an overloaded constructor that allows the user to create an
	 * array of a different size than the default size of 10 values.
	 * 
	 * @author Jacob Buchanan
	 * @param size
	 */
	OrderedIntList(int size) {
		array = new int[size];
	}
	
	
	/** insert: 	This method inserts an integer into the array and sorts the array into ascending order.
	 *  The method first takes in a value to be inserted, and it checks the array to see if the value is
	 *  already in the array. This is to avoid duplication. Next, the methods finds the correct index in the
	 *  array for the value to be inserted where it will be in ascending order with the rest of the array
	 *  (i.e. 6 would be placed between 5 and 7). After this index is found, every integer that is above it
	 *  is moved up by one index. Then, the value to be entered takes the now empty slot in the array. After
	 *  this, the method checks the array to see if it is full, If it is full, then the method creates a new
	 *  array that is 150% larger than the current array. It copies the current array's values into the new
	 *  array, after which the current array is set to the new array, thereby extending the size of the array.
	 * 
	 * @author Jacob Buchanan
	 * @param value
	 */
	public void insert(int value) {
		
		int index = 0;
		int juliet = 0;
		int arraySize = 0;
		boolean exit = false;
				
		while(index < counter && exit == false) {
			
			if(value < array[index]) {
				exit = true;
			}
			else if(array[index] == value) {
				return;
			}
			
			if(exit == false) {
				index++;
				juliet++;
			}
			
		}
		
		if(counter >= array.length - 1) {
			arraySize = array.length + (array.length / 2);
			newArray = new int[arraySize];
			
			for(int increment = 0; increment < array.length; increment++) {
				newArray[increment] = array[increment];
			}
			
			array = newArray;
			
		}
		
		for(juliet = counter; index < juliet; juliet--) {
			array[juliet] = array[juliet-1];
		}
		
		array[index] = value;
		counter++;
		
	}
	
	
	/** size:	This method returns the size of the array, including any unfilled spaces in the array
	 * 
	 * @author Jacob Buchanan
	 * @return arraySize: Holds the size of the actual array itself, filled and unfilled slots combined
	 */
	public int size() {
		int arraySize;
		arraySize = array.length;
		
		return arraySize;
	}
	
	
	/** length:	Returns the number of actual integers in the array, excluding exmpty
	 * slots in the array.
	 * 
	 * @author Jacob Buchanan
	 * @return itemNumber: Holds the number of integers contained in the array
	 */
	public int length() {
		
		int itemNumber = 0;
		int index = 0;
		boolean loopExit = false;
		
		while(loopExit == false && index < counter) {
			
			if(array[index] != 0) {
				itemNumber++;
				index++;
			}
			else {
				loopExit = true;
			}
			
		}
		
		return itemNumber;
		
	}
	
	
	/** search:	This method takes in a given value, or "key," and a starting and ending value that
	 * represent the range of values that will be searched. For the OrderedIntList class, this will
	 * be used to search through the entire array. 
	 * 
	 * @author Jacob Buchanan
	 * @param key:		Number that is being searched for in the array
	 * @param start:	First index of the range of the search
	 * @param end:		Last index of the range of the search
	 * @return middle:	Updated integer that holds the index of the integer being searched for
	 * 						in the array, -1 if the integer is not found
	 */
	int search(int key, int start, int end) {
		
		int middle = (start + end) / 2;
		
		if(end < start) {
			return -1;
		}
		
		if(array[middle] == key) {
			return middle;
		}
		else if(array[middle] > key) {
			return search(key, start, middle - 1);
		}
		else {
			return search(key, middle + 1, end);
		}
		
	}
	
	
	/** delete:		First searches the array for the integer "key" to see if it is in the array
	 * 	at all. Then, if the number is in the array, deletes the number and moves the array over
	 * 	to account for the missing number. Also, this function checks the size of the array and
	 * 	how empty it is. If the array is 50% empty or more, it shrinks the size of the array.
	 * 
	 * @param key:	Number being deleted from the array
	 */
	public void delete(int key) {
		
		int deleteNum = search(key, 0, length());
		int zeroCount = 0;
		int arraySize = size();
		int index;
		
		if(deleteNum != -1) {
			array[deleteNum] = 0;
			counter--;
			
			for(index = deleteNum + 1; index < arraySize; index++) {
				array[index - 1] = array[index];
			}
			
			array[arraySize - 1] = 0;
		}
		else {
			return;
		}
		
		for(index = 0; index < arraySize; index++) {
			if(array[index] == 0) {
				zeroCount++;
			}
		}
		
		if(zeroCount >= arraySize / 2) {
			int newSize = (arraySize * 6) / 10;
			newArray = new int[newSize];
			
			for(index = 0; index < newSize; index++) {
				newArray[index] = array[index];
			}
			
			array = newArray;
		}
		
	}
	
	
	/** toString:	Creates a string that contains each of the integers in the array. This method
	 * first creates an initial array that is empty, in case the array itself is empty. After this,
	 * it adds each number throughout the array, appending the string and placing a tabbed space in
	 * between each integer.
	 * 
	 * @author Jacob Buchanan
	 */
	public String toString() {
		String arrayString = "";
		int printSize = length();
		int index = 0;
		
		for(index = 0; index < printSize; index++) {
			if(index == 0) {
				arrayString = arrayString + array[index];
			}
			else {
				arrayString = arrayString + "\t" + array[index];
			}
		}
		
		return arrayString;
	}
	
	
	public static void main(String[] args) {
		OrderedIntList list = new OrderedIntList();
		
		for(int index = 1; index < 11; index++) {
			list.insert(index);
		}

		list.delete(6);
		list.delete(2);
		list.delete(5);
		list.delete(9);
		
		System.out.println(list.toString());
		System.out.println(list.length());
		System.out.println(list.size());
		
	}
	
}
