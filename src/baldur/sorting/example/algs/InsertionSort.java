/**
 * 
 */
package baldur.sorting.example.algs;

/**
 * Implementation class of the insertion sort
 * algorithm:
 * 
 * - Very effective on small lists (even quicker than quicksort)
 * - Stable
 * - Memory O(1)
 * - Best n
 * - Average n^2
 * - Worst n^2
 *
 */
public final class InsertionSort extends ExecutableSort{


	/**
	 * Method that implements the insertion sort algorithm
	 * 
	 * @param arr <code>int []</code> to be sorted
	 */
	protected void insertionSort(){

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

	@Override
	protected Long sort() {
		// Capture start time			
		long startTime = System.currentTimeMillis();
		insertionSort();
		// Capture execution time			
		long executionTime = System.currentTimeMillis();
		return executionTime - startTime;
	}

	@Override
	public String algType() {		
		return "Insertion Sort";
	}
	
}
