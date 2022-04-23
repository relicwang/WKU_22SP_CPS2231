package classobject;

public class TestRegularPolygon {

	public static void main(String[] args) {
		
		
		RegularPolygon polygon1 =   new RegularPolygon();
		System.out.println(polygon1.getN());
//		System.out.println(polygon1.n);
		
		RegularPolygon polygon2 =   new RegularPolygon(6,4);

		RegularPolygon polygon3 =   new RegularPolygon(10,4, 5.6, 7.8);
		
		polygon3.setSide(312);
		


	}

}
