package review;

import java.util.Scanner;

//Array:
// What's the purpose to have the array?
// Def.: Array is the data structure that 
//         holds elements/values that are the same data type/
//       ---> Use 1 varaible to refer/group these variables have same/common purpose
public class ArrayReview {

	public static void main(String[] args) {
		//General 2-ways to create an array
		
		//1. General Way
		//     Define an array first, then save the values
		//   Create an array with values{1,2,3}
		int[] nums1 = new int[3];
		nums1[0]=1;
		nums1[1]=2;
		nums1[2]=3;
		
		int[] nums2 = {1,2,3};
		int[] nums3 = {};
		
		//For example, we have a method could sum()
		//  ---> we want to test this method
		System.out.println(sum(nums2)==6);
		System.out.println(sum(nums3)==6);

		//Anomous Array
		System.out.println(sum(new int[] {1,2,3})==6);
		//==
		int[] nums5 = {1,2,3};
		
		System.out.println(sum(num5)==6);

		
		System.out.println(sum(new int[] {})==0);

		

		
		
		
		
		
		
		
		//Sample Task:
		//   Our boss gives us a task to compute the 
		//    area of 60 circles, where the radius 
		//    will be given by the user in the console;
		//    Then, double the radius and compute 
		//    the perimeter.
		
		// 1. Get the 10 radius from user
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the radius for 10 circles in order: ");

		double[] radiuses = new double[60];
//		radiuses[0]=input.nextDouble();
//		radiuses[1]=input.nextDouble();
//		radiuses[2]=input.nextDouble();
//		radiuses[3]=input.nextDouble();
//		radiuses[4]=input.nextDouble();
//		radiuses[5]=input.nextDouble();
//		radiuses[6]=input.nextDouble();
//		radiuses[7]=input.nextDouble();
//		radiuses[8]=input.nextDouble();
//		radiuses[9]=input.nextDouble();

		for(int i=0;i<radiuses.length;i++) {
			radiuses[i]=input.nextDouble();
		}
		
		
		//		double radius1 =	input.nextDouble();
//		double radius2 =	input.nextDouble();
//		double radius3 =	input.nextDouble();
//		double radius4 =	input.nextDouble();
//		double radius5 =	input.nextDouble();
//		double radius6 =	input.nextDouble();
//		double radius7 =	input.nextDouble();
//		double radius8 =	input.nextDouble();
//		double radius9 =	input.nextDouble();
//		double radius10 =	input.nextDouble();

		// 2. Compute the area
//		double area1 =	Math.PI*radius1*radius1;
//		double area2 =	Math.PI*radius2*radius2;
//		double area3 =	Math.PI*radius3*radius3;
//		double area4 =	Math.PI*radius4*radius4;
//		//..
//		//..
//		double area9 =	Math.PI*radius9*radius9;
//		double area10 =	Math.PI*radius9*radius10;

	
//		System.out.println("The area for 1st cirlce is "+area1);
		
		double[] areas = new double[radiuses.length];
		
		
		for(int i=0;i<radiuses.length;i++) {
			areas[i]=
					Math.PI*radiuses[i]*radiuses[i];
		}
		
		for(int i=0;i<radiuses.length;i++) {
			System.out.println("The area for Circle"
		+ (i+1)+ " is "+areas[i]);
					
		}
		
		
		
		
		// 3. Double the size of circle
		
		// 4. Compute the perimeters
		
		
	}

}
