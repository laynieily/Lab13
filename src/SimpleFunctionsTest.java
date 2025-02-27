import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleFunctionsTest {

	@Test
	public void testing_greet() {
		SimpleFunctions.greet();
		assertEquals(true, true);
	}
	
	@Test
	public void testing_sum() {
		assertEquals(true, SimpleFunctions.sum(2.5, 3.2) == 5.7);
		assertEquals(true, SimpleFunctions.sum(10.2, 10.3) == 20.5);
		assertEquals(true, SimpleFunctions.sum(5.0, 30.2) == 35.2);
	}

	@Test
	public void testing_even() {
		assertEquals(true, SimpleFunctions.even(4));
		assertEquals(false, SimpleFunctions.even(13));
		assertEquals(true, SimpleFunctions.even(22));
	}

	@Test
	public void testing_max() {
		int[] arr1 = {2, 5, 7, 8, 10};
		int[] arr2 = {77, 52, 112, 45, 63};
		int[] arr3 = {115, 147, 203, 159, 302, 245, 401}; 
		assertEquals(10, SimpleFunctions.max(arr1));
		assertEquals(112, SimpleFunctions.max(arr2));
		assertEquals(401, SimpleFunctions.max(arr3));
	}
}