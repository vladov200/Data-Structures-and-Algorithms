package test.java.utils;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import main.java.utils.ArrayUtils;

public class ArrayUtilsTest {

	@Test
	public void shouldSwapVariablesOnce() {
		int[] array = {10, 20};
		int[] expected = {20, 10};
		
		ArrayUtils.swapValues(array, 0, 1);
		
		Assert.assertArrayEquals(expected, array);
	}
	
	@Test
	public void shouldSwapVariablesSelf() {
		int[] array = {10, 20};
		int[] expected = {10, 20};
		
		ArrayUtils.swapValues(array, 0, 0);
		
		Assert.assertArrayEquals(expected, array);
	}
	
	@Test
	public void shouldSwapVariablesMultiple() {
		int[] array = {0, 1, 2, 3, 4};
		int[] expectedOne = {1, 0, 2, 3, 4};
		int[] expectedTwo = {1, 0, 2, 4, 3};
		int[] expectedThree = {4, 0, 2, 1, 3};
		
		ArrayUtils.swapValues(array, 0, 1);
		Assert.assertArrayEquals(expectedOne, array);
		
		ArrayUtils.swapValues(array, 3, 4);
		Assert.assertArrayEquals(expectedTwo, array);

		ArrayUtils.swapValues(array, 0, 3);
		Assert.assertArrayEquals(expectedThree, array);
	}
	
	@Test
	public void shouldThrowExceptionOnIndexOutOfBounds() {
		int[] array = {0, 1, 2, 3, 4};
		
		try {
			ArrayUtils.swapValues(array, 0, 100);
			Assert.fail("Method should have failed with ArrayIndexOutOfBoundsException");
		} catch(Exception ex) {
			Assert.assertEquals("Index 100 out of bounds for length 5", ex.getMessage());
		}
	}
	
}
