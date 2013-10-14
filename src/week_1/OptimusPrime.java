package week_1;

import java.util.Scanner;

/**
 * Optimus Prime.
 * Write a program that reads an integer number from the user, and then outputs the closest prime number. If there
 * are two prime numbers at the same distance, it should output both. For instance, if the user enters 5116, the output
 * should be 5113 and 5119.
 * @author mbragg02
 *
 */

public class OptimusPrime {

	public static void main(String[] args) {
		System.out.print("Please enter a number: ");
		Scanner in = new Scanner(System.in);
		int keyNumber = in.nextInt();
		in.close();
		
		int nearestHigherPrime = keyNumber;
		int nearestLowerPrime = keyNumber;
		
		// Find nearest prime above keyNumber
		final int LIMIT = 20; //assumes a max gap of 20 between prime numbers
		
		for (int i = keyNumber + 1; i <= keyNumber + LIMIT; i++ ) {
			
			boolean isPrime = true;
			
			for (int j = 2; j < i; j++ ) {
				
				if (i % j == 0) {
					isPrime = false;
					break;	
				}
			}
			
			if(isPrime) {
				nearestHigherPrime = i;
				break;
				}
			
		}
		
		
		// Find nearest prime below keyNumber 
		for (int i = keyNumber - 1; i >= keyNumber - LIMIT; i-- ) {
			
			boolean isPrime = true;
			
			for (int j = 2; j < i; j++ ) {
				
				if (i % j == 0) {
					isPrime = false;
					break;	
				}
			}
			
			if(isPrime) {
				
				nearestLowerPrime = i;
				break;
				}
			
		}
		
		
		
		// Display the nearest prime, or nearest primes if two a the same distance.
		if (nearestHigherPrime - keyNumber == keyNumber - nearestLowerPrime ) {
			System.out.println("The two nearest primes are = " + nearestLowerPrime + " and " + nearestHigherPrime );
		}
		if (nearestHigherPrime - keyNumber > keyNumber - nearestLowerPrime ) {
			System.out.println("Nearest prime = " + nearestLowerPrime);
		} else {
			System.out.println("Nearest prime = " + nearestHigherPrime);
		}
		
		
		
	}
	
	

}
