package week_1;

import java.util.Scanner;

/**
 * Write a program that thinks of a random number between 0 and 1000, and then lets the user try to guess it.
 * For every guess, the computer says whether the guess is correct, or too low, or too high. When the user finds
 * the number, the computer will tell how many guesses were needed.
 * @author mbragg02
 *
 */

public class GuessMyNumber {

	public static void main(String[] args) {
		
			//int number = (int) (1 + Math.random( ) * 100);
			int number = (int) Math.abs(1000 * Math.random());
			// System.out.println(number);
			System.out.println("Try to guess a number!");
			
			boolean guessed = false;
			int counter = 1;
			Scanner in = new Scanner(System.in);
			
			while(!guessed) {
				System.out.print("Tell me a number: ");
				
				int guess = in.nextInt();
				
				if (guess == number) {
					guessed = true;
					break;
				}
				if (guess < number) {
					System.out.println("No, my number is higher!");
				}
				if (guess > number) {
					System.out.println("No, my number is lower!");
				}
				
				counter ++;
			}
			
			System.out.println("Correct! It took you " + counter + " guesses");
			in.close();
	}

}
