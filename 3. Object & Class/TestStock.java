package classobject;

public class TestStock {

	public static void main(String[] args) {
		
		Stock oracleStock =new Stock("ORCL","Oracle Corporation");
		
		oracleStock.currentPrice=34.35;
		oracleStock.previousClosingPrice=34.5;
		
		System.out.println(oracleStock.getChangePercent());
		
		
		
	}

}
