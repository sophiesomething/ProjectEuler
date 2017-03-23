
public class Problem5 {
	
	/* 20170322 - Sophie Andrews
	 * 
	 * Smallest multiple
	 * 
	 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

		What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
	 * 
	 * 
	 */


	public static void main(String[] args){

		int n = 1;
		int limit = 20;

		while(true){

			int i = 1;	

			while (i < (limit+1)){

				if (n % i != 0){
					n++; break;
				}

				if ((i == limit) && (n % i == 0)){
					break;
				}

				else i++;

			}

			if ((i == limit) && (n % i == 0)){
				System.out.println(n);
				break;
			}
		}	
	}
}

