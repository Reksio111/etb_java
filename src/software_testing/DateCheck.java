package software_testing;

import java.io.IOException;
import java.text.SimpleDateFormat;

import java.util.Scanner;
import java.util.Calendar;

public class DateCheck {
	static Scanner keyIn = new Scanner(System.in);
	static int dayIn, monthIn, yearIn;
	static Calendar yourDOB = Calendar.getInstance();

	public static void main(String[] args) throws Exception {
		DateCheck tester = new DateCheck();
		try {

			String date = "";
			do {
				System.out.print("Enter yout DOB (dd/mm/yyyy): ");
				date = keyIn.nextLine();
			} while (!tester.formatValidator(date));

			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Calendar yourDOB = Calendar.getInstance();
			yourDOB.setTime(sdf.parse(date));
			System.out.print(" Your age is " + tester.calculateAge(yourDOB));
			System.out.print(" Your available discount " + tester.calculateDiscount(yourDOB));

		} catch (StringIndexOutOfBoundsException ex) {
			System.out.print("Input/Output exception. Invalid date format");
			keyIn.next();
		} catch (IOException error) {
			System.out.print("Input/Output exception. Invalid date format");
			keyIn.next();
		} catch (NumberFormatException error) {
			System.out.print("Input/Output exception. Invalid date format");
			keyIn.next();
		}
	}

	public boolean formatValidator(String str) throws IOException {
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

	public int calculateAge(Calendar dob) {
		Calendar today = Calendar.getInstance();

		int curYear = today.get(Calendar.YEAR);
		int dobYear = dob.get(Calendar.YEAR);

		int age = curYear - dobYear;

		// if dob is month or day is behind today's month or day
		// reduce age by 1
		int curMonth = today.get(Calendar.MONTH);
		int dobMonth = dob.get(Calendar.MONTH);
		if (dobMonth > curMonth) { // this year can't be counted!
			age--;
		} else if (dobMonth == curMonth) { // same month? check for day
			int curDay = today.get(Calendar.DAY_OF_MONTH);
			int dobDay = dob.get(Calendar.DAY_OF_MONTH);
			if (dobDay > curDay) { // this year can't be counted!
				age--;
			}
		}

		return age;
	}

	public int calculateDiscount(Calendar dob) {
		int discount = 0;
		int age = calculateAge(dob);
		if (age >= 25 && age <= 80)
			discount = 20;
		return discount;

	}
}
