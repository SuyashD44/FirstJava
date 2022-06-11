import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.Random;


public class PlayArrayList 
{
	public static void main(String[] args) 
	{
		/*ArrayList<String> cars = new ArrayList<>();
		cars.add("i20");
		cars.add("i10");
		
		System.out.println(cars);
		cars.add("porsche");
		System.out.println(cars);
		*/
		
		//TODO : anonymous inner class
		ArrayList<Integer> rnos = new ArrayList<>();
		rnos.add(54);
		rnos.add(44);
		rnos.add(4);
		rnos.add(254);
		rnos.add(2);
		
		
		//can only be use with a Functional Interface like the Comparator interface
		rnos.sort((o1,o2)->o2.compareTo(o1)); 
		System.out.println(rnos);
		
		
		
	}

}
