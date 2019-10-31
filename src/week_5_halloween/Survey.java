package week_5_halloween;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author jacek; The Internet and the web are enabling more people to network,
 *         join a cause, voice opinions, and so on. Recent presidential
 *         candidates have used the Internet intensively to get out their
 *         messages and raise money for their campaigns. In this exercise,
 *         you’ll write a simple polling program that allows users to rate
 *         five social-consciousness issues from 1 (least important) to 10 (most
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
		Scanner keyIn = new Scanner(System.in);
		String issueLow, issueHig;
		String[] surveyTopics = { "Health", "Education", "Law", "Taxes", "Ecology" };
		int[][] results = new int[10][5];
		int count = 0;
		int issuePointL=0, issuePiontH=0;
		double issueAvg=0;
		
		
		
		
		

		String surveyRules = "**************************************************************" + "\nThe survey rules:"
				+ "\n1. Chose five most important issues tha you would ask president candidates for."
				+ "\n2. Rate tehm in range 1-10, where 1 is the least and 10 the most important for you."
				+ "\n3. Be honest in your answer. " + "\nThank you. \n" + "The survey topics are following:\n";
		try {
			for (int i = 0; i < results[i].length; i++) {
				System.out.print(surveyRules);
				for (String name : surveyTopics)
					System.out.print(name + "\n");
				for (int j = 0; j < results[i].length; j++) {
					System.out.print("\nRate " + surveyTopics[j] + " importance:");
					results[i][j] = keyIn.nextInt();
				} // internal
				System.out.print("\nThank you for your time\n\n\n");
			} // external
			System.out.print("Finish");
		} catch (InputMismatchException ex) {
			System.out.println("Wrong input format");
		}
		
	}// main

}// class