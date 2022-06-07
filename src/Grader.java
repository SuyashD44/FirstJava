
public class Grader {
	
	static char computeGrade(int marks)
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
	
	public static void main(String[] args)
	{
		int marks = 40;
		System.out.println(computeGrade(marks));
		
	}

}
