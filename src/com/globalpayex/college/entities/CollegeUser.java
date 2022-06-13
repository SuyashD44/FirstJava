package com.globalpayex.college.entities;

public class CollegeUser 
{
	protected String name;
	protected char gender;
	private Address address;
	public CollegeUser(String name, char gender) 
	{
		this.name = name;
		this.gender = gender;
		this.address = new Address();
	}
	
	public CollegeUser(String name, char gender,Address  addr)
	
	{
		this.name = name;
		this.gender = gender;
		this.address = addr;
	}
	
	public Address getAddressRef()
	{
		return this.address;
	}
	public String getDetails()
	{
		
		return String.format("Name: %s \nGender: %s",name,gender);
	}
	
	@Override
	public String toString() 
	{
		return String.format("Name: %s \nGender: %s",name,gender);
	}
}
