package ie.nln.softwaretester.abstraction;

public class Smartphone extends CommunicationDevice {

	private String operatingSystem;
	
	public Smartphone(String c, String os) {
		super(c);
		
		this.operatingSystem = os;
		
		System.out.println("Constructing Smartphone");
	}

	@Override
	public void sendMessage(String m) {
		System.out.println("Sending message from Smartphone with message: " + m);
	}

	@Override
	public String receiveMessage() {
		System.out.println("Receiving message on smartphone");
		
		return "Message from Smartphone";
	}

	@Override
	public void makeSound() {
		System.out.println("Making sound from Smartphone");
	}
	
	public void sendText(String message) {
		System.out.println("Smartphone sending a text with text: " + message);
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}
	
	@Override
	public void turnOn() {
		System.out.println("Turning on smartphone...");
		
		System.out.println("Power up");
		System.out.println("Boot operating system");
		System.out.println("Boot up complete");
		System.out.println("Show power up animation");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Show power down animation");
		System.out.println("Shut down OS");
		System.out.println("Power down");
	}
}
