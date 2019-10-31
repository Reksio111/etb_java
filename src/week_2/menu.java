package week_2;

import java.util.*;

public class menu {

	private ticketPrice price = new ticketPrice();
	Scanner scr = new Scanner(System.in);
	boolean quit = false;
	int count,count1,count2,count3,count4=0;
	int finalPrice;

	public menu() {
	}

	public void menuOption() {
		
		
		try {
			do {
				 	
				System.out.println("\n***** Welcome in No Fuss Bussing destination menu *****");
				System.out.println("1. City Beach");
				System.out.println("2. Museum of cool paintings");
				System.out.println("3. Tayto Park");
				System.out.println("4. Jurassic Park");
				System.out.println("5. Local area");
				System.out.println("6. Quit");
				System.out.print("Chose one of the above options:");
				int option = scr.nextInt();
				

				switch (option) {

				case 1:
					
					finalPrice = price.priceLists();
					System.out.println("Ticket cost is " + (finalPrice + 2) + " euro");
					count++;
					System.out.println("Daily ticket limit is 25. There are still "+ (25-count)+ " tickets available" );
					break;
				case 2:
					finalPrice = price.priceLists();
					System.out.println("Ticket cost is " + (finalPrice + 1) + " euro");
					count1++;
					System.out.println("Daily ticket limit is 25. There are still "+ (25-count1)+ " tickets available" );
					break;
				case 3:
					finalPrice = price.priceLists();
					System.out.println("Ticket cost is " + (finalPrice + 5) + " euro");
					count2++;
					System.out.println("Daily ticket limit is 25. There are still "+ (25-count2)+ " tickets available" );
					break;
				case 4:
					finalPrice = price.priceLists();
					System.out.println("Ticket cost is " + (finalPrice + 100) + " euro");
					count3++;
					System.out.println("Daily ticket limit is 25. There are still "+ (25-count3)+ " tickets available" );
					break;
				case 5:
					finalPrice = price.priceLists();
					System.out.println("Ticket cost is " + finalPrice + " euro");
					count4++;
					System.out.println("Daily ticket limit is 25. There are still "+ (25-count4)+ " tickets available" );
					break;
				case 6:
					quit = true;
					System.out.print("You are very welcome again. Bye !!!\n");
					break;
				default:
					System.out.println("No choice available. Try again\n");
					break;
				}

			} while (!quit);
		} 
		catch(InputMismatchException e) {
			System.out.println("No that option available. Please chose "
		+"between 1 to 5 to chose travel destination, or 6 to quit. Thank you");
			menuOption();
	
		}
		
	}

}