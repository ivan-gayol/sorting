package baldur.sorting.example;

import baldur.sorting.example.algs.InsertionSort;
import baldur.sorting.example.helper.GenerateRandomArrayHelper;
import baldur.sorting.example.helper.PrintHelper;

/**
 * 
 * Entry point for testing different sorting algorithms
 *
 */
public class SortingTest {
	
	
	public static void main(String[] args) {
		
		
		for (int i = 99980; i < 100000; i++) {
			
			int [] generatedArray = GenerateRandomArrayHelper.generateIntArray(i); // Generate random array
			
			// Capture start time			
			long startTime = System.currentTimeMillis();
			
			InsertionSort.insertionSort(generatedArray); // Sort the array with insertion sort
			// Capture stop time
			long stopTime = System.currentTimeMillis();
			PrintHelper.PrintLenghtTimeMessage(i, (stopTime - startTime));
			
			
			
			
		}
		
		
		
		
		
	}



}
