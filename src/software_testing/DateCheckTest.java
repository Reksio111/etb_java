package software_testing;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.Calendar;

import org.junit.jupiter.api.Test;

class DateCheckTest {

	static 	DateCheck tester= new DateCheck();
	static String date ="11/12/1977";
	static Calendar yourDOB = Calendar.getInstance();
	@Test
	void testFormatValidator() throws IOException{
	
		boolean expected=true;
		boolean actual=tester.formatValidator(date);
		assertEquals(expected, actual, "Correct date format is dd/MM/yyyy");
	}

	@Test
	void testCalculateAge() {
		int expected=0;
		int actual=tester.calculateAge(yourDOB);
		assertEquals(expected, actual, "The method dispalys user age");
	}

	@Test
	void testCalculateDiscount() {
		int expected =0;
		int actual=tester.calculateDiscount(yourDOB);
		assertEquals(expected, actual, "The method dispalys discount based on DOB");
		
	}

}
