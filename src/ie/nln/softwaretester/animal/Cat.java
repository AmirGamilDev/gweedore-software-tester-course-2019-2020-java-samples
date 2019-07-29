package ie.nln.softwaretester.animal;

public class Cat extends Animal {

	public Cat(String nam, String col) {
		super(nam, col);
		
		System.out.println("Creating cat: " + getName());  // could also use nam here
	}
	
	@Override
	public void speak() {
		System.out.println(getName() + " says meow");
	}
}
