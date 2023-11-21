package com.ATM._Interface.Bank;

import java.util.Scanner;

public class ATM {
	
	private BankAccount bankAccount;
	
	public ATM(BankAccount bankAccount) {
		this.bankAccount=bankAccount;
	}
	
	public void displayMenu() {
		System.out.println("ATM Menu : ");
		System.out.println("1. Withdraw");
		System.out.println("2. Deposit");
		System.out.println("3. Check Balance");
		System.out.println("4. EXIT");
	}
	public void performTransaction(int choice , Scanner scanner) {
		switch (choice) {
		case 1: {
			
			System.out.println("Enter the Withdrawal amount: ");
			double withdrawAmount = scanner.nextDouble();
			bankAccount.withdraw(withdrawAmount);
			break;
			
		}
		case 2: {
			System.out.println("Enter the Deposit amount : ");
			double depositAmount = scanner.nextDouble();
			bankAccount.deposit(depositAmount);
			break;
		}
		case 3 :{
			System.out.println("Current Balance"+bankAccount.getBalance());
			break;
		}
		case 4:{
			System.out.println("Existing ATM. Thank You");
			System.exit(0);
			break;
		}
		default:
			System.out.println("Invalid choice. Please select a valid option. ");
			
		}
	}

}
