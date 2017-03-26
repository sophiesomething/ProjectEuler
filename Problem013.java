import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem13 {

	/* 20170326 - Sophie Andrews
	 * 
	 * Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
	 * 
	 * [ Long numbers ]
	 * 
	 */


	// readNums method to read in the file containing the long numbers
	public static ArrayList<BigInteger> readNums(String file) throws java.io.FileNotFoundException{

		ArrayList<BigInteger> nums = new ArrayList<BigInteger>(); 
		Scanner inputFile = new Scanner(new File(file));	

		while(inputFile.hasNextLine()){
			Scanner reader = new Scanner(inputFile.nextLine());						

			while(reader.hasNextBigInteger()){
				nums.add(reader.nextBigInteger());
			} 

			reader.close();
		}

		inputFile.close(); 
		return nums;
	}


	// nDigitSum method to find the first n digits of the sum of the numbers in the file
	public static void nDigitSum(String file, int n) throws java.io.FileNotFoundException{

		ArrayList<BigInteger> nums = readNums(file);
		BigInteger sum = new BigInteger("1");

		for (int i = 0; i < nums.size(); i++){

			sum = sum.add(nums.get(i));
		}

		String str = sum.toString();
		System.out.println(str.substring(0,n));
	}


	public static void main(String[] args) throws java.io.FileNotFoundException{

		nDigitSum("data/Problem013nums.txt", 10);
	}
}
