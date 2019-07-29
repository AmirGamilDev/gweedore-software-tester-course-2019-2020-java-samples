package ie.nln.softwaretester.staticstuff;

public class Martian {

	private int health;
	private String colour;
	
	private static int martianCount;
	
	public Martian(String c) {
		this.colour = c;
		
		health = 100;
		
		martianCount++;
		
		System.out.println("Let's go!");
	}
	
	public void takeDamage(int d) {
		System.out.println("Ouch!");
		
		health -= d;
		
		if(health <= 0) {
			die();
		}
	}
	
	public void die() {
		System.out.println("Aaaaahhhh");
		
		martianCount--;
	}
	
	public static int getMartianCount() {
		return martianCount;
	}
}
