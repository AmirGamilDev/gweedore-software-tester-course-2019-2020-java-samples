package ie.nln.softwaretester.inheritance;

public class Animal {
	
	protected String name;
	protected String colour;
	protected int age;
	
	public Animal(String name, String colour, int age) {
		this.name = name;
		this.colour = colour;
		this.age = age;
	}
	
	public void eat() {
		System.out.println(name + " is eating");
	}
	
	public String getName() {
		return this.name;
	}
	
	protected void findFood() {
		
	}
}
