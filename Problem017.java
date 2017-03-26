
public class Problem17 {
	
	/* 20170326 - Sophie Andrews
	 * 
	 * Number letter counts
	 * 
	 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

		If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?


		NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
	 * 
	 * 
	 */
	
	
	public static void main(String[] args){
		
		int oneNine = 3+3+5+4+4+3+5+5+4;
		int tenNineteen = 3+6+6+8+8+7+7+9+8+8;		
		int twentyNinetyNine = 60+60+50+50+50+70+60+60+(oneNine*8);		
		int hundred = 7;		
		int oneThousand = 11;		
		int and = 3;
	
		System.out.println((hundred * 900) + (oneNine * 110) + (and * 891)  + (tenNineteen*10) + (twentyNinetyNine*10) + oneThousand);
	}
}
