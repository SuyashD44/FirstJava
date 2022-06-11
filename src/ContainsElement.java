import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.globalpayex.college.entities.Student;

public class ContainsElement
{
	public static void printStudentDetails(List<Student> studentList, int roll)
	{
		boolean isNotPresent = true;
		for (Student std: studentList)
		{
			if (std.getRollNo() == roll)
			{
				System.out.println(std.getDetails());
				isNotPresent = false;
				break;
			}
		}
		
		if (isNotPresent)
		{
			System.out.println("Student not found");
			
		}
	}
	
	
	public static void main(String[] args)
	{
		List<Student> studentList =  Arrays.asList(new Student("ABN",'M',35,77.63f),
												 new Student("PQR",'F',25,71.43f),
												new Student("XYZ",'M',15,67.56f));
		boolean isFound = studentList.contains(new Student("NA",'M',85,0.0f));
		System.out.println(isFound ? "Student found" : "Student Not found");

		
	}


}
