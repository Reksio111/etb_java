package week_4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class StudentGrades {


	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner scr = new Scanner(System.in);
		double[] grades = new double[10];
		int i = 0;
		double average;
		double total=0;


		while(i < 10) {
			
			System.out.print("Enter " + (i + 1) + "th student grade: ");
			grades[i] = scr.nextDouble();
			total = total + grades[i];
			i++;
		}
		average = total / i;
		System.out.print("Students average: " + df.format(average));
		
	}

}
