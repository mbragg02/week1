package week_1;

import java.util.Scanner;


public class PrimeNumbers {

	/** Asks user for a number. Checks if it is a prime number or not.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a integer: ");
		
		int input = in.nextInt();
		
		in.close();
		
		if(isPrime(input))
		{
			System.out.println("yes");
		} else {
			System.out.println("No");
		}
		
	}
	
	static boolean isPrime(int n){
		
		//check if n is a multiple of 2
	    if (n % 2 == 0) {
	    	return false;
	    }
	    
	    //if not, then just check the odds
	    for(int i = 3; i * i <= n; i += 2) {
	        if(n % i == 0)
	            return false;
	    }
	    return true;
		
		}

}
