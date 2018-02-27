/*Write a test program that creates a Stock object with the stock symbol ORCL, the name
Oracle Corporation, and the previous closing price of 34.5. Set a new current
price to 34.35 and display the price-change percentage.*/
package StockPackage;

public class StockTest {
	public static void main(String[] args) {
		Stock stock1= new Stock("ORCL", "Oracle Corporation"); 

			System.out.println("The price-change percentage is %"+ stock1.getChangePercent(34.5, 34.35));
	}
}
	
