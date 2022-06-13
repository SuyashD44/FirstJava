import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import com.globalpayex.college.entities.Address;
import com.globalpayex.college.entities.Student;

public class StudentHashMap {
	
	public static void main(String[] args)
	{
		List< Student>  hmap = new ArrayList<>();
		Address addr1 = new Address();
		Address addr2 = new Address();
		Address addr3 = new Address();
		Address addr4 = new Address();
		addr1.setAddress("India","MH", "400001");
		hmap.add(new Student("ABN",'M',addr1,35,77.63f));
		addr2.setAddress("USA","NYU", "111111");
		hmap.add(new Student("PQR",'F',addr2,75,70.63f));
		addr3.setAddress("USA","LA", "4444444");
		hmap.add(new Student("XYZ",'M',addr3,85,87.63f));
		//addr4.setAddress(); FIX THE NULL PTR EXCEPTION
		hmap.add(new Student("ASD",'F',addr4,15,88.63f));
		
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
	/*for (Student std: hmap)
	{
		//System.out.println(std.getDetails());
		if (std.getAddressRef().getCountry().equals("USA"))
		{
			System.out.println(std.getName());
			
		}
	}*/
	
	
	/*Map<String, List<Student>> marksMap = st.
			collect(Collectors.partitioningBy(student -> student.getAddressRef().getCountry()));*/
	
	System.out.println(st.filter(student-> ((student.getAddressRef()).getCountry()).equals("USA"))
					     .map(student->student.getName()) //maps the stream of Student obejcts to a string obj
			             .collect(Collectors.joining(", ")));
	
	/*double avg = st.collect(Collectors.averagingDouble(student->student.getMarks()));*/
	
	/*DoubleSummaryStatistics ds = st.collect(Collectors.summarizingDouble(std->std.getMarks()));
	System.out.println(ds);
	System.out.println(ds.getAverage());
	System.out.println(ds.getMax());
	System.out.println(ds.getMin());
	System.out.println(ds.getSum());
	System.out.println();
	}*/
	//Map<Character, List<Student>> genderMap = 
			//st.collect(Collectors.groupingBy(student -> student.getGender()));
	}
	

	
	
	public StudentHashMap() {
		// TODO Auto-generated constructor stub
	}

}
