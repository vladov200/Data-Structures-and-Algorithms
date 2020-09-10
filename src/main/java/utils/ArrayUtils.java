package main.java.utils;

public class ArrayUtils {

	public static void printArray(int[] array) {
		System.out.print("[");
		for(int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		
		System.out.println(array[array.length - 1] + "]");
	}
	
	/**
	 * Swap value at sourceIndex with value at destinationIndex.
	 * 
	 * @param array
	 * @param i
	 * @param j
	 */
	public static void swapValues(int[] array, int sourceIndex, int destinationIndex) {
		if(sourceIndex == destinationIndex) {
			return;
		}
		
		array[sourceIndex] = array[sourceIndex] ^ array[destinationIndex];
		array[destinationIndex] = array[sourceIndex] ^ array[destinationIndex];
		array[sourceIndex] = array[sourceIndex] ^ array[destinationIndex];
	}
}
