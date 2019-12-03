package write_read_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class WriteItemToFile {
	static String[] list = new String[5];
	static String[] prices = new String[5];
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		
		createItemList();
		displayList(list);
		writeToFile();
		addPrices();
		writeItemPriceFile();
		readItemsAndPricesFile();
	}

	// methods
	public static void createItemList() {
		for (int i = 0; i < list.length; i++) {
			System.out.print((i + 1) + "th item: ");
			String name = scanner.nextLine();
			list[i] = name;

		}

	}

	public static void displayList(String[] str) {
		for (String itm : str) {
			System.out.println(itm);
		}
	}

	public static void writeToFile() throws Exception {

		String fileLocation = "X:\\ItemsFile.txt";
		BufferedWriter writer = new BufferedWriter(new FileWriter(fileLocation));
		try {
			for (int i = 0; i < list.length; i++) {
				writer.write(list[i] + "\t");
				writer.newLine();
			}
			writer.close();
		} catch (Exception ex) {
			System.out.print("Input exception");
		}
	}

	public static void readFromFile() throws Exception {
		try {
			String fileLocation = "X:\\ItemsFile.txt";
			BufferedReader reader = new BufferedReader(new FileReader(fileLocation));
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				line = reader.readLine();
			}
			reader.close();
		} catch (Exception ex) {
			System.out.print("Output Exception");
		}
	}

	public static void addPrices() {
		for (int i = 0; i < list.length; i++) {
			System.out.print("Price for " + list[i] + ": ");
			String price = scanner.nextLine();
			prices[i] = price;

		}
	}

	public static void readItemsAndPricesFile() {
		try {
			String fileLocation = "X:\\ItemPriceFile.txt";
			BufferedReader reader = new BufferedReader(new FileReader(fileLocation));
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				line = reader.readLine();
			}
			reader.close();
		} catch (Exception ex) {
			System.out.print("Output Exception");
		}

	}

	public static void writeItemPriceFile() throws Exception {

		String fileLocation = "X:\\ItemPriceFile.txt";
		BufferedWriter writer = new BufferedWriter(new FileWriter(fileLocation));
		try {
			for (int i = 0; i < list.length; i++) {
				writer.write(list[i] + "\t" + prices[i]);
				writer.newLine();
			}
			writer.close();
		} catch (Exception ex) {
			System.out.print("Input exception");
		}
	}

}
