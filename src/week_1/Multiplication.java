package week_1;

import java.util.Scanner;


public class Multiplication {

	/**
	 * Multiply two numbers - without using the * operator.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a integer: ");
		
		int inputA = in.nextInt();
		
		System.out.print("Please enter a second integer: ");
		
		int inputB = in.nextInt();
		
		in.close();
		
		int total = 0;
		
		for( int i = 1; i <= inputB; i++) {
			total = total + inputA;
		}
		
		System.out.println(total);

	}

}
