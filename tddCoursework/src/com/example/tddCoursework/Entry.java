package com.example.tddCoursework;

import java.util.*;

public class Entry {
	private String name;
	private String address;
	private int phoneNumber;
	private String birthday;
	private final UUID ID = UUID.randomUUID(); 
	
	public Entry(){
		name = "";
		address = "";
		phoneNumber = 1;
		birthday = "01/01/1900";
		//idNum++;
	}
	
	public Entry(String name, String address, int phoneNumber, String birthday){
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
		//idNum++;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	
	public String getAddress(){
		return address;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	
	public int getPhoneNumber(){
		return phoneNumber;
	}
	
	public void setPhoneNumber(int phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
	
	public String getBirthday(){
		return birthday;
	}
	
	public void setBirthday(String birthday){
		this.birthday = birthday;
	}
	
	
	public String getID(){
		return ID.toString();
	}
}
