import java.io.File;
import java.util.Scanner;

public class Problem067 {

	/** 20170330 - Sophie Andrews
	 * 
	 * Maximum path sum II
	 * 
	 * By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.

		3
		7 4
		2 4 6
		8 5 9 3

		That is, 3 + 7 + 4 + 9 = 23.

		Find the maximum total from top to bottom in triangle.txt (right click and 'Save Link/Target As...'), a 15K text file containing a triangle with one-hundred rows.

		[ triangle] 
	 * 
	 * 
	 */


	// readTriangle() reads in the file containing the triangle data.
	public static long[][] readTriangle(String file) throws java.io.FileNotFoundException{

		long[][] nums = new long[100][100]; 
		Scanner inputFile = new Scanner(new File(file));	

		int r = 0;
		while(inputFile.hasNextLine()){
			Scanner reader = new Scanner(inputFile.nextLine());						

			int c = 0;

			while(reader.hasNextLong()){
				nums[r][c] = reader.nextLong();
				c++;
			}
			r++;
			reader.close();
		}
		inputFile.close(); 
		return nums;
	}


	// printTriangle() prints out the triangle array - useful for debugging
	public static void printTriangle(long[][] nums){

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + "	");
			}
			System.out.println();
		}
		System.out.println();
	}


	public static void main(String[] args) throws java.io.FileNotFoundException{

		long[][] tri = readTriangle("data/Problem067data.txt");
		printTriangle(tri);

		System.out.println("Triangle size: " + tri[0].length + " by " + tri[1].length);

		// iterate across triangle from bottom

		for (int r = tri[0].length-2; r >= 0; r--){ // Starting at the second bottom row

			for (int c = 0; c < tri[1].length; c++){ // And working along left to right

				if (tri[r][c] != 0){
					long daughterL = tri[r+1][c];
					long daughterR = tri[r+1][c+1];
					if (daughterL > daughterR){

						tri[r][c] += tri[r+1][c];

					} else if (daughterR > daughterL) {

						tri[r][c] += tri[r+1][c+1];

					} else if (daughterR == daughterL){

						tri[r][c] += tri[r+1][c+1];
					}
				}
			}
		}
		System.out.println(tri[0][0]);
	}
}
