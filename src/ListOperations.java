import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListOperations {

	public ListOperations() {
		// TODO Auto-generated constructor stub
	}
	
	public static String convertToString(int t)
	{
		
		return " ";
	}
	
	public static void main(String[] args) 
	{
		List<Integer> nos = Arrays.asList(4,8,7,21,689,57542,99855,745,3);

		List<Integer> res = new ArrayList<Integer>();
		
		for(int n : nos)
		{
			if (n > 3 && n%2 != 0)
			{
				res.add(n);
			}
		}
		
		System.out.println(res);
		Stream<Integer> s=  nos.stream();
		System.out.println("using stream");
		//Operations on stream of data
		System.out.println(s.filter(ele -> ele > 3 && ele % 2 != 0)
							.sorted((o1,o2)->o2.compareTo(o1))
							.map(ele-> ele*ele)
							.collect(Collectors.toList()));
	}

}
