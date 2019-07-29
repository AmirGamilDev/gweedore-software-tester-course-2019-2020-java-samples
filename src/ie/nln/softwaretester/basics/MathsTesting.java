package ie.nln.softwaretester.basics;
import java.util.Scanner;

public class MathsTesting {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter three numbers to sum");
		double first = scanner.nextDouble();
		double second = scanner.nextDouble();
		double third = scanner.nextDouble();
		
		double sum = sum(first, second, third);
		System.out.println("Sum: " + sum);
		
		System.out.println("Please enter a number to half");
		first = scanner.nextDouble();
		double half = half(first);
		System.out.println("Half: " + half);
		
		System.out.println("Please enter two numbers to multiply together");
		first = scanner.nextDouble();
		second = scanner.nextDouble();
		double product = multiply(first, second);
		System.out.println("Product: " + product);
		
		System.out.println("Please enter three numbers");
		first = scanner.nextDouble();
		second = scanner.nextDouble();
		third = scanner.nextDouble();
		double sum2 = sum(first, second, third);
		double half2 = half(sum2);
		double product2 = multiply(half2, 3);
		
		System.out.println("Final answer:" + product2);
		
		scanner.close();
	}
	
	public static double sum(double num1, double num2, double num3) {
		return num1 + num2 + num3;
	}
	
	public static double half(double num) {
		return num / 2;
	}
	
	public static double multiply(double num1, double num2) {
		return num1 * num2;
	}
}
