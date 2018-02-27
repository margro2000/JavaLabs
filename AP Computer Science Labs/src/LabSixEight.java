/*Write a class that that converts from Celsius to Fahrenheight and from fahrenheight to celsius*/
public class LabSixEight {
	public static void main(String[] args){
		System.out.println("Celsius   Fahrenheit|  Fahrenheit    Celsius  ");
		for (double f=120, celsius=40; celsius>=31; f=f-10, celsius--) {
		double fahrenheit= celsiusToFahrenheit(celsius);
		double c= fahrenheitToCelsius(f);
		System.out.printf("%-10.1f", celsius);
		System.out.printf("%-10.1f|", fahrenheit);
		System.out.printf("  "+"%-10.1f", f);
		System.out.printf("    "+"%-10.2f\n\n", c);
		}	
	}
	public static double celsiusToFahrenheit(double celsius) {
		double fahrenheit = (9.0 / 5) * celsius + 32;
		return fahrenheit;
	}
	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (5.0 / 9) * (fahrenheit-32);
		return celsius;
	}
}
