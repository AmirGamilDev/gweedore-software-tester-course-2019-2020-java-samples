package ie.nln.softwaretester.computer;

public class Computer {

	private int id;
	private String colour;
	private OpSystem opSystem;
	private boolean on;
	
	public Computer(int id, String colour, OpSystem system, boolean on) {
		this.id = id;
		this.colour = colour;
		this.opSystem = system;
		this.on = on;
	}
	
	public int getId() {
		return this.id;
	}

	public String getColour() {
		return this.colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public boolean isOn() {
		return this.on;
	}
	
	public void turnOn() {
		// note: could use isOn() or this.on
		if(isOn()) {
			System.out.println("Computer is already on");
			
			return;
		}
		
		this.on = true;
	}
	
	// above and below methods are effectively the same pattern.  Just different
	// ways of doing it (if or return vs else)
	
	public void turnOff() {
		if(!this.on) {  // could also be if(this.on != true)
			System.out.println("Computer is already off");
		} else {
			this.on = false;
		}
	}
	
	public OpSystem getOperatingSystem() {
		return this.opSystem;
	}
	
	public void setOperatingSystem(OpSystem opSystem) {
		this.opSystem = opSystem;
	}
}
