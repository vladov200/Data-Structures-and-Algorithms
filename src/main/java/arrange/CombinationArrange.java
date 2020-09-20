package main.java.arrange;

import java.util.ArrayList;

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
	 */
	public static ArrayList<int[]> arrange(int[] array, int n, int r) {
		ArrayList<int[]> arrangements = new ArrayList<>();
		
		if(n > 0 && r > 0) {
			int[] placeholder = new int[r];
			combinate(array, placeholder, arrangements, 0, n - 1, 0, r);
		}
		
		return arrangements;
	}
	
	private static ArrayList<int[]> combinate(int[] array, int[] placeholder, ArrayList<int[]> arrangements, int start, int end, int index, int r) {
		if(index == r) {
			//	Have to clone placeholder because it will be reused
			//	If it is added to the arraylist directly, future
			//		modifications will alter previously added arrays
			arrangements.add(placeholder.clone());
			return arrangements;
		}
		
		for(int i = start; i <= end; i++) {
			placeholder[index] = array[i];
			combinate(array, placeholder, arrangements, i + 1, end, index + 1, r);
		}
		
		return arrangements;
	}
}
