/**
 * 
 */
package baldur.sorting.example.algs;

/**
 * Implementation class of the insertion sort
 * algorithm
 *
 */
public final class InsertionSort {
	
	/**
	 * Method that implements the insertion sort algorithm
	 * 
	 * @param arr <code>int []</code> to be sorted
	 */
	public static void insertionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while ((j > -1) && (key < arr[j])) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}

	}
	
}
