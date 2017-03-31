import java.util.List;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem022 {

	/** 20170331 - Sophie Andrews
	 * 
	 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.

		For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.

		What is the total of all the name scores in the file?
	 * 
	 * 
	 */


	// readNames() reads in the file containing the list of names
	public static List<String> readNames(String file) throws java.io.FileNotFoundException{

		List<String> names = new ArrayList<String>();
		Scanner scanner = new Scanner(new File(file));
		Scanner inputFile = scanner.useDelimiter(",");

		while(inputFile.hasNext()){
			names.add(inputFile.next());
		}
		inputFile.close(); 
		scanner.close();
		return names;
	}


	public static void main(String[] args) throws java.io.FileNotFoundException{

		List<String> names =  readNames("data/Problem022data.txt");
		long sum = 0;

		Collections.sort(names, String.CASE_INSENSITIVE_ORDER);
		Object[] sorted = names.toArray();

		for (int i = 0; i < sorted.length; i++){

			String val = sorted[i].toString();
			int score = 0;

			for (int j = 1; j < val.length()-1; j++){
				score += (int) val.charAt(j)-64;
			}

			score *= (i+1);
			sum += score;
		}

		System.out.println("Total score: " + sum);
	}
}
