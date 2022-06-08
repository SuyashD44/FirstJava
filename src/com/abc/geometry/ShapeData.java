package com.abc.geometry;

import com.abc.geometry.entities.Shape;

public class ShapeData 
{
	public static void printShapeData(Shape s1)
	{
		System.out.println(String.format("The Area is %s \nThe Perimeter is %s",s1.computeArea(),s1.computePerimeter()));
	}
	

}
