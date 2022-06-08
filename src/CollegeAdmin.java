import com.globalpayex.college.entities.Student;
import com.globalpayex.college.entities.Professor;

public class CollegeAdmin 
{
	
	public static void main(String[] args) 
	{
		Student s1 = new Student("Suyash",'M',35,77.36f);
		String [] subjects = {"Maths","Science"};
		Professor p1 = new Professor("Dhondkar", 'F',subjects);
		System.out.println(s1);
		System.out.println(p1);
	}

}
