import java.awt.List;
import java.util.Vector;

public class MathSeries {

	public MathSeries() {
		// TODO Auto-generated constructor stub
	}

	public static Vector<Integer> createFibonacci(int n)
	{
		Vector<Integer> fib = new Vector<>();
		int fib1 = 0;
		int fib2 = 1;
		fib.add(fib1);
		fib.add(fib2);
		int num = 0;
		for (int i = 0; i<n-2 ;i++)
		{
			num = fib1+fib2;
			fib.add(num);
			fib1 = fib2;
			fib2 = num;
			
		}
		
		return fib;
		
	}
	
	
}
