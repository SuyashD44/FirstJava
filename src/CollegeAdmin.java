//import com.globalpayex.college.entities.Student;
import com.abc.geometry.SalaryData;
import com.globalpayex.college.entities.Professor;
import com.globalpayex.college.entities.Student;
import com.globalpayex.college.entities.Address;
public class CollegeAdmin 
{
	
	public static void main(String[] args) 
	{
		Address addr = new Address("MH", "India", "400001");
		Student s1 = new Student("Suyash",'M',addr,35,77.36f);
		//s1.getAddressRef().setAddress("MH", "India", "400001");
		String [] subjects = {"Maths","Science"};
		Professor p1 = new Professor("Dhondkar", 'F',subjects,1500.0f,22.0f);
		//System.out.println(p1.getSalary());
		System.out.println(s1.getDetails());		
		//SalaryData.main(p1);
		//System.out.println(s1);
		//System.out.println(p1);
		
	}

}
