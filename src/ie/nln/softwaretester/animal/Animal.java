package ie.nln.softwaretester.animal;

public abstract class Animal {

	private String name;
	private String colour;
	
	public Animal(String n, String c) {
		this.name = n;
		this.colour = c;
		
		System.out.println("In Animal constructor for " + n);
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public void sleep() {
		System.out.println(name + " is sleeping");
	}
	
	public abstract void speak();
}
