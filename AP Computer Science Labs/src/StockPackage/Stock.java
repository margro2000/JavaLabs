/*(The Stock class) Following the example of the Circle class in Section 9.2,
design a class named Stock that contains:
 ■ A string data field named symbol for the stock’s symbol.
 ■ A string data field named name for the stock’s name.
 ■ A double data field named previousClosingPrice that stores the stock
price for the previous day.
 ■ A double data field named currentPrice that stores the stock price for the
current time.
 ■ A constructor that creates a stock with the specified symbol and name.
 ■ A method named getChangePercent() that returns the percentage changed
from previousClosingPrice to currentPrice*/
package StockPackage;

public class Stock {
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	Stock(String newSymbol, String newName) {
	}
	
	double getChangePercent(double previousClosingPrice, double currentPrice) {
		return ((currentPrice-previousClosingPrice)/previousClosingPrice)*100;
	}
}
