package ie.nln.softwaretester.interfaces;

// TODO: Auto-generated Javadoc
/**
 * The Class Customer.
 */
public class Customer implements Buyer {

	/** The name. */
	private String name;
	
	/** The number. */
	private int number;
	
	/**
	 * Instantiates a new customer.
	 *
	 * @param name the name
	 * @param number the number
	 */
	public Customer(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param n the new name
	 */
	public void setName(String n) {
		this.name = n;
	}
	
	/**
	 * Buy.
	 *
	 * @param item the item
	 */
	@Override
	public void buy(String item) {
		System.out.println("Customer " + name + " buys " + item);
		
	}
}
