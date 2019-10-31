package week_3;

/**
 * @author James Barrett
 * @version 1.0
 */

public class MyString {
	public static void main(String[] args) {

		// String literal
		String str1 = "Welcome";

		// Using new keyword
		String str2 = new String("  Welcome  ");

		System.out.println(str1.charAt(0));
		System.out.println(str1.length());
		System.out.println(str1.trim());
		System.out.println(str1.indexOf(0));
		System.out.println(str1.lastIndexOf('m'));
		System.out.println(str1.replace('e', '3'));
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.substring(0, 2));

		// See https://docs.oracle.com/javase/7/docs/api/java/lang/String.html

		String text = "james,barrett,james.barrett@nln.ie,0-,,";

		String staffInformation[] = new String[5];

		int start = 0;
		int variableElement = 0;

		for (int i = 0; text.length() > i; i++) {
			if (text.charAt(i) == ',') {
				staffInformation[variableElement] = "" + (text.subSequence(start, i));
				variableElement++;
				start = i + 1;
			}
		}

		for (int i = 0; staffInformation.length > i; i++) {
			System.out.println(staffInformation[i]);
		}
		String name = "", sf1 = "", sf2 = "", sf3 = "", str4 = "", str5 = "", str6 = "", str7 = "", str8 = "",
				str9 = "", str10 = "", str11 = "", str12 = "", str13 = "";

		String[] names = { name, sf1 = String.format("name is %s", "sonoo"),
				sf2 = String.format("value is %f", 32.33434), sf3 = String.format("value is %32.12f", 32.33434),
				str4 = String.format("%d", 101), str5 = String.format("%s", "Amar Singh"),
				str6 = String.format("%f", 101.00), str7 = String.format("%x", 101), str8 = String.format("%c", 'c'),
				str9 = String.format("%d", 101), str10 = String.format("|%10d|", 101),
				str11 = String.format("|%-10d|", 101), str12 = String.format("|% d|", 101),
				str13 = String.format("|%010d|", 101) };
		
		for(int i=0; i <= names.length;i++) {
			
		}

		/*
		 * //Java String format String name="sonoo"; String
		 * sf1=String.format("name is %s",name); String
		 * sf2=String.format("value is %f",32.33434); String
		 * sf3=String.format("value is %32.12f",32.33434);//returns 12 char fractional
		 * part filling with 0
		 * 
		 * 
		 * String str4 = String.format("%d", 101); // Integer value String str5 =
		 * String.format("%s", "Amar Singh"); // String value String str6 =
		 * String.format("%f", 101.00); // Float value String str7 = String.format("%x",
		 * 101); // Hexadecimal value String str8 = String.format("%c", 'c'); // Char
		 * value
		 * 
		 * 
		 * String str9 = String.format("%d", 101); String str10 =
		 * String.format("|%10d|", 101); // Specifying length of integer String str11 =
		 * String.format("|%-10d|", 101); // Left-justifying within the specified width
		 * String str12 = String.format("|% d|", 101); String str13=
		 * String.format("|%010d|", 101); // Filling with zeroes
		 * 
		 * 
		 * 
		 * 
		 * System.out.println(sf1); System.out.println(sf2); System.out.println(sf3);
		 * 
		 * System.out.println(str4); System.out.println(str5); System.out.println(str6);
		 * System.out.println(str7); System.out.println(str8);
		 * 
		 * System.out.println(str9); System.out.println(str10);
		 * System.out.println(str11); System.out.println(str12);
		 * System.out.println(str13);
		 * 
		 * 
		 */

	}// end class
}// end class