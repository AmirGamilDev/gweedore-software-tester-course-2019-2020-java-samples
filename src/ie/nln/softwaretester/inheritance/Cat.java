package ie.nln.softwaretester.inheritance;

public class Cat extends Animal {

	private String breed;
	
	public Cat(String name, String colour, int age, String breed) {
		super(name, colour, age);
		this.breed = breed;
	}
	
	public void meow() {
		System.out.println(getName() + " is meowing");
	}
}
