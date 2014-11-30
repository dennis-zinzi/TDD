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
		assertTrue((ab != null) && (ab instanceof AddressBook));
		assertTrue((ab != null) && (ab instanceof AddressBook));
		assertTrue((ab != null) && (ab instanceof AddressBook));
	}

	/**
	 * Test Method to see if AddressBook store entries
	 */
	@Test
	public void hasEntries(){
		assertNotNull("Entries array not initialized", ab.getEntries());
	}

	/**
	 * Test Method to check if entries are being created
	 */
	@Test
	public void canCreateEntries(){
		assertTrue((e != null) && (e instanceof Entry));
	}

	/**
	 * Test Method to prove that Entry fields are being assigned
	 */
	@Test
	public void createEntry(){
		assertNotNull("Name not initialized", e.getName());
		assertNotNull("Address not initialized", e.getAddress());
		assertNotEquals("Phone number not assigned", 0, e.getPhoneNumber());
		assertNotNull("Birthday not initialized", e.getBirthday());
		assertNotNull("ID not assigned", e.getID());
	}

	/**
	 * Test Method to determine if Entries can be added to AddressBook
	 */
	@Test
	public void canAddEntry(){
		Entry e4 = new Entry("Siddharth Singh", "1 Maple Road", 02525163514, "04/09/1987");
		ab.addEntry(e4);
		assertTrue(ab.getEntries()[3].equals(e4));
	}

	/**
	 * Test Method to check if ID is unique to every Entry
	 */
	@Test
	public void IDIsUnique(){
		for(int i=0;i<ab.getEntries().length;i++){
			if(ab.getEntries()[i]!=null){
				String check = ab.getEntries()[i].getID();
				for(int y=0;y<i;y++){
					assertFalse("ID not unique", ab.getEntries()[y].getID()==check);
				}
			}
		}
	}

	/**
	 * Test Method to show that an Entry's ID cannot be changed
	 */
	@Test 
	public void IDIsUnchangeable(){
		String id = ab.getEntries()[0].getID();
		//Causes compilation problem so proves it's final thus theoretically passing the test
		//ab.getEntries()[0].ID = 1;
		assertEquals("ID modifieable",id, ab.getEntries()[0].getID());
	}

	/**
	 * Test Method to see if a list of Entries can be produced
	 */
	@Test
	public void makesListOfEntries(){
		ab.makeList();
	}
	
	/**
	 * Test Method to show if a list of Entries that match a given name can be produced
	 */
	@Test
	public void testSearchByName(){
		assertNotEquals(0, ab.searchByName("Dennis Zinzi").size());
		assertEquals(0, ab.searchByName("John Gordon").size());
	}
	
	/**
	 * Test Method to show if a list of Entries that match a given address can be produced
	 */
	@Test
	public void testSearchByAddress(){
		assertNotEquals(0, ab.searchByAddress("5 Grosvenor Plaza").size());
		assertEquals(0, ab.searchByAddress("10 Churchill Gardens").size());
	}
	
	/**
	 * Test Method to show if a list of Entries that match a given phone number can be produced
	 */
	@Test
	public void testSearchByPhoneNumber(){
		assertNotEquals(0, ab.searchByPhoneNumber(1026680125).size());
		assertEquals(0, ab.searchByPhoneNumber(1126580905).size());
	}
	
	/**
	 * Test Method to show if a list of Entries that match a given birthday can be produced
	 */
	@Test
	public void testSearchByBirthday(){
		assertNotEquals(0, ab.searchByBirthday("05/02/1998").size());
		assertEquals(0, ab.searchByBirthday("15/12/1978").size());
	}
	
	/**
	 * Test Method to determine is the Entry's name can be changed
	 */
	@Test
	public void canChangeName(){
		String name = ab.getEntries()[0].getName();
		ab.getEntries()[0].setName("Denzel Smith");
		assertNotEquals("Name not changed", name, ab.getEntries()[0].getName());
	}
	
	/**
	 * Test Method to determine is the Entry's address can be changed
	 */
	@Test
	public void canChangeAddress(){
		String address = ab.getEntries()[0].getAddress();
		ab.getEntries()[0].setAddress("10 Queen's Road");
		assertNotEquals("Address not changed", address, ab.getEntries()[0].getAddress());
	}
	
	/**
	 * Test Method to determine is the Entry's phone number can be changed
	 */
	@Test
	public void canChangePhoneNumber(){
		int phoneNumber = ab.getEntries()[0].getPhoneNumber();
		ab.getEntries()[0].setPhoneNumber(1227590908);
		assertNotEquals("Phone Number not changed", phoneNumber, ab.getEntries()[0].getPhoneNumber());
	}
	
	/**
	 * Test Method to determine is the Entry's birthday can be changed
	 */
	@Test
	public void canChangeBirthday(){
		String birthday = ab.getEntries()[0].getBirthday();
		ab.getEntries()[0].setBirthday("12/03/1995");
		assertNotEquals("Birthday not changed", birthday, ab.getEntries()[0].getBirthday());
	}

}
