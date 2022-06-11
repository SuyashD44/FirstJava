
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class AdvancedArrayList 
{
	
	
	
/*	public static void Print(Integer i)
	{
		System.out.println(i);
	}*/
	public static void main(String[] args) 
	{
		List<Integer> nos = Arrays.asList(4,8,7,21,689,57542,99855,745);
		
		//labmda expr passed into the forEach methods
		//nos.forEach(n->{if (n%2 == 0)System.out.println(n);});
		
		//method references for static methods 
		//class :: ref_method
		//for non static methods 
		//obj:: ref_method
		
		//nos.forEach(System.out::println);
		
		
		//linked list
		//TreeSet<Integer> l = new TreeSet<>(Arrays.asList(4,4,8,7,21,689,9,4,57542,99855,745));
		HashSet<String> hs = new HashSet<>();
		hs.add("F1");
		hs.add("F2");
		
		hs.forEach(ele->{System.out.println(ele);});
		
		
	}


}
