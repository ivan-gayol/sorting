/**
 * 
 */
package baldur.sorting.example.algs;

/**
 * @author igayolfernan
 * 
 * From Wikipedia
 * On typical modern architectures, efficient quicksort implementations generally outperform mergesort for sorting RAM-based arrays.
 * On the other hand, merge sort is a stable sort and is more efficient at handling slow-to-access sequential media. 
 * Merge sort is often the best choice for sorting a linked list
 * 
 * Implements mergeSort algorithm:
 * 
 * - Stable
 * - Memory n A hybrid block merge sort is O(1) mem.
 * - Best O(n Log n)
 * - Average O(n Log n)
 */
public class MergeSort extends ExecutableSort {
	
	// Helper array for mergin.
	private int[] helper;
	
	/**
	 * 
	 * @param low
	 * @param high
	 */
	private void mergeSort(int low, int high){
		// check if low is smaller then high, if not then the array is sorted
		if (low < high){
			int middle = low + (high-low)/2;
			 // Sort the left side of the array
			mergeSort(low, middle);
			// Sort the right side of the array
			mergeSort(middle + 1, high);
			merge (low, middle, high);
		}
	}
	
	 private void merge(int low, int middle, int high) {
		 
		 // Copy both parts into the helper array
         for (int i = low; i <= high; i++) {
                 helper[i] = arr[i];
         }
         
         int i = low;
         int j = middle + 1;
         int k = low;
         
         // Moving upwards from lower index to middle and from middle to higher one
         // we copy back into original array the smallest value of both index
         while (i <= middle && j <= high) {
             if (helper[i] <= helper[j]) {
                     arr[k] = helper[i];
                     i++;
             } else {
                     arr[k] = helper[j];
                     j++;
             }
             k++;
         }
         
         // Copy the rest of the left side of the array into the target array
         while (i <= middle) {
                 arr[k] = helper[i];
                 k++;
                 i++;
         }
	 }

	/* (non-Javadoc)
	 * @see baldur.sorting.example.algs.ExecutableSort#sort()
	 */
	@Override
	protected Long sort() {
		// Capture start time
		long startTime = System.currentTimeMillis();
		this.helper = new int[arr.length];
		mergeSort(0, arr.length-1);
		// Capture execution time
		long executionTime = System.currentTimeMillis();
		return executionTime - startTime;
	}

	/* (non-Javadoc)
	 * @see baldur.sorting.example.algs.ExecutableSort#algType()
	 */
	@Override
	public String algType() {
		return "mergeSort";
	}

}
