/* Lab 5.3
 Margarita Groisman
 11/16/17
  (Conversion from miles to kilometers) Write a program that displays a specified table (note that 1 mile is 1.609 kilometers):
 */
public class LabeFiveFour {
	public static void main(String[] args) {
		final double milesPerKilo = 1.609; // Create constant
		// Display header for table
		System.out.println("Miles       Kilograms");
		// Display table
		//create table loop
		for (int i = 1; i <= 10; i ++) {
			System.out.printf("%-15d%6.3f\n", i, (i * milesPerKilo));  	
		}  

	}
	
}
