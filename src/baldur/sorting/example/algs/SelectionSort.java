/**
 * 
 */
package baldur.sorting.example.algs;

/**
 * @author igayolfernan
 * 
 * Implements SelectionSort algorithm:
 * 
 *  It has O(n2) time complexity, making it inefficient on large lists, and generally performs worse than the similar insertion sort. 
 *  Selection sort is noted for its simplicity, and it has performance advantages over more complicated algorithms in certain situations, 
 *  particularly where auxiliary memory is limited.
 * 
 * - Stable if insertion (insert smaller and move forward the rest) unstable if it is implmented with swap
 * - Memory O(n)
 * - Best О(n2)
 * - Average О(n2)
 * - Worst О(n2)
 *
 */
public class SelectionSort extends ExecutableSort {
	
	private void selectionSort(){
		
		for (int i = 0; i<arr.length; i++){
			
			int min = i;
			
			for (int j = i+1; j < arr.length; j++){
				if (arr[j] < arr[i]){
					min = j;
				}
			}
		
			if (min != i){
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
		
	}
	

	/* (non-Javadoc)
	 * @see baldur.sorting.example.algs.ExecutableSort#sort()
	 */
	@Override
	protected Long sort() {
		// Capture start time
		long startTime = System.currentTimeMillis();
		
		selectionSort();
		
		// Capture execution time
		long executionTime = System.currentTimeMillis();
		return executionTime - startTime;
	}

	/* (non-Javadoc)
	 * @see baldur.sorting.example.algs.ExecutableSort#algType()
	 */
	@Override
	public String algType() {
		return "Selection sort";
	}

}
