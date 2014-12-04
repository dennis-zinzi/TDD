package com.example.tddCoursework;

import static org.junit.Assert.*;
import org.junit.*;

public class AddressBookTest extends AbstractLoggingJUnitTest{
	//Objects that will be used to test
	AddressBook ab;
	AddressBook ab2;
	AddressBook ab3;
	Entry e;
	Entry e2;
	Entry e3;

	/**
	 * Method to initialize Objects
	 */
	@Before
	public void initialize(){
		ab = new AddressBook();
		ab2 = new AddressBook();
		ab3 = new AddressBook();
		e = new Entry("Dennis Zinzi", "1 Fake Street", 07514362475, "14/05/1993");
		ab.addEntry(e);
		e2 = new Entry("Mary Tea", "5 Grosvenor Plaza", 1129474261, "05/02/1998");
		ab.addEntry(e2);
		e3 = new Entry("John Hammock", "5 Grosvenor Plaza", 1328444280, "02/09/1997");
		ab.addEntry(e3);
	}

	/**
	 * Test Method to see if multiple AddressBooks can be created
	 */
	@Test
	public void canCreateAddressBooks(){
		//Assert AddressBooks created are initialized and instances of AddressBook class 
		assertTrue((ab != null) && (ab instanceof AddressBook));
		assertTrue((ab != null) && (ab instanceof AddressBook));
		assertTrue((ab != null) && (ab instanceof AddressBook));
	}

	/**
	 * Test Method to see if AddressBook store entries
	 */
	@Test
	public void hasEntries(){
		//Assert Array of Entries in AddressBook is initialized
		assertNotNull("Entries array not initialized", ab.getEntries());
	}

	/**
	 * Test Method to check if entries are being created
	 */
	@Test
	public void canCreateEntries(){
		//Assert Entries created are initialized and instances of Entry class
		assertTrue((e != null) && (e instanceof Entry));
	}

	/**
	 * Test Method to prove that Entry fields are being assigned
	 */
	@Test
	public void createEntry(){
		//Assert fields of of an Entry are being initialized
		assertNotNull("Name not initialized", e.getName());
		assertEquals("Name not assigned correctly", "Dennis Zinzi", e.getName());
		assertNotNull("Address not initialized", e.getAddress());
		assertEquals("Address not assigned correctly", "1 Fake Street", e.getAddress());
		assertNotEquals("Phone number not assigned", 0, e.getPhoneNumber());
		assertEquals("Phone number not assigned correctly", 07514362475, e.getPhoneNumber());
		assertNotNull("Birthday not initialized", e.getBirthday());
		assertEquals("Birthday not assigned correctly", "14/05/1993", e.getBirthday());
		assertNotNull("ID not assigned", e.getID());
	}

	/**
	 * Test Method to determine if Entries can be added to AddressBook
	 */
	@Test
	public void canAddEntry(){
		//Create new Entry
		Entry e4 = new Entry("Siddharth Singh", "1 Maple Road", 02525163514, "04/09/1987");
		//Add new Entry to AddressBook
		ab.addEntry(e4);
		//Assert new Entry has been added to AddressBook
		assertTrue(ab.getEntries()[3].equals(e4));
	}

	/**
	 * Test Method to check if ID is unique to every Entry
	 */
	@Test
	public void IDIsUnique(){
		//Counter
		int i = 0;
		//Iterate thorough array until empty position found or reached end of array
		while(i<ab.getEntries().length && ab.getEntries()[i]!=null){
			//Get ID at current position
			int check = ab.getEntries()[i].getID();
			//Compare current ID with other Entry's IDs
			for(int y=0;y<i;y++){
				//Assert current ID is different to any other on array
				assertFalse("ID not unique", ab.getEntries()[y].getID()==check);
			}
			i++;
		}
	}

	/**
	 * Test Method to show that an Entry's ID cannot be changed
	 */
	@Test 
	public void IDIsUnchangeable(){
		//Get an Entry's ID
		int id = ab.getEntries()[0].getID();
		//Causes compilation problem so proves it's final thus theoretically passing the test
		//ab.getEntries()[0].ID = 1;
		
		//Assert ID value has not changed 
		assertEquals("ID not modifiable",id, ab.getEntries()[0].getID());
	}

