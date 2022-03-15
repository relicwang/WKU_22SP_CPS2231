package twodimensionarray;

//Figure out the largest number in each row of 2D array
//   with its corresponding row and col. index.
public class LargestRowNumber {

	public static void main(String[] args) {
		int[][] temp = { 
						{ 8, 16, 12, 10, 9, 14, 7 }, 
						{ 12, 4, 19, 4, 12, 3, 14 }, 
						{ 9, 27, 27, 6, 3, 28, 13 } };

		
		//Using nested for-loop
		int[][] allRowsMaxInfo = new int [temp.length][3];
		
		for(int rowIndex=0;rowIndex<temp.length;rowIndex++) {
			
			int maxRowValue=temp[rowIndex][0];
			int [] maxRowIndexes =new int [2];// Save row and column index
			
			for (int colIndex = 0; colIndex < temp[rowIndex].length; colIndex++) {
				if (maxRowValue < temp[rowIndex][colIndex]) {
					// Update the max value
					maxRowValue = temp[rowIndex][colIndex];

					// Update corresponding index
					maxRowIndexes[0] = rowIndex;
					maxRowIndexes[1] = colIndex;
				}
			}
		
			allRowsMaxInfo[rowIndex][0]= maxRowValue;
			allRowsMaxInfo[rowIndex][1]= maxRowIndexes[0];
			allRowsMaxInfo[rowIndex][2]= maxRowIndexes[1];
			
		}
		
		//Using method approach
//		int[][] allRowsMaxInfo = new int [temp.length][3];
		
		for(int rowIndex=0;rowIndex<temp.length;rowIndex++) {
				
			int[] curtRowMaxInfo = findMaxRowValue(rowIndex, temp);
		
			allRowsMaxInfo[rowIndex][0]= curtRowMaxInfo[0];
			allRowsMaxInfo[rowIndex][1]= curtRowMaxInfo[1];
			allRowsMaxInfo[rowIndex][2]= curtRowMaxInfo[2];
			
		}
		
		//Show the largest # for 1st and indexes		
		System.out.println("The largest # in row 1 is "+	allRowsMaxInfo[0][0]);
		System.out.println("The index is["+allRowsMaxInfo[0][1] +","+allRowsMaxInfo[0][2]+"]");
		
		
	}
	
	
	//Signature: findMaxRowValue: int  int[][] --> int[]
	//Purpose: Given the row Index and the 2D int array
	//      we want to find the largest number in that
	//      row and corresponding index
	//     We will return a 1D array with size 3,
	//     the 1st value --> largest value in given row
	//     the 2nd value --> corresponding row Index
	//     the 3rd value --> corresponding col Index
	
	public static int[] findMaxRowValue(int rowIndex, int[][]temp){
		int maxRowValue = temp[rowIndex][0];

		int[] indexMaxRow = new int[2]; // Save row and col Index

		for (int colIndex = 0; colIndex < temp[rowIndex].length; colIndex++) {
			if (maxRowValue < temp[rowIndex][colIndex]) {
				// Update the max value
				maxRowValue = temp[rowIndex][colIndex];

				// Update corresponding index
				indexMaxRow[0] = rowIndex;
				indexMaxRow[1] = colIndex;
			}

		}
		
		//We will return an array that contains
		//  maxRowValue, rowIndex and colIndex
		int[] maxRowInfo = new int [3];
		maxRowInfo[0]=maxRowValue;
		maxRowInfo[1]=indexMaxRow[0];
		maxRowInfo[2]=indexMaxRow[1];
		
		return maxRowInfo;
	}
	

}
