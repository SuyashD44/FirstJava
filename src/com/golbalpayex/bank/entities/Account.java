package com.golbalpayex.bank.entities;

import java.util.Optional;

import com.globalpayex.bank.exceptions.MinBalanceException;
import static com.golbalpayex.bank.entities.BankConstants.*;
public class Account
{
	
	//private String accType;
	private AccType accType;
	private String accNumber;
	private double balance;
	
	/*public Account(String accType, String accNumber, double balance) 
	{
		super();
		this.accType = accType;
		this.accNumber = accNumber;
		this.balance = balance;
	}*/

	public Account(AccType accType, String accNumber, double balance) 
	{
		super();
		this.accType = accType;
		this.accNumber = accNumber;
		this.balance = balance;
	}
	public void setAccType(AccType a)
	{
		if (a == AccType.SAVINGS || a == AccType.CURRENT)
			this.accType = a;
		else 
			throw new IllegalArgumentException("Account type has to Savings/Current");
	}
	
	public void setAccNumber(String a)
	{
		if (a != null || a != " ")
			this.accNumber = a;
	}
	
	public void setAccBalance(double a)
	{
		if (a > 1000.0)
		{
			this.balance = a;
		}
		else 
			throw new IllegalArgumentException("Account balance has to more than 1000");
	}
	
	public AccType getAccType()
	{
		return this.accType;
	}
	
	public String getAccNumber()
	{
		return this.accNumber;
	}
	
	public double getAccBalance()
	{
		return this.balance;
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
	
	
	public String getDetails()
	{
		if (this.accType == null && this.accType == null && this.balance == 0.0)
		{
			return null;
			
		}
		
		else return(String.format("Account number %s \n Account type %s\n Account balance %s"
								  , this.accNumber,this.accType.getValue(),this.balance));	
		
	}
	
	/*public Optional<String> getDetails()
	{
		if (this.accType == null && this.accType == null && this.balance == 0.0)
		{
			return Optional.empty();
			
		}
		
		else return Optional.of(String.format("Account number %s \n Account type %s\n Account balance %s"
								  , this.accNumber,this.accType,this.balance));	
		
	}	*/

}
