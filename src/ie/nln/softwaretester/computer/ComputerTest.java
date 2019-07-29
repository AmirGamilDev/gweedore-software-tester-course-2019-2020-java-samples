package ie.nln.softwaretester.computer;

public class ComputerTest {

	public static void main(String[] args) {
		Computer computer1 = new Computer(1, "Green", OpSystem.WINDOWS, true);
		Computer computer2 = new Computer(2, "Blue", OpSystem.LINUX, true);
		Computer computer3 = new Computer(3, "Silver", OpSystem.MACOS, false);
		
		computer1.setColour("Purple");
		
		System.out.println("Colour of computer1 is: " + computer1.getColour());
		
		computer2.turnOn();
		computer2.turnOff();
		
		checkPowerStatus(computer1);
		checkPowerStatus(computer2);
		 
		int computer1Id = computer1.getId();
		printId(computer1Id);
		
		String thisCouldBeNamedAnything = computer3.getColour();
		printColour(thisCouldBeNamedAnything);
		
		printOperatingSystem(computer3);
		
 	}
	
	public static void printId(int theId) {
		System.out.println("The id is " + theId);
	} 
	
	public static void printColour(String colour) {
		System.out.println("The colour is " + colour);
	}
	
	public static void printOperatingSystem(Computer computerX) {
		System.out.println("The operating system is " + computerX.getOperatingSystem());
	}
	 
	public static void checkPowerStatus(Computer c) {
		if(c.isOn()) {
			System.out.println("Computer " + c.getId() + " is on");
		} else {
			System.out.println("Computer " + c.getId() + " is off");
		}
	}
}
