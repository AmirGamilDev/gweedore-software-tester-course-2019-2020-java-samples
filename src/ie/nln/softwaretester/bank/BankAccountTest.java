package ie.nln.softwaretester.bank;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount amirsBankAccount = new BankAccount("Amir", 12345678, 273.56);
		BankAccount tarasBankAccount = new BankAccount("Tara", 87654321, 300);
		
		amirsBankAccount.deposit(512.78);
		amirsBankAccount.withdraw(1000);
		amirsBankAccount.deposit(100);
		amirsBankAccount.withdraw(50);
	}
}
