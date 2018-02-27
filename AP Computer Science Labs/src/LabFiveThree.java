/* Lab 5.3
 Margarita Groisman
 11/16/17
 Write a program that displays a specified table (note that 1 kilogram is 2.2 pounds):
 */
public class LabFiveThree {
	public static void main(String[] args) {
		final double poundsPerKilo = 2.2; // Create constant
		// Display header for table

		System.out.println("Kilograms      Pounds");

		// Display table
		//create table loop
		for (int i = 1; i <= 199; i += 2) {
			System.out.printf("%-15d%6.1f\n", i, (i * poundsPerKilo));  
			
		}  
		
		for(;;);

	}
	
}

