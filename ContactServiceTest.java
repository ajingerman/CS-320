package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	//Test adding a contact with a unique ID
	@Test
	void testAddContact() {
		ContactService service = new ContactService();
		
		Contact contact = new Contact(
				"11111",
				"Andrew",
				"Ingerman",
				"1234567890",
				"100 Park Pl");
		
		assertDoesNotThrow(() -> service.addContact(contact));
	}
	
	//Test adding a contact with duplicate ID
	@Test
	void testAddDuplicateContact() {
		ContactService service = new ContactService();
		
		Contact contact1 = new Contact(
				"11111",
				"Andrew",
				"Ingerman",
				"1234567890",
				"100 Park Pl");
		
		Contact contact2 = new Contact(
				"11111",
				"Anakin",
				"Skywalker",
				"0987654321",
				"1 Low Ground");
		
		service.addContact(contact1);
		
		assertThrows(IllegalArgumentException.class, () -> {
			service.addContact(contact2);
		});
	}
	
	//Test deleting a contact by contact ID
	@Test
	void testDeleteContact() {
		ContactService service = new ContactService();
		
		Contact contact = new Contact(
				"11111",
				"Andrew",
				"Ingerman",
				"1234567890",
				"100 Park Pl");
		
		service.addContact(contact);
		service.deleteContact("11111");
		
		assertThrows(IllegalArgumentException.class, () -> {
			service.deleteContact("11111");
		});
	}
	
	//Test updating first name by contact ID
	@Test
	void testUpdateFirstName() {
		ContactService service = new ContactService();
		
		Contact contact = new Contact(
				"11111",
				"Andrew",
				"Ingerman",
				"1234567890",
				"100 Park Pl");
		
		service.addContact(contact);
		
		service.updateFirstName("11111", "Obi Wan");
		
		assertEquals("Obi Wan", contact.getFirstName());
	}
	
	//Test updating last name by contact ID
	@Test
	void testUpdateLastName() {
		ContactService service = new ContactService();
		
		Contact contact = new Contact(
				"11111",
				"Andrew",
				"Ingerman",
				"1234567890",
				"100 Park Pl");
		
		service.addContact(contact);
		
		service.updateLastName("11111", "Kenobi");
		
		assertEquals("Kenobi", contact.getLastName());
	}
	
	//Test updating phone number by contact ID
	@Test
	void testUpdatePhone() {
		ContactService service = new ContactService();
		
		Contact contact = new Contact(
				"11111",
				"Andrew",
				"Ingerman",
				"1234567890",
				"100 Park Pl");
		
		service.addContact(contact);;
		
		service.updatePhone("11111", "0987654321");
		
		assertEquals("0987654321", contact.getPhone());
	}
	
	//Test updating address by contact ID
	@Test
	void testUpdateAddress() {
		ContactService service = new ContactService();
		
		Contact contact = new Contact(
				"11111",
				"Andrew",
				"Ingerman",
				"1234567890",
				"100 Park Pl");
		
		service.addContact(contact);;
		
		service.updateAddress("11111", "200 High Ground");
		
		assertEquals("200 High Ground", contact.getAddress());
	}
}
