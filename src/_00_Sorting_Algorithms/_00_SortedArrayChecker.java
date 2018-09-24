package _00_Sorting_Algorithms;

import java.util.function.BooleanSupplier;

public class _00_SortedArrayChecker {
	// 1. Write a static method called intArraySorted.
	// This method takes in an array of integers
	// and it returns a boolean.
	// The method returns true if the integer
	// array is in ascending order and false otherwise

	public static boolean intArraySorted(int[] arrayBELUGAXD) {
		for (int i = 0; i < arrayBELUGAXD.length - 1; i++) {
			if (arrayBELUGAXD[i] < arrayBELUGAXD[i + 1]) {

			} else {
				if (arrayBELUGAXD[i] > arrayBELUGAXD[i + 1]) {
					return false;
				}
			}
		}
		return true;
	}

	// this
	// 2. Write a static method called doubleArraySorted.
	// This method takes in an array of doubles
	// and it returns a boolean.
	// The method returns true if the double
	// array is in ascending order and false otherwise
	public static boolean doubleArraySorted(double[] arrayBELUGANONXD) {
		for (int i = 0; i < arrayBELUGANONXD.length - 1; i++) {
			if (arrayBELUGANONXD[i] < arrayBELUGANONXD[i + 1]) {

			} else {
				if (arrayBELUGANONXD[i] > arrayBELUGANONXD[i + 1]) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean charArraySorted(char[] arrayBELUGANONISXD) {
		for (int i = 0; i < arrayBELUGANONISXD.length - 1; i++) {
			if (arrayBELUGANONISXD[i] < arrayBELUGANONISXD[i + 1]) {

			} else {
				if (arrayBELUGANONISXD[i] > arrayBELUGANONISXD[i + 1]) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean stringArraySorted(String[] arrayBELUGANONISWAITWUTXD) {
		for (int i = 0; i < arrayBELUGANONISWAITWUTXD.length - 1; i++) {
			int truzfalsez = arrayBELUGANONISWAITWUTXD[i].compareTo(arrayBELUGANONISWAITWUTXD[i + 1]);
			if (truzfalsez < 0) {
				
			} else {
				
				if (truzfalsez >= 0) {
					return false;
				}
			}
		}
		return true;
	}
	

	// 3. Write a static method called charArraySorted.
	// This method takes in an array of characters
	// and it returns a boolean.
	// The method returns true if the character
	// array is in alphabetical order and false otherwise
	// (You can compare characters just like integers)
	
	// 4. Write a static method called stringArraySorted.
	// This method takes in an array of Strings
	// and it returns a boolean.
	// The method returns true if the String
	// array is in alphabetical order and false otherwise
	// (Use the compareTo(String) method)

}
