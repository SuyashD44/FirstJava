import java.util.*;
public class EvenToN 
{

	static Vector<Integer> Even2N(Vector<Integer>arrN , int n)
	{
		if (n >= 2)
		{
			/*int i = 2;
			while (i <= n)
			{
				arrN.add(i);
				i+=2;
			}
			*/
			
			for (int i = 2; i <= n; i = i+2)
			{
				arrN.add(i);
			}
			
		}
	
		return arrN;
	}
	
	public static void main(String[] args) 
	{
		Vector<Integer> arrN = new Vector<Integer>();
		System.out.println(Even2N(arrN, 5));
		
	}
	

}
