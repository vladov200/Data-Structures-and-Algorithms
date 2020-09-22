package main.java.arrange;

import java.util.ArrayList;

import main.java.utils.Utils;

public class CombinationArrange {
	/**
	 * Arrange the array taking every possible combination.
	 * <p>
	 * 
	 * A combination is a unique arrangement of elements where
	 * order does not matter. For example, {1,2,3} and {3,2,1} 
	 * would be one combination.
	 * <p>
	 * 
	 * The equation to calculate the number of possible combinations
	 * is given by the following: C(n, r) = n! / r! * (n - r)!
	 * <p>
	 * 
	 * It can be read the following way: given an array of size n,
	 * how many combinations are possible if r elements are chosen
	 * at a time?
	 * <p>
	 * 
	 * @param array
	 * @param n
	 * @param r
	 * @return
	 */
	public static ArrayList<int[]> arrange(int[] array, int n, int r) {
		ArrayList<int[]> arrangements = new ArrayList<>();
		
		if(n > 0 && r > 0 && r <= n) {
			combinate(array, n, r, new int[r], 0, 0, arrangements);
		}
		
		return arrangements;
	}
	
	private static void combinate(int[] array, int n, int r, int[] placeholder, int start, int index, ArrayList<int[]> arrangements) {
		if(r == 0) {
			arrangements.add(placeholder.clone());
			return;
		}
		
		for(int i = start; i < n; i++) {
			placeholder[index] = array[i];
			combinate(array, n, r - 1, placeholder, i + 1, index + 1, arrangements);
		}
	}
}
