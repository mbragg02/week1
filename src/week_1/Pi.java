package week_1;

import java.util.Scanner;

/**
 * PI
 * Create a program that asks the user for a number n and then calculates n of this infinite sum. How many terms
 * do you need to get the first three digits right (3.14)? How many for the first 10 digits (3.14159265358. . . ...)?
 * @author mbragg02
 *
 */

public class Pi {
	
	public static void main(String[] args) {
		System.out.println("A program to calculate PI to the nth degree");
		System.out.print("Please enter an integer for n: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		
		double pi = 0.0;
		final double NUMERATOR = 4.0;
		int denominator = 3;
		boolean operator = true;
		pi += 4;
		
		//int counter = 1;
		//String piString = "";
		
		//while (!piString.equals("3.14") ) {
		for ( int i = 0; i <= n; i ++) {
			
			if (operator) {
				pi = pi - (NUMERATOR / denominator);
				//System.out.println(pi);
				operator = false;
			} else {
				pi = pi + (NUMERATOR / denominator); 
				//System.out.println(pi);
				operator = true;
			}
			
			
			//counter ++;
			denominator += 2;
			
			//piString = String.format("%.2f", pi);
			//System.out.println(counter);
					
		}
		System.out.println(pi);
		
		
	}

}
