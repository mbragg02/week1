package week_1;

/**
 * 
 * 
 * 
 * Write a program that output a number piramid like the one below.
 * 1
	22
	333
	4444
	55555
	666666
	7777777
 */

public class NumberPiramids {

	public static void main(String[] args) {
		int piramidSize = 10;
		
		for (int i = 1; i <= piramidSize; i++) {
			for (int j = 1; j <= i; j ++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
