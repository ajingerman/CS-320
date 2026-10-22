package contact;

import java.util.ArrayList;

public class ContactService {
	
	//List used to store contacts
	private ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	//Add a new contact
	public void addContact(Contact contact) {
		
		//Check for unique Contact ID
		for(Contact existingContact : contactList) {
			if(existingContact.getContactID().equals(contact.getContactID())) {
				throw new IllegalArgumentException("Contact ID Already Exists");
			}
		}
		
		contactList.add(contact);
	}
	
	//Delete a contact using the contact ID
	public void deleteContact(String contactID) {
		
		for (Contact contact : contactList) {
			if(contact.getContactID().equals(contactID)) {
				contactList.remove(contact);
				return;
			}
		}
		
		throw new IllegalArgumentException("Contact ID not found");
	}
	
	//Updae first name with contact ID
	public void updateFirstName(String contactID, String firstName) {
		
		for(Contact contact : contactList) {
			if(contact.getContactID().equals(contactID)) {
				contact.setFirstName(firstName);
				return;
			}
		}
		
		throw new IllegalArgumentException("Contact ID not found");
	}
	
	//Update Last name using contact ID
	public void updateLastName(String contactID, String lastName) {
		
		for(Contact contact : contactList) {
			if(contact.getContactID().equals(contactID)) {
				contact.setLastName(lastName);;
				return;
			}
		}
		
		throw new IllegalArgumentException("Contact ID not found");
	}
	
	//Update phone number using contact ID
	public void updatePhone(String contactID, String phone) {
		
		for(Contact contact : contactList) {
			if(contact.getContactID().equals(contactID)) {
				contact.setPhone(phone);;
				return;
			}
		}
		
		throw new IllegalArgumentException("Contact ID not found");
	}
	
	//Update address using contact ID
	public void updateAddress(String contactID, String address) {
		
		for(Contact contact : contactList) {
			if(contact.getContactID().equals(contactID)) {
				contact.setAddress(address);;
				return;
			}
		}
		
		throw new IllegalArgumentException("Contact ID not found");
	}

}
