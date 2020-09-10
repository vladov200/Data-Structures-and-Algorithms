package main.java.sort;

import java.util.Arrays;
import java.util.Random;

import main.java.utils.ArrayUtils;

public class QuickSort {

	
	public static void sort(int[] array) {
		if(array.length == 0) {
			return;
		}
		
		int pivotIndex = new Random().nextInt(array.length);
		int lastIndex = array.length - 1;
		
		int tmp = array[lastIndex];
		array[lastIndex] = array[pivotIndex];
		array[pivotIndex] = tmp;
		
		int lowIndex = 0;
		
		for(int i = 0; i < lastIndex; i++) {
			if(array[i] <= array[lastIndex]) {
				tmp = array[i];
				array[i] = array[lowIndex];
				array[lowIndex] = tmp;
				lowIndex += 1;
			}
		}
		
		tmp = array[lastIndex];
		array[lastIndex] = array[lowIndex];
		array[lowIndex] = tmp;
		
		int[] leftArray = Arrays.copyOfRange(array, 0, lowIndex);
		int[] rightArray = Arrays.copyOfRange(array, lowIndex + 1, array.length);
		
		sort(leftArray);
		sort(rightArray);
	}
}
