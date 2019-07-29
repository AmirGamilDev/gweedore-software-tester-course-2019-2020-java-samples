package ie.nln.softwaretester.car;

import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {
		Car seansCar = new Car("Red", 1398, 4, 4);
		Car aislingsCar = new Car("Blue", 1598, 3, 4);
	
		String seansCarsColour = seansCar.getColour();
		seansCar.setColour("Green"); 
		
		System.out.println("Sean's car: " + seansCar);
		System.out.println("Aisling's car: " + aislingsCar);
		
		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(seansCar);
		cars.add(aislingsCar);
		
		System.out.println("All the cars: " + cars);
	}
}
