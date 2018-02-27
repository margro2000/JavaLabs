/* Dog class */
public class Dog extends animals {
	// Properties of the class
	public int numberOfFleas;
	public int spots;
	
	// Constructor of the class
	public Dog(String name){
		numberOfLegs = 4;
		numberOfFleas = 10;
		spots = (int)(Math.random() * 11); // 0 to 10 spots
		this.name = name;
	}
	
	public Dog(){
		this("Unnamed dog");
	}
	
	// Methods of the class
	public void bark(){
		System.out.println("Woof woof");
	}
	
	public void scratch(){
		if(numberOfFleas > 0){
			System.out.println(name + " scratched off a flea!");
			numberOfFleas--;
		}
	}
}
