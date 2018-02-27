/*(Sum elements column by column) Write a method that returns the sum of all the
elements in a specified column in a matrix */
 import java.util.Scanner;
public class LabEightOne {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//create tester multi-dimensional array
		double [][] m = new double [4][4];
		System.out.println("Enter a 4x4 matrix row by row");
		for (int row=0; row<m.length; row++) {
			for (int column=0; column<m.length; column++)
				m[row][column]=input.nextDouble();
		}
		//create loop which prints values
		for (int columnIndex=0; columnIndex<m.length+1; columnIndex++) {
			double sum =sumColumn(m, columnIndex);
			System.out.println("Sum of the elements at column " +columnIndex + " is " +sum);
		}
	}
	//method which finds sums of columns
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		for (int i=0; i<m.length; i++) {
			sum += m[i][columnIndex];
		}
		return sum;
}
}