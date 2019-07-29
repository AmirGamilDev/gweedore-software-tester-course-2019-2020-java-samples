package ie.nln.softwaretester.arrays;

import java.util.Scanner;

public class ArrayGrades {
	
	public static void main(String[] args) {
		String[] names = { "Tom", "Peter", "John", "Ringo", "Paul" };
		int[] results = new int[5];
		
		storeResults(names, results);
		
		int total = 0;
		
		for(int element : results) {
			total += element;
		}
		
		double average = total / results.length;
		System.out.println("Average class grade: " + average);
	}
	
	private static void storeResults(String[] names, int[] grades) {
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < grades.length; i++) {
			System.out.println("Please enter grade for " + names[i]);
			grades[i] = scanner.nextInt();
		}
	}
}
