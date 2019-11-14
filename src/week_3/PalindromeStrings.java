package week_3;

import java.util.Arrays;
/*
 * Palindrome
A palindrome is a word, phrase or sequence that reads the same backwards as forwards.
Write a method isPalindrome thats accepts a String as a parameter and returns true if the String is a palindrome, false otherwise.
Stage 1 (simple)
Test your code with the following palindromes:
Navan
Madam
Noon
Civic
Radar
Level
Rats live on no evil star

Stage 2 (tricky)
Test your code (and adapt it if necessary) with all of the following palindromes:
Never odd or even
Mr. Owl ate my metal worm
A man, a plan, a canal – Panama
Madam, I'm Adam
Hint 1: Remember to break your code up into manageable methods which you can test independently
Hint 2: Try coding the solution both with and without the use of regular expressions.

 * */

public class PalindromeStrings {
	
	public static void main(String[] args) {
		PalindromeStrings test = new PalindromeStrings();
		String str = "A man, a plan, a canal – Panama";
		String str2 = "Madam, I'm Adam";
		String str3 = "Mr. Owl ate my metal worm";
		String str4 = "kayak";

		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

		System.out.println(test.isPalindrome(str));
		System.out.println(test.isPalindrome(str4));
		System.out.println(test.isPalindrome(str2));
		System.out.println(test.isPalindrome(str3));

	}

	boolean isPalindrome(String strIn) {
		String clearString = strIn.replaceAll("([^a-zA-Z]|\\s)+", "").trim();
		String reverseStr = "";
		for (int i = clearString.length() - 1; i >= 0; i--) {
			reverseStr = reverseStr + clearString.charAt(i);
		}

		if (reverseStr.equalsIgnoreCase(clearString))
			return true;
		else
			return false;
	}

}
