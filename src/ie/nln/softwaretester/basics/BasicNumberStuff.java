package ie.nln.softwaretester.basics;
import java.util.Scanner;

public class BasicNumberStuff {

	public static void main(String[] args) {
		int num1;
		int num2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a value for first number:");
		num1 = scanner.nextInt();
		
		System.out.println("Please enter a value for second number:");
		num2 = scanner.nextInt();
		
		int sum = num1 + num2;
		System.out.println("Sum is " + sum);
		
	}
}
