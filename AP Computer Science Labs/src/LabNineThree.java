/*Design a class named StopWatch. The class contains:
 ■ Private data fields startTime and endTime with getter methods.
 ■ A no-arg constructor that initializes startTime with the current time.
 ■ A method named start() that resets the startTime to the current time.
 ■ A method named stop() that sets the endTime to the current time.
 ■ A method named getElapsedTime() that returns the elapsed time for the
stopwatch in milliseconds.
 Draw the UML diagram for the class and then implement the class. Write a test
program that measures the execution time of sorting 100,000 numbers using
selection sort*/
public class LabNineThree {
	private int startTime;
	private int endTime;
	
	double getStartTime() {
		return startTime=(int) System.currentTimeMillis();
	}
	
	double getEndTime() {
		return endTime=(int) System.currentTimeMillis(); 
	}
	
	double start(int currentTime) {
		return currentTime= startTime;
	}
	
	double stop(int currentTime) {
		return currentTime=endTime;
	}
	
	double getElapsedTime() {
		return endTime-startTime;
	}
}
