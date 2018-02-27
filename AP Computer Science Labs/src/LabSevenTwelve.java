/*The reverse method in Section 7.7 reverses an array by copying it to a new array. Rewrite the method that reverses the array passed in the argument and returns this array. Write a test program that prompts the user to 
enter ten numbers, invokes the method to reverse the numbers, and displays the numbers. */
import java.util.Scanner;
public class LabSevenTwelve {
	static final int SIZE = 10;
    public static void main(String[] args) {
        double[] array = new double[SIZE];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter " + SIZE + " numbers: ");
        for (int i = 0; i < array.length; i++) array[i] = input.nextDouble();
        double[] reverse = reverse(array);
        System.out.println("The array in reverse: ");
        printArray(reverse, 10);
    }
    public static double[] reverse(double[] original) {
        double[] reverse = new double[original.length];
        int endIndex = original.length - 1;
        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = original[endIndex--];
        }
        return reverse;
    }
    public static void printArray(double[] array, int numberPerLine) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%4.2f ", array[i]);
            if ((i + 1) % numberPerLine == 0) System.out.println("");
        }
    }
}