package main.java.sort;

import main.java.utils.Utils;

public class SelectionSort {

	/**
	 * Sort array in place using selection sort algorithm.
	 * <p>
	 * 
	 * Traverse the array and find the smallest value.
	 * <p>
	 * 
	 * Once the traversal is complete, switch the smallest
	 * value with the start of the iteration.
	 * <p>
	 *
	 * Repeat the iteration but the starting point
	 * incremented by one.
	 * <p>
	 * 
	 * Time complexity:  best case (n^2), worst cast (n^2)
	 * 
	 * @param array Unsorted array of integers
	 */
	public static void sort(int[] array) {
		for(int i = 0; i < array.length; i++) {
			int minIndex = i;
			int minValue = array[i];
			
			for(int j = i; j < array.length; j++) {
				if(array[j] < minValue) {
					minIndex = j;
					minValue = array[j];
				}
			}
			
			Utils.swapElements(array, minIndex, i);
		}
	}
}
