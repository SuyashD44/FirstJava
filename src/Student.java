import java.util.Vector;

public class Student 
{
	String name;
	char gender;
	int rollno;
	float marks;
	static int count;
	//static Vector<Student> StudentList; 
	//static Student[] StudentList;
	
	Student(String name, char gender,int roll, float marks)
	{
		this.name = name;
		this.gender = gender;
		this.rollno = roll;
		this.marks = marks;
		Student.count++;
		//Student.StudentList.add(this); 
	}
	
	Student()
	{
		this("NA",'M',-1,0.0f);
	}
	String getDetails()
	{
		
		return "Name: "+this.name+"\nGender: "+this.gender+"\nRollNo: "+this.rollno+
				"\nMarks: "+this.marks;
	}
	
	static Student newStudent(String name,char gender, int roll, float marks)
	{
		return new Student(name,gender,roll,marks);
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
