package sortingAlgorithm;

import java.util.Arrays;


/* For a 1,000,000 element array
 * Insertion Sort took 1787426 Milliseconds
 * Arrays.sort() took 59 Milliseconds
 * 
 * 
 * For a 500,000 element array 
 * Insertion Sort took 547145 Milliseconds
 * Arrays.sort() took 27 Milliseconds
 * 
 * 
 * for a 100,000 element array
 * Insertion Sort took 17513 Milliseconds
 * Arrays.sort() took 8 Milliseconds
 * 
 * 
 * for a 10,000 element array
 * Insertion Sort took 223 Milliseconds
 * Arrays.sort() took 1 Milliseconds
 * 
 * 
 * for a 1,000 element array 
 * Insertion Sort took 8 Milliseconds
 * Arrays.Sort() took 0 Milliseconds
 * 
 * 
 * for a 100
 * Insertion Sort took 1 Milliseconds
 * Arrays.sort() took 0 Milliseconds
 */


/**
 * The purpose of this class is to sort two identical arrays
 * that are filled with random integers and return the time 
 * in Milliseconds to the console
 * 
 * @date 04/16/2019
 * @author chris harwell
 *
 */


public class Main {

	public static void main(String[] args) {

		// randomIntArray is a constant integer Array
		// Is the first of two arrays
		final int[] randomIntArray = new int[10000];

		int[] secondArray; // the second of two Arrays

		long startTime = System.currentTimeMillis();

		// Fill randomIntArray[] with a wide range of random integer values

		for (int i = 0; i < randomIntArray.length; i++) {
			randomIntArray[i] = (int) (Integer.MAX_VALUE * Math.random());

			int itemsSorted; // Number of items that have been sorted so far.
			for (itemsSorted = 0; itemsSorted < randomIntArray.length; itemsSorted++) {
				// Assume that items randomIntArray[0], randomIntArray[1], ...
				// randomIntArray[itemsSorted-1]
				// have already been sorted. Insert randomIntArray[itemsSorted]
				// into the sorted part of the list.
				int temp = randomIntArray[itemsSorted]; // The item to be inserted.
				int loc = itemsSorted - 1; // Start at end of list.

				while (loc >= 0 && randomIntArray[loc] > temp) {
					randomIntArray[loc + 1] = randomIntArray[loc]; // Bump item from randomIntArray[loc] up to loc+1.
					loc = loc - 1; // Go on to next location.
				}
				randomIntArray[loc + 1] = temp; // Put temp in last vacated space.

			}

		}
		// Subtract the start time of the program for the randomIntArray[] from the time
		// the program finishes
		long runTime = System.currentTimeMillis() - startTime;
		System.out.println(runTime + " Milliseconds");

		long startTime2 = System.currentTimeMillis();

		secondArray = randomIntArray.clone(); // make an exact copy of randomIntArray
		Arrays.sort(secondArray); // Sort the array
		// System.out.println(Arrays.equals(randomIntArray,secondArray));

		// Subtract the start time of the program for the secondArray[] from the time
		// the program finishes
		long runTime2 = System.currentTimeMillis() - startTime2;
		System.out.println(runTime2 + " Milliseconds");
	}
}
