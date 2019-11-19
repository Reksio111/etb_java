package software_testing;

public class CalendarTester {

	public static void main(String[] args) {
		
		//This is a comment
		if(testMaxMonthDaysJan()) {
			print("testMaxMonthDaysJan - pass");
		}
		else {
			print("testMaxMonthDaysJan - fail");
		}
		if(testMaxMonthDaysFebLeap()) {
			print("testMaxMonthDaysFebLeap - pass");
		}
		else {
			print("testMaxMonthDaysFebLeap - fail");
		}

	}

	private static boolean testMaxMonthDaysFebLeap() {
		return CalendarMain.getMaxMonthDays(29) == 29;
	}

	private static boolean testMaxMonthDaysJan() {
		return CalendarMain.getMaxMonthDays(31) == 31;
	}

	private static void print(String myString) {
		System.out.println(myString);
		
	}

}