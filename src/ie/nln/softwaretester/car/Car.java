package ie.nln.softwaretester.car;

public class Car {
	
	// instance variables
	private String colour;
	private int engineSize;
	private int numberOfDoors;
	private int numberOfWheels;
	
	public Car(String c, int es, int nod, int now) {
		this.colour = c;
		this.engineSize = es;
		this.numberOfDoors = nod;
		this.numberOfWheels = now;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public void setColour(String col) {
 		this.colour = col;
	}

	@Override
	public String toString() {
		return "Car [colour=" + colour + ", engineSize=" + engineSize + ", numberOfDoors=" + numberOfDoors
				+ ", numberOfWheels=" + numberOfWheels + "]";
	}
}
