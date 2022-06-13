package com.globalpayex.college.entities;

final public class Student extends CollegeUser
{
	
	int rollno;
	float marks;
	public Student(String name, char gender, Address addr, int roll, float marks)
	{
		super(name,gender,addr);
		this.rollno = roll;
		this.marks = marks;
	}
	
	public int getRollNo()
	{
		return this.rollno;
	}
	
	public char getGender()
	{
		return this.gender;
	}
	public String getName()
	{
		return this.name;
	}
	
	public float getMarks()
	{
		return this.marks;
	}
	/*public Student()
	{
		this("NA",'M',,-1,0.0f);
	}
	*/
	
	/*static Student newStudent(String name,char gender, int roll, float marks)
	{
		return new Student(name,gender,roll,marks);
	}
	*/
	@Override
	public String getDetails() 
	{
		// TODO Auto-generated method stub
		return String.format(super.getDetails()+"\nRollNo: %s \nMarks %s \nAddress: %s", 
				rollno,marks,this.getAddressRef().getAddress());
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollno;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (rollno != other.rollno)
			return false;
		return true;
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
