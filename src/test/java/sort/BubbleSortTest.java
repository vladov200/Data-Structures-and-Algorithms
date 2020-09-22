package test.java.sort;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import main.java.sort.BubbleSort;

public class BubbleSortTest {

	@Test
	public void shouldBeSortedInAscendingOrder() {
		int[] array = {6, 3, 4, 7, 0, 1, 2, 10, 16, 13, 11, 18};
		int[] expected = {0, 1, 2, 3, 4, 6, 7, 10, 11, 13, 16, 18};
		
		BubbleSort.sort(array);
		Assert.assertArrayEquals(expected, array);
	}
	
	@Test
	public void shouldBeSortedInAscendingOrderWithDuplicates() {
		int[] array = {6, 3, 4, 7, 0, 0, 2, 11, 18, 13, 11, 18};
		int[] expected = {0, 0, 2, 3, 4, 6, 7, 11, 11, 13, 18, 18};
		
		BubbleSort.sort(array);
		Assert.assertArrayEquals(expected, array);
	}
	
	@Test
	public void shouldBeSortedInAscendingOrder2D() {
		ArrayList<int[]> list = new ArrayList<>();
		list.add(new int[] {3, 1, 2});
		list.add(new int[] {1, 3, 2});
		list.add(new int[] {3, 2, 1});
		list.add(new int[] {2, 1, 3});
		list.add(new int[] {2, 3, 1});
		list.add(new int[] {1, 2, 3});
        
        ArrayList<int[]> expected = new ArrayList<>();
        expected.add(new int[] {1, 2, 3});
        expected.add(new int[] {1, 3, 2});
        expected.add(new int[] {2, 1, 3});
        expected.add(new int[] {2, 3, 1});
        expected.add(new int[] {3, 1, 2});
        expected.add(new int[] {3, 2, 1});
        
        BubbleSort.sort2D(list);
        Assert.assertArrayEquals(expected.toArray(), list.toArray());
	}
	
	@Test
	public void shouldBeSortedInAscendingOrderWithDuplicates2D() {
		ArrayList<int[]> list = new ArrayList<>();
		list.add(new int[] {3, 2, 1});
		list.add(new int[] {1, 1, 3});
		list.add(new int[] {1, 1, 2});
		list.add(new int[] {2, 2, 3});
		list.add(new int[] {3, 1, 2});
		list.add(new int[] {2, 2, 1});
        
		ArrayList<int[]> expected = new ArrayList<>();
        expected.add(new int[] {1, 1, 2});
        expected.add(new int[] {1, 1, 3});
        expected.add(new int[] {2, 2, 1});
        expected.add(new int[] {2, 2, 3});
        expected.add(new int[] {3, 1, 2});
        expected.add(new int[] {3, 2, 1});
        
        BubbleSort.sort2D(list);
        Assert.assertArrayEquals(expected.toArray(), list.toArray());
	}
}
