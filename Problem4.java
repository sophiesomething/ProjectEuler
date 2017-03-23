import java.util.ArrayList;
import java.util.Collections;

public class Problem4 {
	
	/* 20170322 - Sophie Andrews
	 * 
	 * Largest palindrome product
	 * 
	 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

		Find the largest palindrome made from the product of two 3-digit numbers.
	 * 
	 */
	
	
	public static void main(String[] args){

		ArrayList<String> list = new ArrayList<String>();

		for (int i = 999; i > 99; i--){
			for (int j = 999; j > 99; j--){

				int prod = i * j;
				String prods = Integer.toString(prod);
				if (prods.length() == 6){
					if (prods.charAt(0) == prods.charAt(5) &&
							prods.charAt(1) == prods.charAt(4) &&
							prods.charAt(2) == prods.charAt(3)){
						list.add(prods);
						break;}
				}
			}
		}

		System.out.println(Collections.max(list));	
	}

}


