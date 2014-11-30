package com.example.tddCoursework;

import java.util.*;

public class AddressBook {
	private Entry[] entries;

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
			System.out.println("\tName: "+entries[i].getName());
			System.out.println("\tAddress: "+entries[i].getAddress());
			System.out.println("\tPhone Number: "+entries[i].getPhoneNumber());
			System.out.println("\tBirthday: "+entries[i].getBirthday());
			System.out.println("\tID: "+entries[i].getID());
			i++;
		}
	}
	
	public List<Entry> searchByName(String name){
		List<Entry> matches = new ArrayList<Entry>();
		int i=0;
		while(i<entries.length && entries[i]!=null){
			if(entries[i].getName().equals(name)){
				System.out.println("\tName: "+entries[i].getName());
				System.out.println("\tAddress: "+entries[i].getAddress());
				System.out.println("\tPhone Number: "+entries[i].getPhoneNumber());
				System.out.println("\tBirthday: "+entries[i].getBirthday());
				System.out.println("\tID: "+entries[i].getID());
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
			if(entries[i].getAddress().equals(address)){
				System.out.println("\tName: "+entries[i].getName());
				System.out.println("\tAddress: "+entries[i].getAddress());
				System.out.println("\tPhone Number: "+entries[i].getPhoneNumber());
				System.out.println("\tBirthday: "+entries[i].getBirthday());
				System.out.println("\tID: "+entries[i].getID());
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
			if(entries[i].getPhoneNumber() == phoneNumber){
				System.out.println("\tName: "+entries[i].getName());
				System.out.println("\tAddress: "+entries[i].getAddress());
				System.out.println("\tPhone Number: "+entries[i].getPhoneNumber());
				System.out.println("\tBirthday: "+entries[i].getBirthday());
				System.out.println("\tID: "+entries[i].getID());
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
			if(entries[i].getBirthday().equals(birthday)){
				System.out.println("\tName: "+entries[i].getName());
				System.out.println("\tAddress: "+entries[i].getAddress());
				System.out.println("\tPhone Number: "+entries[i].getPhoneNumber());
				System.out.println("\tBirthday: "+entries[i].getBirthday());
				System.out.println("\tID: "+entries[i].getID());
				matches.add(entries[i]);
			}
			i++;
		}
		if(matches.size() == 0){
			System.out.println("Entry with Birthday "+birthday+" not found.");
		}
		return matches;
	}
	
	public Entry[] getEntries(){
		return entries;
	}



}
