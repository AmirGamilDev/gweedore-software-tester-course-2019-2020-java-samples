package ie.nln.softwaretester.staticstuff;

public class StaticExample {

	public static void main(String[] args) {
		
		sayHi("Paul");  // call to a static method from a static method

		System.out.println("Current martian count: " + Martian.getMartianCount());
		
		Martian martian1 = new Martian("Marvin");
		Martian martian2 = new Martian("Bill");
		Martian martian3 = new Martian("Ted");
		
		System.out.println("Current martian count: " + Martian.getMartianCount());
		
		martian1.takeDamage(75);
		martian1.takeDamage(75);
		
		System.out.println("Current martian count: " + Martian.getMartianCount());

		Martian martian4 = new Martian("Rufus");

		System.out.println("Current martian count: " + Martian.getMartianCount());

		martian4.attack();

		Martian martian5 = new Martian("Oswald");

		System.out.println("Current martian count: " + Martian.getMartianCount());

		martian4.attack();
	}
	
	public static void sayHi(String n) {
		System.out.println("Hi " + n + "!");
	}
}
