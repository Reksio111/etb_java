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

public class NoFussBussing {
	public static void main(String args[]) {
		/**
		 * @author Jacek
		 * @date 16/10/19
		 */

		int child = 2;
		int olderRate = -2;
		int standardPrice = 6;
		int age, finalPrice;
		int studentRate = -1;
		int teenagerRate = 4;
		char student, returnTravel;

		Scanner scr = new Scanner(System.in);
		try {

			System.out.print("Return ticket?\n");
			returnTravel = scr.next().charAt(0);

			System.out.print("Please enter your age:\n");
			age = scr.nextInt();

			// children rate
			if (age < 13) {
				if (returnTravel == 'y') {
					finalPrice = child + child / 2;
					System.out.println("Class Children/Return. Ticket price is " + finalPrice + " euro.");
				} else {
					System.out.println("Class Children. Ticket price is " + child + " euro.");
				}

			}
			// teenager/adult/student/return
			if (age > 12 && age < 60) {
				System.out.print("Are you student ?");
				student = scr.next().charAt(0);

				if (returnTravel == 'y') {
					if (student == 'y') {
						// student teenager return
						if (age < 20) {
							finalPrice = studentRate + teenagerRate + teenagerRate / 2;
							System.out
									.println("Class Student/Teenager-Return. Ticket price is " + finalPrice + " euro");

							// adult student return
						} else {
							finalPrice = studentRate + standardPrice + standardPrice / 2;
							System.out.println("Class Student/Adult-Return. Ticket price is " + finalPrice + " euro");

						}

					} else {
						// no student teenager return
						if (age < 20) {
							finalPrice = teenagerRate + teenagerRate / 2;
							System.out.println("Class Teenager-Return. Ticket price is " + finalPrice + " euro");
							// no student adult return
						} else {
							finalPrice = standardPrice + standardPrice / 2;
							System.out.println("Class Adult_Return. Ticket price is " + finalPrice + " euro");
						}
					}
				}
				// if no return

				else {
					// teenager
					if (age < 20) {
						// no student
						if (student != 'y') {
							finalPrice = teenagerRate;
							System.out.println("Class Teenager. Ticket price is " + finalPrice + " euro");
							// student
						} else {
							finalPrice = studentRate + teenagerRate;
							System.out.println("Class Teeager/Student. Ticket price is " + finalPrice + " euro");
						}
					}
					// adult
					else {
						if (student == 'y') {
							finalPrice = studentRate + standardPrice;
							System.out.println("Class Adult/Student. Ticket price is " + finalPrice + " euro");
						} else {
							finalPrice = standardPrice;
							System.out.println("Class Adult. Ticket price is " + finalPrice + " euro");
						}
					}

				}

			}
			// older people
			if (age > 59) {
				if (returnTravel == 'y') {
					olderRate = olderRate + standardPrice;
					finalPrice = olderRate + olderRate / 2;
					System.out.println("Class Older/Return. Ticket price is " + finalPrice + " euro");
				} else {
					finalPrice = olderRate + standardPrice;
					System.out.println("Class Older. Ticket price is " + finalPrice + " euro");
				}
			}

		} catch (Exception ex) {
			System.out.println("Error occured");
		}

	}
}