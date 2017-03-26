import java.math.BigInteger;

public class Problem15 {


	/* 20170326 - Sophie Andrews
	 * 
	 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.
	 * 
	 * [ grid ]
	 *
	 * How many such routes are there through a 20×20 grid?
	 * 
	 */
	

	public static BigInteger getFactorial2(int num){

		BigInteger factorial = new BigInteger("1");

		for (int i = 1; i <= num; i++){

			factorial = factorial.multiply(new BigInteger(i + ""));
		}
		
		return factorial;
	}


	public static BigInteger getRoutes(int gridSize){
		
		BigInteger val = getFactorial2(gridSize*2).divide((getFactorial2((gridSize)).multiply((getFactorial2((gridSize*2)-gridSize)))));
	
		return val;
	}
	

	public static void main(String[]args){
		
		System.out.println(getRoutes(20));
	}
}



