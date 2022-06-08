package com.globalpayex.geometry.entities;
import com.abc.geometry.entities.Shape;
public class Circle extends Shape
{
	float radius;

	public Circle(float radius) 
	{
		super();
		this.radius = radius;
	}

	@Override
	public float computeArea() 
	{
		// TODO Auto-generated method stub
		return 3.14f*this.radius*this.radius;
	}

	@Override
	public float computePerimeter()
	{
		
		// TODO Auto-generated method stub
		return 2.0f*3.14f*this.radius;
	}
	

}
