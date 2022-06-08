package com.globalpayex.college.entities;

public class Professor extends CollegeUser
{
	String[] subjects;
	
	public Professor(String name, char gender, String[] subjects) 
	{
		super(name,gender);
		this.subjects = subjects;
	}
	
	@Override
	public String getDetails() 
	{
		
		// TODO Auto-generated method stub
		return String.format(super.getDetails()+"\nSubjects %s %s",subjects[0],subjects[1]);
	}

}
