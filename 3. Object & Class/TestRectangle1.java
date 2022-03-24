package classobject;

public class TestRectangle1 {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(4,40);
		Rectangle rect2 = new Rectangle(3.5,35.9);

		System.out.println("Area of Rect 1: "+rect1.getArea());

		rect1.width=10;
		
		System.out.println("Width of Rect 1: "+rect1.width);
	
		System.out.println("Area of Rect 1: "+rect1.getArea());

	}

}
