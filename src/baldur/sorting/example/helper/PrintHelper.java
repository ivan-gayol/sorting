/**
 * 
 */
package baldur.sorting.example.helper;

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
	 * @param i
	 */
	public static void PrintLenghtTimeMessage(int length, long elapsedTime) {
		System.out.println("--  Ordering array of length:  " + length + " Took: " + elapsedTime + "ms");
	}

}
