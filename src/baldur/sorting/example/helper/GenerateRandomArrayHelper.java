/**
 * 
 */
package baldur.sorting.example.helper;

import java.util.Random;

/**
 *Helper class for generating random <code>int</code> arrays.
 *
 */
public class GenerateRandomArrayHelper {

	/**
	 * Generates an array of random number with the given 
	 * length 
	 * 
	 * @param length Size of the array to be generated
	 * 
	 * @return <code>int []</code> generated.
	 */
	public static int[] generateIntArray (int length){
		
		int[] generated = new int[length];
		Random randomGenerator = new Random();
		for (int i=0; i<length; i++){
			generated[i] = randomGenerator.nextInt(100);
		}
		return generated;
	}
	
}
