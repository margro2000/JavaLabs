/*Write a method that prints characters using the following header:
public static void printChars(char ch1, char ch2, int numberPerLine)
This method prints the characters between ch1 and ch2 with the specified numbers per line. Write a test program that prints ten characters per line from 1 to Z. Characters are separated by exactly one space. */
public class LabSixTwelve {
	public static void main(String[] args){ 
	char ch1= 'l';
	char ch2 ='z';
	int numberPerLine=10;
	printChars(ch1, ch2, numberPerLine);
	}

public static void printChars(char ch1, char ch2, int numberPerLine) {
	for (char i=ch1; i<=ch1+numberPerLine; i++) {
	System.out.print(i);}
	System.out.println("");
	for (char a=(char) (ch1+numberPerLine+1); a<=ch2; a++) {
	System.out.print(a); }
}
}

