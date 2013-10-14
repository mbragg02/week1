package week_1;

import java.util.Scanner;

/**
 * Rock, Paper, Scissors
 * Write a program that reads 2 characters from either the keyboard or a file. The characters are either PP, PR, PS, RP,
 * RR, RS, SP, SR, or SS. They correspond to the selections made by 2 players playing the game of rock-paper-scissors.
 * Make the program accept inputs until one player’s score is more than 3 points ahead of the other.
 * Hint: remember that you can use .substring() to get the elements of a String.
 * @author mbragg02
 *
 */

public class RockPaperScissors {

	public static void main(String[] args) {
		
		int playerOneScore = 0;
		int playerTwoScore = 0;
		int scoreDifference = 0;
			
		System.out.println("Rock, Paper, Scissors Game. First to 3 points advantage wins.");
		
		Scanner in = new Scanner(System.in);
		
		while(scoreDifference < 3) {
		
	
		System.out.print("Please enter 2 charcters - 1 for each player: ");
		String input = in.nextLine();
		
		input = input.toUpperCase();
			
		
		//String playerOne = input.substring(0, 1);
		//String playerTwo = input.substring(1);
		
		//System.out.println(input);
		//System.out.println(playerTwo);
		
		
		//Player one wins
		// PR RS SP
		if (input.equals("PR") || input.equals("RS") || input.equals("SP")) {
			System.out.println("Player one wins");
			playerOneScore ++;
			System.out.println("Player 1:" + playerOneScore );
			System.out.println("Player 2:" + playerTwoScore );
		}
		
				//Player two wins
		// PS RP SR
		if (input.equals("PS") || input.equals("RP") || input.equals("SR")) {
			System.out.println("Player Two wins");
			playerTwoScore ++;
			System.out.println("Player 1:" + playerOneScore );
			System.out.println("Player 2:" + playerTwoScore );
		}
		
		//Draw
		// PP RR SS
		if (input.equals("PP") || input.equals("RR") || input.equals("SS")) {
			System.out.println("A Draw!");
			System.out.println("Player 1:" + playerOneScore );
			System.out.println("Player 2:" + playerTwoScore );
		}
		
		scoreDifference = Math.abs(playerOneScore - playerTwoScore );
		
		} // game loop
		in.close();
		
		if (playerOneScore == 3) {
			System.out.println("Player ONE wins the game!");
		} else {
			System.out.println("Player TWO wins the game!");

		}

		
	} //main

} //class
