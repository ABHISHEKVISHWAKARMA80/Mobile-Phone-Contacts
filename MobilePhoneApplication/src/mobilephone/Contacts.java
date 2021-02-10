package mobilephone;

public class Contacts {
	
	private String name; // Name of the person in the contact list
	private String phoneNumber; // Phone number of the person in the contact list
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// Constructor to set the name and phone number of the person
	Contacts(String name,String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
}