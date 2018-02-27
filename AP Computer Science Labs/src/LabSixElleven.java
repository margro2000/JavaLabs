/* Write a method that computes the commission, using the scheme in Programming Exercise 5.39. */
public class LabSixElleven {
	public static void main(String[] args){
		System.out.println("Sales Amount   Commission");
		System.out.println("______________________________");
		for (double sales = 10000; sales<=100000; sales=sales+5000) {
			double commissions= computeCommission(sales);
			System.out.printf("%-10.0f", sales);
			System.out.printf("     "+ "%.1f\n", commissions);
		}
}
public static double computeCommission(double salesAmount) {
	double commission;
	double pay=0;
	if (salesAmount>0.01&&salesAmount<=5000) {
		commission= .08;
		pay=salesAmount*commission; }
	else if (salesAmount>5000&&salesAmount<=10000) {
		commission= .1;
		pay=(5000*.08)+((salesAmount-5000)*commission);}
	else if (salesAmount>10000) {
		commission= .12;
		pay=(5000*.08)+(5000*.1)+((salesAmount-10000)*commission);
	}
		else
		commission=0;

	 /*Note that this is a graduated rate. The rate for the first $5,000 is at 8%, the next $5000 is at 10%, and the rest is at 12%. If the sales amount is 25,000, the commission is 5,000 * 8% + 5,000 * 10% + 15,000 * 12% = 2,700.*/
	return pay;
}
}