package com.example.tddCoursework;

import static org.junit.Assert.*;
import org.junit.*;

public class AddressBookTest extends AbstractLoggingJUnitTest{
	AddressBook ab;
	AddressBook ab2;
	AddressBook ab3;
	
	@Before
	public void initialize(){
		ab = new AddressBook();
		ab2 = new AddressBook();
		ab3 = new AddressBook();
	}

	
	@Test
	public void canCreateAddressBooks(){
		assertTrue((ab != null) && (ab instanceof AddressBook));
		assertTrue((ab != null) && (ab instanceof AddressBook));
		assertTrue((ab != null) && (ab instanceof AddressBook));
	}
	
	@Test
	public void hasNonNullFields(){
		assertNotNull("Names array not initialized", ab.names);
		assertNotNull("Addresses array not initialized", ab.addresses);
		assertNotNull("PhoneNumbers array not initialized", ab.phoneNumbers);
		assertNotNull("Birthdays array not initialized", ab.birthdays);
	}

}
