
public class Problem3 {
	
	/* 20170322 - Sophie Andrews
	 * 
	 * Largest prime factor
	 *  
	 * The prime factors of 13195 are 5, 7, 13 and 29.

		What is the largest prime factor of the number 600851475143 ?
		
		
		Had to have some help with this one. I implemented a very long multi-method solution that worked well with smaller numbers, 
		but was too slow on large numbers.
	 * 
	 */


	public static void main(String[] args) {

		long n = 600851475143L;
		int i;
		for (i = 2; i <= n; i++) {
			if (n % i == 0) {
				n /= i;
				i--;
			}
		}
		System.out.println(i);


	}

}



