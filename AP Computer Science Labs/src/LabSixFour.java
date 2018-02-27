/* Write a method to display an integer in reverse order*/
import java.util.Scanner;
public class LabSixFour {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter integer:");
		int number = input.nextInt();
		System.out.println("The integer in reverse is ");
		reverse(number);
		input.close();
	}
	public static void reverse(int number) {
		int length = (int)(Math.log10(number)+1);
		int digit=0;
		 for (int i=0; i<length; i++) {
			 digit= (int) (number%10);
			 number=number/10;
			 System.out.print(digit);
		 }
		return;
		
	}


}
