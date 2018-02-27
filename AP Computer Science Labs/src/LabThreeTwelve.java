import java.util.Scanner;
public class LabThreeTwelve {
	    public static void main(String args[]) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter a three digit integer: ");
	    int number = input.nextInt();
	    int hundredsplace= number/100;
	    int tensplace = (number % 100) /10;
	    int onesplace = (number%100) % 10;
	    if (hundredsplace == onesplace) {
	        System.out.println(number + " is a palindrome"); }
	    else {
	    System.out.println(number + " is not a palindrome");
	    }
	    }
}
