package test.java.arrange;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import main.java.arrange.PermutationArrange;

public class PermutationArrangeTest {

	@Test
	public void shouldCorrectlyArrangeWithSwap() {
		int array[] = {1, 2, 3}; 
		int n = 3;
        int r = 3; 
        
        ArrayList<int[]> expected = new ArrayList<>();
        expected.add(new int[] {1, 2, 3});
        expected.add(new int[] {1, 3, 2});
        expected.add(new int[] {2, 1, 3});
        expected.add(new int[] {2, 3, 1});
        expected.add(new int[] {3, 1, 2});
        expected.add(new int[] {3, 2, 1});
        
        ArrayList<int[]> actualWithSwap = PermutationArrange.arrangeWithSwapElements(array, n, r);
        Assert.assertArrayEquals(expected.toArray(), actualWithSwap.toArray());
        
        ArrayList<int[]> actualWithRemove = PermutationArrange.arrangeWithRemoveElements(array, n, r);
        Assert.assertArrayEquals(expected.toArray(), actualWithRemove.toArray());
	}
	
	@Test
	public void shouldReturnIndividual() {
		int array[] = {1, 2, 3, 4, 5}; 
		int n = array.length;
		int r = 1; 
		
		ArrayList<int[]> expected = new ArrayList<>();
		expected.add(new int[] {1});
		expected.add(new int[] {2});
		expected.add(new int[] {3});
		expected.add(new int[] {4});
		expected.add(new int[] {5});
		
		ArrayList<int[]> actualWithSwap = PermutationArrange.arrangeWithSwapElements(array, n, r);
		Assert.assertArrayEquals(expected.toArray(), actualWithSwap.toArray());
		
		ArrayList<int[]> actualWithRemove = PermutationArrange.arrangeWithRemoveElements(array, n, r);
		Assert.assertArrayEquals(expected.toArray(), actualWithRemove.toArray());
	}
	 
	@Test
	public void shouldReturnEmptyThroughN() {
		int array[] = {1, 2, 3, 4, 5}; 
		int n = 0;
        int r = 3; 
        
        ArrayList<int[]> expected = new ArrayList<>();
        
        ArrayList<int[]> actualWithSwap = PermutationArrange.arrangeWithSwapElements(array, n, r);
        Assert.assertArrayEquals(expected.toArray(), actualWithSwap.toArray());
        
        ArrayList<int[]> actualWithRemove = PermutationArrange.arrangeWithRemoveElements(array, n, r);
        Assert.assertArrayEquals(expected.toArray(), actualWithRemove.toArray());
	}

	@Test
	public void shouldReturnEmptyThroughR() {
		int array[] = {1, 2, 3, 4, 5}; 
		int n = array.length;
		int r = 0; 
		
		ArrayList<int[]> expected = new ArrayList<>();
		
		ArrayList<int[]> actualWithSwap = PermutationArrange.arrangeWithSwapElements(array, n, r);
        Assert.assertArrayEquals(expected.toArray(), actualWithSwap.toArray());
        
        ArrayList<int[]> actualWithRemove = PermutationArrange.arrangeWithRemoveElements(array, n, r);
        Assert.assertArrayEquals(expected.toArray(), actualWithRemove.toArray());
	}
}
