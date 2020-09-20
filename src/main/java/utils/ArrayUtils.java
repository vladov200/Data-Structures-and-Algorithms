package main.java.utils;

import java.util.List;

public class ArrayUtils {

	public static void printList(List<int[]> list) {
		list.forEach(array -> printArray(array));
	}
	
	public static void printArray(int[] array) {
		System.out.print("[");
		for(int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		
		if(array.length > 0) {
			System.out.print(array[array.length - 1]);			
		} 
		
		System.out.println("]");
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
