package baldur.sorting.example;

import baldur.sorting.example.algs.InsertionSort;
import baldur.sorting.example.algs.QuickSort;
import baldur.sorting.example.helper.GenerateRandomArrayHelper;
import baldur.sorting.example.helper.PrintHelper;

/**
 * 
 * Entry point for testing different sorting algorithms
 *
 */
public class SortingTest {
	
	
	public static void main(String[] args) {
		
		InsertionSort insertionSort = new InsertionSort();
		QuickSort quickSort = new QuickSort();
		
		
		for (int i = 99980; i < 100000; i++) {
			
			int [] generatedArray = GenerateRandomArrayHelper.generateIntArray(i); // Generate random array			
			insertionSort.setArr(generatedArray);
			quickSort.setArr(generatedArray);
			PrintHelper.PrintLenghtTimeMessage(quickSort);		
			
		}		
		
	}

}
