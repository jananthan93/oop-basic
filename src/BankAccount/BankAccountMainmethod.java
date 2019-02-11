package BankAccount;

import java.util.Scanner;

public class BankAccountMainmethod {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double userAnnualIntrestRate;
		double userStartingBalance;
		int userNoOfMonths;
		double depositAmount;
		double withdrawAmount;
		double totalDeposits = 0;
		double totalWithdrawals = 0;
		double totalIntrestEarned = 0;

		System.out.println("please enter the annual intrest rate: ");
		userAnnualIntrestRate = scanner.nextDouble();
		
		System.out.println("Please enter the starting balance: ");
		userStartingBalance = scanner.nextDouble();
		
		System.out.println("Please enter the NoOfMonths: ");
		userNoOfMonths = scanner.nextInt();

		SavingsAccount account1 = new SavingsAccount(userStartingBalance);
		account1.setAnnualIntrestRate(userAnnualIntrestRate);

		for (int currentMonth = 1; currentMonth <= userNoOfMonths; currentMonth++) {
			System.out.println("How much did you deposit during month" + currentMonth);
			depositAmount = scanner.nextDouble();
			totalDeposits += depositAmount;
			account1.deposit(depositAmount);

			System.out.println("How much did you Withdraw during month" + currentMonth);
			withdrawAmount = scanner.nextDouble();
			totalWithdrawals += withdrawAmount;

			account1.withdraw(withdrawAmount);

			totalIntrestEarned += account1.addMonthlyIntrest();
		}

		System.out.printf(
				"the final balance at the end of %d months is %,.2f\n the Total amount of deposits: %,.2f\n"
				+ " The total amount of withdrawals: %,.2f\n The total intrest earned %,.2f",
				userNoOfMonths,account1.getBalance(), totalDeposits, totalWithdrawals, totalIntrestEarned);
	}

}
