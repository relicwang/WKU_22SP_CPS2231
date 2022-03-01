package review;

//Purpose: Implement a method to count the number of elements
//  smaller than average in an integer array
public class CountSmallerNumbers {

	public static void main(String[] args) {
		//Test Cases 	
		//1. 	
		
		//2.
		
		//3. 
		
	}
	
	//Signature: countSmallerNumber: int[] --> int
	//Purpose: Count the number of elements 
	//          that are smaller than the average 
	//           in the given integer array.
	//Examples: countSmallerNumber({1,2,3}) --> 1
	//          countSmallerNumber({-1,2,3,5,-3}) --> 2
	public static int countSmallerNumber( int[] nums) {
		// 1. When array is empty --> 0
		if(nums.length==0) {
			return 0;
		}
		
		// 2. When array is not empty:
		//    a. compute average of the array
		double average = computeAverage(nums);
		
		//    b. count the number of element smaller than average
		int count = 0;
		for(int num: nums) {
			if(num<average) {
				count++;
			}
		}
		return count;
		
	}

	
	//Helper Method:
	// computeAverage: int[] --> double
	//Purpose: Compute the avearage of the given int array.
	private static double computeAverage(int[] nums) {
		//If array is empty ---> 0
		if(nums.length==0) {
			return 0;
		}
		
		//Othwise, compute the average
		double sum = 0;
		for(int num: nums) {
			sum+=num;
		}
		return sum/nums.length;
	}
	

}
