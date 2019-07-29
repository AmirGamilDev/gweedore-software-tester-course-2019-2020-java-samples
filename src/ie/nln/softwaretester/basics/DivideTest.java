package ie.nln.softwaretester.basics;
import java.util.Scanner;

public class DivideTest {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Please enter first number");
		int num1 = myScanner.nextInt();
		
		System.out.println("Please enter second number");
		int num2 = myScanner.nextInt();
		
		double result = divide(num1, num2);
		
		System.out.println("Result is: " + result);
		
		myScanner.close();
	}
	
	private static double divide(double n1, double n2) {
		double result = n1 / n2;
		
		return result;
	}
}
