/*Write a method that returns the index of the smallest element in an array of integers. If the number of such elements is greater than 1, return the smallest index. */
import java.util.Scanner;
public class LabSevenTen {
	 static final int SIZE = 10;
	    public static void main(String[] args) {
	        double[] numbers = new double[SIZE];
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter " + SIZE + " numbers: ");
	        for (int i = 0; i < numbers.length; i++) numbers[i] = input.nextDouble();
	        System.out.println("The index of the smallest number is: " + indexOfSmallestElement(numbers));
	    }
	    public static int indexOfSmallestElement(double[] array) {
	        int index = 0;
	        double low = array[index];
	        for (int i = 0; i < array.length; i++) {
	            if (low > array[i]) {
	                low = array[i];
	                index = i;
	            }
	        }
	        return index;
	    }
	}
