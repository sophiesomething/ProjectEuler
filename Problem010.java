public class Problem10 {

	/* 20170324 - Sophie Andrews
	 * 
	 * Summation of primes
	 * 
	 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

		Find the sum of all the primes below two million.
	 * 
	 * 
	 */

	public static void sumPrimes(int num){

		boolean[] primes = new boolean[num];
		long sum = 0;

		for (int i = 1; i < num; i++){
			primes[i] = true;
		}

		for (int i = 2; i < num; i++){

			if (primes[i-1]){
				sum += i;
				for (int j = 2*i; j <= num; j+=i){
					primes[j-1] = false;
				}
			}
		}

		System.out.println("sum: " + sum);
	}


	public static void main(String[] args){

		sumPrimes(2000000);
	}
}


