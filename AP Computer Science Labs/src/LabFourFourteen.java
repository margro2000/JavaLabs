import java.util.Scanner;

/*Write a program that prompts the user to enter a letter grade A, B, C, D, or F and displays its corresponding numeric value 4, 3, 2, 1, or 0. Here is a sample run:
*/
import java.util.Scanner;
public class LabFourFourteen {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	// Create Scanner object
		System.out.print("Enter a letter(in uppercase): ");
		char letter = input.next().charAt(0);
		switch (letter) {
		case 'A':
			System.out.println("4");
			break;
		case 'B':
			System.out.println("3");
			break;
		case 'C':
			System.out.println("2");
			break;
		case 'D':
			System.out.println("1");
			break;
		case 'F':
			System.out.println("0");
			break;
		default:
			System.out.println("invalid input");
		}
	
	}
}
