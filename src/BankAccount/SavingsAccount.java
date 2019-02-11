package BankAccount;

public class SavingsAccount {
	private double annualIntrestRate;
	private double balance;
	 
	public void withdraw(double userAmount) {
		balance -= userAmount;
	}

	public void deposit(double userAmount) {
		balance += userAmount;

	}

	public double getBalance() {
		return balance;
	}

	public double addMonthlyIntrest() {
		double monthlyIntrest;
		monthlyIntrest=((annualIntrestRate / 12) * balance);
		balance += monthlyIntrest;
		return monthlyIntrest;
	}

	public void setAnnualIntrestRate(double annualIntrestRate) {
		this.annualIntrestRate = annualIntrestRate/100 ;
	}
	
	public SavingsAccount(double startingBalance) {
		balance = startingBalance;
		annualIntrestRate = 0;
	}
}
