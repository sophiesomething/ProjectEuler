import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem11 {

	/* 20170325 - Sophie Andrews
	 * 
	 * Largest product in a grid
	 * 
	 * In the 20×20 grid below, four numbers along a diagonal line have been marked in red.
	 * 
	 * [Large grid]
	 * 
	 * The product of these numbers is 26 × 63 × 78 × 14 = 1788696.

		What is the greatest product of four adjacent numbers in the same direction (up, down, left, right, or diagonally) in the 20×20 grid?
	 * 
	 * 
	 */


	// readGrid method reads in the file and produces the 2D array. 
	public static ArrayList<ArrayList<Integer>> readGrid(String file) throws java.io.FileNotFoundException{

		ArrayList<ArrayList<Integer>> grid = new ArrayList<ArrayList<Integer>>(); 	
		Scanner inputFile = new Scanner(new File(file));				
		while(inputFile.hasNextLine()){
			Scanner columnReader = new Scanner(inputFile.nextLine());						
			ArrayList<Integer> col = new ArrayList<Integer>();
			while(columnReader.hasNextInt()){
				col.add(columnReader.nextInt());
			} 
			grid.add(col);
			columnReader.close();
		}

		inputFile.close(); 
		return grid;
	}


	// checkUpDown method finds biggest product in up-down direction. 
	public static long checkUpDown(ArrayList<ArrayList<Integer>> grid){

		long max = 0;

		for (int i = 0; i <  grid.size()-4; i++){ 

			for (int j = 0; j < grid.size(); j++){ 

				long product = 1;

				for (int k = 0; k < 4; k++){ 

					product = product * (grid.get(i + k).get(j)); 
				}

				if (product > max){ max = product;}
			}
		}
		return max;
	}


	// checkLeftRight method finds biggest product in left-right direction. 
	public static long checkLeftRight(ArrayList<ArrayList<Integer>> grid){

		long max = 0;

		for (int j = 0; j <  grid.size()-4; j++){ 

			for (int i = 0; i < grid.size()-4; i++){ 

				long product = 1;

				for (int k = 0; k < 4; k++){ 

					product = product * (grid.get(i).get(j + k)); 		
				}

				if (product > max){ max = product;}
			}
		}
		return max;
	}


	// checkDiagonalLeft method finds biggest product in the diagonal direction starting at the top left corner.
	public static long checkDiagonalLeft(ArrayList<ArrayList<Integer>> grid){

		long max = 0;

		for (int i = 0; i <  grid.size()-4; i++){ 

			for (int j = 0; j < grid.size()-4; j++){ 

				long product = 1;

				for (int k = 0; k < 4; k++){ 

					product = product * (grid.get(i + k).get(j + k)); 		
				}

				if (product > max){ max = product;}
			}
		}
		return max;
	}


	// checkDiagonalRight method finds biggest product in the diagonal direction starting at the top right corner.
	public static long checkDiagonalRight(ArrayList<ArrayList<Integer>> grid){

		long max = 0;

		for (int i = 0; i < grid.size()-4; i++){ 

			for (int j = grid.size()-1; j > 4; j--){ 

				long product = 1;

				for (int k = 0; k < 4; k++){ 

					product = product * (grid.get(i + k).get(j - k)); 
				}

				if (product > max){ max = product;}
			}
		}
		return max;
	}


	// Main method
	public static void main(String[] args) throws java.io.FileNotFoundException{

		ArrayList<ArrayList<Integer>> grid = readGrid("src/problem11grid.txt");

		long uD = checkUpDown(grid);
		long lR = checkLeftRight(grid);
		long dL = checkDiagonalLeft(grid);
		long dR = checkDiagonalRight(grid);

		System.out.println("Max: " + Math.max(uD, Math.max(lR, Math.max(dL, dR))));
		

	}
}
