import java.util.Scanner;

/*Suppose you are given a 6-by-6 matrix filled with
0s and 1s. All rows and all columns have an even number of 1s. Let the user flip
one cell (i.e., flip from 1 to 0 or from 0 to 1) and write a program to find which
cell was flipped. Your program should prompt the user to enter a 6-by-6 array
with 0s and 1s and find the first row r and first column c where the even number
of the 1s property is violated (i.e., the number of 1s is not even). The flipped cell
is at (r, c). Here is a sample run:*/
public class EightTwentyThree {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//create tester multi-dimensional array
		int [][] m = new int [6][6];
		System.out.print("Enter a 6x6 matrix row by row");
		for (int row=0; row<m.length; row++) {
			for (int column=0; column<m.length; column++)
				m[row][column]=input.nextInt();
		}
	      for(int row = 0; row< m.length; row++){
	          for(int col = 0 ;col< m[row].length; col++){ 
	                System.out.print(m[row][col]+"  ");
	          } 
	         System.out.println(); 
	      }
	      int totalOnes=0;
	      int totalZeroes=0;
	      int rowLocation=0;
	      int columnLocation=0;
	      for (int i=0; i<m.length; i++) {
	    	  if (totalOnes%2!=0 || totalZeroes%2!=0) {
	    		  rowLocation= i-1;
	    		  totalOnes=0;
	    		  totalZeroes=0;
	    		  break; }
	    	  for (int j=0; j<m.length; j++) {
	    		  if (m[i][j]==1)
	    			  totalOnes+=1;
	    		  else if (m[i][j]==0)
	    			  totalZeroes+=0;
	    	  }
	      }
	      for (int i=0; i<m.length; i++) {
	    	  if (totalOnes%2!=0 || totalZeroes%2!=0) {
	    		  columnLocation= i-1;
	    		  totalOnes=0;
	    		  totalZeroes=0;
	    		  break; }
	    	  for (int j=0; j<m.length; j++) {
	    		  if (m[j][i]==1)
	    			  totalOnes+=1;
	    		  else if (m[j][i]==0)
	    			  totalZeroes+=0;
	    	  }
	      }
	      System.out.println("The flipped cell is at ("+rowLocation+ "," +columnLocation+ ")");
	      
	      //for loop which goes through every row and counts the number of ones and the number of zeroes. If there are even ones and zeroes, go onto next row and keep going. If not, new for loop to which does the same for columns. Find column where there is not an even number of 1s and 0s. Display the row and column.
	     
		
	}

}
