package week_4;

import java.util.Random;
//import java.util.Formatter;

public class TwoDice {

	public static void main(String[] args) {

		Random generator = new Random();
		int firstDice = 0;
		int totalDigit[] = new int[11];
		int secondDice;
		int sum = 0;
		int[] tally = new int[36000000];

		for (int i = 0; i < tally.length; i++) {
			firstDice = generator.nextInt(6) + 1;
			secondDice = generator.nextInt(6) + 1;
			sum = firstDice + secondDice;
			tally[i] = sum;

			if (sum == 2)
				totalDigit[0]++;
			if (sum == 3)
				totalDigit[1]++;
			if (sum == 4)
				totalDigit[2]++;
			if (sum == 5)
				totalDigit[3]++;
			if (sum == 6)
				totalDigit[4]++;
			if (sum == 7)
				totalDigit[5]++;
			if (sum == 8)
				totalDigit[6]++;
			if (sum == 9)
				totalDigit[7]++;
			if (sum == 10)
				totalDigit[8]++;
			if (sum == 11)
				totalDigit[9]++;
			if (sum == 12)
				totalDigit[10]++;

		} // end of for loop
		for (int i = 0; i < totalDigit.length; i++) {
			System.out.format("%32s%d%6s", "Sum of two dices equal " + (i + 2) + " occured: ", totalDigit[i],
					" times\n");

		}

	}

}
