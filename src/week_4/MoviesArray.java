package week_4;
/*A movie (Killer Klowns from Outer Space) has been given a review score out of 5 from a number of film buffs. 
 *  The scores are as follows:
1/5
1/5
2/5
1/5
3/5
2/5
1/5
2/5
1/5
5/5
Write a program that:
1.	Stores these review scores in an array
2.	Displays these scores on the screen (as above)
3.	Calculates the average score and displays it on the screen
4.	Displays a graph showing the number of times each score was recorded.  Like so:
1/5: *****
2/5: ***
3/5: *
4/5:
5/5: *

 * */

public class MoviesArray {

	public static void main(String[] args) {
		int[] score = { 1, 1, 2, 1, 3, 2, 1, 2, 1, 5 };
		int[] stars = new int[5];
		int total = 0;

		for (int val : score) {
			System.out.println(val + "/5");
			stars[val - 1]++;
			total += val;
		}
		

		double avg = (double) total / score.length;
		System.out.println("\nAverage: " + avg);

		for (int i = 0; i < stars.length; i++) {
			System.out.print("\n" + (i + 1) + "/5: ");

			for (int k = 0; k < stars[i]; k++) {
				System.out.print("*");
			}
		}
	}

}
