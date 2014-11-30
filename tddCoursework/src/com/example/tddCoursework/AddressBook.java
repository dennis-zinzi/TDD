package com.example.tddCoursework;

import java.util.*;

public class AddressBook {
	//Array of Entries stored
	private Entry[] entries;

	/**
	 * Constructor of AddressBook
	 */
	public AddressBook(){
		//Make an AddressBook store a maximum of 100 Entries
		entries = new Entry[100];
	}

	/**
	 * Method to add Entry to Address Book
	 * @param e - Entry to add
	 */
	public void addEntry(Entry e){
		for(int i=0;i<entries.length;i++){
			if(entries[i]==null){
				entries[i] = e;
				return;
			}
		}
		System.out.println("Address Book Full.");
	}
	
	/**
	 * Outputs details of every Entry in AddressBook
	 */
	public void makeList(){
		int i=0;
		while(i<entries.length && entries[i]!=null){
			System.out.println("Entry "+(i+1)+":");
			printInfo(i);
			i++;
		}
	}
	
	/**
	 * Prints out details of specified Entry
	 * @param i - Index of Entry to display
	 */
	public void printInfo(int i){
		System.out.println("\tName: "+entries[i].getName());
		System.out.println("\tAddress: "+entries[i].getAddress());
		System.out.println("\tPhone Number: "+entries[i].getPhoneNumber());
		System.out.println("\tBirthday: "+entries[i].getBirthday());
		System.out.println("\tID: "+entries[i].getID());
		System.out.println("");
	}
	
	/**
	 * Searches for every Entry with matching name, and produces list of matching Entries' details
	 * @param name - Entry name to be searched
	 * @return - List of Entries with matching name
	 */
	public List<Entry> searchByName(String name){
		List<Entry> matches = new ArrayList<Entry>();
		int i=0;
		while(i<entries.length && entries[i]!=null){
			if(entries[i].getName().equals(name)){
				printInfo(i);
				matches.add(entries[i]);
			}
			i++;
		}
		if(matches.size() == 0){
			System.out.println("Entry with name "+name+" not found.");
		}
		return matches;
	}
	
	/**
	 * Searches for every Entry with matching address, and produces list of matching Entries' details
	 * @param address - Entry address to be searched
	 * @return - List of Entries with matching address
	 */
	public List<Entry> searchByAddress(String address){
		List<Entry> matches = new ArrayList<Entry>();
		int i=0;
		while(i<entries.length && entries[i]!=null){
			if(entries[i].getAddress().equals(address)){
				printInfo(i);
				matches.add(entries[i]);
			}
			i++;
		}
		if(matches.size() == 0){
			System.out.println("Entry with address "+address+" not found.");
		}
		return matches;
	}
	
	/**
	 * Searches for every Entry with matching phone number, and produces list of matching Entries' details
	 * @param name - Entry phone number to be searched
	 * @return - List of Entries with matching phone number
	 */
	public List<Entry> searchByPhoneNumber(int phoneNumber){
		List<Entry> matches = new ArrayList<Entry>();
		int i=0;
		while(i<entries.length && entries[i]!=null){
			if(entries[i].getPhoneNumber() == phoneNumber){
				printInfo(i);
				matches.add(entries[i]);
			}
			i++;
		}
		if(matches.size() == 0){
			System.out.println("Entry with Phone Number "+phoneNumber+" not found.");
		}
		return matches;
	}
	
	/**
	 * Searches for every Entry with matching birthday, and produces list of matching Entries' details
	 * @param name - Entry birthday to be searched
	 * @return - List of Entries with matching birthday
	 */
	public List<Entry> searchByBirthday(String birthday){
		List<Entry> matches = new ArrayList<Entry>();
		int i=0;
		while(i<entries.length && entries[i]!=null){
			if(entries[i].getBirthday().equals(birthday)){
				printInfo(i);
				matches.add(entries[i]);
			}
			i++;
		}
		if(matches.size() == 0){
			System.out.println("Entry with Birthday "+birthday+" not found.");
		}
		return matches;
	}
	
	
	/**
	 * Returns array of Entries in Address Book
	 * @return - Array of Entries in Address Book
	 */
	public Entry[] getEntries(){
		return entries;
	}



}
