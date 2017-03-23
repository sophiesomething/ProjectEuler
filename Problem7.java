import java.util.ArrayList;

public class Problem7 {


	/* 20170323 - Sophie Andrews
	 * 
	 * 10001st prime
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

		What is the 10 001st prime number?
	 * 
	 * 
	 */


	public static void stPrime(int pos){

		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);

		int n = 2;
		boolean prime;

		while(true){

			n++;
			prime = true;

			for (int j = primes.size()-1; j > -1; j--){ 

				if (n % primes.get(j) == 0){			
					prime = false;
				}
			}


			if (prime == true){
				primes.add(n);
			}

			if (primes.size() == pos){				
				System.out.println(n);
				break;
			}
		}
	}


	public static void main(String[] args){		

		stPrime(10001);
	}
}
