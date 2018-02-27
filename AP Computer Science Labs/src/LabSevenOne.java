/* Write a program that reads student scores, gets the best score, and then assigns grades
 The program prompts the user to enter the total number of students, then prompts the user to enter all of the scores, and concludes by displaying the grades. Here is a sample run:
*/
import java.util.Scanner;
public class LabSevenOne {
	public static void main(String[] args) { //create main method
	Scanner input= new Scanner(System.in);
	System.out.print("Enter the number of students:");
	int i = input.nextInt();
	int [] score = new int[i]; //create score array
	//get student scores from user
	System.out.print("Enter all student scores");
	for (i=0; i<score.length; i++) {
		score[i]=input.nextInt();
	}
	//find best score
	double max = score[0]; 
	for (int a = 1; a <score.length; a++) { 
		if (score[a] > max) 
			max = score[a]; }
	
	//print results
	for (int b=0; b<score.length; b++) {
	char grade;
	//determine letter grade
	if (score[b]>(max-10)) 
		grade = 'A';
	else if (score[b]>(max-20))
		grade = 'B';	
	else if (score[b]>(max-30))
		grade = 'C';
	else if (score[b]>(max-40))
		grade = 'D';
	else 
		grade = 'F';
	System.out.println("Student " +b+ " is "+ score[b]+ " and grade is " + grade);
	}
}
}
