package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

	//Test valid contact
	@Test
	void testContact() {
		Contact contact = new Contact(
				"11111",
				"Andrew",
				"Ingerman",
				"1234567890",
				"100 Park Pl");
		
		assertEquals("11111", contact.getContactID());
		assertEquals("Andrew", contact.getFirstName());
		assertEquals("Ingerman", contact.getLastName());
		assertEquals("1234567890", contact.getPhone());
		assertEquals("100 Park Pl", contact.getAddress());
	}
	
	//Test contact ID with exactly 10 characters
	@Test
	void testContactIDTenCharacters() {
		Contact contact = new Contact(
				"1234567890",
				"Andrew",
				"Ingerman",
				"1234567890",
				"100 Park Pl");
		
		assertEquals("1234567890", contact.getContactID());
	}

	//Test contact ID that is too long
	@Test
	void testContactIdTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(
					"12345678901",
					"Andrew",
					"Ingerman",
					"1234567890",
					"100 Park Pl");
		});
	}
	
	//Test a null contact ID
	@Test
	void testContactIDNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(
					null,
					"Andrew",
					"Ingerman",
					"1234567890",
					"100 Park Pl");
			
		});
	}
	
	//Test first name with 10 characters
	@Test
	void testFirstNameTenCharacters() {
		Contact contact = new Contact(
				"11111",
				"abcdefghij",
				"Ingerman",
				"1234567890",
				"100 Park Pl");
		
		assertEquals("abcdefghij", contact.getFirstName());
	}
	
	//Test first name that is too long
	@Test
	void testFirstNameTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(
					"11111",
					"abcdefghijk",
					"Ingerman",
					"1234567890",
					"100 Park Pl");
		});
	}
	
	//Test a null First name
	@Test
	void testFirstNameNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(
					"11111",
					null,
					"Ingerman",
					"1234567890",
					"100 Park Pl");
		
		});
	}
	
	//Test Last name with 10 characters
	@Test
	void testLastNameTenCharacters() {
		Contact contact = new Contact(
				"11111",
				"Andrew",
				"abcdefghij",
				"1234567890",
				"100 Park Pl");
		
		assertEquals("abcdefghij", contact.getLastName());
	}
	
	//Test last name that is too long
	@Test
	void testLastNameTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(
					"11111",
					"Andrew",
					"abcdefghijk",
					"1234567890",
					"100 Park Pl");
		});
	}
	
	//Test a null Last name
	@Test
	void testLastNameNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(
					"11111",
					"Andrew",
					null,
					"1234567890",
					"100 Park Pl");
		});
	}
	
	//Test a phone number that is too short
	@Test
	void testPhoneTooShort() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(
					"11111",
					"Andrew",
					"Ingerman",
					"123456789",
					"100 Park Pl");
		});
	}
	
	//Test a phone number that is too long
	@Test
	void testPhoneTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(
					"11111",
					"Andrew",
					"Ingerman",
					"12345678901",
					"100 Park Pl");
		});
	}
	
	//Test a phone number that contains letters
	@Test
	void testPhoneNotNumber() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(
					"11111",
					"Andrew",
					"Ingerman",
					"123abd4567",
					"100 Park Pl");
		});
	}
	
	//Test a null number
	@Test
	void testPhoneNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(
					"11111",
					"Andrew",
					"Ingerman",
					null,
					"100 Park Pl");
		});
	}
	
	//Test address with exactly 30 characters
	@Test
	void testAddressThirtyCharacters() {
		Contact contact = new Contact(
				"11111",
				"Andrew",
				"Ingerman",
				"1234567890",
				"a".repeat(30));
		assertEquals("a".repeat(30), contact.getAddress());
	}
	
	//Test address that is too long
	@Test
	void testAddressTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(
					"11111",
					"Andrew",
					"Ingerman",
					"1234567890",
					"a".repeat(31));
		});
	}
	
	//Test a null address
	@Test
	void testAddressNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(
					"11111",
					"Andrew",
					"Ingerman",
					"1234567890",
					null);
		});
	}
}
