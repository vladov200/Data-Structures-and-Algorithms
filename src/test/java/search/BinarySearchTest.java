package test.java.search;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import main.java.search.BinarySearch;

public class BinarySearchTest {

	@Test
	public void shouldReturnIndexIfFound() {
		int[] array = {6, 3, 4, 7, 0, 1, 2, 10, 16, 13, 11, 18};
		int value = 10;
		
		int expected = 7;
		int actual = BinarySearch.search(array, value);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void shouldReturnNegativeOneIfNotFound() {
		int[] array = {6, 3, 4, 7, 0, 1, 2, 10, 16, 13, 11, 18};
		int value = 20;
		
		int expected = -1;
		int actual = BinarySearch.search(array, value);
		
		Assert.assertEquals(expected, actual);
	}
}
