import java.math.BigInteger;

public class Problem20 {

	/* 20170326 - Sophie Andrews
	 * 
	 * Factorial digit sum
	 * 
	 * n! means n × (n − 1) × ... × 3 × 2 × 1

		For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
		and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

		Find the sum of the digits in the number 100!

	 * 
	 */

	public static int getFactorialSum(int num){

		BigInteger factorial = new BigInteger("1");

		for (int i = 1; i <= num; i++){

			factorial = factorial.multiply(new BigInteger(i + ""));
		}

		String str = factorial.toString();
		int sum = 0;

		for (int i = 0; i < str.length(); i++){

			sum += Character.getNumericValue(str.charAt(i));
		}

		System.out.println(sum);
		return sum;
	}


	public static void main(String[] args){

		getFactorialSum(100);
	}




}
