package week_1;

import java.util.Scanner;


public class ConsecutiveIntegers {

	/**
	 * User enters a series of integers - enters -1 to end.
	 * Program prints "yes" if the numbers are consecutive (1,2,3,4,5), otherwise "no".
	 * @param args
	 */
	public static void main(String[] args) {
		
		final int CANCEL = -1;
		final int INITIALIZE = 0;
		
		int input = INITIALIZE;
		int nextInput = INITIALIZE;
		boolean consecutive = true;
		
		Scanner in = new Scanner(System.in);
	
		while (input != CANCEL) {
		System.out.print("Please enter an integer: ");
		input = in.nextInt();
		
		if (input != nextInput && input != CANCEL && nextInput != INITIALIZE) {
			consecutive = false;
		}
		
		nextInput = input + 1;

		}
		in.close();

		
		
		if (consecutive) {
			System.out.println("Yes, they are consecutive");
		} else {
			System.out.println("No, they are not consecutive");
		}

	}

}
