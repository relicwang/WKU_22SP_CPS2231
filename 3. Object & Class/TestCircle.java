package classobject;

public class TestCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println("# of Circles : "+Circle.getNumberOfObjects());
		
		Circle c2 = new Circle(666.9); 
		System.out.println("# of Circles : "+Circle.getNumberOfObjects());

		Circle c3 = new Circle(11); 
		System.out.println("# of Circles : "+Circle.getNumberOfObjects());

		System.out.println("Radius of Circles : "+c1.getRadius());
		c1.setRadius(-100);
		System.out.println("Radius of Circles : "+c1.getRadius());
		
				

//		if(>=0) {
//		c1.radius=-1000;
//		System.out.println("Area of c1: "+ c1.getArea());
//		}
//		
//		if(>=0) {
//			c2.radius=-1000;
//			System.out.println("Area of c1: "+ c1.getArea());
//			}
			
		
//		Circle.numOfObjects = 10000;
//		System.out.println("# of Circles : "+Circle.numOfObjects);

//		System.out.println("C1 radius is "+c1.radius);
//		System.out.println("C2 radius is "+c2.radius);
//
//		System.out.println("C1 area is "+c1.getArea());
//		System.out.println("C2 area is "+c2.getArea());

		
	}

}
