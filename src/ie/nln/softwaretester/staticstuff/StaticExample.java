package ie.nln.softwaretester.staticstuff;

public class StaticExample {

	public static void main(String[] args) {
		
		sayHi("Paul");

		System.out.println("Current martian count: " + Martian.getMartianCount());
		
		Martian martian1 = new Martian("Blue");
		Martian martian2 = new Martian("Red");
		Martian martian3 = new Martian("Green");
		
		System.out.println("Current martian count: " + Martian.getMartianCount());
		
		martian1.takeDamage(75);
		martian1.takeDamage(75);
		
		System.out.println("Current martian count: " + Martian.getMartianCount());
	}
	
	public static void sayHi(String n) {
		System.out.println("Hi " + n + "!");
	}
}
