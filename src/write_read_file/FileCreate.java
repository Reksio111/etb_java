package write_read_file;

import java.io.*;
import java.util.Scanner;

public class FileCreate {

	static String[] list = new String[5];
	static String[] prices = new String[5];
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

		createList();
		writeToFile();
		readFromFile();

	}
	
	

	public static void createList() {
		for (int i = 0; i < list.length; i++) {
			System.out.print((i + 1) + "th item:");
			String name = scanner.nextLine();
			list[i] = name;
			System.out.print("Price for " + list[i] + ":");
			String price = scanner.nextLine();
			prices[i] = price;
		}

	}

	public static void writeToFile() throws Exception {

		String fileLocation = "X:\\javaFile.txt";
		BufferedWriter writer = new BufferedWriter(new FileWriter(fileLocation));
		try {
			for (int i = 0; i < list.length; i++) {
				writer.write(list[i] + "\t");
				writer.write(prices[i]);
				writer.newLine();

			}
		} catch (Exception ex) {
			System.out.print("Input exception");
		} finally {
			writer.close();
		}
	}

	public static void readFromFile() throws Exception {
		String fileLocation = "X:\\javaFile.txt";
		BufferedReader reader = new BufferedReader(new FileReader(fileLocation));
		String line = reader.readLine();
		while (line != null) {
			System.out.println(line);
			line = reader.readLine();
		}
	}
}
