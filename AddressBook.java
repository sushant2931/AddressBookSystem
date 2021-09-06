package com.bl.addressbooksystem;

public class AddressBook {
	String firstName, lastName, address, city, state, phoneNo, email;
    long zip;
    public void setDetails(){

        firstName = "Sushant";
        lastName = "Lad";
        address = "BalajiNagar";
        city ="Pune";
        state = "Maharashtra";
        zip = 411043;
        phoneNo = "8830602356";
        email = "sushantlad8888@gmail.com";
    }
    public void printValue(){

        System.out.println("First Nmae : " + firstName  + "\nLast Name : " + lastName + "\nAddress : " + address + "\nCity : " + city + "\nState : " + state + "\nZip : " + zip + "\nPhone Number : " + phoneNo + "\nE-mail : " + email); 
    }
}
