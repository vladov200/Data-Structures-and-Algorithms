package main.java.sort;

import java.util.List;

import main.java.utils.Utils;

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
					Utils.swapElements(array, j, j + 1);
				}
			}
		}
	}
	
	/**
	 * Sort list of arrays in place using bubble sort algorithm.
	 * <p>
	 * 
	 * Sort will be applied on columns as well as on rows.
	 * <p>
	 * 
	 * Compare two arrays at a time and determine their position.
	 * For example, {1,2,3} is considered to be smaller than
	 * {1,3,2} and will be placed before.
	 * <p>
	 * 
	 * Afterwards, place the smaller array at the beginning of
	 * the list (swap) and recurse with the list minus the beginning.
	 * <p>
	 * 
	 * Time complexity: ..
	 * 
	 * @param listOfArrays
	 */
	public static void sort2D(List<int[]> listOfArrays) {
		if(listOfArrays.size() == 0) {
			return;
		}
		
		int smallestArrayIndex = 0;
		for(int i = 1; i < listOfArrays.size(); i++) {
			int[] arrayOne = listOfArrays.get(smallestArrayIndex);
			int[] arrayTwo = listOfArrays.get(i);
			
			for(int j = 0; j < arrayOne.length; j++) {	
				if(arrayOne[j] < arrayTwo[j]) {
					break;
				}
				
				if(arrayTwo[j] < arrayOne[j]) {
					smallestArrayIndex = i;
					break;
				}
			}
		}
		
		Utils.swapListElements(listOfArrays, 0, smallestArrayIndex);
		sort2D(listOfArrays.subList(1, listOfArrays.size()));
	}
}
