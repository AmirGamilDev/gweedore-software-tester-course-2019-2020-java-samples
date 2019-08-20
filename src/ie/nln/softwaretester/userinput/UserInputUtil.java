package ie.nln.softwaretester.userinput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputUtil {

	private static Scanner scanner = new Scanner(System.in);
	
	public static String getString() {
		return scanner.nextLine();
	}
	
	public static int getNumber() {
		int input = -1;
		
		boolean valid = false;
		
		do {
			try {
				input = scanner.nextInt();
				scanner.nextLine();
				
				valid = true;
			} catch(InputMismatchException e) {
				// do nothing - loop will handle scenario
			}
			
			if(!valid) {
				System.out.println("Please enter an integer");
			}
			
		} while(!valid);
		
		return input;
	}
}
