package ie.nln.softwaretester.carbon;

public class Building implements CarbonFootprinter {

	private String address;
	
	private double floorArea;
	
	private final double CARBON_FOOTPRINT_PER_SQUARE_METRE = 20;
	
	public Building(String address, double floorArea) {
		this.address = address;
		this.floorArea = floorArea;
	}

	@Override
	public String toString() {
		return "Building [address=" + address + ", floorArea=" + floorArea + ", FOOTPRINT_INDEX=" + CARBON_FOOTPRINT_PER_SQUARE_METRE
				+ "]";
	}
	
	@Override
	public double getCarbonFootprint() {
		return floorArea * CARBON_FOOTPRINT_PER_SQUARE_METRE;
	}
	
	// leaving out getters and setters to keep example concise
}
