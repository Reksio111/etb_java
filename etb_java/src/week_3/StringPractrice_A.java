package week_3;

import java.util.Scanner;

/*
 * 
Question 1 : Write a Java program that reads an input from the user and displays the length of the given string. 
Question 2: Write a Java program that reads an input string and display each character of the string per line.
Question 3 : Write a java Program that validates the length of an input string
Question 4 Write a java program to count the number of words in a string.

 * 
 * */

public class StringPractrice_A {

	static Scanner scanner = new Scanner(System.in);
	static String noSpaces, word;

	public static void main(String[] args) {

		// Question 1
		System.out.print("Enter word: ");
		word = scanner.nextLine();

		// REMOVE ALL WHITESPACES FORM STRING
		// ***************************************************************************
		/* * */String noSpaces = word.trim().replaceAll("[ ]{2,}", " ");//           *
		// ***************************************************************************

		System.out.print("Given word length is " + noSpaces.length() + " characters\n");
		// Question 1 finish

		// Question 2
		for (int i = 0; i < noSpaces.length(); i++) {
			System.out.println(noSpaces.charAt(i));
		}
		// Question 2 finish

		System.out.println();
		// Question 3
		if (noSpaces.length() > 10) {
			System.out.print("Entered word schould't exceed 10 words\n");
		} else {
			System.out.print("The input string is valid ");
		}

		// Question 3 finish

		// Question 4
		int count = 1;
		for (int i = 0; i < noSpaces.length(); i++) {
			if (noSpaces.charAt(i) == ' ')
				count++;
		}
		System.out.print("The given string contains " + count + " words\n");
		// Question 4 finish

		// create and display array of given string
		String[] array = noSpaces.split(" ");
		System.out.print("Array:\n");
		for (String n : array) {
			System.out.print(n + " ");
		}

		// System.out.print("\n" + word.trim()+"\n");

		System.out.print("\n" + noSpaces);
		System.out.print("\n" + word);
	}
	// Dublin is capitol of Republic of Ireland

}
