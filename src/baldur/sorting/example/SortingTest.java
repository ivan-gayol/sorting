package baldur.sorting.example;

import java.util.LinkedList;
import java.util.List;

import baldur.sorting.example.algs.ExecutableSort;
import baldur.sorting.example.algs.InsertionSort;
import baldur.sorting.example.algs.MergeSort;
import baldur.sorting.example.algs.QuickSort;
import baldur.sorting.example.algs.SelectionSort;
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
		MergeSort mergeSort = new MergeSort();
		SelectionSort selectionSort = new SelectionSort();
		
		
		for (int i = 99980; i < 100000; i++) {
			
			int [] generatedArray = GenerateRandomArrayHelper.generateIntArray(i); // Generate random array			
			insertionSort.setArr(generatedArray);
			quickSort.setArr(generatedArray);
			mergeSort.setArr(generatedArray);
			selectionSort.setArr(generatedArray);
			List<ExecutableSort> algList = new LinkedList<>();
			//algList.add(insertionSort);
			algList.add(quickSort);
			algList.add(mergeSort);
			algList.add(selectionSort);
			PrintHelper.PrintLenghtTimeMessage(algList);		
			
		}		
		
	}

}
