
public class CreateStudent 
{
	
	public static void main(String[] args)
	{
		Student [] StudentList = new Student[2]; 
		StudentList[0] = Student.newStudent("Suyash",'M',35,77.6f);
		StudentList[1] = Student.newStudent("Dhondkar",'F',25,25.6f);
		for(Student student : StudentList)
		{
			System.out.println(student.name);
		}

	}
}
