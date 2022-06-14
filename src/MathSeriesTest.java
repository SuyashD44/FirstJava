import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MathSeriesTest 
{
	@InjectMocks
	MathSeries mathSeries;
	@Mock
	Random random;
	@Test
	void test()
	{	
		//MathSeries mseries = new MathSeries();
		Object[] actual = mathSeries.createFibonacci(8).toArray();
		Integer [] expected=  {0, 1, 1, 2, 3, 5, 8, 13}; 
		//Vector<Integer> expect = new Vector<>(Arrays.asList(arr));
		//System.out.println(arr[7]);
		assertArrayEquals(actual, expected);
		//assert(actual,expect);	
	}
	@Test
	void testRandom()
	{
		//MathSeries mseries = new MathSeries();
		Object[] actual = mathSeries.createFibonacci(8).toArray();
		Integer [] expected=  {0, 1, 1, 2, 3, 5, 8, 13}; 
		//Vector<Integer> expect = new Vector<>(Arrays.asList(arr));
		//System.out.println(arr[7]);
		assertArrayEquals(actual, expected);
		
	}

}
