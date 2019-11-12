package week_6;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.InputMismatchException;

/*
 * MetricConversion 
The following formulas can be used to convert US/Imperial units of measurements to metric units:
inches	1 inch = 2.54 centimeters
feet	1 foot = 30.48 centimeters
yards	1 yard = 0.9144 meters
miles	1 mile = 1.60934 kilometers
Create a metric conversion application that prompts the user for an amount, 
then displays a menu of conversion choices. Then it prompts the user to choose a conversion. 
Lastly, it displays the converted value:
 

IMPORTANT - The application should include 4 separate methods for doing each of the conversions 
- each method should require a value to be sent in, and should return the appropriate converted number. 
In addition, a separate void method should be used to display the menu.

 * 
 * */

public class Metric_convrsion {

	static int number;
	static int choice;
	static Scanner scr = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("#.####");

	public static void main(String[] args) {

		menu();

	}

	public static void menu() {
		while (choice != 5) {
			try {
				System.out.print("Type number:");
				number = scr.nextInt();

				System.out.print("Convert\n");
				System.out.println("1.Inches to centimeters");
				System.out.println("2.Feet to centimeters");
				System.out.println("3.Yards to meters");
				System.out.println("4.Miles to kilometers");
				System.out.println("5.Quit");
				System.out.print("Enter your choice:");
				choice = scr.nextInt();

			} catch (InputMismatchException ex) {

				System.out.print("Wrong input");
			}

			switch (choice) {
			case 1:
				if (number == 1)
					System.out.print(number + " inch equals " + df.format(toInch(number)) + " centimeters\n\n");
				else
					System.out.print(number + " inches equals " + df.format(toInch(number)) + " centimeters\n\n");

				break;
			case 2:
				if (number == 1)
					System.out.print(number + " feed equals " + toFoot(number) + " centimeters\n\n");
				else
					System.out.print(number + " feeds equals " + toFoot(number) + " centimeters\n\n");

				break;
			case 3:
				if (number == 1)
					System.out.print(number + " yard equals " + toYard(number) + " meters\n\n");
				else
					System.out.print(number + " yards equals " + toYard(number) + " meters\n\n");

				System.out.print(number + " yards equals " + toYard(number) + " meters\n\n");
				break;
			case 4:
				if (number == 1)
					System.out.print(number + " mile equals " + toMile(number) + " kilometers\n\n");
				else
					System.out.print(number + " miles equals " + toYard(number) + " meters\n\n");

				break;
			case 5:

				System.out.print("Quit");
				break;

			default:

				System.out.print("That choice ia not available\n");
				break;
			}
		}
	}

	public static double toInch(int num) {

		return (double) num * 2.54;
	}

	public static double toFoot(int num) {
		return (double) num * 30.48;
	}

	public static double toYard(int num) {
		return (double) (num * .9144);
	}

	public static double toMile(int num) {
		return (double) num * 1.60934;
	}

}
