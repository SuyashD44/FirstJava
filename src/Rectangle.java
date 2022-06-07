
public class Rectangle 
{
	static int computePerimeter(int length, int breadth )
	{
		return 2*(length + breadth);
	}
	
	public static void main (String[] args)
	{
		int l = 8;
		int b = 4;
		System.out.println(computePerimeter(l,b));
	}
}
