package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {
	private Scanner sc = new Scanner(System.in);
	private FoodTruck[] fleet = new FoodTruck[5];

	public static void main(String[] args) {
		FoodTruckApp fta = new FoodTruckApp();
		fta.run();

	}

	// methods
	public void run() {
		addTruck();
		menu();

	}

	public void addTruck() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Please enter the truck info.\n"
							 + "What is the truck's name?");

			String truckName = sc.nextLine();
			if (!truckName.equals("quit")) {

				System.out.println("What is type of food do they serve?\n" 
								 + "ex. Tacos, Sushi, etc.");
				String foodType = sc.nextLine();

				System.out.println("Rate them on a scale of 1 - 5.\n" 
								 + "With 1 being the lowest and 5 the highest.");
				int scale = sc.nextInt();
				sc.nextLine();
				// truckId not incrementing in the array// SOLVED

				FoodTruck truck = new FoodTruck(truckName, foodType, scale);
				// add truck at end of loop so a new one isn't created when "quit" input.

				fleet[i] = truck;
				System.out.println();

			} else {

				break;
			}
		}

	}

	public void menu() {
		menuPrint();
		int option = sc.nextInt();
		sc.nextLine();
		switch (option) {
		case 1:
			listOfTrucks();
			menu();
			break;

		case 2:
			calculateAvg();
			menu();
			break;

		case 3:
			highestRating();
			menu();
			break;

		case 4:
			System.out.println("Goodbye!");
			break;

		default:
			System.err.println("Not a valid option.");
			menu();
		}

	}

	public void menuPrint() {
		System.out.println("**************************************************");
		System.out.println("**        What would you like to do?            **");
		System.out.println("**************************************************");
		System.out.println("**  [1] List all existing food trucks.          **");
		System.out.println("**  [2] See the average rating of food trucks.  **");
		System.out.println("**  [3] Display the highest-rated food truck..  **");
		System.out.println("**  [4] Quit the program.			**");
		System.out.println("**************************************************");

	}

	public void listOfTrucks() { // complete
		for (int i = 0; i < fleet.length; i++) {
			if (fleet[i] != null) { // checking for null results, not including them
				System.out.println(fleet[i]);

			}
		}
	}

	public void calculateAvg() { // complete
		double sum = 0;
		double length = 0;
		double average = 0;
		for (int i = 0; i < fleet.length; i++) {
			if (fleet[i] != null) {
				sum += fleet[i].getScale();

			}

		}
		for (int i = 0; i < fleet.length; i++) {
			if (fleet[i] != null) {
				length++;
			}
		}

		average = sum / length;
		System.out.println("Average Rating: " + average);

	}

	public void highestRating() {
		// if max < i , max = i
		int max = 0;
		String truck = "";

		for (int i = 0; i < fleet.length; i++) {
			if (fleet[i] != null) {
				if (max < fleet[i].getScale()) {
					max = fleet[i].getScale();
					truck = fleet[i].toString();
				}
			}

		}
		System.out.println();
		System.out.println("Highest Rated Truck: " + truck);
	}

}
