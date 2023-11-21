package com.Address.Book.System.pro;

public class Contact {
	private String name;
	private String phoneNumber;
	private String email;
	
	
	
	public Contact(String name, String phoneNumber, String email) {
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.email=email;
		
	}
	@Override
	public String toString() {
		return "Name : "+ name+ "\nphoneNumber: "+ phoneNumber+ "\nEmail : "+ email;
	}
	
	public String getName() {
		return name;
	}
	

}
