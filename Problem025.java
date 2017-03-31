import java.math.BigInteger;

public class Problem025 {

	/** 20170331 - Sophie Andrews
	 * 
	 * The Fibonacci sequence is defined by the recurrence relation:

		Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
		Hence the first 12 terms will be:

		[terms]
	 * 
	 * The 12th term, F12, is the first term to contain three digits.

		What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
	 * 
	 */

	public static void main(String[] args){

		int index = 2;
		BigInteger prevPrev = BigInteger.valueOf(1);
		BigInteger prev = BigInteger.valueOf(1);
		BigInteger curr = BigInteger.valueOf(1);
		int size = 1;

		while (size < 1000){
			index++;
			curr = prev.add(prevPrev);
			prevPrev = prev;
			prev = curr;
			size = curr.toString().length();
		}
		System.out.println("Index: " + index);
	}
}
