package com.Address.Book.System.pro;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	
	
		private List<Contact> contacts;
		
		public AddressBook() {
			this.contacts=new ArrayList<>();
		}
		
		public void addContact(Contact contact) {
			contacts.add(contact);
		}
		public void removeContact(Contact contact) {
			contacts.remove(contact);
		}
		
		public Contact searchContact(String name) {
			for (Contact contact: contacts) {
				if (contact.getName().equalsIgnoreCase(name)){
					return contact;
				}
			}
			return null;
		}

		public void displayAllContatcts() {
			for(Contact contact: contacts) {
				System.out.println(contact);
				System.out.println("-------------------------");
			}
		}
		
		
		
		
}
