package com.example.tddCoursework;

public class AddressBook {
	Entry[] entries;

	public AddressBook(){
		entries = new Entry[100];
	}

	public void addEntry(Entry e){
		for(int i=0;i<entries.length;i++){
			if(entries[i]==null){
				entries[i] = e;
				return;
			}
		}
		System.out.println("Address Book Full.");
	}



}
