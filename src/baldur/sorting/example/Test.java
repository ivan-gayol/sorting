/**
 * 
 */
package baldur.sorting.example;

import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * @author igayolfernan
 *
 */
public class Test {
	
    private static Scanner sc;

	static long sumOfIntegers(int[] arr) {
    	
    	long result = 0;
    	for (int i=1; i<=arr.length;i++)
    			result = result + arr[i];
    	return result;
    }

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		sc = new Scanner(System.in);
		DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("hh:mm:ssa");
		LocalTime time = LocalTime.parse(sc.nextLine(),inputFormat);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println(time.format(formatter));
		
	}

}
