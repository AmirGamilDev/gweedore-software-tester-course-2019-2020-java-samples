package ie.nln.softwaretester.interfaces;

public class LimitedCompany extends Company {

	public LimitedCompany(String n) {
		super(n);
	}
	
	@Override
	public void pay() {
		System.out.println("LimitedCompany " + getName() + " got paid");
	}

	@Override
	public void buy(String item) {
		System.out.println("LimitedCompany " + getName() + " buys " + item);		
	}
}
