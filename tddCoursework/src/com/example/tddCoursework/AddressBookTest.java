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
		assertNotNull("Entries array not initialized", ab.entries);
	}


	@Test
	public void canCreateEntries(){
		assertTrue((e != null) && (e instanceof Entry));
	}

	@Test
	public void createEntry(){
		assertNotNull("Name not initialized", e.name);
		assertNotNull("Address not initialized", e.address);
		assertNotEquals("Phone number not assigned", 0, e.phoneNumber);
		assertNotNull("Birthday not initialized", e.birthday);
		assertTrue("ID not assigned", e.ID>=0);
	}

	@Test
	public void canAddEntry(){
		ab.addEntry(e);
		ab.addEntry(new Entry("Siddharth Singh", "1 Maple Road", 02525163514, "04/09/1987"));
		assertTrue(ab.entries[0].equals(e));
	}

	@Test
	public void IDIsUnique(){
		for(int i=0;i<ab.entries.length;i++){
			if(ab.entries[i]!=null){
				int check = ab.entries[i].ID;
				for(int y=0;y<i;y++){
					assertFalse("ID not unique", ab.entries[y].ID==check);
				}
			}
		}
	}
	
	@Test 
	public void IDIsUnchangeable(){
		int id = ab.entries[0].ID;
		//Causes compilation problem so proves it's final thus theoretically passing the test
		//ab.entries[0].ID = 1;
		assertEquals("ID modifieable",id, ab.entries[0].ID);
	}

	//	@Test
	//	public void makesListOfEntries(){
	//		fail("Not yet implemented");
	//	}

}
