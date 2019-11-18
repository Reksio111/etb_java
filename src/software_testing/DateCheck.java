package software_testing;

import java.io.IOException;
import java.util.Scanner;

public class DateCheck {
	static Scanner keyIn = new Scanner(System.in);
	static int dayIn, monthIn, yearIn;
	

	public static void main(String[] args) throws IOException {

		try {
			 String date = "10/12/2010";
			if (formatValidator(date))
				System.out.println("Correct date format");
			else
				System.out.print("Incorrect date format");
		} catch (StringIndexOutOfBoundsException ex) {
			System.out.print("Input/Output exception. Invalid date format");
		}
		catch (IOException error) {
			System.out.print("Input/Output exception. Invalid date format");
		}
	}

	public static boolean formatValidator(String str) throws IOException {
		boolean validator = false;
		boolean length = false;
		boolean day = false;
		boolean month = false;
		boolean year = false;
		boolean backslash = false;
		int dayIn = Integer.parseInt(str.substring(0, 2));
		int monthIn = Integer.parseInt(str.substring(3, 5));
		int yearIn = Integer.parseInt(str.substring(6, 10));

		if (str.length() == 10)
			length = true;
		if (dayIn >= 1 && dayIn <= 31)
			day = true;
		if (monthIn >= 1 && monthIn <= 12)
			month = true;
		if (yearIn >= 1900 && yearIn <= 2019)
			year = true;
		if (str.charAt(2) == '/' && str.charAt(5) == '/')
			backslash = true;
		if (length && day && month && year && backslash)
			validator = true;

		return validator;

	}


}
