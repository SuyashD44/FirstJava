
public class CreateStudent 
{
	
	public static void main(String[] args)
	{
		//Student [] StudentList = new Student[2]; 
		Student s1 = Student.newStudent("Suyash",'M',35,77.6f);
		Student s2 = Student.newStudent("Dhondkar",'F',25,25.6f);
		for(int i = 0; i < 2;i++)
		{
			//System.out.println(StudentList[i].name+ " "+ StudentList[i].gender);
		}
		//Student s2 = new Student();
		//Student s3 = new Student();
		System.out.println(s1);
		//System.out.println(s2);
		/*
		s1.name = "Suyash";
		s1.rollno = 35;
		s1.gender = 'M';
		s1.marks = 77.36f;*/
		System.out.println(Student.count);
		System.out.println(s1.getDetails());
		System.out.println(s1.getGrade());
	}
}
