package ie.nln.softwaretester.animal;

public class Bird extends Animal {

	public Bird(String n, String c) {
		super(n, c);
		
		System.out.println("Creating bird: " + getName());
	}
	
	@Override
	public void speak() {
		System.out.println(getName() + " is tweeting");
	}
	
	public void fly() {
		System.out.println(getName() + " is flying");
	}
}
