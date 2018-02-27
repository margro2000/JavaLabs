/* Write a program that prompts the user to enter the number of students and each student’s name and score, and finally displays the name of the student with the highest score. */
import java.util.Scanner;
public class LabFiveEight {
	public static void main(String[] args) { 
	//declare variables
	String name;
	int score;
	int highScore = 0; // Holds the hightest student score
	String highScoreName = ""; // Holds the student name with highest score
	Scanner input = new Scanner(System.in); //create Scanner Object
	System.out.print("How many students are there?"); //display prompt
	int numStudents = input.nextInt();
	// create loop to keep asking for name and score of students until total number of students
		for (int i = 0; i < numStudents; i++) {
			System.out.print(
				"Student: " + (i + 1) + "\n   Name: "); //Write which student (use i+1 since i starts at 0) and then ask for name
			name = input.next();
			System.out.print("Score: "); // Prompt use for score
			score = input.nextInt();
			
			// Test if score is higher than highest score 
			if (score > highScore)
			{
				highScore = score;
				highScoreName = name;
			}
		}
		// Display the name of the student with the highest score

	System.out.println("Student with the highest score: " + highScoreName);
	}
	
}
