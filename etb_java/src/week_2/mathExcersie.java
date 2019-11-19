package week_2;

import java.lang.Math;
import java.text.DecimalFormat;

/*
 * 
 * 
 * 
2)Please write a program  that asks the user to input the radius of a circle, so that the program can tell them the area of the circle.

3)Please write a program that asks the user to input the diameter of a circle, so that the program can tell them  the circumference of the circle.

4)Please write a program that asks the user to input an one whole number, so that the program can tell them the square result of that number.

5)Please write a program  that asks the user to input one whole number, so that the program can tell them the factorial result of the number they entered.

6)Please write a program that demonstrates exponential growth by  printing out Factorial 1, Factorial 2 & so on to Factorial 10.


 * */
public class mathExcersie {

	double radius, circle, diameter, circumstance, area;

	double Pi = Math.PI;

	public static void main(String args[]) {
		mathExcersie calc = new mathExcersie();
		DecimalFormat df = new DecimalFormat("#.##");

		System.out.println("Circle:" + df.format(calc.circumstance(2.5)));
		System.out.println("Area:" + df.format(calc.circleArea(4)));
		System.out.println("Square:" + df.format(calc.squareRes(-4)));
		System.out.println("Factorial:" + calc.factorialCalc(5));
		System.out.println("Factorial: " + calc.factorialExpo(10));

	}

	public double circleArea(double radius) {
		area = Pi * radius * radius;
		return area;
	}

	public double circumstance(double diameter) {
		radius = diameter / 2;
		circumstance = 2 * Pi * radius;
		return circumstance;
	}

	public int squareRes(int number) {
		int square = number * number;
		return square;
	}

	public int factorialCalc(int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public int factorialExpo(int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
			System.out.println("Factor " + i + ": " + fact);
		}
		return fact;
	}

	public int divideCalc(int number, int number2) {
		int sum = 1;
		sum = number / number2;

		return sum;
	}

}