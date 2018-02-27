import java.util.Scanner;

/*(Strictly identical arrays) The two-dimensional arrays m1 and m2 are strictly
identical if their corresponding elements are equal. Write a method that returns
true if m1 and m2 are strictly identical*/
public class LabEightTwentyEight {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//create tester multi-dimensional array
		int [][] m = new int [3][3];
		int [][] m2 = new int [3][3];
		System.out.print("Enter the first 3x3 matrix row by row");
		for (int row=0; row<m.length; row++) {
			for (int column=0; column<m.length; column++)
				m[row][column]=input.nextInt();
		}
		System.out.print("Enter the second 3x3 matrix row by row");
		for (int row=0; row<m2.length; row++) {
			for (int column=0; column<m2.length; column++)
				m2[row][column]=input.nextInt();
		}
	      int i;
	      int j;
	      for (i=0; i<m.length; i++) {
	    	  for (j=0; j<m.length; j++) {
	    		  if (m[i][j]!=m2[i][j]) {	    			  
	    			  System.out.println("The two arrays are not strictly identical");
	    			  break;}
	    		  if (i==m.length-1||j==m.length-1) 
	    			  System.out.println("The two arrays are strictly identical");
	    	  }
	    	  if (m[i][j]!=m2[i][j]) {
	    		  break;
	    	  }
	      }
	      
}
}