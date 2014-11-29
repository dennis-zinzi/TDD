package com.example.tddCoursework;

public class Entry {
	String name;
	String address;
	int phoneNumber;
	String birthday;
	private static int idNum = 0;
	final int ID = idNum;
	
	public Entry(){
		name = "";
		address = "";
		phoneNumber = 1;
		birthday = "01/01/1900";
		idNum++;
	}
	
	public Entry(String name, String address, int phoneNumber, String birthday){
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
		idNum++;
	}
}
