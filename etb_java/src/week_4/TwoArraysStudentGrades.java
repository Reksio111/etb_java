package week_4;



import java.text.DecimalFormat;
import java.util.Scanner;

public class TwoArraysStudentGrades {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner scr = new Scanner(System.in);
		double[][] grades ={ { 50.34, 55.45, 60.55 }, //j represents rows (poziom-level)
							 { 30.8, 55.34, 80.11 }, //(0,0) first row first column
							 { 60.89, 45.44, 60.45 }, //(0,1) first row second column
							 { 90.89, 85.89, 60.67 }, //(1,0) second row first column 
							 { 50.45, 55.50, 60.56 } };
							   //i represents columns (pion-vertical)
		double average = 0;
		double studentAverage;
		double subjectAverage;

		
		for (int i = 0; i < grades.length; i++) {
			double studentTotal = 0;
			studentAverage = 0;
			int count1 = 0;
			System.out.print("Student: " + (i + 1) + "\n");
			for (int j = 0; j < grades[i].length; j++) {
				System.out.println("Exam " + (j + 1) + "th result:" + grades[i][j]);
				studentTotal += grades[i][j];
				count1++;
			} // inner loop finish

			studentAverage += studentTotal / grades[i].length;
			System.out.println("Student total:" + studentTotal);
			System.out.println("Student average:" + df.format(studentAverage));
			System.out.println();
		} // external loop finish

		// calculate average for each subject
		for (int i = 0; i < grades[i].length; i++) {
			subjectAverage = 0;
			for (int j = 0; j < grades.length; j++) {
				subjectAverage += grades[j][i];

			} // inner loop
			System.out.println("Subject " + (i + 1) + "th average:" +df.format((subjectAverage / grades.length)));
		} // external loop

	}

}
