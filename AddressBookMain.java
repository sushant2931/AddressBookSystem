package com.bl.addressbooksystem;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome In Adress Book Program On Master Branch");

		AddressBook contact = new AddressBook();
		contact.setDetails();
		contact.printValue();

	}
}
