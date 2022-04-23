package classobject;

public class TestCircleOverride {

	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(5);

//		System.out.println(c1);//"Radius is 5"
//		System.out.println(c1.toString());// 1 --> "1"

		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
		
		
//		int[] arr1 = {1,3,4};
//		System.out.println(arr1);//--->
		
		
//		System.out.println(1);// 1 --> "1"
//		System.out.println('a');// 'a' --> "a"

	}

}
