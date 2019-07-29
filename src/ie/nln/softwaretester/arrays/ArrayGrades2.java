package ie.nln.softwaretester.arrays;
import java.util.Scanner;

public class ArrayGrades2 {

	public static void main(String[] args) {
		
		StudentGrade[] students = new StudentGrade[5];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < students.length; i++) {
			String name = scanner.nextLine();
			students[i] = new StudentGrade(name);
		}
		
		for(StudentGrade element : students) {
			int grade = scanner.nextInt();
			element.setGrade(grade);
		}
		
		System.out.println("yo");
		
		scanner.close();
	}
}
