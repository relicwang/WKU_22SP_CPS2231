package classobject;

public class RegularPolygon {
	/**Data Fields**/
	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;

	/**Constructors**/
	RegularPolygon(){
		
	}
	
	RegularPolygon(int newN, int newSide){
		n=newN;
		side=newSide;
	}
	
	RegularPolygon(int newN, int newSide, double newX, double newY){
		n=newN;
		side=newSide;
		x=newX;
		y=newY;
	}
	
	/**Methods**/
	//setN: int  -->  void
	void setN(int newN) {
		n=newN;
	}
	
	//setSide: double  -->  void
	void setSide(double newSide) {
		side=newSide;
	}
	
	//setX: double  -->  void
	void setX(double newX) {
		x=newX;
	}
	
	//setY: double  -->  void
	void setY(double newY) {
		y=newY;
	}
	
	//getN:    -->  int
	int getN() {
		return n;
	}
	
	//getSide:    -->  double
	double getSide() {
		return side;
	}
	
	//getX:    -->  double
	double getX() {
		return x;
	}
	
	//getY:    -->  double
	double getY() {
			return y;
	}
	
	
	//getPerimeter:  --> double
	double getPerimeter() {
		return n*side;
	}
	
	//getArea:  --> double
	double getArea() {
		return n*side*side/(4*Math.tan(Math.PI/n));
	}
}
