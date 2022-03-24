package classobject;

/**3 Class Members*
 * 	1. Data Fields
 *  2. Constructor
 *  3. Methods
 * */
	
public class Circle {
	/** 1. Data Fields **/
	private double radius;
    private static int numOfObjects = 0;
	
	/** 2. Constructor **/
	Circle(){ //no-arg constuctor
		radius=1.0;
		numOfObjects++;
	}
	
	Circle(double newRadius){
		radius=newRadius;
		numOfObjects++;

	}
	
	/** 3. Methods **/
	
	/**getArea:  ---> double **/
	double getArea() {
		return Math.PI*radius*radius;
	}
	
	/**getPerimeter:  ---> double **/
	double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	
	//getNumberOfObjects(): --> int
	static int getNumberOfObjects(){
		return numOfObjects;
	}
	
	//setRadius(): double --> void
	void setRadius(double newRadius) {
		if(newRadius>=0) {
		radius=newRadius;}
	}
	
	//getRadius():  --> double
	double getRadius() {
		return radius;
	}
}
