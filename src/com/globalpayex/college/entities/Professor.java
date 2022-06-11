package com.globalpayex.college.entities;

import com.abc.geometry.entities.SalariedPerson;

public class Professor extends CollegeUser implements SalariedPerson
{
	String[] subjects;
	float costPerDay;
	float workDays;
	
	public Professor(String name, char gender, String[] subjects,
					 float costPerDay,float workDays) 
	{
		super(name,gender);
		this.subjects = subjects;
		this.costPerDay = costPerDay;
		this.workDays = workDays;
	}
	
	@Override
	public String getDetails() 
	{	
		// TODO Auto-generated method stub
		return String.format(super.getDetails()+"\nSubjects %s %s",subjects[0],subjects[1]);
	}


	@Override
	public float getWorkingDays()
	{
		// TODO Auto-generated method stub
		return this.workDays;
	}

	@Override
	public float getCostPerDay() {
		// TODO Auto-generated method stub
		return this.costPerDay;
	}

}
