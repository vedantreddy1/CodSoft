package com.ATM._Interface.Bank;

public class BankAccount {
	
	private double balance;
	
	public BankAccount(double balance) {
		this.balance=balance;
	}
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("Deposit Completed . New Balance: "+balance);
		
	}
	
	
	public void withdraw(double amount) {
		if(amount>balance) {
			System.out.println("Insuffici=ent funds. Withdraw failed. ");
			}
		else {
			balance -=amount;
			System.out.println("Withdraw successfully completed. neew balance : "+balance);
		}
	}
	

}
