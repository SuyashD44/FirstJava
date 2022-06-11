import java.util.Random;

public class RandomArray 
{
	
	//to restrict the generic declaration to types say Numbers
	//static <T extends Numbers> T randomElement (T[] elements)
	
	
	static <T> T randomElement (T[] elements)
	{
		Random random = new Random();
		int n = random.nextInt(elements.length);
		return elements[n];
	}
	
	
	public static void main(String[] args) 
	{
		String[] cars = {"A","B","C"};
		System.out.println(randomElement(cars));
		
		Integer[] nos = {548,54,5,4489,56};
		System.out.println(randomElement(nos));
		
	}

}
