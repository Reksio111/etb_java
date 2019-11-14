package week_3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeStringsTest {

	@Test
	void testIsPalindrome() {
		PalindromeStrings test=new PalindromeStrings();
		String str="kayak";
		boolean ans= test.isPalindrome(str);
		assertEquals(true, ans, "Return true if given string is palindrome");	
	}


}
