package week_1;

import java.util.Scanner;


public class Division {

	/**
	 * A program that requests two integers. Outputs them divided WITHOUT using the "/" of "%" operator.
	 * eg output: "7 divided by 3 is 2, remainder 1"
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a integer: ");
		
		int inputA = in.nextInt();
		
		System.out.print("Please enter a second integer: ");
		
		int inputB = in.nextInt();
		in.close();
		
		
		int remainder = inputA; 
		int quotient = 0; 

		while (remainder > inputB) { 
			quotient ++; 
			remainder = remainder - inputB; 
		} 
		
		System.out.println(inputA + " divided by " + inputB + " equals " + quotient + ", remainder " + remainder );

	}

}
