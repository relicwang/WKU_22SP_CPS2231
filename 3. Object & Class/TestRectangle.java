package classobject;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		
		Rectangle rect2 = new Rectangle(3,5);

		rect2.width=6;
		rect2.height=8;

		System.out.println("Width for rect2 is "+rect2.width);
		System.out.println("Height for rect2 is "+rect2.height);

		
		System.out.println("Area for rect1 is "+rect1.getArea());
		System.out.println("Perimter for rect1 is "+rect1.getPerimeter());

	}

}
