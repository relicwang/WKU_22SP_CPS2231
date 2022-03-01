package review;

//Array:
// A collection of elements that have same type
// Loops are always good friend with array
public class ArrayIntermediate {

	public static void main(String[] args) {
		//How many ways to create an array? 3!
		
		//1. Scenerio 1: We know how many elements
		//     we want to save in the array,
		//    however, we don't their values when we
		//    create the array.
		//   e.g. I want to save all of your assignent 3
		//   scores(25 students), where the scores will be entered
		//   by students.
		//   Syntax:
		//    TYPE [] ARRAYNAME = new TYPE[SIZE];
		//    ARRAYNAME[0] = 5;
		//    ARRAYNAME[4] = 7
		// .....
		double[] scores = new double[25];
		
		
		scores[0]=input.nextDouble();
		scores[1]=input.nextDouble();
		//...
		
		
		
		//2. Scenerio 1: We know how many elements
		//     we want to save in the array, 
		//     in the meantime, we know their values
		//    when create the array.
		//   e.g. Generate select a color from following
		//   combination: "blue", "green", "red", "purple"
		//   Syntax:
		//   TYPE [] NAME = {el1, el2, el3, ... , eln};
		
		//1st Approch
		String[] colors=new String[4];
		colors[0]="blue";
		colors[1]="green";
		colors[2]="red";
		colors[3]="purple";

		//2nd Approach (shorthand approach)
		String[] colors2= {"blue","green","red","purple"};
		
		//3. We only want to using the array one time.
		//   e.g. Using arrays for test cases
		///   For exmple:
		//    A method called sum(): int[] --> int
		//   Syntax(Anonmous Array== Array without any name):
		//   new TYPE[]{el1, el2, el3, ... , eln}
		//  
		//  In order to test sum() method:
		
		//Using 2nd Way
		int[] nums= {1,2,3};
		System.out.println(sum(nums )== 6);
		
		
		//A better way
		System.out.println(sum(new int[] {1,2,3})== 6);

		
		//Save the values to the array
		double [] scores2 = new double[100];
		
		// --> help to get all index corresponding to our arrayu
		for(int i=0;i<scores2.length;i++) {
			scores2[i]=ANY VALUE;
		}
		
		//Access/get/read elements from the array
		for(int i=0;i<scores2.length;i++) {
			double currentElement =scores2[i];
			System.out.println(currentElement);
		}
		
		
		
	}

}
