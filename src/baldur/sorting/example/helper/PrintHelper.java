/**
 * 
 */
package baldur.sorting.example.helper;

import java.util.List;

import baldur.sorting.example.algs.ExecutableSort;

/**
 * Helper class for console messages
 *
 */
public final class PrintHelper {
	
	/**
	 * Prints on console an array of integers
	 * 
	 * @param arr The <code>int []</code> to be printed
	 */
	public static void printArray(int[] arr) {
		
		System.out.print("[ ");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.print("]");

	}
	
	/**
	 * @param <T>
	 */
	public static <T extends ExecutableSort> void PrintLenghtTimeMessage(List<T> algList) {
		if (!algList.isEmpty()){
			System.out.print("--  Ordering array of length:  " + algList.get(0).arrayLength());
			for (ExecutableSort alg : algList) {
				System.out.print("-- " + alg.algType() + " Took: " + alg.execute() + "ms ");
			}
			System.out.println();
		}
	}

}
