
public class VariableArguments {
	
	static int VarSum(int ... n)
	{
		int sum = 0;
		
		for (int i =0 ; i<n.length;i++)
			sum+=n[i];
		return sum;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(VarSum());
		System.out.println(VarSum(34,56,88));
		System.out.println(VarSum(23,4));	
	}

}

