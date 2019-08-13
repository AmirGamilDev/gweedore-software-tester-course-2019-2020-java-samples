package ie.nln.softwaretester.basics;
import java.util.Scanner;

public class MultiplyTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your name:");
		String name = scanner.nextLine();
		System.out.println("Hi " + name + "!");
		
		System.out.println("Please enter number 1:");
		int num1 = scanner.nextInt();
		System.out.println("Please enter number 2:");
		int num2 = scanner.nextInt();
		System.out.println("Please enter number 3:");
		int num3 = scanner.nextInt();
		
		int product = multiply(num1, num2, num3);
		
		System.out.println("The product is " + product);
	}
	
	public static int multiply(int n1, int n2, int n3) {
		int result = n1 * n2* n3;
		
		return result;
	}
}
