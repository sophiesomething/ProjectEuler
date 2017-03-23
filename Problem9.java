
public class Problem9 {

	/* 20170323 - Sophie Andrews
	 * 
	 * Special Pythagorean triplet
	 * 
	 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

		a^2 + b^2 = c^2
		For example, 3^2 + 4^2 = 9 + 16 = 25 = 52.

		There exists exactly one Pythagorean triplet for which a + b + c = 1000.
		Find the product abc.
	 * 
	 * 
	 */


	public static void main(String[] args){

		double a = 1;
		double b = 1; 
		double c = 1;

		for (b = 1; b < 1000; b++){

			for (a = 1; a < 1000; a++){

				c =  Math.sqrt((a*a) + (b*b));

				if (a + b + c == 1000){
					break;
				}
			}

			if (a + b + c == 1000){
				break;
			}
		}


		double val = a*b*c;
		System.out.println((int)val);

	}
}
