package week_3;

public class fizzBooz {

	public static void main(String args[]) {

		for (int i = 1; i < 101; i++) {

			if (i % 3 != 0 && i % 5 != 0)
				System.out.println(i);
			else if (i % 3 == 0)
				System.out.println("fizz");
			else if (i % 5 == 0)
				System.out.println("booz");

		}
		int i = 1;
		do {

			if (i % 3 != 0 && i % 5 != 0)
				System.out.println(i);
			else if (i % 3 == 0)
				System.out.println("fizz");
			else if (i % 5 == 0)
				System.out.println("booz");
			i++;
		} while (i < 101);
	}
}
