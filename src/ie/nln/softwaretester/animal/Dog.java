package ie.nln.softwaretester.animal;

public class Dog extends Animal {

	public Dog(String nam, String col) {
		super(nam, col);
		
		System.out.println("Creating dog: " + getName());
	}
	
	@Override
	public void speak() {
		System.out.println(getName() + " says woof");
	}
}
