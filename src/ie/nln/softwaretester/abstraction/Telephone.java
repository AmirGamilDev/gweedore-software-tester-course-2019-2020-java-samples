package ie.nln.softwaretester.abstraction;

public class Telephone extends CommunicationDevice {

	public Telephone(String col) {
		super(col);
		
		System.out.println("Constructing Telephone");
	}

	@Override
	public void sendMessage(String message) {
		System.out.println("Sending message from Telephone - with message: " + message);
	}
	
	@Override
	public String receiveMessage() {
		System.out.println("Receiving message from Telephone");
		
		return "Message from Telephone";
	}
	
	@Override
	public void makeSound() {
		System.out.println("Classic ring ring from telephone");
	}
}
