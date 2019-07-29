package ie.nln.softwaretester.basics;
import java.util.Scanner;

public class BasicStuff {
	
	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Please enter your name:");
		
		String name;
		name = myScanner.nextLine();
		
		sayHi(name);
		
		sayHi("Paul");
		sayHi("Conal");
		sayHi("Sean");
	}
	
	public static void sayHi(String n) {
		System.out.println("Hi " + n + "! - Nice to meet you!");
		
		System.out.println("Isn't the weather lovely today?");
	}
}
