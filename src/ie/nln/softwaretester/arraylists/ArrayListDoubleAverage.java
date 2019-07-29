package ie.nln.softwaretester.arraylists;
import java.util.ArrayList;

public class ArrayListDoubleAverage {

	public static void main(String[] args) {
		ArrayList<Double> myDoubleList = new ArrayList<Double>();
		
		myDoubleList.add(1.1);
		myDoubleList.add(2.1);
		myDoubleList.add(3.1);
		myDoubleList.add(4.1);
		myDoubleList.add(5.1);
		myDoubleList.add(6.1);
		myDoubleList.add(7.1);
		myDoubleList.add(8.0);
		myDoubleList.add((double) 9);
		myDoubleList.add(10d);
		
		double total = 0;
		
		for(double element : myDoubleList) {
			total = total + element;  // total += element
		}
		
		double average = total / myDoubleList.size();
		
		System.out.println("Average: " + average);
	}
}
