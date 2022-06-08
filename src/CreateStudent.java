import com.globalpayex.college.entities.Student;

public class CreateStudent 
{
	
	public static void main(String[] args)
	{
		Student [] StudentList = new Student[2]; 
		StudentList[0] = new Student("Suyash",'M',35,77.6f);
		StudentList[1] = new Student("Dhondkar",'F',25,25.6f);
		
	}
}
