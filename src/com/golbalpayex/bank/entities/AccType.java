package com.golbalpayex.bank.entities;

public enum AccType
{

	SAVINGS("S"),
	CURRENT ("C");
	
	
	private String aTypeValue;
	
	AccType(String s)
	{
		this.aTypeValue = s;
	}
	
	public String getValue()
	{
		return this.aTypeValue;
	}
}
