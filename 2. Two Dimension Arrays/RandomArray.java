
package twodimensionarray;

import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

//Purpose: Create a 2D double array where the number of rows and columns
//          are defined by user(via typing in the console);
//         Then, we assign random numbers([0,49) in each position 
public class RandomArray {

	public static void main(String[] args) {
		// 1. Create a 2D array, # of rows and columns given
		// by user

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number of rows: ");
		int numOfRows = input.nextInt();

		System.out.println("Please enter number of columns: ");
		int numOfColumns = input.nextInt();

		double[][] randomNums = new double[numOfRows][numOfColumns];

		// 2. Assign the random values
//		//    Create a random value in [0,49)
//		double aRandomVal = Math.random()*49;
//		
//		//  Fill random #s in 1st row
//		for(int colIndex=0;colIndex<randomNums[0].length; colIndex++) {
//			randomNums[0][colIndex] =  Math.random()*49;
//		}
//	
//		//  Fill random #s in 2nd row
//		for(int colIndex=0;colIndex<randomNums[0].length; colIndex++) {
//			randomNums[1][colIndex] =  Math.random()*49;
//		}
//	
//		
		//Using loop to generate all possible row Index 
		for (int rowIndex = 0; rowIndex < randomNums.length; rowIndex++) {
			
			//Generate all possible  column index for given row index
			for (int colIndex = 0; colIndex < randomNums[0].length; colIndex++) {
				randomNums[rowIndex][colIndex] = Math.random() * 49;
			}
		}

		
		//Show all elements
		for (int rowIndex = 0; rowIndex < randomNums.length; rowIndex++) {
			for (int colIndex = 0; colIndex < randomNums[0].length; colIndex++) {
				System.out.print(randomNums[rowIndex][colIndex] + " ");
				System.out.print("["+rowIndex+","+colIndex+"]"+" ");
			}
			System.out.println();
		}

	}

}
