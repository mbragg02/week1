package week_1;

/**
 * Write a program that prints all on screen all prime numbers up to 1,000.
 * 
 */

public class AllThePrimes {

	public static void main(String[] args) {
		int upToNum = 1000;
		
		for (int i = 2; i <= upToNum; i++ ) {
			
			boolean isPrime = true;
			
			for (int j = 2; j < i; j++ ) {
				
				if (i % j == 0) {
					isPrime = false;
					break;	
				}
			}
			
			if(isPrime) {
				System.out.print(i + " ");
			}
			
		}

	}

}
