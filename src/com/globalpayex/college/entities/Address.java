package com.globalpayex.college.entities;

public class Address {
	
	private String state;
	private String country;
	private String postalcode;
	public void setAddress(String country,String state, String postalcode) 
	{
		this.country = country;
		this.state = state;
		this.postalcode = postalcode;
	}

	public Address(String country,String state, String postalcode)
	{ 
		this.country = country;
		this.state = state;
		this.postalcode = postalcode;
	}
	
	public Address()
	{
		
	}
	
	public String getCountry()
	{
		return this.country;
	}
	
	public String getAddress()
	{
		return String.format("State: %s \nCountry: %s \nPostal Code: %s",
							this.state,this.country,this.postalcode);
	}

}
