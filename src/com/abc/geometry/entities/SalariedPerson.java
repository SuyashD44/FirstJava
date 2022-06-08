package com.abc.geometry.entities;

public interface SalariedPerson 
{
	public float getWorkingDays();
	public float getCostPerDay();
	public default float getSalary()
	{
		float base = this.getWorkingDays()*this.getCostPerDay();
		base -= 200.0f;
		base -= base*0.3f;
		return base;
	}

}
