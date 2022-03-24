package classobject;

public class Stock {
	/**Data Fields**/
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	/**Constructor**/
	Stock(String newSymbol, String newName){
		symbol=newSymbol;
		name=newName;
	}
	
	
	/**Methods**/
	//getChangePercent: --> double
	double getChangePercent() {
		return (currentPrice-previousClosingPrice)/previousClosingPrice*100;
	}
	
}
