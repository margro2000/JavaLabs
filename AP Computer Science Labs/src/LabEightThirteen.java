/*Write the following method that returns the location of the largest element in a two-dimensional array.
 The return value is a one-dimensional array that contains two elements. These
two elements indicate the row and column indices of the largest element in the
two-dimensional array. Write a test program that prompts the user to enter a two-dimensional array and displays the location of the largest element in the array.
Here is a sample run:*/
import java.util.Scanner;
public class LabEightThirteen {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//my two-dimensional array
		System.out.print("Enter the number of rows and columns of the array:");
		int rows=input.nextInt(); 
		int columns=input.nextInt();   
		double [] [] a = new double [rows][columns];
		System.out.println("Enter a "+ rows+ "x" +columns+ " matrix row by row");
		for (int j=0; j<a.length; j++) {
			for (int i=0; i<a.length; i++) {
				a[j][i]=input.nextDouble(); }}
		printArray(locateLargest(a));
	}

public static int[] locateLargest(double[][] a) {
	double max=0;  
	int location1 = 0;
	int location2=0;
	for (int row=0; row<a.length; row++) {
		for (int column=0; column<a.length; column++) {
			if (a[row][column]>max) {
				max= a[row][column];
				location1= row;
				location2 =column;}
			}}
		int [] locations = new int [2];
		locations[0]=location1;
		locations[1]=location2;
		return locations;
		
}

public static void printArray(int[] locations) {
	int i;
	System.out.print("("); 
	for (i=0; i<locations.length; i++) {
		System.out.print(locations[i]);
		if (i<locations.length-1) {
			System.out.print(","); }
		}
	System.out.print(")");
}
}
