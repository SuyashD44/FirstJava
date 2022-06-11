
public class NextGenArray<T>
{
	
	T[] elements;

	public NextGenArray(T[] elements)
	{
		super();
		this.elements = elements;
	}
	
	public T getElement(int idx)
	{
		return this.elements[idx-1];
	}
	
	public T[] setElements(int idx,T ele)
	{
		elements[idx - 1] = ele;
		return this.elements;
	}
	
	
	public String toString()
	{
		String res = "";
		for (int i = 0; i<this.elements.length;i++)
		{
			if (i == elements.length-1)
			{
				res+= elements[i]+"."; 
				break;
			}
			res += elements[i]+ ", ";
		}
		return res;
	}
	
	
	public static void main(String[] args) 
	{
		String [] cars = {"A","B","C","D"};
		NextGenArray<String> n1 = new NextGenArray<String>(cars);
		
		System.out.println(n1.toString());
		//cars.toString();
		
	}
}
