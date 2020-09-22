package main.java.sort;

import java.util.Arrays;

import main.java.utils.Utils;

public class MergeSort {

	/**
	 * Sort array in place using merge sort algorithm.
	 * <p>
	 * 
	 * This algorithm belongs to the divide-and-conquer
	 * family.
	 * <p>
	 * 
	 * Divide the array into two equal parts and repeat
	 * until there are only two elements left.
	 * <p>
	 * 
	 * Afterwards, iterate through the left and right
	 * portion at the same time and sort each element.
	 * <p>
	 * 
	 * Do this until one of the array is emptied.
	 * Afterwards, iterate through the elements in the
	 * remaining array.
	 * <p>
	 * 
	 * Time complexity:  best case (n * log n), worst cast (n * log n)
	 * 
	 * @param array Unsorted array of integers
	 */
	public static void sort(int[] array) {
		if(array.length < 2) {
			return;
		}
		
		int midpoint = array.length / 2;
		
		int[] leftArray = Arrays.copyOfRange(array, 0, midpoint);
		int[] rightArray = Arrays.copyOfRange(array, midpoint, array.length);
		
		sort(leftArray);
		sort(rightArray);
		
		int leftIndex = 0;
		int rightIndex = 0;
		
		while(leftIndex < leftArray.length && rightIndex < rightArray.length) {
			if(leftArray[leftIndex] <= rightArray[rightIndex]) {
				array[leftIndex + rightIndex] = leftArray[leftIndex];
				leftIndex += 1;
			} else {
				array[leftIndex + rightIndex] = rightArray[rightIndex];
				rightIndex += 1;
			}
		}
		
		while(leftIndex < leftArray.length) {
			array[leftIndex + rightIndex] = leftArray[leftIndex];
			leftIndex += 1;
		}
		
		while(rightIndex < rightArray.length) {
			array[leftIndex + rightIndex] = rightArray[rightIndex];
			rightIndex += 1;
		}
	}
}
