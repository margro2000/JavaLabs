/*
 (Geometry: area of a hexagon) The area of a hexagon can be computed using the following formula (s is the length of a side):
 */
import java.util.Scanner;
import java.lang.*;
public class LabFourFour {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	// Create Scanner object
		System.out.print("Enter the length of the side: ");
		double side = input.nextDouble();
		double area;
		area= (6*side*side)/(4*Math.tan(3.14159265359/6));
		System.out.printf("Area is %.2f", area);

	}
}
