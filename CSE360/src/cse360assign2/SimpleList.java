/**Michael Fields
 * Class ID: 205
 * Assignment 2
 * 
 * This class implements an integer array with a length of 10 and sets count to 0. 
 * It adds new indicated values to the beginning of the array, dropping the value
 * in index 9 if need be, count increments by 1. All instances of a value indicated
 *  to be removed will be removed and count is decremented by 1. 
 * Searching for an element will return the index of the first instance of
 * the element. To string prints all elements of the array with spaces between.
 * Count returns the number of elements that have been added minus the
 * number that have been removed.
 */
package cse360assign2;
import java.util.Arrays;

public class SimpleList {
	private int[] list;
	private int count;
	
	/**
	 * Class constructor
	 *
	 */
	
	public SimpleList() {
		super();
		list = new int[10];
		count = 0;
	}
	/**
	 * Adds indicated integer to front of the array
	 * @param newInt
	 */
	public void add(int newInt) {
		if (count == list.length-1) {
			int[] newlist = new int[(list.length * (3))/2];
			System.arraycopy(list, 0, newlist, 0, list.length);
			list = newlist;
		}
		int[] tempList = new int[list.length];
		for (int idx = 0; idx <= list.length-2; idx++) {
			tempList[idx + 1] = list[idx];
		}
		tempList[0] = newInt;
		list = tempList;
		count++;
	}
	/**
	 * Removes all instances of indicated integer from the array
	 * @param remInt
	 */
	public void remove(int remInt) {
		if(count < (list.length * (3)/4)) {
			list = Arrays.copyOf(list, (list.length * (3)/4));
			}
		int[] tempList = new int[list.length];
		int tempIdx = 0;
		for (int idx = 0; idx < list.length; idx++) {
			if (list[idx] == remInt) {
				if (count <= list.length && count >0){
					count--;
				}
				continue;
			}
			else {
				tempList[tempIdx] = list[idx];
				tempIdx++;
			}
		}
		list = tempList;
	}
	/**
	 * Returns the number of elements added to the array
	 * @return
	 */
	public int count() {
		return count;
	}
	/**
	 * Returns the index of the first instance of the indicated integer
	 * or returns -1 if the integer is not in the array
	 * @param reqInt
	 * @return
	 */
	public int search(int reqInt) {
		for(int idx = 0; idx < list.length; idx++ ) {
			if (list[idx] == reqInt) {
				return idx;
			}
		}
		return -1;
	}
	/**
	 * Prints the values in the array with spaces between elements
	 */
	public String toString() {
		String arrayString = "";
		for(int idx = 0; idx < list.length-1; idx++) {
		arrayString += Integer.toString(list[idx]) + " ";
	}
		arrayString += Integer.toString(list[list.length-1]);
		return arrayString;
	}
	

}
