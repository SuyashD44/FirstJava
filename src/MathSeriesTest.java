import static org.junit.jupiter.api.Assertions.*;

import java.awt.List;
import java.util.Arrays;
import java.util.Vector;

import org.junit.jupiter.api.Test;

class MathSeriesTest {

	@Test
	void test() {
		
		Vector<Integer> actual = MathSeries.createFibonacci(8);
		Integer [] arr=  {0, 1, 1, 2, 3, 5, 8, 13}; 
		Vector<Integer> expect = new Vector<>(Arrays.asList(arr));
		
		//assert(actual,expect);
		fail("Not yet implemented");
	}

}
