
public class StudentDetails {
	
	
	static String getDetails(String name, char gender, int roll, float marks) 
	{
		return String.format("Name: %s \nGender: %s \nRollNo: %s \nMarks %s", 
				name,gender,roll,marks);
	}
	
	
	static char getResult(float marks)
	{
		char grade = ' ';
		if (marks > 100.0 || marks < 0)
			return 'I';
		if (marks >= 70.0)
			grade = 'A';
		else if (marks >= 60.0)
			grade = 'B';
		else if (marks >= 40.0)
			grade = 'C';
		else
			grade = 'F';
		return grade;
	}


	
	public static void main(String[] args) {
		
		
		System.out.println(getDetails("Suyash", 'M', 35, 77.6f));
		System.out.println(getResult(77.6f));
		
	}
}
