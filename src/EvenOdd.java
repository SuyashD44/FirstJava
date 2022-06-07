
public class EvenOdd {
	
	static boolean isEven(int num)
	{
		return (num % 2 == 0);
	}
	
	public static void main(String[] args) 
	{
		int num = 25;
		System.out.println(isEven(num) ? "Even Number":"Odd Number");
/*		
 		if (isEven(num))
		{
			System.out.println("Even number");
		}
		
		else
			System.out.println("Odd Number ");
	}
*/

	}

};