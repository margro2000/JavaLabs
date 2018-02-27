
public class Test {
	public static void main(String[] args) {
	int number1 = (int)(System.currentTimeMillis() % 10); 
	System.out.println(number1);
	
	int x=3;
	int y=2;
	if (x > 2) 
		if (y > 2) { 
			int z = x + y;    
	System.out.println("z is " + z);  } 
	else  System.out.println("x is " + x); 
	
}
}
