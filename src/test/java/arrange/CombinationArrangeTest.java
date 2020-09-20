package test.java.arrange;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import main.java.arrange.CombinationArrange;
import main.java.utils.ArrayUtils;

public class CombinationArrangeTest {

	@Test
	public void shouldCorrectlyArrange() {
		int array[] = {1, 2, 3, 4, 5}; 
		int n = array.length;
        int r = 3; 
        
        ArrayList<int[]> expected = new ArrayList<>();
        expected.add(new int[] {1, 2, 3});
        expected.add(new int[] {1, 2, 4});
        expected.add(new int[] {1, 2, 5});
        expected.add(new int[] {1, 3, 4});
        expected.add(new int[] {1, 3, 5});
        expected.add(new int[] {1, 4, 5});
        expected.add(new int[] {2, 3, 4});
        expected.add(new int[] {2, 3, 5});
        expected.add(new int[] {2, 4, 5});
        expected.add(new int[] {3, 4, 5});
        
        ArrayList<int[]> actual = CombinationArrange.arrange(array, n, r);
        Assert.assertArrayEquals(expected.toArray(), actual.toArray());
	}
	
	@Test
	public void shouldReturnEmptyThroughN() {
		int array[] = {1, 2, 3, 4, 5}; 
		int n = 0;
        int r = 3; 
        
        ArrayList<int[]> expected = new ArrayList<>();
        
        ArrayList<int[]> actual = CombinationArrange.arrange(array, n, r);
        Assert.assertArrayEquals(expected.toArray(), actual.toArray());
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
        
        ArrayList<int[]> actual = CombinationArrange.arrange(array, n, r);
        Assert.assertArrayEquals(expected.toArray(), actual.toArray());
	}
	
	@Test
	public void shouldReturnEmptyThroughR() {
		int array[] = {1, 2, 3, 4, 5}; 
		int n = array.length;
        int r = 0; 
        
        ArrayList<int[]> expected = new ArrayList<>();
        
        ArrayList<int[]> actual = CombinationArrange.arrange(array, n, r);
        Assert.assertArrayEquals(expected.toArray(), actual.toArray());
	}
}
