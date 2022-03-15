package twodimensionarray;

//Purpose: Compute the sum and average for 2D array
public class SumAverageFor2DArray {

	public static void main(String[] args) {
		int[][] temperature = {
				{8,16,12,10,9,14,7},
				{12,4,19,4,12,3,14},
				{9,27,27,6,3,28,13}
				};
		
		//Compute the sum of all elements
		//   Get each elements value and add to the sum variable
		
		double sum = 0; //Think why double is better here?
		
		for(int rowIndex=0;rowIndex<temperature.length;rowIndex++) {
			for(int colIndex=0;colIndex<temperature[0].length;colIndex++) {
				sum+=temperature[rowIndex][colIndex];
			}
		}
		
		System.out.println("The sum is "+sum);
		
		//Compute the average of all elements
		double average= sum/(temperature.length* temperature[0].length);
	
		System.out.println("The average is "+average);
		

	}

}
