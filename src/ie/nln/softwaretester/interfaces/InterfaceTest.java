package ie.nln.softwaretester.interfaces;

import java.util.ArrayList;

public class InterfaceTest {

	public static void main(String[] args) {
		LimitedCompany pepsi = new LimitedCompany("Pepsi");
		LimitedCompany etb = new LimitedCompany("ETB");
		
		Shopkeeper bob = new Shopkeeper("Bob");
		
		System.out.println("This is Bob: " + bob);
		
		int num1 = 11;
		int num2 = 5;
		
		pepsi.pay();
		etb.pay();
		bob.pay();
		
		Payable evian = new LimitedCompany("Evian");
		Payable ballygowan = new LimitedCompany("Ballygowan");
		Payable larry = new Shopkeeper("Larry");
		
		evian.pay();
		ballygowan.pay();
		larry.pay();
		
		ArrayList<Payable> payables = new ArrayList<Payable>();
		
		payables.add(evian);
		payables.add(ballygowan);
		payables.add(larry);
		payables.add(pepsi);
		payables.add(etb);
		payables.add(bob);
		
		for(Payable payable : payables) {
			payable.pay();
		}
		
		Eater karlTheEater = new Shopkeeper("Karl");
		Eater homerTheEater = new Shopkeeper("Homer");
		
		ArrayList<Eater> eaters = new ArrayList<Eater>();
	}
}
