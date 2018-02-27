/*
  Write a program that reads an unspecified number of scores and determines how many scores are above or equal to the average and how many scores are below the average. Enter a negative number to signify the end of the input. Assume that the maximum number of scores is 100. 
*/
import java.util.Scanner;
public class LabSevenFour {
	static final int MAX = 100;
    public static void main(String[] args) {
        int[] scores = new int[MAX];
        int numScores = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter scores: ");
        for (int i = 0; i < MAX; i++) {
            int num = input.nextInt();
            if (num < 0)  break;// break out of loop if input is negative
            scores[i] = num;
            numScores++;
        }
        scores[numScores] = -1; // marking last end of array
        int average = getAverage(scores, numScores);
        int above = scoresTracking(scores, average);
        System.out.println("Number of scores: " + numScores);
        System.out.println("Average score is: " + average);
        System.out.println("Scores above average = " + above);
        System.out.println("Scores below average = " + (numScores - above));
    }

    public static int getAverage(int[] scores, int numberOfScores) {
        int total = 0;
        for (int i = 0; scores[i] >= 0; i++) {
            total += scores[i];
        }
        return total / numberOfScores;
    }
    public static int scoresTracking(int[] scores, int average) {
        int count = 0;
        for (int i = 0; scores[i] >= 0; i++) {
            if (scores[i] >= average) count++;
        }
        return count;
    }
}