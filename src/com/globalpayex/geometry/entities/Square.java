package com.globalpayex.geometry.entities;

import com.abc.geometry.entities.Shape;

public class Square extends Shape
{
	float side;
	
	public Square(float side)
	{
		this.side = side;
	}
	
	public float getSide()
	{
		return this.side;
	}
	public float computeArea()
	{
		return this.side*this.side;
	}
	
	public float computePerimeter()
	{
		return 4.0f*this.side;
	}

}
