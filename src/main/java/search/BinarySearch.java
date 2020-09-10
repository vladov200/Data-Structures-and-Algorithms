package main.java.search;

public class BinarySearch {

	/**
	 * Find index of value in sorted array using binary search algorithm.
	 * <p>
	 * 
	 * Evaluate value located at the middle of the array.
	 * If the value is not found, divide the array into two and repeat
	 * evaluation on the part which contains the value.
	 * <p>
	 * 
	 * Repeat until value is found.
	 * <p>
	 * 
	 * 
	 * Time complexity:  best case (n * log n), worst cast (n^2)
	 * 
	 * @param array Sorted array in ascending order
	 * @param value Integer value to be found
	 * @return Index of found value or -1 if not found
	 */
	public static int search(int[] array, int value) {
		int lowerIndex = 0;
		int upperIndex = array.length - 1;
		
		int currentIndex;
		
		while(true) {
			if(lowerIndex > upperIndex) {
				return -1;
			}
			
			currentIndex = lowerIndex + ((upperIndex - lowerIndex) / 2);
			
			if(array[currentIndex] < value) {
				lowerIndex = currentIndex + 1;
			} else if(array[currentIndex] > value) {
				upperIndex = currentIndex - 1;
			} else {
				return currentIndex;
			}
		}
	}
}
