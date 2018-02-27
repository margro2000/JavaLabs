/*Write a method that sums all the numbers in the major diagonal in an n * n matrix of double values. Write a test program that reads a 4-by-4 matrix and displays the sum of all its
elements on the major diagonal*/
import java.util.Scanner;
public class LabEightTwo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//my two-dimensional array
		double [][] m = new double [4][4];
		System.out.println("Enter a 4x4 matrix row by row");
		for (int row=0; row<m.length; row++) {
			for (int column=0; column<m.length; column++)
				m[row][column]=input.nextDouble();
		}
		double sum = sumMajorDiagonal(m);
		//display sum
		System.out.println("Sum of the elements in the major diagonal is " +sum);

	}
	//method to find sum
	public static double sumMajorDiagonal(double[][] m) {
		double sum= 0;
		for (int i=0; i<m.length; i++) {
			sum +=m [i][i]; }
		return sum;
		}
	}


