/* Cat Class */

public class Cat extends animals{
	//instance variables
	String color="white";
	double weight=20.0; 
	boolean fed=false;
	
	public Cat(){} //default constructor
	
	//constructor to set color, weight, and whether the cat is fed
	public Cat(String color, double weight, boolean fed) {
		this.color=color;
		this.weight=weight;
		this.fed=fed;
	}
	
	//accessor and mutator methods for all instance variables
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight=weight;
	}
	public boolean isFed() {
		return fed;
	}
	public void Feed() {
		if(fed==true) //if already fed
			System.out.println("I'm not hungry...meowwww");
		this.fed=true;
	}
	
	public void talk(String phrase) { 
		//have the cat talk
		System.out.println(phrase);
	}
}
