package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {
	private FoodTruck[] fleet = new FoodTruck[5];

	public static void main(String[] args) {

		FoodTruckApp fta = new FoodTruckApp();

		fta.run();
		fta.Menu();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);

		boolean running = true;

		while (running) {
			for (int truck = 0; truck < fleet.length; truck++) {

				System.out.println("Please enter the name of the food truck. Or type \"quit\" to exit into menu: ");
				String name = sc.nextLine();
				if (name.equalsIgnoreCase("quit")) {
					running = false;
					break;
				}
				System.out.println("Please enter the type of food served at this truck: ");
				String foodType = sc.nextLine();
				System.out.println("Please enter your rating for the food truck (1 - 5): ");
				int rating = sc.nextInt();
				sc.nextLine();

				fleet[truck] = new FoodTruck(name, foodType, rating);

			}

		}
	}

	public void averageRating() {
		double totalRating = 0;
		int count = 0;
		for (int i = 0; i < fleet.length; i++) {
			if (fleet[i] == null) {

			} else {
				totalRating += fleet[i].getRating();
				count++;
			}
		}
		double avgRating = totalRating / count;
		System.out.println("The total average rating is: " + avgRating);

	}

	public void highestRating() {

		int highest = 0;

		for (int i = 1; i < fleet.length; i++) {
if(fleet[i] != null && fleet[i].getRating() > fleet[highest].getRating()) {
	highest = i;
}
		}
		System.out.println(fleet[highest].toString());
	}

	public void displayFoodTrucks() {

		for (int i = 0; i < fleet.length; i++) {
			if (fleet[i] == null) {

			} else {
				System.out.println(fleet[i].toString());
			}
		}

	}

	public void Menu() {

		Scanner sc = new Scanner(System.in);
		boolean running = true;

		while (running) {

			System.out.println("-----------------------------------------");
			System.out.println("Welcome to the Main Menu!");
			System.out.println("Press a number between 1 - 4 to continue:");
			System.out.println("1. List existing food trucks");
			System.out.println("2. See the average rating of food trucks");
			System.out.println("3. Display the highest rated food truck");
			System.out.println("4. Quit program");
			System.out.println("-----------------------------------------");

			int selection = sc.nextInt();

			if (selection == 1) {
				displayFoodTrucks();
			}
			if (selection == 2) {
				averageRating();
			}
			if (selection == 3) {
				highestRating();
			}
			if (selection == 4) {
				running = false;
				break;

			}
			if (selection <= 0 || selection >= 5) {
				System.err.println("Your selection MUST be within the range of 1 - 4");
			}
		}

	}
}
