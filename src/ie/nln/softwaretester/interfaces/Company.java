package ie.nln.softwaretester.interfaces;

public abstract class Company implements Payable {

	private String name;
	
	public Company(String n) {
		this.name = n;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + "]";
	}
}
