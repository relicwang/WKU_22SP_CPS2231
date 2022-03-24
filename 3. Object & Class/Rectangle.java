package classobject;

public class Rectangle {
	
	/**Data Fields**/
	double width=1;
	double height=1;
	
	/**Constuctors**/
	Rectangle(){
		
	}
	
	Rectangle(double newWidth, double newHeight){
		width=newWidth;
		height=newHeight;
	}
	
	/**Methods**/
	
	//getArea:  --> double
	double getArea() {
		return width*height;
	}
	
	//getPerimeter:  --> double
	double getPerimeter() {
		return 2*(width+height);
	}
	
}
