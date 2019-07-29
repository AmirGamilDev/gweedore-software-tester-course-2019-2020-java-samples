package ie.nln.softwaretester.basics;
import ie.nln.softwaretester.car.Car;

public class VariableMessin {

	public static void main(String[] args) {
		
		int num1 = 3;
		
		System.out.println("num1 before: " + num1);
		
		printValue(num1);
		
		System.out.println("num1 after: " + num1);
		
		Car car = new Car("Yellow", 998, 2, 3);
		
		System.out.println("Car colour before: " + car.getColour());
		
		printCarColour(car);
		
		System.out.println("Car colour after: " + car.getColour());
		
		int[] temperatures = { 12, 2, 3, -1, 3, 5, 9 };
		
		calculateAndPrintAverage(temperatures);
	}
	
	private static void calculateAndPrintAverage(int[] values) {
		double total = 0;
		
//		for(int i = 0; i < values.length; i++) {
//			total = total + values[i];
//		}
		
		for(int element : values) {
			total = total + element;
		}
		
		double average = total / values.length;
		
		System.out.println("Average temperature: " + average);
	}
	
	private static void printValue(int sample1) {
		System.out.println("Value: " + sample1);
	
		sample1 = 5; 
	}
	
	private static void printCarColour(Car car) {
		car = new Car("Green", 1398, 4, 4);
		
		car.setColour("Pink");
		
		System.out.println("Colour: " + car.getColour());
		
		car.setColour("Blue");
	}
}
