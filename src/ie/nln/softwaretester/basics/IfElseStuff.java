package ie.nln.softwaretester.basics;

public class IfElseStuff {

	public static void main(String[] args) {
		
		boolean humid = true;
		boolean sunny = false;
		boolean warm = false;

		if(humid) {
			System.out.println("It's humid today");
		}
		
		if(sunny) {
			System.out.println("It's sunny today");
		}
		
		if(warm) {
			System.out.println("It's warm today");
		}
		
		int num1 = 5;
		
		if(num1 % 2 == 0) {
			System.out.println("num1 is even");
		} else {
			System.out.println("num1 is odd");
		}
		
		String fruit = "Orange";
		
		if(fruit.equals("Orange")) {
			System.out.println("It's an orange");
		} else if(fruit.equals("Apple")) {
			System.out.println("It's an apple");
		} else {
			System.out.println("It's a watermelon");
		}
	}
}
