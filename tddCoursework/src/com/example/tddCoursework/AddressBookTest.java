package com.example.tddCoursework;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddressBookTest extends AbstractLoggingJUnitTest{

	@Test
	public void canCreateAddressBooks() {
		AddressBook ab = new AddressBook();
		AddressBook ab2 = new AddressBook();
		AddressBook ab3 = new AddressBook();
		
		assertTrue(ab instanceof Object);
		assertTrue(ab2 instanceof AddressBook);
		assertTrue(ab3 instanceof AddressBook);
		
	}

}
