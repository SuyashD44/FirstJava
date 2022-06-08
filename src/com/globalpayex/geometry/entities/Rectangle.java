package com.globalpayex.geometry.entities;
import com.abc.geometry.entities.Shape;
public class Rectangle extends Shape 
{
	float length;
	float breadth;
	
	
	public Rectangle (float length, float breadth) 
	{
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public float computeArea()
	{
		return this.breadth*this.length;
	}

	public float computePerimeter()
	{
		return 2.0f*(this.length+this.breadth);
	}
}
