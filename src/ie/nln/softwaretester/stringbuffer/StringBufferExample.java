package ie.nln.softwaretester.stringbuffer;

public class StringBufferExample {

	public static void main(String[] args) {
		String message = "Hello";
		
		System.out.println(message);
		
		message += " world!";
		
		System.out.println(message);
		
		StringBuffer stringBuffer = new StringBuffer("Hi");
		
		stringBuffer.append("!  How's it going?");
		
		String messageFromBuffer = stringBuffer.toString();
		System.out.println(messageFromBuffer);
	}
}
