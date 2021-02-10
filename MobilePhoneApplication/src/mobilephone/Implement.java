package mobilephone;

import java.util.Scanner;
import java.lang.System;

public class Implement {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		MobilePhone mobilephone = new MobilePhone(); // Object of MobilePhone class

		String name, phonenumber; // variables to store the input of user
		Contacts newcontact;
		boolean iterator = true;

		while (iterator) {

			System.out.println("****************************MOBILE PHONE APPLICATION**********************************"
					+ "\nEnter your choice :" + "\n1.Add new contact" + "\n2.Update the existing contact"
					+ "\n3.Remove contact" + "\n4.Find contact" + "\n5.Print the list of contacts" + "\n6.Quit");

			String choice = sc.next();

			switch (choice) {

			// Add new contact
			case "1":
				System.out.println("Enter the name of person");
				name = sc.next();
				System.out.println("Enter the phone number of person");
				phonenumber = sc.next();
				newcontact = new Contacts(name, phonenumber);
				mobilephone.addNewContact(newcontact);
				break;

			// Update the existing contact
			case "2":
				System.out.println("Enter the name of person");
				name = sc.next();
				System.out.println("Enter the phone number of person");
				phonenumber = sc.next();
				newcontact = new Contacts(name, phonenumber);
				mobilephone.updateExsistingContact(newcontact);
				break;

			// Remove the contact
			case "3":
				mobilephone.printContacts();
				System.out.println("Enter the name of person to be removed");
				name = sc.next();
				System.out.println("Enter the phone number of person");
				phonenumber = sc.next();
				newcontact = new Contacts(name, phonenumber);
				mobilephone.removeContact(newcontact);
				break;

			// Find contact
			case "4":
				System.out.println("Enter the name of person");
				name = sc.next();
				System.out.println("Enter the phone number of person");
				phonenumber = sc.next();
				newcontact = new Contacts(name, phonenumber);
				mobilephone.findContact(newcontact);
				break;

			// Print the list of contacts
			case "5":
				mobilephone.printContacts();
				break;

			// for exit
			case "6":
				System.out.println("************************THANK YOU***************************");
				iterator = false;
				System.exit(0);
				break;

			default:
				System.out.println("Please enter the correct choice");
			}
		}
	}
}
