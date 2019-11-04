package week_5_halloween;

import java.util.Arrays;

/*/*Note: Think about design for all these problems before coding.  Pen and paper, flowcharts, pseudo code etc

1.	Given an array of ints length 3, create and print a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
2.	Given an array of ints, create and display a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.  e.g. { 1, 5, 9, 2}  { 1, 2 }
3.	Given an int array length 2, display true if it contains a 2 or a 3.  False otherwise.
4.	Given an int array length 2, display true if it does not contain a 2 or 3.  False otherwise.
5.	Given an array of ints, print the number of even and the number of odd numbers in the array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
6.	Given an array of ints, create and display a new array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order.
Note: For JUnit folks, implement unit tests for all of the above.
Extra credit question:

*/

public class ArraysManipulation {

	public static void main(String[] args) {

		int[] originalArray = { 1, 2, 3 };
		int[] containDigits = { 1, 3 };
		boolean check = false;
		int[] evenOdd = { 1, 2, 7, 5, 9, 23, 67, 98, 34, 1, 45, 100, 456, 1400 };
		int[] evenFirst = new int[evenOdd.length];
		int even = 0, odd = 0;
		int[] result;

		// display original array
		System.out.print("Original array: ");
		for (int i = 0; i < originalArray.length; i++) {
			System.out.print(originalArray[i] + " ");
		}

		// part 1. display original array in reverse order
		result = reverseOrder(originalArray);
		System.out.print("\n\nAd.1. Reverse order: " + Arrays.toString(result));

		// part 2. Display the first one and the last one element of the original array
		result = firstLastElement(originalArray);
		System.out.print("\nAd.2. First and last element: " + Arrays.toString(result));

		// part 3. Check if given array contains 2 or 3. If return true, otherwise return false
		System.out.print("\nAd.3. Check array for a digit. if-true, else-false:  ");
		if (ifContainTrue(containDigits))
			System.out.print("The array contains at least from two given numbers. ");
		else
			System.out.print("The array does not contain any of given numbers.");

		//part 4. Check if given array contains 2 or 3. If return true, otherwise return false
		System.out.print("\nAd.4. Check array for a digit. if-false, else-true:  ");
		if (ifContainFalse(containDigits))
			System.out.print("The array contains at least from two given numbers.");
		else
			System.out.print("The array does not contain any of given numbers.");

		result=numberEvenOddNumbers(evenOdd);
		System.out.print("\nAd.5. Number of even and odd numbers in an array respectively: " + Arrays.toString(result));
		

		result = evenNumberFirst(evenOdd);
		System.out.print("\nAd.6. Print even numbers first: " + Arrays.toString(result));

	}

	static int[] evenNumberFirst(int[] array) {
		int j = -1, temp;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				j++;

				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		return array;
	}

	static int[] reverseOrder(int[] array) {
		int[] arr = new int[array.length];
		int position = 0;
		for (int i = array.length - 1; i >= 0; i--) {
			arr[position] = array[i];
			position++;
		}
		return arr;

	}

	static int[] firstLastElement(int[] array) {
		int[] arr = new int[2];
		for (int i = 0; i < array.length; i++) {
			if (i == 0)
				arr[i] = array[i];
			if (i == array.length - 1)
				arr[1] = array[i];
		}
		return arr;
	}

	static boolean ifContainTrue(int[] array) {
		boolean check = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 2 || array[i] == 3)
				check = true;
		}
		return check;

	}

	static boolean ifContainFalse(int[] array) {
		boolean check = true;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 2 || array[i] == 3)
				check = false;
		}
		return check;

	}

	static int[] numberEvenOddNumbers(int[] array) {
		int[] arr = new int[2];
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0)
				arr[0]++;
			else
				arr[1]++;
		}
		return arr;

	}
}
