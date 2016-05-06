/**
 * 
 */
package baldur.sorting.example.helper;

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
	public static <T extends ExecutableSort> void PrintLenghtTimeMessage(T alg) {
		System.out.println("--  Ordering array of length:  " + alg.arrayLength() + " Took: " + alg.execute() + "ms");
	}

}
