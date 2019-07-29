package ie.nln.softwaretester.inheritance;

public class AnimalTest {

	public static void main(String[] args) {
		Cat lola = new Cat("Lola", "calico", 5, "mixed");
		Cat tom = new Cat("Tom", "Black", 8, "Tabby");
		
		lola.eat();
		lola.meow();
	}
}
