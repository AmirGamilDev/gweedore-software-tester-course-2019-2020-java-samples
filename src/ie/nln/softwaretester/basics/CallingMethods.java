package ie.nln.softwaretester.basics;

public class CallingMethods {

	public static void main(String[] args) {
		
		printNumbers(1, 2, 3, 4, 5);
		
		System.out.println("Hello");
		
		printNumbers(6, 7, 8, 9, 10);
		
		System.out.println("Hi");
	}
	
	static void printNumbers(int num1, int num2, int num3, int num4, int num5) {
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
	}
}
