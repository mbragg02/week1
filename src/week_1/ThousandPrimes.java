package week_1;

/**
 * 
 * Modify the program that you wrote for the former exercise so that it writes on screen the first 1,000 primes.
 */

public class ThousandPrimes {

	public static void main(String[] args) {
		final int PRIMES = 1000;
		int counter = 1;
		
		for (int i = 2; counter <= PRIMES; i++ ) {
			
			boolean isPrime = true;
			
			for (int j = 2; j < i; j++ ) {
				
				if (i % j == 0) {
					isPrime = false;
					break;	
				}
			}
			
			if(isPrime) {
				System.out.println(counter + ": " + i);
				counter ++;
			}
			
		}

	}

}
