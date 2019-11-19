package week_4;
/*
 * Write a program that:
1.	Prints out the temperatures for each day in a tabular format.  Like so:
Day		12am	6am	12pm	6pm
Monday	7	6	9	5
Tuesday	5	5	7	8
etc…
2.	Calculates and displays the average temperature for the week
3.	Calculates the minimum, maximum and average temperatures for each day and prints them out in a tabular format for each day.  Like so:
Day		Min	Max	Avg
Monday 	5	9	6.75
etc…

 * */

import java.text.DecimalFormat;

public class WeekdaysTemperature {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		String[] days = { "Monday   ", "Tuesday  ", "Wednesday", "Thursday ", "Friday   ", "Saturday ", "Sunday   " };
		int[][] temp = { { 7, 6, 9, 5 }, { 5, 5, 7, 8 }, { 7, 8, 13, 11 }, { 9, 10, 11, 9 }, { 8, 8, 9, 8 },
				{ 8, 9, 14, 12 }, { 9, 11, 18, 15 }

		};
		int weekTemp = 0, maxTemp = 0, minTemp = 0;


		System.out.format("%s%10s%10s%10s%10s%10s%10s%10s", "Day of week", "12am", "6am", "12pm", "6pm", "Min", "Max",
				"Avg");
		System.out.println("\n___________________________________________________________________________________");
		for (int i = 0; i < temp.length; i++) {
			maxTemp = temp[i][0];
			minTemp = temp[i][0];
			double avgTemp = 0;
			System.out.print(days[i]);
			for (int j = 0; j < temp[i].length; j++) {
				System.out.format("%10d", temp[i][j]);
				weekTemp += temp[i][j];
				avgTemp += temp[i][j];
				if (temp[i][j] < minTemp)
					minTemp = temp[i][j];
				if (temp[i][j] > maxTemp)
					maxTemp = temp[i][j];
				
			}
			double dayTempAvg = avgTemp / temp[i].length;

			System.out.format("%10d%10d%13s", minTemp, maxTemp, df.format(dayTempAvg));
			System.out.println();

		}
		System.out.println("___________________________________________________________________________________");
		double weekAvg = (double) weekTemp / (temp.length * temp[0].length);
		System.out.println("Average week temperature is " + df.format(weekAvg) + "°C");
	}

}
