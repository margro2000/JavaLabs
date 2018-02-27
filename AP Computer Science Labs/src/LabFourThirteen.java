import java.util.Scanner;

/* Write a program that prompts the user to enter a letter and check whether the letter is a vowel or consonant. Here is a sample run:
*/
import java.util.Scanner;
public class LabFourThirteen {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	// Create Scanner object
		System.out.print("Enter a letter: ");
		char letter = input.next().charAt(0);
		if (letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u') {
			System.out.println("Vowel"); }
		else if (letter>'a' && letter<= 'z') {
			System.out.println("Consonant");
		}
		else 
			System.out.println("invalid input");
	}	
}
