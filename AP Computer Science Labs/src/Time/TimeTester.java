package Time;
/*Draw the UML diagram for the class and then implement the class. Write a test
program that measures the execution time of sorting 100,000 numbers using
selection sort*/
public class TimeTester {
		 
	public static void main(String[] args) {
        java.util.Random r = new java.util.Random();
        int[] numbers = new int[100000];
        
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(10000);
        }

        Time stopWatch = new Time();
        selectionSort(numbers);
        stopWatch.stop();

        System.out.println("Sorting 100,000 numbers took " + stopWatch.getElapsedTime() + " milliseconds");
    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length; i++) { 
            int currentMin = list[i]; 
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }   

            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}

