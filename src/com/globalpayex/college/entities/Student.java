package com.globalpayex.college.entities;

public class Student extends CollegeUser
{
	
	int rollno;
	float marks;
	public Student(String name, char gender,int roll, float marks)
	{
		super(name,gender);
		this.rollno = roll;
		this.marks = marks;
	}
	
	
	public Student()
	{
		this("NA",'M',-1,0.0f);
	}
	
	
	static Student newStudent(String name,char gender, int roll, float marks)
	{
		return new Student(name,gender,roll,marks);
	}
	
	@Override
	public String getDetails() 
	{
		// TODO Auto-generated method stub
		return String.format(super.getDetails()+"\nRollNo: %s \nMarks %s", rollno,marks);
	}
	
	
	char getGrade()
	{
		char grade = ' ';
		if (marks > 100 || marks < 0)
			return 'I';
		if (marks >= 70)
			grade = 'A';
		else if (marks >= 60)
			grade = 'B';
		else if (marks >= 40)
			grade = 'C';
		else
			grade = 'F';
		return grade;
	}
}
