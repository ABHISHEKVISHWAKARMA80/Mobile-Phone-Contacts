package mobilephone;

import java.util.ArrayList;

public class MobilePhone {

	private ArrayList<Contacts> contact = new ArrayList<Contacts>(); // list of contacts saved in the system
	
	public ArrayList<Contacts> getContact() {
		return contact;
	}

	public void setContact(ArrayList<Contacts> contact) {
		this.contact = contact;
	}

	// function to print the list of all contacts with name and phone number
	public void printContacts() {
		int serialnumber = 0;
		System.out.println("***********************List of contacts*************************");
		for (Contacts al : contact) {
			serialnumber++;
			System.out.println(serialnumber + ". Name: " + al.getName() + " PhoneNumber: " + al.getPhoneNumber());
		}
	}

	// function to add new contact
	public void addNewContact(Contacts newcontact) {
		int check = 0;
		for (Contacts al : contact) {
			if (al.getName().equalsIgnoreCase(newcontact.getName())) {
				check = 1;
				break;
			}
		}

		if (check == 0) {
			contact.add(newcontact);
			System.out.println(newcontact.getName() + " " + newcontact.getPhoneNumber() + " added successfully");
		} else
			System.out.println("The contact is already stored");

	}

	// function to add update existing contact
	public void updateExsistingContact(Contacts updatecontact) {
		int count = -1;
		int check = 0;
		for (Contacts al : contact) {
			count++;
			if (al.getName().equalsIgnoreCase(updatecontact.getName())) {
				contact.set(count, updatecontact);
				check = 1;
				System.out.println(al.getName() + " " + al.getPhoneNumber() + " is updated to " + updatecontact.getName() + " "
						+ updatecontact.getPhoneNumber());
			}
		}
		if (check == 0) {
			System.out.println("This contact is not be updated. Name is not present in the contact list");
		}

	}

	// function to remove the contact
	public void removeContact(Contacts removecontact) {
		int check = 0, count = 0;
		for (Contacts al : contact) {
			if (al.getName().equalsIgnoreCase(removecontact.getName()) && al.getPhoneNumber().equals(removecontact.getPhoneNumber())) {
				check = 1;
				break;
			}
			count++;
		}

		if (check == 0)
			System.out.println("The contact is not present");
		else {
			contact.remove(count);
			System.out.println(removecontact.getName() + " " + removecontact.getPhoneNumber() + " is successfully removed");
		}
	}

	// function to find the contact
	public void findContact(Contacts findcontact) {
		int check = 0;
		for (Contacts al : contact) {
			if (al.getName().equalsIgnoreCase(findcontact.getName()) && al.getPhoneNumber().equals(findcontact.getPhoneNumber())) {
				System.out.println("The contact is present -> Name: " + findcontact.getName() + " PhoneNumber: "
						+ findcontact.getPhoneNumber());
				check = 1;
				break;
			}
		}
		if (check == 0) {
			System.out.println("The contact is not present");
		}
	}

}