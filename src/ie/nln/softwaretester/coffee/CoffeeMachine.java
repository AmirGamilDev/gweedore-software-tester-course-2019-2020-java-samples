package ie.nln.softwaretester.coffee;

public class CoffeeMachine {

	private double litresCapacity;
	private String colour;
	private double coffeePrice;
	
	public CoffeeMachine(double litres, String c, double cp) {
		this.litresCapacity = litres;
		this.colour = c;
		this.coffeePrice = cp;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public String getColour() {
		return this.colour;
	}

	public double getLitresCapacity() {
		return litresCapacity;
	}

	public void setLitresCapacity(double litresCapacity) {
		this.litresCapacity = litresCapacity;
	}

	public double getCoffeePrice() {
		return coffeePrice;
	}

	public void setCoffeePrice(double coffeePrice) {
		this.coffeePrice = coffeePrice;
	}
	
	@Override
	public String toString() {
		String result = "CoffeeMachine [litresCapacity=" + this.litresCapacity 
				+ ", colour=" + colour + ", coffeePrice=" + coffeePrice + "]";
		
		return result;
	}
}
