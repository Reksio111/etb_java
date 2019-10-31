/*
  1) Write a Mad-Libs program, That askes the user to enter in an int, double, boolean, char & string at leasts once within the story. 

2)Write a guessing game program, using a random number generator to generate a number between 1 and 10. Then give the user three chances to guess the number, each time telling them if they're a higher or lower & how many attempts they have a remaining.  

3) Please write a calculator program that prints out the following menu. Then asks the user to input a number & pick the operation they want to use.

	1) Add 
    2) Subtract 
	3) Divide
	4) Multiply
	5 )Square a number 
	6) Cube a number
	7) Raise a number to a power 
	8) Calculate a factorial 

4) Please write a program that can  calculate the following:
  	Given a radius of a circle, return the area of the circle.
   	Given a diameter of a circle, return the circumference of the circle. 
  	Given a the length of a square, return area of the square.
	Given the length and breadth of a square rectangle, return area of the rectangle.

 */

package week_2;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.*;

public class methodsWeek2 {

	public static void main(String args[]) {

		boolean exit = false;
		try {
			do {
				Scanner scr = new Scanner(System.in);
				methodsWeek2 calc = new methodsWeek2();
				DecimalFormat df = new DecimalFormat("#.##");

				// menu display
				System.out.print("\n*** Chose one option ***\n");
				System.out.print("1.Type variable types\n");
				System.out.print("2.Number random generator game\n");
				System.out.print("3.Maths calculation\n");
				System.out.print("4.Formulas\n");
				System.out.print("5.Exit\n");
				System.out.print("Your choice: ");
				int chose = scr.nextInt();

				switch (chose) {
				case 1:

					boolean error = true;
					// part 1
					do {
						try {
							System.out.print("Enter integer number:");
							int number = scr.nextInt();
							System.out.print("Enter double number:");
							double number1 = scr.nextDouble();
							System.out.print("Type boolean value: ");
							boolean bol = scr.nextBoolean();
							if (bol)
								System.out.println(bol);
							System.out.println("Enter char:");
							String number4 = scr.nextLine();
							if (number4.length() > 0)
								System.out.println("Enter one character only");
							System.out.print("All input correct");
							break;
						} catch (InputMismatchException ex) {
							error = false;
						}
					} while (error);
					break;
				case 2:
					// part 2
					System.out.print("\nPart 2\n");
					Random rand = new Random();
					int num1 = rand.nextInt(10);
					int num2 = 6;
					int count = 0;
					System.out.print("Random number:" + num1 + "\n");
					System.out.print("Please type a number form 1 to 10. You have 3 attempts...\n");
					do {
						count++;
						System.out.print("Enter number:");
						int digit = scr.nextInt();
						System.out.print("");

						if (digit > num1)
							System.out.print("Entered number is too big. ");
						else if (digit < num1)
							System.out.print("Entered number is too small.");
						else {
							count = 3;
							System.out.println("Correct number !!!");

						}
						if (count == 2)
							System.out.println("It's your last attempt !!!");
						else if (count == 3)
							System.out.println("Game is over ");
						else
							System.out.println("Attempts left: " + (3 - count));

					} while (count < 3);
					break;
				// end part 2
				case 3:
					// part 3
					System.out.print("\nPart 3\n");
					System.out.print("Enter number 1:");
					int number3 = scr.nextInt();
					System.out.print("Enter number 2:");
					int number5 = scr.nextInt();

					System.out.print("\n");
					System.out.println("Add: " + calc.add(number3, number5));
					System.out.println("Substract: " + df.format(calc.substract(number3, number5)));
					System.out.println("Divide: " + df.format(calc.divide(number3, number5)));
					System.out.println("Multiply: " + calc.multiply(number3, number5));
					System.out.println("Square of number 1: " + calc.square(number3));
					System.out.println("Cube of number 1: " + calc.cube(number3));
					System.out.println("Power: " + calc.power(number3, number5));
					System.out.println("Factorial of number 1: " + calc.factorial(number3));
					break;
				case 4:
					// part 4
					System.out.print("\nPart 4\n");
					System.out.println("Circle area: " + df.format(calc.area(3)));
					System.out.println("Circle circumstance: " + df.format(calc.circumstance(12)));
					System.out.println("Circle area: " + calc.squareArea(3));
					System.out.println("Circle area: " + calc.rectangleArea(3, 5));
					break;
				case 5:
					exit = true;
					System.out.print("Exit ....");
					break;
				default:
					System.out.print("\n Incorrect choice");
					break;
				}
			} while (!exit);
		} catch (InputMismatchException ex) {
			System.out.print("\nIncorrect input");

		}
	}

	// Part 3 methods
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	public double divide(double num1, double num2) {
		return num1 / num2;
	}

	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	public int square(int num1) {
		return num1 * num1;
	}

	public int cube(int num1) {
		return num1 * num1 * num1;
	}

	public long power(int num1, int num2) {

		long result = 1;
		while (num2 != 0) {
			result *= num1;
			--num2;
		}
		return result;
	}

	public long factorial(int num1) {
		long fact = 1;
		for (int i = 1; i <= num1; i++) {
			fact = fact * i;
		}
		return fact;

	}// end part 3 methods

	// part 4 methods

	public double area(int r) {
		double area = 0;
		area = Math.PI * r * r;
		return area;
	}

	public double circumstance(int diameter) {
		double circum = 0;
		int r = diameter / 2;
		circum = 2 * Math.PI * r;
		return circum;
	}

	public int squareArea(int a) {
		return a * a;
	}

	public int rectangleArea(int a, int b) {
		return a * b;
	} // end part 4 methods
} // class finish
