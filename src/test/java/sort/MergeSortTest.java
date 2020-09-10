package test.java.sort;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import main.java.sort.MergeSort;

public class MergeSortTest {

	@Test
	public void shouldBeSortedInAscendingOrder() {
		int[] array = {6, 3, 4, 7, 0, 1, 2, 10, 16, 13, 11, 18};
		int[] expected = {0, 1, 2, 3, 4, 6, 7, 10, 11, 13, 16, 18};
		
		MergeSort.sort(array);
		Assert.assertArrayEquals(expected, array);
	}
	
	@Test
	public void shouldBeSortedInAscendingOrderWithDuplicates() {
		int[] array = {6, 3, 4, 7, 0, 0, 2, 11, 18, 13, 11, 18};
		int[] expected = {0, 0, 2, 3, 4, 6, 7, 11, 11, 13, 18, 18};
		
		MergeSort.sort(array);
		Assert.assertArrayEquals(expected, array);
	}
}
