package ie.nln.softwaretester.arrays;

public class ArrayExample {

	public static void main(String[] args) {
		int[] temperatures = { 12, 2, 3, -1, 3, 5, 9 };
		int[] otherWay = new int[5];  // if you don't know the values in advance
		
		calculateAndPrintAverage(temperatures);
		
		printValue(temperatures[1]);
		
		System.out.println("In main: " + temperatures[1]);
	}
	
	private static void calculateAndPrintAverage(int[] values) {
		double total = 0;
		
		for(int i = 0; i < values.length; i++) {
			total = total + values[i];
		}
		
		// above and below for loops are equivalent
		
		total = 0;
		
		for(int element : values) {
			total = total + element;
		}
		
		double average = total / values.length;
		
		System.out.println("Average : " + average);
	}
	

	private static void printValue(int t) {
		//t = 3; - if this were here, it would change the value of t
		// before being processed
		
		System.out.println("Value: " + t);
	}
}
