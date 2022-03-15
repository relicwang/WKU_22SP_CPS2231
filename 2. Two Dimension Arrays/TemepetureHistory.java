package twodimensionarray;

//Purpose: Saving the 3 weeks' temperature using
//         two dimension array
public class TemepetureHistory {

	public static void main(String[] args) {
		//1. Define an array
		int[][] temperature = new int[3][7];
	
		//2. Save the values
		//Week 1 Temperature
		temperature[0][0] = 8;
		temperature[0][1] = 16;
		temperature[0][2] = 12;
		temperature[0][3] = 10;
		temperature[0][4] = 9;
		temperature[0][5] = 14;
		temperature[0][6] = 7;

		//Week 2 Temperature
		temperature[1][0] = 12;
		temperature[1][1] = 4;
		temperature[1][2] = 19;
		temperature[1][3] = 4;
		temperature[1][4] = 12;
		temperature[1][5] = 3;
		temperature[1][6] = 14;
		
		//Week 3 Temperature
		temperature[2][0] = 9;
		temperature[2][1] = 27;
		temperature[2][2] = 27;
		temperature[2][3] = 6;
		temperature[2][4] = 3;
		temperature[2][5] = 28;
		temperature[2][6] = 13;
		
		//Short-hand approach
		
		int[][] temperature2 = {
								{8,16,12,10,9,14,7},
								{12,4,19,4,12,3,14},
								{9,27,27,6,3,28,13}
								};
		
		//Print all elements in 1-D array
		double[] scores= {100,98,94,70,100};
//		System.out.println(scores);
		
		for(int i=0;i<scores.length;i++) {
//			System.out.print(scores[i]+" ");
		}
//		System.out.println();
		
		//Print all element in 2D array row-by-row
//		// 1. Print elements in 1st row
//		for(int i=0;i<temperature2[0].length;i++) {
//			System.out.print(temperature2[0][i]+" ");
//		}
//		System.out.println();
//		
//		// 2. Print elements in 2nd row
//		for(int i=0;i<temperature2[0].length;i++) {
//			System.out.print(temperature2[1][i]+" ");
//		}
//		
//		System.out.println();
//		
//		// 3. Print elements in 3rd row
//		for(int i=0;i<temperature2[0].length;i++) {
//			System.out.print(temperature2[2][i]+" ");
//		}
//		
//		
		//More efficient approach
		//Outer Loop: Generate row index 1-by-1
		for(int rowIndex=0;rowIndex<temperature2.length;rowIndex++) {
			//Inner Loop: Generate all column index
			for(int colIndex=0;colIndex<temperature2[0].length;colIndex++) {
				System.out.print(temperature2[rowIndex][colIndex]+" ");
			}
			
			System.out.println();
		}
		
		
		
		//Print elements column-by-column	
		//1st Column
//		for(int rowIndex=0;rowIndex<temperature2.length;rowIndex++) {
//			System.out.print(temperature2[rowIndex][0]+" ");
//		}
//		System.out.println();
//		
//		//2nd Column
//		for(int rowIndex=0;rowIndex<temperature2.length;rowIndex++) {
//			System.out.print(temperature2[rowIndex][1]+" ");
//		}
//		System.out.println();
//		
//		//3rd Column
//		for(int rowIndex=0;rowIndex<temperature2.length;rowIndex++) {
//			System.out.print(temperature2[rowIndex][2]+" ");
//		}
//		System.out.println();
		
		//More Efficient Way
		for(int colIndex=0;colIndex<temperature2[0].length;colIndex++) {
			//Print the column given colIndex
			for(int rowIndex=0;rowIndex<temperature2.length;rowIndex++) {
				System.out.print(temperature2[rowIndex][colIndex]+" ");
			}	
			System.out.println();
		}			
		
	}

}
