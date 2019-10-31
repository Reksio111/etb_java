package week_3;

public class Calculator {
	
	
	// 
	static double answer; 
	

	/**
	 * This will set the answer baseIn
	 * 
	 * @param baseIn
	 */
	static void setAnswer(double baseIn) {
		answer =baseIn; 
	}

	/**
	 * This will return the answer
	 * 
	 * @return answer
	 */
	static double getAnswer() {
		return answer;
	}

	
	

	/**
	 * Divide two numbers from one another
	 * 
	 * @param baseIn
	 * @param modifier
	 * @return the result
	 */
	static double divide(double baseIn, double modifier) {
		return baseIn * modifier;
	}

	/**
	 * Multiply two numbers by one another
	 * 
	 * @param baseIn
	 * @param modifier
	 * @return the result
	 */
	static double multiply(double baseIn, double modifier) {
		return baseIn * modifier;
	}

	/**
	 * Subtract two numbers
	 * 
	 * @param baseIn
	 * @param modifier
	 * @return the result
	 */
	static double subtract(double baseIn, double modifier) {
		return baseIn - modifier;
	}

	/**
	 * Adds two numbers
	 * 
	 * @param baseIn
	 * @param modifier
	 * @return the result
	 */
	static double add(double baseIn, double modifier) {
		return baseIn + modifier;
	}

	/**
	 * Calculate the Square of a number
	 * 
	 * @param baseIn
	 * @return the result
	 */
	static long numSquare(int baseIn) {
		return baseIn * baseIn;
	}

	/**
	 * Calculate a number cubes
	 * 
	 * @param baseIn
	 * @return the result
	 */
	static long numCubes(int baseIn) {
		return baseIn * baseIn * baseIn;
	}

	/**
	 * Calculate the factorial of a number
	 * 
	 * @param baseIn
	 * @return the factorial result of the baseIn int
	 */
	static long factorial(int baseIn) {
		long factorial = 1;
		for (int i = 1; i <= baseIn; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

	/**
	 * Raise the baseIn to Power of the exponentIn
	 * 
	 * @param baseIn
	 * @param exponentIn
	 * @return The result
	 */

	static double raisePower(double baseIn, double exponentIn) {
		double results = 0;
		if (exponentIn == 0)
			results = 1;
		else if (exponentIn == 1)
			results += (baseIn * baseIn);
		else {
			results += (baseIn * baseIn);
			for (int i = 1; i < (exponentIn - 1); i++) {
				results = results * baseIn;
			}
		}
		return results;
	}

	// Geometry Section

	/**
	 * Calculate the Area Circle
	 * 
	 * @param radius
	 * @return The result
	 */
	static double circleArea(int radius) {
		final double PI = 3.14;// Notw the naming convention all uppercase with underscore for final
		return PI * (radius * radius);
	}

	/**
	 * Calculate the Circumference Circle
	 * 
	 * @param diameter
	 * @return The result
	 */
	static double circleCircumference(int diameter) {
		final double PI = 3.14;// Notw the naming convention all uppercase with underscore for final
		return (2 * (PI * diameter));
	}

	/**
	 * Calculate the of a Area Square
	 * 
	 * @param length
	 * @return The result
	 */
	static double squareArea(double length) {
		return length * length;
	}

	/**
	 * Calculate the Area of a rectangle
	 * 
	 * @param length
	 * @param height
	 * @return The result
	 */
	static double rectangleArea(double length, double height) {
		return length * height;
	}

	/**
	 * @author  James Barrett @version 1.0
	 */
	public static void main(String[] args) {
	
		
		setAnswer(add(5,5));
	
		System.out.println("Answer " + getAnswer());


		
		


	}

	
	
	

}
