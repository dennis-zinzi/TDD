package com.example.tddCoursework;

import java.util.*;

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
	
	public void makeList(){
		int i=0;
		while(i<entries.length && entries[i]!=null){
			System.out.println("Entry "+(i+1)+":");
			System.out.println("\tName: "+entries[i].name);
			System.out.println("\tAddress: "+entries[i].address);
			System.out.println("\tPhone Number: "+entries[i].phoneNumber);
			System.out.println("\tBirthday: "+entries[i].birthday);
			System.out.println("\tID: "+entries[i].ID);
			i++;
		}
	}
	
	public List<Entry> searchByName(String name){
		List<Entry> matches = new ArrayList<Entry>();
		int i=0;
		while(i<entries.length && entries[i]!=null){
			if(entries[i].name.equals(name)){
				System.out.println("\tName: "+entries[i].name);
				System.out.println("\tAddress: "+entries[i].address);
				System.out.println("\tPhone Number: "+entries[i].phoneNumber);
				System.out.println("\tBirthday: "+entries[i].birthday);
				System.out.println("\tID: "+entries[i].ID);
				matches.add(entries[i]);
			}
			i++;
		}
		if(matches.size() == 0){
			System.out.println("Entry with name "+name+" not found.");
		}
		return matches;
	}
	
	public List<Entry> searchByAddress(String address){
		List<Entry> matches = new ArrayList<Entry>();
		int i=0;
		while(i<entries.length && entries[i]!=null){
			if(entries[i].address.equals(address)){
				System.out.println("\tName: "+entries[i].name);
				System.out.println("\tAddress: "+entries[i].address);
				System.out.println("\tPhone Number: "+entries[i].phoneNumber);
				System.out.println("\tBirthday: "+entries[i].birthday);
				System.out.println("\tID: "+entries[i].ID);
				matches.add(entries[i]);
			}
			i++;
		}
		if(matches.size() == 0){
			System.out.println("Entry with address "+address+" not found.");
		}
		return matches;
	}
	
	public List<Entry> searchByPhoneNumber(int phoneNumber){
		List<Entry> matches = new ArrayList<Entry>();
		int i=0;
		while(i<entries.length && entries[i]!=null){
			if(entries[i].phoneNumber == phoneNumber){
				System.out.println("\tName: "+entries[i].name);
				System.out.println("\tAddress: "+entries[i].address);
				System.out.println("\tPhone Number: "+entries[i].phoneNumber);
				System.out.println("\tBirthday: "+entries[i].birthday);
				System.out.println("\tID: "+entries[i].ID);
				matches.add(entries[i]);
			}
			i++;
		}
		if(matches.size() == 0){
			System.out.println("Entry with Phone Number "+phoneNumber+" not found.");
		}
		return matches;
	}
	
	public List<Entry> searchByBirthday(String birthday){
		List<Entry> matches = new ArrayList<Entry>();
		int i=0;
		while(i<entries.length && entries[i]!=null){
			if(entries[i].birthday.equals(birthday)){
				System.out.println("\tName: "+entries[i].name);
				System.out.println("\tAddress: "+entries[i].address);
				System.out.println("\tPhone Number: "+entries[i].phoneNumber);
				System.out.println("\tBirthday: "+entries[i].birthday);
				System.out.println("\tID: "+entries[i].ID);
				matches.add(entries[i]);
			}
			i++;
		}
		if(matches.size() == 0){
			System.out.println("Entry with Birthday "+birthday+" not found.");
		}
		return matches;
	}



}