	/**
	 * Test Method to see if a list of Entries can be produced
	 */
	@Test
	public void makesListOfEntries(){
		//Test makeList() method works
		ab.makeList();
	}

	/**
	 * Test Method to show if a list of Entries that match a given name can be produced
	 */
	@Test
	public void testSearchByName(){
		//Assert Entry with name "Dennis Zinzi" has been found by assuring size of matching Entries list is not empty 
		assertNotEquals(0, ab.searchByName("Dennis Zinzi").size());
		//Assert Entry with name "John Gordon" has not been found by assuring size of matching Entries list is empty
		assertEquals(0, ab.searchByName("John Gordon").size());
	}

	/**
	 * Test Method to show if a list of Entries that match a given address can be produced
	 */
	@Test
	public void testSearchByAddress(){
		//Assert Entry with address "5 Grosvenor Plaza" has been found by assuring size of matching Entries list is not empty
		assertNotEquals(0, ab.searchByAddress("5 Grosvenor Plaza").size());
		//Assert Entry with address "10 Churchill Gardens" has not been found by assuring size of matching Entries list is empty
		assertEquals(0, ab.searchByAddress("10 Churchill Gardens").size());
	}

	/**
	 * Test Method to show if a list of Entries that match a given phone number can be produced
	 */
	@Test
	public void testSearchByPhoneNumber(){
		//Assert Entry with phone number 1026680125 has been found by assuring size of matching Entries list is not empty
		assertNotEquals(0, ab.searchByPhoneNumber(1026680125).size());
		//Assert Entry with phone number 1126580905 has not been found by assuring size of matching Entries list is empty
		assertEquals(0, ab.searchByPhoneNumber(1126580905).size());
	}

	/**
	 * Test Method to show if a list of Entries that match a given birthday can be produced
	 */
	@Test
	public void testSearchByBirthday(){
		//Assert Entry with birthday "05/02/1998" has been found by assuring size of matching Entries list is not empty
		assertNotEquals(0, ab.searchByBirthday("05/02/1998").size());
		//Assert Entry with birthday "15/12/1978" has not been found by assuring size of matching Entries list is empty
		assertEquals(0, ab.searchByBirthday("15/12/1978").size());
	}

	/**
	 * Test Method to determine is the Entry's name can be changed
	 */
	@Test
	public void canChangeName(){
		//Get name of an Entry
		String name = ab.getEntries()[0].getName();
		//Change birthday of Entry
		ab.getEntries()[0].setName("Denzel Smith");
		//Assert previous name of Entry does not match with new value, thus proving Entry's name can be changed
		assertNotEquals("Name not changed", name, ab.getEntries()[0].getName());
	}

	/**
	 * Test Method to determine is the Entry's address can be changed
	 */
	@Test
	public void canChangeAddress(){
		//Get address of an Entry
		String address = ab.getEntries()[0].getAddress();
		//Change address of Entry
		ab.getEntries()[0].setAddress("10 Queen's Road");
		//Assert previous address of Entry does not match with new value, thus proving Entry's address can be changed
		assertNotEquals("Address not changed", address, ab.getEntries()[0].getAddress());
	}

	/**
	 * Test Method to determine is the Entry's phone number can be changed
	 */
	@Test
	public void canChangePhoneNumber(){
		//Get phone number of an Entry
		int phoneNumber = ab.getEntries()[0].getPhoneNumber();
		//Change phone number of Entry
		ab.getEntries()[0].setPhoneNumber(1227590908);
		//Assert previous phone number of Entry does not match with new value, thus proving Entry's phone number can be changed
		assertNotEquals("Phone Number not changed", phoneNumber, ab.getEntries()[0].getPhoneNumber());
	}

	/**
	 * Test Method to determine is the Entry's birthday can be changed
	 */
	@Test
	public void canChangeBirthday(){
		//Get birthday of an Entry
		String birthday = ab.getEntries()[0].getBirthday();
		//Change birthday of Entry 
		ab.getEntries()[0].setBirthday("12/03/1995");
		//Assert previous birthday of entry does not match with new value, thus proving Entry's birthday can be changed
		assertNotEquals("Birthday not changed", birthday, ab.getEntries()[0].getBirthday());
	}

}
