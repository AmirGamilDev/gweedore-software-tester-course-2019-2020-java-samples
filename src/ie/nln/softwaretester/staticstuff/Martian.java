package ie.nln.softwaretester.staticstuff;

public class Martian {

	private int health;
	private String name;
	
	private static int martianCount;
	
	public Martian(String c) {
		this.name = c;
		
		health = 100;
		
		martianCount++;
		
		System.out.println(this.name + ": Let's go!");
	}
	
	public void takeDamage(int d) {
		System.out.println(this.name + ": Ouch!");
		
		health -= d;
		
		if(health <= 0) {
			die();
		}
	}
	
	public void die() {
		System.out.println(this.name + ": Aaaaahhhh");
		
		martianCount--;
	}

	public void attack() {
		if(martianCount > 3) {
			System.out.println(this.name + ": Rush him!");
		} else {
			System.out.println(this.name + ": Attack... cautiously... from afar");
		}
	}
	
	public static int getMartianCount() {
		return martianCount;
	}
}
