/**
 * 
 */
package week_4;

import java.util.Scanner;

/**
 * @author jacek kania
 * @date 21.10.2019
 *
 */
public class WeekDays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		String[] weekDays = new String[7];
		int i = 0;

		do {
			System.out.print("Enter " + (i + 1) + "th day of week: ");
			weekDays[i] = scr.nextLine();
			i++;
		} while (i < 7);

		System.out.print("Weekdays: ");
		for (int j = 0; j < 5; j++) {
			System.out.print(weekDays[j] + ", ");
			if(j==4)
				System.out.print(weekDays[j]);
		}
		System.out.print("\nWeekend: " + weekDays[5] + ", " + weekDays[6]);

	}

}
