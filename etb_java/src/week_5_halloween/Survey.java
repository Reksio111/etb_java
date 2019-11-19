package week_5_halloween;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author jacek; The Internet and the web are enabling more people to network,
 *         join a cause, voice opinions, and so on. Recent presidential
 *         candidates have used the Internet intensively to get out their
 *         messages and raise money for their campaigns. In this exercise,
 *         you’ll write a simple polling program that allows users to rate five
 *         social-consciousness issues from 1 (least important) to 10 (most
 *         important). Pick five causes that are important to you (e.g.,
 *         political issues, global environmental issues). Use a one-dimensional
 *         array topics (of type String) to store the five causes. To summarize
 *         the survey responses, use a 5-row, 10-column two-dimensional array
 *         responses (of type int), each row corresponding to an element in the
 *         topics array. When the program runs, it should ask the user to rate
 *         each issue. Have your friends and family respond to the survey. Then
 *         have the program display a summary of the results, including:
 * 
 *         a) A tabular report with the five topics down the left side and the
 *         10 ratings across the top, listing in each column the number of
 *         ratings received for each topic.
 * 
 *         b) To the right of each row, show the average of the ratings for that
 *         issue.
 * 
 *         c) Which issue received the highest point total? Display both the
 *         issue and the point total.
 * 
 *         d) Which issue received the lowest point total? Display both the
 *         issue and the point total.
 *
 */

public class Survey {

	public static void main(String args[]) {
		String[] topics = { "Political Corruption  ", "Global envirovment    ", "Unemployment          ",
				"Poverty               ", "Lack of infrastructure" };
		int[][] responses = new int[5][10];
		Scanner keyIn = new Scanner(System.in);
		int[] sumResponses = new int[5];
		double avg, total;

		System.out.println("The five major issues are:");
		for (String name : topics)
			System.out.println(name);

		System.out.println("Please rate them from 1 (least important) to 10 (most important):");

		for (int i = 0; i < 10; i++) {
			total = 0;
			System.out.println("Welcome user " + (i + 1));
			for (int j = 0; j < 5; j++) {
				System.out.print("Enter your raiting for " + topics[j] + " :");
				responses[j][i] = keyIn.nextInt();

			} //
		} // external loop

		System.out.print(
				"\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n ");
		System.out.print("\t\t\t\t*********** STATISTICS ***********\n");
		System.out.print(
				"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \n");
		System.out.println(
				"\n______________________________________________________________________________________________________________");
		for (int i = 0; i < responses.length; i++) {
			total = 0;
			int high = responses[0][0];
			int low = responses[0][0];
			System.out.print(topics[i] + "\t");
			for (int j = 0; j < responses[i].length; j++) {
				System.out.print(responses[i][j] + "\t");
				total += responses[i][j];
				sumResponses[i] = (int) total;
			} // internal
			avg = total / (double) responses[i].length;
			System.out.print(avg);
			System.out.print("\n");

		} // external
		System.out.println(
				"______________________________________________________________________________________________________________");

		int maxValue = sumResponses[0];
		int minValue = sumResponses[0];
		for (int i = 1; i < sumResponses.length; i++) {
			if (sumResponses[i] > maxValue)
				maxValue = sumResponses[i];
			if (sumResponses[i] < minValue)
				minValue = sumResponses[i];
		}
		for (int i = 0; i < sumResponses.length; i++) {
			if (maxValue == sumResponses[i]) {
				System.out.println("The topic that received the highest values is " + topics[i] + " and scored "
						+ maxValue + " points");

			}
			if (minValue == sumResponses[i]) {
				System.out.println("The topic thac received the least values is " + topics[i] + " and scored "
						+ minValue + " points");

			}
		}

	}// main

}// class