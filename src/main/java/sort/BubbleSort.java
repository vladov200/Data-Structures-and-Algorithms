package main.java.sort;

import main.java.utils.ArrayUtils;

public class BubbleSort {

	/**
	 * Sort array in place using bubble sort algorithm.
	 * <p>
	 * 
	 * As the array is traversed, the algorithm compares
	 * the first and second value and swaps them if the
	 * first is larger than the second.
	 * <p>
	 * 
	 * Once at the end, the traversal is repeated minus
	 * the last element (since it is already sorted).
	 * <p>
	 * 
	 * Time complexity: best case (n), worst case (n^2)
	 * 
	 * @param array Unsorted array of integers
	 */
	public static void sort(int[] array) {
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length - 1 - i; j++) {
				if(array[j] > array[j + 1]) {
					ArrayUtils.swapValues(array, j, j + 1);
				}
			}
		}
	}
}
