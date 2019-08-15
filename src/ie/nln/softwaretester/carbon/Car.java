package ie.nln.softwaretester.carbon;

public class Car implements CarbonFootprinter {

	private String make;
	
	private String colour;
	
	private int milesDriven;
	
	private double mpg;
	
	public Car(String m, String c, int md, double mpg) {
		this.make = m;
		this.colour = c;
		this.milesDriven = md;
		this.mpg = mpg;
	}

	@Override
	public double getCarbonFootprint() {
		return (milesDriven / mpg) * 19.82;
	}


	@Override
	public String toString() {
		return "Car [make=" + make + ", colour=" + colour + ", milesDriven=" + milesDriven + ", mpg=" + mpg + "]";
	}
		
	// leaving out getters and setters for conciseness
}
