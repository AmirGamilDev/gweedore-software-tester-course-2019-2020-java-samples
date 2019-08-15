package ie.nln.softwaretester.carbon;

import java.util.ArrayList;

public class CarbonTest {

	public static void main(String[] args) {
		Car toyota = new Car("Toyota", "Blue", 10000, 35.4);
		Building carPark = new Building("Down the road", 1000);
		Bicycle seansBicycle = new Bicycle(200);
		
		ArrayList<CarbonFootprinter> carbonFootprinters = new ArrayList<CarbonFootprinter>();
		
		carbonFootprinters.add(toyota);
		carbonFootprinters.add(carPark);
		carbonFootprinters.add(seansBicycle);
		
		for(CarbonFootprinter carbonFootprint : carbonFootprinters) {
			String description = carbonFootprint.toString();
			System.out.println(description);
			
			double carbonFootprintValue = carbonFootprint.getCarbonFootprint();
			System.out.println("Carbon footprint: " + carbonFootprintValue);
		}
	}
}
