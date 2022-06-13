import static org.junit.jupiter.api.Assertions.*;

import java.awt.List;
import java.util.Arrays;
import java.util.Vector;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class MathSeriesTest {

	@Test
	void test() {
		
		Object[] actual = MathSeries.createFibonacci(8).toArray();
		Integer [] expected=  {0, 1, 1, 2, 3, 5, 8, 13}; 
		//Vector<Integer> expect = new Vector<>(Arrays.asList(arr));
		//System.out.println(arr[7]);
		assertArrayEquals(actual, expected);
		//assert(actual,expect);
		
	}

}
