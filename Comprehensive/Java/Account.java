package com.java;
public class Account {
	private double interest;
	protected double balance;
	public Account(double interest, double balance) {
		this.interest = interest;
		this.balance = balance;
	}
	public void calculateInterest() {
		double interestAmount = balance * (interest/100);
		System.out.println("Interest calculated : " + interestAmount);
		
		double newBalance = balance + interestAmount;
		System.out.println("Updated balance after interest : " + newBalance);
	}
	public void addToAccount(double amount) {
		balance = balance + amount;
		System.out.println(amount + "added to the account");
		System.out.println("New Balance " + balance);
	}
	
}
class SavingsAccount extends Account { 
	public  SavingsAccount(double interest, double balance) {
		super(interest, balance);
	}
	public void calculateInterest() {
		System.out.println("Calculating interest for savings Account ");
		super.calculateInterest();
	}
	public void addToAccount(double amount) {
		super.addToAccount(amount);
	}
	
}
class CurrentAccount extends Account {
	public  CurrentAccount(double interest, double balance) {
		super(interest, balance);
	}
	public void calculateInterest() {
		System.out.println("Calculating interest for Current Account ");
		super.calculateInterest();
	}
	public void addToAccount(double amount) {
		balance = balance + amount;
		System.out.println(amount + " added to the current account");
		System.out.println("New Balance : " + balance);	
	}
}