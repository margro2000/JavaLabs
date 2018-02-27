/* Write a method that computes the sum of the digits in an integer. Use the following method header:
*/
import java.util.Scanner;
public class LabSixTwo {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter integer:");
		long n = input.nextLong();
		System.out.println("The sum of digits is: " + sumDigits(n));
	}
	public static int sumDigits(long n) {
		
	int sum=0;
	int length = (int)(Math.log10(n)+1);
	 for (int i=0; i<length; i++) {
		 int digit= (int) (n%10);
		n=n/10;
		sum= sum+digit;
	 }
	return sum;

	}
	
}
