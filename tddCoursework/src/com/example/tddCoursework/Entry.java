package com.example.tddCoursework;

import java.util.*;

public class Entry {
	//Instance variables for Entry
	private String name;
	private String address;
	private int phoneNumber;
	private String birthday;
	private final UUID ID = UUID.randomUUID(); 
	
	/**
	 * Default Entry Constructor
	 */
	public Entry(){
		name = "";
		address = "";
		phoneNumber = 1;
		birthday = "01/01/1900";
	}
	
	/**
	 * Entry Constructor
	 * @param name - Entry's name
	 * @param address - Entry's address
	 * @param phoneNumber - Entry's phone number
	 * @param birthday - Entry's birthday
	 */
	public Entry(String name, String address, int phoneNumber, String birthday){
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
	
	/**
	 * Returns Entry's name
	 * @return - Entry's current name
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * Changes Entry's name to one specified
	 * @param name - Entry's new name
	 */
	public void setName(String name){
		this.name = name;
	}
	
	
	/**
	 * Returns Entry's address
	 * @return - Entry's current address
	 */
	public String getAddress(){
		return address;
	}
	
	/**
	 * Changes Entry's address to one specified
	 * @param address - Entry's new address
	 */
	public void setAddress(String address){
		this.address = address;
	}
	
	
	/**
	 * Returns Entry's phone number
	 * @return - Entry's current phone number
	 */
	public int getPhoneNumber(){
		return phoneNumber;
	}
	
	/**
	 * Changes Entry's phone number to one specified
	 * @param phoneNumber - Entry's new phone number
	 */
	public void setPhoneNumber(int phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
	
	/**
	 * Returns Entry's birthday
	 * @return - Entry's current birthday
	 */
	public String getBirthday(){
		return birthday;
	}
	
	/**
	 * Changes Entry's birthday to one specified
	 * @param birthday - Entry's new birthday
	 */
	public void setBirthday(String birthday){
		this.birthday = birthday;
	}
	
	
	/**
	 * Returns Entry's ID
	 * @return - Entry's ID
	 */
	public String getID(){
		return ID.toString();
	}
}
