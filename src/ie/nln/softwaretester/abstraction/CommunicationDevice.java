package ie.nln.softwaretester.abstraction;

public abstract class CommunicationDevice {
	
	private String colour;
	
	public CommunicationDevice(String c) {
		this.colour = c;
		
		System.out.println("Constructing CommunicationDevice");
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public abstract void sendMessage(String message);
	
	public abstract String receiveMessage();
	
	public abstract void makeSound();
	
	public void turnOn() {
		System.out.println("Turn on");
	}
	
	public void turnOff() {
		System.out.println("Turn off");
	}
}
