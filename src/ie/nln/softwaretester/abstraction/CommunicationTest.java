package ie.nln.softwaretester.abstraction;

public class CommunicationTest {
	public static void main(String[] args) {
		
		// can't do this - abstract class
//		CommunicationDevice myDevice = new CommunicationDevice();
		
		Telephone blackTelephone = new Telephone("Black");
		Telephone whiteTelephone = new Telephone("White");
		
		blackTelephone.turnOn();
		blackTelephone.sendMessage("Hello there");
		String response = blackTelephone.receiveMessage();
		System.out.println("Message received: " + response);
		blackTelephone.turnOff();
		
		Smartphone whiteSmartphone = new Smartphone("White", "Android");
		Smartphone blackSmartphone = new Smartphone("Black", "iOS");
		
		whiteSmartphone.turnOn();
		blackSmartphone.turnOn();
		whiteSmartphone.sendMessage("Yo!");
		blackSmartphone.sendText("How's things?");
		
		CommunicationDevice device = new Telephone("Red");
		device.sendMessage("What's the craic?");
		
		CommunicationDevice device2 = new Smartphone("Pink", "Android");
		device2.sendMessage("Hello from the Pink smartphone");
		device2.turnOn();
		
		if(device2 instanceof Smartphone) {
			Smartphone theActualSmartphone = (Smartphone) device2;
			theActualSmartphone.sendText("I downcasted!");
		}
		
		((Smartphone)device2).sendText("I downcasted.. again!");
	}
}
