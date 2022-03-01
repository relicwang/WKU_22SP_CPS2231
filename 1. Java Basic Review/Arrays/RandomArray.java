package review;

import java.util.Arrays;

//Purpose: 
//  Generate 100 random value in range [0,100)
//   then compute the average value.
public class RandomArray {

	public static void main(String[] args) {
		//1. Generate 100 random double values ([0,100))
		double [] nums = new double [100];
		
		// Math.random() --> [0,1)  ---Goal: [0,100) -->   ---*100--
//		nums[0]=Math.random()*100;
//		nums[1]=Math.random()*100;
//		nums[2]=Math.random()*100;
//		//..
//		nums[99]=Math.random()*100;

		for(int i=0;i<nums.length;i++) {
			nums[i]=Math.random()*100;
		}
		
		//2. Compute the average
		double sum = 0;
		
		//Regula For-loop
//		for(int i=0;i<nums.length;i++) {
//			sum+=nums[i];
//		}
		
		//Enhanced for-loop
		for(double num: nums) {
			sum+=num;
		}
		
		
		double average =sum/nums.length;
		
		System.out.println("The average for array: \n"+
		Arrays.toString(nums)+"\n is "+ average);
	}

}
