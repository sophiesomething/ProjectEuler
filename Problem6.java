public class Problem6 {

	/* 20170323 - Sophie Andrews
	 * 
	 * Sum square difference
	 *
	 * The sum of the squares of the first ten natural numbers is, 
	 * 				1^2 + 2^2 + ... + 10^2 = 385
	 * 
	 * The square of the sum of the first ten natural numbers is,
	 * 
	 * 				(1 + 2 + ... + 10)^2 = 55^2 = 3025
	 * 
	 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

			Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
	 * 
	 * 
	 */


	public static int sumSquares(int num){							

		int[] squares = new int[num];

		for (int i = 0; i < squares.length; i++){
			squares[i] = (i+1)*(i+1);
		}

		int sum = 0;

		for (int i: squares){
			sum = sum + i;
		}

		return sum;
	}


	public static int squareOfSum(int num){

		int[] nums = new int[num];

		for (int i = 0; i < nums.length; i++){
			nums[i] = i+1;

		}

		int sum = 0;

		for (int i: nums){
			sum = sum + i;
		}

		return (sum*sum);
	}



	public static void main(String[] args){


		int diff = squareOfSum(100) - sumSquares(100);

		System.out.println(diff);


	}

}
