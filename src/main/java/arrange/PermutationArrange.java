package main.java.arrange;

import java.util.ArrayList;

import main.java.sort.BubbleSort;
import main.java.utils.Utils;

public class PermutationArrange {

	/**
	 * Arrange the array taking every possible permutation.
	 * This method uses the swap technique.
	 * <p>
	 * 
	 * A permutation is a unique arrangement of elements where
	 * order does matter. For example, {1,2,3} and {3,2,1} 
	 * would be two unique permutations.
	 * <p>
	 * 
	 * The equation to calculate the number of possible permutations
	 * is given by the following: C(n, r) = n! / (n - r)!
	 * <p>
	 * 
	 * It can be read the following way: given an array of size n,
	 * how many permutations are possible if r elements are chosen
	 * at a time?
	 * <p>
	 * 
	 * @param array
	 * @param n
	 * @param r
	 * @return
	 */
	public static ArrayList<int[]> arrangeWithSwapElements(int[] array, int n, int r) {
		ArrayList<int[]> arrangements = new ArrayList<>();

		if(n > 0 && r > 0 && r <= n) {
			permutateSwapElements(array, n, r, new int[r], 0, arrangements);
		}

		BubbleSort.sort2D(arrangements);
		return arrangements;
	}
	
	private static ArrayList<int[]> permutateSwapElements(int[] array, int n, int r, int[] placeholder, int index, ArrayList<int[]> arrangements) {
		if(r == 0) {
			//	Clone the array in order to prevent modification from future use
			arrangements.add(placeholder.clone());
			return arrangements;
		}
		
		for(int i = 0; i < n; i++) {
			placeholder[index] = array[i];
			
			Utils.swapElements(array, i, n - 1);
			permutateSwapElements(array, n - 1, r - 1, placeholder, index + 1, arrangements);
			Utils.swapElements(array, i, n - 1);
		}
		
		return arrangements;
	}
	
	/**
	 * Arrange the array taking every possible permutation.
	 * This method uses the remove element technique.
	 * <p>
	 * 
	 * A permutation is a unique arrangement of elements where
	 * order does matter. For example, {1,2,3} and {3,2,1} 
	 * would be two unique permutations.
	 * <p>
	 * 
	 * The equation to calculate the number of possible permutations
	 * is given by the following: C(n, r) = n! / (n - r)!
	 * <p>
	 * 
	 * It can be read the following way: given an array of size n,
	 * how many permutations are possible if r elements are chosen
	 * at a time?
	 * <p>
	 * 
	 * @param array
	 * @param n
	 * @param r
	 * @return
	 */
	public static ArrayList<int[]> arrangeWithRemoveElements(int[] array, int n, int r) {
		ArrayList<int[]> arrangements = new ArrayList<>();
		
		if(n > 0 && r > 0 && r <= n) {
			permutateRemoveElements(array, n, r, new int[r], 0, arrangements);
		}
		
		return arrangements;
	}
	
	private static ArrayList<int[]> permutateRemoveElements(int[] array, int n, int r, int[] placeholder, int index, ArrayList<int[]> arrangements) {
		if(r == 0) {
			//	Clone the array in order to prevent modification from future use
			arrangements.add(placeholder.clone());
			return arrangements;
		}
		
		for(int i = 0; i < n; i++) {
			placeholder[index] = array[i];
			
			int[] subArray = Utils.removeElementAtIndex(array, i);
			permutateRemoveElements(subArray, n - 1, r - 1, placeholder, index + 1, arrangements);
		}
		
		return arrangements;
	}
}
