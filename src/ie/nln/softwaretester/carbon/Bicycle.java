package ie.nln.softwaretester.carbon;

public class Bicycle implements CarbonFootprinter {

	private int milesTraveled;
	
	public Bicycle(int m) {
		this.milesTraveled = m;
	}

	@Override
	public double getCarbonFootprint() {
		return milesTraveled * 0.95;
	}

	@Override
	public String toString() {
		return "Bicycle [milesTraveled=" + milesTraveled + "]";
	}
}
