package Random_class;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
/*
 * 1.Write a Java program that simulates a number guesing game.
   Its rules are as follows:
a.	Computer proposes a number from 1 to 1000.
b.	Human player tries to guess it. One enters a guess and computer tells if the number matches 
or it is smaller/greater than the proposed one.
c.	Game continues, until player guesses the number.
2.	Write a class PickACard which had two String ararys, called suits and values.
Use the Random method to pick a card for you.
3.	Write a Java Program to calculate compound interest
4.	Write a Program to Calculate the Discriminant Value
 
 * 
 * */

public class RandomExercise {

	Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {

		RandomExercise tester = new RandomExercise();
		tester.randomNumber();
		System.out.print(tester.pickACard());
		System.out.print("Compound interest:" + tester.calculateInterest());
		System.out.print("Discrimated value is:" + tester.discriminantValue());
	}

	public void randomNumber() {
		Random generator = new Random();
		int userNumber, secretNumber;
		try {
			secretNumber = generator.nextInt(1000) + 1;
			System.out.println("Secret number is: " + secretNumber);

			do {
				System.out.print("Enter your number: ");
				userNumber = scr.nextInt();

				if (secretNumber > userNumber)
					System.out.println("You number is too small");
				else if (secretNumber < userNumber)
					System.out.println("You number is too big");
				else
					System.out.print("Bingo !!!!");

			} while (secretNumber != userNumber);
		} catch (InputMismatchException ex) {
			System.out.print("Wrong input format\n");
		}
	}

	public String pickACard() {

		Random generator = new Random();
		String[] suits = { "Clubs", " Hearts", "Spades", "Diamonds" };
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		int yourSuit = generator.nextInt(suits.length);
		int yourValue = generator.nextInt(values.length);

		return "\nYour card is:" + suits[yourSuit] + " " + values[yourValue];
	}

	public double calculateInterest() {
		double rate = 5.4;
		System.out.print("\nEnter invested amound: ");
		int investmentAmount = scr.nextInt();
		System.out.print("Period: ");
		int time = scr.nextInt();
		return (double) investmentAmount + ((1 + rate / 100) * time);
	}

	public int discriminantValue() {
		System.out.print("\nEnter first number: ");
		int digitA = scr.nextInt();
		System.out.print("\nEnter second number: ");
		int digitB = scr.nextInt();
		System.out.print("\nEnter third number: ");
		int digitC = scr.nextInt();
		int dis = (int)Math.pow(digitB,2) - (4*digitA*digitC); 
		return dis;
	}
}
