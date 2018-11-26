package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD

	@Test
	public void testLinearSearch() {
		String[] yeet = new String[4];
		yeet[0] = "It is a wild borker";
		yeet[1] = "A floof";
		yeet[2] = "*blep*";
		yeet[3] = "Pupper doge";
		String reveal = yeet[2];
		// 1. use the assertEquals method to test your linear search method.
		assertEquals(2, _00_LinearSearch.linearSearch(yeet, reveal));
	}

	@Test
	public void testBinarySearch() {
		// 2. use the assertEquals method to test your binary search method.
		// remember that the array must be sorted
		int[] yeet = new int[] { 1, 2, 3, 4 };

		int revael = yeet[0];
		// 1. use the assertEquals method to test your linear search method.
		assertEquals(0, _01_BinarySearch.binarySearch(yeet, 0, 4, revael));
	}
	/*
	 * @Test public void testInterpolationSearch() { //3. use the assertEquals
	 * method to test your interpolation search method. // remember that the array
	 * must be sorted and evenly distributed }
	 * 
	 * @Test public void testExponentialSearch() { //4. use the assertEquals method
	 * to test your exponential search method. // remember that the array must be
	 * sorted }
	 */
}
