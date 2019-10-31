package week_3;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 
 * @author Jacek Kania
 * @version 1.0
 * @date 16/10/2019
 *
 */

public class StringPractice {

	static String str = "yeet or be yeeted";
	static String reverse = "";
	static char upperLetter = 0;
	static String james = "james,barrett,james.barrett@nln.ie,0-,";
	static String variable = "james,barrett,james.barrett@nln.ie,0-,";
	static String staffInformation[] = new String[5];
	static String lett[] = {"Name:", "Surname:", "email:", "blood group:" };
	static String[] split;

	static int start = 0;
	static int start1 = 0;
	static int nextSplit = 0;
	static int nextInt = 0;

	public static void main(String[] args) {

		/**
		 * Task 1: display only every second character in str string Create loop with
		 * length of str. Use modulo. If counter (i) divided by 2 return 0 then display
		 * the character form str string
		 */
		System.out.print("Display every second letter from the string: ");

		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {
				System.out.print(str.charAt(i));
			}
		}
		/**
		 * Display str string in backward. Create loop that count down from str string
		 * length -1 to 0. assign to new created array -reverse each char form original
		 * array in backward way. So the last element form the original array became the
		 * first one in the new array. Return and print new array
		 */
		System.out.print("\n\nDisplay the string backwards: ");
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.print(reverse);

		/**
		 * Display every second character of the original string array in upper case.
		 * Create loop with length of the array. Create new char value (upperLetter) and
		 * in each loop turn assign in the do position in the array. If position of the
		 * character in the array is even (parzysty), set it to upper case. else set it
		 * to lower case.
		 */

		System.out.print("\n\nDisplay every second letter in uppercase: ");

		for (int i = 0; i < str.length(); i++) {
			upperLetter = str.charAt(i);
			if (i % 2 == 0)
				System.out.print(Character.toUpperCase(upperLetter));
			else
				System.out.print(Character.toLowerCase(upperLetter));
		}

		/**
		 * Display each word in string str that is separated by comma in new line.
		 * Create loop with length of james string. if compiler find comma in the
		 * string, display next word in the new line
		 */

		System.out.print("\n\nDisplay String to new line wheather the is e coma: ");
		 splitArray();
		System.out.print(Arrays.toString(split));

		/**
		 *call variableArray() that display two arrays: lett- contains personal attributes such name, surname etc.
		 *and split array containing  james string split by comma.
		 * 
		 */

		System.out.print("\n\nAssign variable to the each of the substrings that end with comma:\n ");
		variableArray();

	}

	/**
	 * method split string value called "james" and split in on collection of words i places where in the string comma 
	 * next return new array called split

	 */
	public static String[] splitArray() {
		split = new String[4];
		int count = 0;
		int count1 = 0;
		for (int i = 0; i < variable.length(); i++) {
			if (variable.charAt(i) == ',') {
				split[count1] = (String) variable.subSequence(count, i);
				count = i + 1;
				count1++;
			}
		}

		return split;

	}
	/**
	 * display two arrays: lett and split combined together.
	 */

	public static void variableArray() {

		for (int i = 0; i < split.length; i++) {
			System.out.println(lett[i] + "" + split[i]);

		}

	}
}