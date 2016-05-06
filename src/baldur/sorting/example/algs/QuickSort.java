/**
 * 
 */
package baldur.sorting.example.algs;

/**
 * @author igayolfernan
 *
 */
public class QuickSort extends ExecutableSort {

	
	protected void quickSort (int low, int high){		
		
		int i = low;
		int j = high;
		// pivot element is the one in the middle of the list
		int pivot = arr[low + (high-low)/2];
		
		while (i<=j){
			while(arr[i] <pivot){
				i++;
			}
			
			while (arr[j] >pivot){
				j--;
			}
			
			if (i<=j){
				int aux = arr[i];
				arr[i] = arr[j];
				arr[j] = aux;
				i++;
				j--;
			}			
		}
		
		if(low<j){
			quickSort(low, j);
		}
		
		if(i<high){
			quickSort(i, high);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see baldur.sorting.example.algs.ExecutableSort#sort(int[])
	 */
	@Override
	protected Long sort() {
		// Capture start time
		long startTime = System.currentTimeMillis();
		quickSort(0, arr.length-1);
		// Capture execution time
		long executionTime = System.currentTimeMillis();
		return executionTime - startTime;
	}

	/* (non-Javadoc)
	 * @see baldur.sorting.example.algs.ExecutableSort#algType()
	 */
	@Override
	public String algType() {
		return "QuickSort";
	}

}
