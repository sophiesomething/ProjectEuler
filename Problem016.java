import java.math.BigInteger;

public class Problem16 {

	/* 20170326 - Sophie Andrews
	 * 
	 * Power digit sum
	 * 
	 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

		What is the sum of the digits of the number 2^1000?
	 * 
	 * 
	 */


	public static void powerSum(int base, int power){

		BigInteger val = new BigInteger("1");
		int sum = 0;

		for (int i = 0; i < power; i++){

			val = val.multiply(new BigInteger(base + ""));
		}

		String str = val.toString();

		for (int i = 0; i < str.length(); i++){

			sum += Character.getNumericValue(str.charAt(i));
		}
		System.out.println("Power digit sum: " + sum);

	}

	public static void main(String[] args){

		powerSum(2, 1000);

	}
}





