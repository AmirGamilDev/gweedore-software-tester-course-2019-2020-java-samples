package ie.nln.softwaretester.interfaces;

public class Shopkeeper implements Payable, Eater, Buyer {

	private String name;
	
	public Shopkeeper(String nam) {
		this.name = nam;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Shopkeeper [name=" + name + "]";
	}
	
	@Override
	public void pay() {
		System.out.println("Shopkeeper " + name + " got paid");
	}

	@Override
	public void buy(String item) {
		System.out.println("Shopkeeper " + getName() + " buys " + item);
	}
}
