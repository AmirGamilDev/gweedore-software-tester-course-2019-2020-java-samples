package ie.nln.softwaretester.coffee;

import java.util.ArrayList;

public class CoffeeMachineTest {

	public static void main(String[] args) {
		
		CoffeeMachine coffeeMachine1 = new CoffeeMachine(3, "red", 2.20);
		CoffeeMachine coffeeMachine2 = new CoffeeMachine(2, "black", 1.20);
		
		ArrayList<CoffeeMachine> coffeeMachines = new ArrayList<CoffeeMachine>();
		
		coffeeMachines.add(coffeeMachine1);
		coffeeMachines.add(coffeeMachine2);
		
		System.out.println("Coffee Machine 1 " + coffeeMachine1);
		System.out.println("Coffee machines: " + coffeeMachines);
	}
}
