package com.day10;

public class Contact 
{
	String firstName; 
	String lastName;
	String address;
	String city;
	String state;
	String  email;
	int zipCode;
	long phoneNo;
	
	public Contact(String first_Name, String last_Name, String address, String city, String state, String email,
			int zipCode, long phoneNo) {
		
		this.firstName = first_Name;
		this.lastName = last_Name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.email = email;
		this.zipCode = zipCode;
		this.phoneNo = phoneNo;
		System.out.println("\nFirst_Name : " + firstName + "   Last_Name : " + lastName + "\nAddress : " + address + "\nCity : " + city +
				"    State : " + state + "\nZipcode : " + zipCode + "\nPhone No : " + phoneNo + "\nEmail : " + email + "  ");
	
	}
}
