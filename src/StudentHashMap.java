import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.globalpayex.college.entities.Student;

public class StudentHashMap {
	
	public static void main(String[] args)
	{
		List< Student>  hmap = new ArrayList<>();
		hmap.add(new Student("ABN",'M',35,77.63f));
		hmap.add(new Student("PQR",'F',75,70.63f));
		hmap.add(new Student("XYZ",'M',85,87.63f));
		hmap.add(new Student("ASD",'F',15,88.63f));
		
	//System.out.println(hmap.get(35) != null ? hmap.get(35).getDetails() 
						   //: "Student Not found"  );
	//System.out.println(hmap.get(35));
	//HashSet<Integer> keys = new HashSet<>(hmap.keySet());
/*	for (int key :keys )
	{
		System.out.println(String.format("The name is %s and the roll no is %s",
				           hmap.get(key).getName(),key));
	}
	}
	*/
	Stream<Student> st = hmap.stream();
	System.out.println(st.filter(student-> student.getMarks( )> 80.0f)
					     .map(student->student.getName()) //maps the stream of Student obejcts to a string obj
			             .collect(Collectors.joining(", ")));
	}
	
	
	public StudentHashMap() {
		// TODO Auto-generated constructor stub
	}

}
