package com.Address.Book.System.pro;

import java.util.Scanner;


public class AddressBookApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AddressBook addressbook = new AddressBook();
		
		
		
		while (true) {
			System.out.println("\n Address Book System Menu ; ");
			System.out.println("1. Add a contact");
			System.out.println("2. Remove a Contact");
			System.out.println("3. Search the Contact");
			System.out.println("4. Display All the Contatcts");
			System.out.println("5. EXIT");
			System.out.println("****************************");
			
			System.out.println("Enterthe choice :");
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			
			switch (choice) {
			case 1: 
				addContact(addressbook,scanner);
				break;
			case 2 :
				removeContact(addressbook, scanner);
				break;
				
			case 3: 
				searchContact(addressbook, scanner);
				break;
			case 4 :
				addressbook.displayAllContatcts();
				break;
			case 5:
				System.out.println("Exiting the Address book system");
				System.exit(0);
			}
			
			
		}
	
	
	}
	private static void addContact(AddressBook addressbook, Scanner scanner) {
		System.out.println("Enter the name: ");
		String name = scanner.nextLine();
		System.out.println("Phone Number: ");
		String phoneNumber = scanner.nextLine();
		System.out.println("Enter your Email Address : ");
		String email = scanner.nextLine();
		
		
		Contact newContact = new Contact(name, phoneNumber, email);
		addressbook.addContact(newContact);
	}
	
	
	private static void removeContact(AddressBook addressbook, Scanner scanner) {
		System.out.println("Enter the name of the contatc you want to remove: ");
		String name = scanner.nextLine();
		Contact contactToRemove = addressbook.searchContact(name);
		if(contactToRemove!=null) {
			System.out.println("Contact Removed ");
			addressbook.removeContact(contactToRemove);
		}
		else{
			System.out.println("Contact not Found.");
		}
		
	}
	
	private static void searchContact(AddressBook addressBook, Scanner scanner) {
		 System.out.println("Enter the name you want to search");
		 String name = scanner.nextLine();
		 Contact foundContact = addressBook.searchContact(name);
		 if (foundContact != null) {
			 System.out.println("Contact found : \n"+foundContact);
			 
		 }
		 else {
			 System.out.println("Contact not found.");
		 }
		
	}
	
	
}

