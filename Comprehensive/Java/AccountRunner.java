package com.java;

public class AccountRunner {

	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount(3.0, 10000);
		savingsAccount.calculateInterest();
		savingsAccount.addToAccount(2000);
		
		CurrentAccount currentAccount = new CurrentAccount(2.5, 10000);
		currentAccount.calculateInterest();
		currentAccount.addToAccount(2000);
	}

}
