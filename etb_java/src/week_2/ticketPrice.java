package week_2;

import java.util.*;
/*A bus company "NoFuss-Bussing" provides 4 pricing tiers per journey, Child: anyone under the age of 13, Teenager: anyone under the age of 20, Adult: anyone over the age of 20 but under the age of 60, as anyone over the age of 60 is entitled to a discount of €2 to the ticket price. 

The price lists are as follows:

	Child  		€2.00
	Teenager 	€4.00
	Adult 		€6.00

1.1)Please write a program that asks the user to input their age, so that the program can tell them the cost of a single journey.

1.2)"No Fuss-Bussing" wants to add a student discount of €1.00, so add code that will ask the user if they are a student & subtract the discount if they are. 

1.3)"No Fuss-Bussing" wants to add a return ticket pricing options, returning journeys cost half as much as the original journey (after any discount/s are applied),So a return ticket for a Teenager  who isnt a student  would cost €6.00  E.g:(Teenager: €4.00, Returning journeys: €4.00/2).

1.4)"No Fuss Bussing" are expanding they're destinations beyond the local area, please write the following menu. All new destinations has an Additional surcharge as listed, this will be added to the normal ticket price (as defined above), Such that when the user enters an option the program prints purchased ticket to name of "destination" & the cost.
So a return ticket for a Teenager who isnt a student going to City Beach would cost €8.00  E.g:(Teenager: €4.00, Returning journeys: €4.00/2, City Beach: €2.00).
If the user any other option the program should inform them it is not a valid choice.

	1) City Beach (Additional surcharge of  €2.00)
	2) Museum of cool paintings (Additional surcharge of  €1.00)
	3) Tayto Park (Additional surcharge of  €5.00)
	4) Jurassic Park (Additional surcharge of  €100.00)
	5) local area
	

1.5)A customer of "No Fuss-Bussing" suggested The the menu should be repeated until the user choose the exit options, please edit your code so that this is the case.

	1) City Beach (Additional surcharge of  €2.00)
	2) Museum of cool paintings (Additional surcharge of  €1.00)
	3) Tayto Park (Additional surcharge of  €5.00)
	4) Jurassic Park (Additional surcharge of  €100.00)
	5) local area
	0) EXIT

1.6)"No Fuss-Bussing" cannot be stopped! after their expansion of destinations sales were so high they have to limit available tickets, So please add code that keeps 
track of how many available tickets for each location they are & prevent the sale of more than 25 tickets (per location) for any of their new destinations.


 * 
 * */

public class ticketPrice {

	int standardPrice = 6, childPrice = 2, discontPrice = 4;
	int studentDiscont = -1;
	int returnAdult, returnTeenager;
	char returnTicket, studentTicket;
	
	public ticketPrice() {
	}

	public boolean returnWay() {
		boolean reTicket = false;
		if (returnTicket == 'y')
			reTicket = true;
		return reTicket;

	}

	public boolean studentDiscont() {
		boolean student = false;

		if (studentTicket == 'y')
			student = true;
	
		return student;

	}

	public int priceLists() {
		Scanner scr = new Scanner(System.in);
		int finalPrice = 0;
		try {

			System.out.print("Please enter your age:\n");
			int age = scr.nextInt();
			System.out.println("Are you student ?");
			studentTicket = scr.next().charAt(0);
			System.out.println("Return ticket ?");
			returnTicket = scr.next().charAt(0);

			if (age < 13) {
				if (returnTicket == 'y') {
					finalPrice = childPrice + childPrice / 2;

				} else
					finalPrice = childPrice;

			}

			// teenager/adult/student/return
			if (age > 12 && age < 60) {

				if (returnTicket == 'y') {
					if (studentTicket == 'y') {
						// student teenager return
						if (age < 20) {
							finalPrice = studentDiscont + discontPrice + discontPrice / 2;

							// adult student return
						} else {
							finalPrice = studentDiscont + standardPrice + standardPrice / 2;
							
						}

					} else {
						// no student teenager return
						if (age < 20) {
							finalPrice = discontPrice + discontPrice / 2;

							// no student adult return
						} else {
							finalPrice = standardPrice + standardPrice / 2;

						}
					}
				}
				// if no return

				else {
					// teenager
					if (age < 20) {
						// no student
						if (studentTicket != 'y') {
							finalPrice = discontPrice;
							// student
						} else {
							finalPrice = studentDiscont + discontPrice;
						}
					}
					// adult
					else {
						if (studentTicket == 'y') {
							finalPrice = studentDiscont + standardPrice;

						} else {
							finalPrice = standardPrice;

						}
					}

				}

			}
			// older people
			if (age > 59) {
				if (returnTicket == 'y') {

					finalPrice = discontPrice + discontPrice / 2;

				} else {
					finalPrice = discontPrice ;

				}

			}

		} catch (Exception ex) {
			System.out.print(ex.getMessage());
		}
		
		return finalPrice;
	}

}
