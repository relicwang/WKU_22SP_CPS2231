package edu.wku.luckynum;

public class LuckyNumber {

	public static void main(String[] args) {

		// Test Cases for isLuckNumber

		// 1. Negative Number and 0 --> false
		System.out.println(isLuckNumber(-9) == false);
		System.out.println(isLuckNumber(-8) == false);
		System.out.println(isLuckNumber(-16) == false);
		System.out.println(isLuckNumber(-8987131) == false);
		System.out.println(isLuckNumber(0) == false);

		// 2. Positive Number
		// 2-a. Is divisable by both 8 and 2 --> true
		System.out.println(isLuckNumber(8) == true);
		System.out.println(isLuckNumber(32) == true);
		System.out.println(isLuckNumber(128) == true);

		// 2-b. Is divisable by 2 but not 8 --> false
		System.out.println(isLuckNumber(2) == false);
		System.out.println(isLuckNumber(4) == false);
		System.out.println(isLuckNumber(6) == false);
		System.out.println(isLuckNumber(12) == false);

	}

	// Signature: isLuckNumber: int --> boolean
	// Purpose: Check whether the given integer is lucky number or not;
	// Return true if it is a lucky number; otherwise return false.
	// The lucky number is defined as follows:
	// 1. Positive
	// 2. Must be divisiable by both 8 and 2
	// Examples:
	// isLuckNumber(1) --> false
	// isLuckNumber(4) --> false
	// isLuckNumber(16) --> true
	// isLuckNumber(-8) --> false
	public static boolean isLuckNumber(int num) {
		//1.If number is negative or 0
		if(num<=0) {
			return false;
		}
		
		//2.If number is positive
		else {
		//   2-a. divisable by both 8 and 2
		 if(num%2==0 && num%8==0) {
			 return true;
		 }
		
		//   2-b. divisable by 2 but not 8
			else {
				return false;
			}
		
		
		}
	}
	
}


