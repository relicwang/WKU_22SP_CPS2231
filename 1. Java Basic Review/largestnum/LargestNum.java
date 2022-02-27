package edu.wku.largestnum;

public class LargestNum {

	public static void main(String[] args) {
		//Test Cases
		//1. Array is already sorted (Ascending or Descending Order)
		
		//   a. Ascending
		System.out.println(
				findLargestNum(new int[]{-1213,-122,-16, -1})==-1);
		System.out.println(
				findLargestNum(new int[]{-1213,-122,-16, -2, -2})==-2);
		System.out.println(
				findLargestNum(new int[]{1,242,13123, 13123123})==13123123);
		System.out.println(
				findLargestNum(new int[]{22,242,13123, 2413245,2413245})==2413245);
		System.out.println(
				findLargestNum(new int[]{-1212,-256, -2,0,412,5453})==5453);
		
		//   b. Descending
		System.out.println(
				findLargestNum(new int[]{-3,-4123,-6666})==-3);
		System.out.println(
				findLargestNum(new int[]{7643532,1231,12,4})==7643532);
		
		System.out.println(
				findLargestNum(new int[]{7643532,1231,12,4,-23,-213123})==7643532);
		
		//2. Array is not sorted
		//   (Largest is in the beginning)
		System.out.println(
				findLargestNum(new int[]{6546346,3123,123,432452,4124,-1231})==6546346);
		System.out.println(
				findLargestNum(new int[]{112121,-12,21,44124,-1231,4134,-1231})==112121);
		//   (Largest is in the middle)
		System.out.println(
				findLargestNum(new int[]{6546346,3123,123,89898988, 432452,4124,-1231})==89898988);
		System.out.println(
				findLargestNum(new int[]{112121,-12,21,89898988,1312,-1231,4134,-1231})==89898988);
		//   (Largest is in the end)
		System.out.println(
				findLargestNum(new int[]{3123,123,432452,4124,-1231,6546346})==6546346);
		System.out.println(
				findLargestNum(new int[]{-12,21,44124,-1231,4134,-1231,112121})==112121);
	
		//3. Array is empty
		System.out.println(
				findLargestNum(new int[]{})==-1);
	}

	//Signature: findLargestNum: int[] --> int
	//Purpose: Find the largest number in the given array
	//         and return it; if the array is empty, return -1.
	//Examples: 
	//        findLargestNum({1,2,3}) ---> 3
	//        findLargestNum({3,7,2,1,-1}) ---> 7
    //        findLargestNum({}) ---> -1
	public static int findLargestNum(int[] nums) {
		
		//1. array is empty 
		if(nums.length==0) {
			return -1;
		}
		
		//2. array is not empty
		else {
			int largestNum = nums[0];
			
			for(int i=0;i<nums.length;i++) {
				if(nums[i]>largestNum) {
					largestNum=nums[i];
				}
			}
			return largestNum;
		}
		
		
	}
	
	
}
