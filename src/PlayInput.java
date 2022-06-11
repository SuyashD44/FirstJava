import java.util.InputMismatchException;
import java.util.Scanner;

public class PlayInput 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number n: ");
		
		
		while (true)
		{
			
			try
			{	int n = sc.nextInt();
				System.out.println(n%2 == 0 ? "It is even" : "It is odd");
				break;
			}
			
			catch(InputMismatchException e)
			{
				System.out.println("Invalid input Enter");
				sc.nextLine(); //ensure the scanner gets to the next input line.
			}

		}
		sc.close();
	}

}
