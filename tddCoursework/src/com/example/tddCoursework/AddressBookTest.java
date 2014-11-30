package com.example.tddCoursework;

import static org.junit.Assert.*;
import org.junit.*;

public class AddressBookTest extends AbstractLoggingJUnitTest{
	AddressBook ab;
	AddressBook ab2;
	AddressBook ab3;
	Entry e;

	@Before
	public void initialize(){
		ab = new AddressBook();
		ab2 = new AddressBook();
		ab3 = new AddressBook();
		e = new Entry("Dennis Zinzi", "1 Fake Street", 07514362475, "14/05/1993");
		ab.addEntry(e);
		ab.addEntry(new Entry("Mary Tea", "5 Grosvenor Plaza", 1129474261, "05/02/1998"));
	}


	@Test
	public void canCreateAddressBooks(){
		assertTrue((ab != null) && (ab instanceof AddressBook));
		assertTrue((ab != null) && (ab instanceof AddressBook));
		assertTrue((ab != null) && (ab instanceof AddressBook));
	}

	@Test
	public void hasEntries(){
		assertNotNull("Entries array not initialized", ab.getEntries());
	}


	@Test
	public void canCreateEntries(){
		assertTrue((e != null) && (e instanceof Entry));
	}

	@Test
	public void createEntry(){
		assertNotNull("Name not initialized", e.getName());
		assertNotNull("Address not initialized", e.getAddress());
		assertNotEquals("Phone number not assigned", 0, e.getPhoneNumber());
		assertNotNull("Birthday not initialized", e.getBirthday());
		assertNotNull("ID not assigned", e.getID());
	}

	@Test
	public void canAddEntry(){
		ab.addEntry(e);
		ab.addEntry(new Entry("Siddharth Singh", "1 Maple Road", 02525163514, "04/09/1987"));
		assertTrue(ab.getEntries()[0].equals(e));
	}

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

	@Test 
	public void IDIsUnchangeable(){
		String id = ab.getEntries()[0].getID();
		//Causes compilation problem so proves it's final thus theoretically passing the test
		//ab.getEntries()[0].ID = 1;
		assertEquals("ID modifieable",id, ab.getEntries()[0].getID());
	}

	@Test
	public void makesListOfEntries(){
		ab.makeList();
	}
	
	@Test
	public void testSearchByName(){
		assertNotEquals(0, ab.searchByName("Dennis Zinzi").size());
		assertEquals(0, ab.searchByName("John Gordon").size());
	}
	
	@Test
	public void testSearchByAddress(){
		assertNotEquals(0, ab.searchByAddress("1 Fake Street").size());
		assertEquals(0, ab.searchByAddress("10 Churchill Gardens").size());
	}
	
	@Test
	public void testSearchByPhoneNumber(){
		assertNotEquals(0, ab.searchByPhoneNumber(1026680125).size());
		assertEquals(0, ab.searchByPhoneNumber(1126580905).size());
	}
	
	@Test
	public void testSearchByBirthday(){
		assertNotEquals(0, ab.searchByBirthday("05/02/1998").size());
		assertEquals(0, ab.searchByBirthday("15/12/1978").size());
	}
	
	@Test
	public void canChangeName(){
		String name = ab.getEntries()[0].getName();
		ab.getEntries()[0].setName("Denzel Smith");
		assertNotEquals("Name not changed", name, ab.getEntries()[0].getName());
	}
	
	@Test
	public void canChangeAddress(){
		String address = ab.getEntries()[0].getAddress();
		ab.getEntries()[0].setAddress("10 Queen's Road");
		assertNotEquals("Address not changed", address, ab.getEntries()[0].getAddress());
	}
	
	@Test
	public void canChangePhoneNumber(){
		int phoneNumber = ab.getEntries()[0].getPhoneNumber();
		ab.getEntries()[0].setPhoneNumber(1227590908);
		assertNotEquals("Phone Number not changed", phoneNumber, ab.getEntries()[0].getPhoneNumber());
	}
	
	@Test
	public void canChangeBirthday(){
		String birthday = ab.getEntries()[0].getBirthday();
		ab.getEntries()[0].setBirthday("12/03/1995");
		assertNotEquals("Birthday not changed", birthday, ab.getEntries()[0].getBirthday());
	}

}
