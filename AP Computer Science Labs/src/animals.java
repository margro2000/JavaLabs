
public class animals {
	public animals( ) {} 
	public int numberOfLegs;
	public int numberOfFleas;
	private String treat= "bone";
	protected String name= "Dot";
	public int getNumberLegs( )
	{  
	return numberOfLegs;
	}
	public int getNumberFleas() 
	{  
	return numberOfFleas;
	}
	public void setTreat(String treat) 
	{  
	this.treat = treat;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public int getWeight(int weight)
	{  
	return weight;
	}
	public void talk() {
		System.out.print("Hello");
	}
}
