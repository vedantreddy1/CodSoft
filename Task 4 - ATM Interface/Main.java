package com.ATM._Interface.Bank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BankAccount userAccount =  new BankAccount(1000.0);
		ATM atmMachine  =  new ATM(userAccount);
		Scanner scanner = new Scanner(System.in);

		
		while(true)
		{
			atmMachine.displayMenu();
			System.out.println("Enter your Choice : ");
			int choice =  scanner.nextInt();
			atmMachine.performTransaction(choice, scanner);
		}
	}

}
