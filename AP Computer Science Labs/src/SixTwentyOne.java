/*The international standard letter/number mapping for telephones is shown in Programming Exercise 4.15. Write a method that returns a number, given an uppercase letter.
*/
import java.util.Scanner;
public class SixTwentyOne {
	public static void main(String[] args){ 
		Scanner input = new Scanner(System.in);
// Prompt the user to enter a phone number as a string
		System.out.print("Enter a string: ");
		String string = input.nextLine();
// Translate a letter to a digit and leaves all other character intact
		for (int i = 0; i < string.length(); i++) {
			if (Character.isLetter(string.charAt(i)))
				System.out.print(getNumber(Character.toUpperCase(string.charAt(i))));
			else
				System.out.print(string.charAt(i));
		}
}
static int getNumber(char uppercaseLetter) {
	if (uppercaseLetter >= 'W')
		return 9;
	else if (uppercaseLetter >= 'T')
		return 8;
	else if (uppercaseLetter >= 'P')
		return 7;
	else if (uppercaseLetter >= 'M')
		return 6;
	else if (uppercaseLetter >= 'J')
		return 5;
	else if (uppercaseLetter >= 'G')
		return 4;
	else if (uppercaseLetter >= 'D')
		return 3;
	else 
		return 2;
}

}
