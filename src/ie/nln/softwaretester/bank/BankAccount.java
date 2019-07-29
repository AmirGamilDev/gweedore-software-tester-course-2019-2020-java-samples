package ie.nln.softwaretester.bank;

public class BankAccount {

	private String name;
	private int accountNumber;
	private double balance;
	
	public BankAccount(String name, int accountNumber, double balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String n) {
		this.name = n;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double deposit) {
		balance = balance + deposit;  // could also be balance += deposit
	}
	
	public void withdraw(double withdrawal) {
		if(balance < withdrawal) {
			System.out.println("Insufficient funds");
		} else {
			balance = balance - withdrawal;
		}
	}
}