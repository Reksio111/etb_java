package week_5_halloween;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ArraysManipulationTest {
	static ArraysManipulation tester;
	static int [] arr=new int[14];
	static int[] actual=new int[3];

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		tester = new ArraysManipulation();
		int [] arr = { 1, 2, 7, 5, 9, 23, 67, 98, 34, 1, 45, 100, 456, 1400 };
		int [] actual= { 1, 2, 3 };
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.print("Cleanig cache....");
		arr=null;
		actual=null;

	}

	@Test
	void testReverseOrder() {
		int[] expected = tester.reverseOrder(actual);	
		assertArrayEquals(expected, actual, "Should return the array in reverese order");
	}

	@Test
	void testEvenNumberFirst() {
		int[] expected = tester.evenNumberFirst(arr);
		assertArrayEquals(expected, arr, "Should return even number first");
	}

	@Test
	void testFirstLastElement() {
		int[] actual = { 1, 2, 3 };
		int[] expected = { 1, 3 };
		assertArrayEquals(expected, tester.firstLastElement(actual), "Should return first and last element");
	}

	@Test
	void testIfContainTrue() {
		int[] actual = { 1, 2, 3 };
		boolean expected = true;
		assertEquals(expected, tester.ifContainTrue(actual), " should return true if na array contains given number");
	}
	
	@Test
	void testIfContainFalse() {
		int[] actual = { 1, 2, 3 };
		boolean expected = false;
		assertEquals(expected, tester.ifContainFalse(actual), " should return false if na array contains given number");
	}

	@Test
	void testNumberEvenOddNumbers() {
		int [] expected= {6,8};
		int [] arr = { 1, 2, 7, 5, 9, 23, 67, 98, 34, 1, 45, 100, 456, 1400 };
		assertArrayEquals(expected, tester.numberEvenOddNumbers(arr) , "Should return number of even and odd numbers in an array");
		
	}
}