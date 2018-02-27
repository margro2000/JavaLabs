/* ) Write a program that reads an unspecified number of integers, determines how many positive and negative values have been read, and computes the total and average of the input values (not counting zeros). Your program ends with the input 0. Display the average as a floating-point number. Here is a sample run:
*/
import java.util.Scanner;
public class LabFiveOne {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int data;
	int sum=0;
	int numPos = 0;
	int numNeg=0;
	do { // Read the next data     
	System.out.print("Enter an integer (the input ends if it is 0): "); 
	data = input.nextInt(); 
	if (data>0) {
		numPos++; 
	}
	else if(data<0) {
		numNeg--;
	}
	sum += data; 
	if (sum==0&&numPos==0) {
		System.out.println("No numbers entered except 0.");
	}
	
	} while (data != 0); 
	System.out.println("The total is " + sum); 
	System.out.println("The number of positives is: " +numPos);
	System.out.println("The number of negatives is:" +numNeg);
	System.out.println("The average is: " +sum);
}
}


