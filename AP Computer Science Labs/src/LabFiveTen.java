/*Write a program that displays all the numbers from 100 to 1,000, ten per line, that are divisible by 5 and 6.  Numbers are separated by exactly one space. */
public class LabFiveTen {
	   public static void main(String[] args) {
		   int number=25;
		   int i;
		   
		   boolean isPrime=true;
		   for (i=2; i<number&&isPrime; i++) {
			   if (number %i==0)
				 isPrime=false;
	        }
	   System.out.println("i is " +i+ "isPrime is" +isPrime);
}
}