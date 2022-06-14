import java.awt.List;
import java.util.Random;
import java.util.Vector;

public class MathSeries {
	Random rand;
	public Vector<Integer> createFibonacci(Integer n)
	{
		Integer nToUse = n;
		if (nToUse == null)
		{
			nToUse = (this.rand).nextInt(11);
		}
		Vector<Integer> fib = new Vector<>();
		int fib1 = 0;
		int fib2 = 1;
		fib.add(fib1);
		fib.add(fib2);
		int num = 0;
		for (int i = 0; i<nToUse-2 ;i++)
		{
			num = fib1+fib2;
			fib.add(num);
			fib1 = fib2;
			fib2 = num;
			
		}
		
		return fib;
		
	}
	
	
}
