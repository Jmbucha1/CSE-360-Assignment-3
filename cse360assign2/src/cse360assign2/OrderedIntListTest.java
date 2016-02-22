// Assignment 2:	OrderedIntListTest.java
// PIN:				203
// Due Date:		2/9/2016 4:00 PM

package cse360assign2;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderedIntListTest {
	
	
	/*	This test creates an array using the initial constructor, which creates an
	 * array of size 10. Then it checks to make sure that the constructor successfully
	 * created the array.
	 */
	@Test
	public void testOrderedIntList_Constructor_CreatesList() {
		OrderedIntList list = new OrderedIntList();
		assertNotNull(list);
	}
	
	
	/*	This test creates an array using the overloaded constructor, giving it a
	 * size of 15  instead of the initial 10. Then it checks to make sure that this
	 * constructor is successfully creating the object "list"
	 */
	@Test
	public void testOrderedIntList_Overloaded_CreatesVariableList() {
		OrderedIntList list2 = new OrderedIntList(15);
		assertNotNull(list2);
	}
	
	
	/*	This test is to see if the size() method returns the correct size of an
	 * array created with the initial constructor that has a size of 10
	 */
	@Test
	public void testSize_fixedSize_returnSize10() {
		OrderedIntList list = new OrderedIntList();
		int size = list.size();
		
		assertEquals(10, size);
	}
	
	
	/*	This test is to see if the size() method returns the correct size of an
	 * array created with a size that is entered by the user as a size of 20
	 */
	@Test
	public void testSize_variableSize_returnSizeOfArray() {
		OrderedIntList list = new OrderedIntList(20);
		int size = list.size();
		
		assertEquals(20, size);
	}
	
	
	/*	This tests the method toString() by creating a test string "1	2	3	4	5".
	 * Then it creates an array and enters the integers 1 - 5 into it. After this, toString()
	 * is called to see if it will print the same expected string that is in testString.
	 */
	@Test
	public void testToString_printArray_returnString() {
		String testString = "1	2	3	4	5";
		OrderedIntList list = new OrderedIntList();
		
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		
		assertNotNull(list.toString());
		assertEquals(testString, list.toString());
	}
	
	
	/*	This tests toString() to see if it will return an empty string when the array is
	 * empty. If the array is empty, instead of returning a null value, toString() is written
	 * to create an empty string, so this test checks to see that toString is not null. Then
	 * it tests to see if toString() returns an empty string.
	 */
	@Test
	public void testToString_printEmptyArray_returnEmpty() {
		String testString = "";
		OrderedIntList list = new OrderedIntList();
		
		assertNotNull(list.toString());
		assertEquals(testString, list.toString());
	}
	
	
	/*	This test checks to see that the method length() returns the proper number of
	 * integers contained in the array.
	 */
	@Test
	public void testLength_initialArray_return5() {
		OrderedIntList list = new OrderedIntList();
		
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		
		int length = list.length();
		
		assertEquals(5, length);
	}
	
	
	/*	This test is used to test the functionality of the search() method when the number
	 * being searched for is in the array.
	 */
	@Test
	public void testSearch_intInArray_returnIndex() {
		OrderedIntList list = new OrderedIntList();
		
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		
		int search = list.search(4, 0, list.length());
		
		assertEquals(3, search);
		
	}
	
	
	/*	This test is used to test the functionality of the search() method when the number
	 * being searched for is not in the array.
	 */
	@Test
	public void testSearch_intNotInArray_returnNoIndex() {
		OrderedIntList list = new OrderedIntList();
		
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		
		int search = list.search(6, 0, list.length());
		
		assertEquals(-1, search);
	}

}
