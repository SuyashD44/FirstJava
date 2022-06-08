package com.globalpayex.college.entities;

public class CollegeUser
{
	String name;
	char gender;
	
	public CollegeUser(String name, char gender) 
	{
		this.name = name;
		this.gender = gender;
	}
	
	public String getDetails()
	{
		
		return String.format("Name: %s \nGender: %s",name,gender);
	}
	
	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		return String.format("Name: %s \nGender: %s",name,gender);
	}

}
