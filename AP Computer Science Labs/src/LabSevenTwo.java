/* Write a program that reads ten integers and displays them in the reverse of the order in which they were read.*/
import java.util.Scanner;
public class LabSevenTwo {
	public static void main (String[] args) { //crate main method
		Scanner input= new Scanner(System.in);
		int [] list = new int[10]; //declare list array
		System.out.print("Enter ten integers:");
		for (int i=0; i<list.length; i++) { //create loop that adds user values at each index
			list[i]=input.nextInt();
		}
		for (int i=9; i>=0; i-- ) { //display in reverse order
			System.out.print(list[i]);
		}
		
	}
}