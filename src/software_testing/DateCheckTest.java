package software_testing;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.Calendar;

import org.junit.jupiter.api.Test;

class DateCheckTest {

	static DateCheck tester = new DateCheck();
	static String date = "10/12/1977";
	static Calendar yourDOB = Calendar.getInstance();

	@Test
	void testFormatValidator() throws IOException {

		boolean actual = tester.formatValidator(date);
		assertTrue(actual, "Correct date format is dd/MM/yyyy. Day: 1-31, Month 1-12, Year: 1900- current");
	}

	@Test
	void testCalculateAge() {
		int expected = 0;
		int actual = tester.calculateAge("12/12/2000");
		assertEquals(expected, actual, "The method dispalys user age");
	}

	@Test
	void testCalculateDiscount() {
		int expected = 0;
		int actual = tester.calculateDiscount("12/12/200");
		assertEquals(expected, actual, "The method dispalys discount based on DOB");

	}

}
