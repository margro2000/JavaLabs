import java.util.Scanner;
public class LabEightNine {
/*Plan: create a string array (which is at first empty) and display it with the board showing. In a loop, ask user x to enter a row and column they would like to fill and fill with x and ask user O for row and column they would like to fill and fill column with this number. Display new board after every turn. If a player fills three spots or diagnol, break.*/
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//Create empty 3x3 array and display
		char [][] m = new char [3][3];
		for(int row = 0; row< m.length; row++){
			  System.out.println("--------------");
			  System.out.print("|");
	        for(int col = 0 ;col< m[row].length; col++){ 
	              System.out.print(m[row][col]+"  |");
	        } 
	       System.out.println(); }
		  System.out.println("--------------"); 
//Make loop for player moves
		  int Xcount=0;
		  int Ocount=0;
outerloop:
 for (int a=0; a<=m.length; a++) {
	System.out.println("Enter a row (0, 1, or 2) for player X:");
	int row= input.nextInt();
	System.out.println("Enter a column (0, 1, or 2) for player X:");
	int column =input.nextInt();
	m [row][column]= 'X';
	for(int i = 0; i< m.length; i++){
		  System.out.println("--------------");
		  System.out.print("|");
        for(int col = 0 ;col< m.length; col++){ 
              System.out.print(m[i][col]+"  |");
        } 
       System.out.println(); }
	  System.out.println("--------------");
	  for (int x=0; x<m.length; x++) {
		  if (Xcount==3) {
			  System.out.print("Player X wins!");
		  	  break outerloop; }
		  	  Xcount=0;
		  	 for (int y=0; y<m.length; y++) {
				  if (m[x][y]=='X') {
					  Xcount+=1;}} }
	  for (int x=0; x<m.length; x++) {
		  if (Xcount==3) {
			  System.out.print("Player X wins!");
		  	  break outerloop; }
		  	  Xcount=0;
		  	 for (int y=0; y<m.length; y++) {
				  if (m[y][x]=='X') {
					  Xcount+=1;}} }
	  if (m[0][0]=='X'&&m[1][1]=='X'&&m[2][2]=='X') {
		  System.out.print("Player X wins!");
	  	  break outerloop; 
	  }
	  if (m[2][0]=='X'&&m[1][1]=='X'&&m[0][2]=='X') {
		  System.out.print("Player X wins!");
	  	  break outerloop; 
	  }
	  
		  
	  System.out.println("Enter a row (0, 1, or 2) for player O:");
		row= input.nextInt();
		System.out.println("Enter a column (0, 1, or 2) for player O:");
		column =input.nextInt();
		m [row][column]= 'O';
		for(int i = 0; i< m.length; i++){
			  System.out.println("--------------");
			  System.out.print("|");
	        for(int col = 0 ;col< m.length; col++){ 
	              System.out.print(m[i][col]+"  |");
	        } 
	       System.out.println(); }
		  System.out.println("--------------");
		  
		  for (int x=0; x<m.length; x++) {
			  if (Ocount==3) {
				  System.out.print("Player O wins!");
				  break outerloop; }		  
			  Ocount=0;
			  for (int y=0; y<m.length; y++) {
				  if (m[x][y]=='O') {
					  Ocount +=1;}}}
		  for (int x=0; x<m.length; x++) {
			  if (Ocount==3) {
				  System.out.print("Player O wins!");
				  break outerloop; }		  
			  Ocount=0;
			  for (int y=0; y<m.length; y++) {
				  if (m[y][0]=='O') {
					  Ocount +=1;}}}
		  if (m[0][0]=='O'&&m[1][1]=='O'&&m[2][2]=='O') {
			  System.out.print("Player O wins!");
		  	  break outerloop; 
		  }
		  if (m[2][0]=='O'&&m[1][1]=='O'&&m[0][2]=='O') {
			  System.out.print("Player O wins!");
		  	  break outerloop; 
		  }

 }
	if (Xcount<3&&Ocount<3) {
		System.out.print("It's a tie!");
	}
			  
	  }

	}

	