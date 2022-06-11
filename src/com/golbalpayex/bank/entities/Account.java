package com.golbalpayex.bank.entities;

import com.globalpayex.bank.exceptions.MinBalanceException;

public class Account
{
	
	String accType;
	String accNumber;
	double balance;
	
	public Account(String accType, String accNumber, double balance) 
	{
		super();
		this.accType = accType;
		this.accNumber = accNumber;
		this.balance = balance;
	}
	
	public String getAccountDetails()
	{
		return String.format("Account number: %s \nBalance is: %s"
				,this.accNumber,this.balance);
	}
	public double withDrawAmount(double amt) throws MinBalanceException
	{
		System.out.println("Transaction starts");
		try
		{
			if (amt <= 0)
			{
				throw new IllegalArgumentException("Invalid withdrawl amount");
			}
			if (this.balance - amt < 1000.0)
			{
				
				throw new MinBalanceException("Min balance cannot be less than 1k");
			}
			return this.balance -= amt;
		}
		finally
		{
			System.out.println("End transaction");
		}

	}
	
	public double depositAmount(double amt)
	{
		return this.balance -= amt;
	}
	

}
