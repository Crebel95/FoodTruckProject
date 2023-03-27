package com.skilldistillery.foodtruck.entities;

public class FoodTruck {

	private int idNum;
	private String name;
	private String foodType; 
	private int rating;
	private static int count;
	

	public String toString() {
		String output = " ID number: " + idNum + " Name: " + name + " " + "Food type: " + foodType + " " + "Rating: " + rating;
		return output;
	}
	
	public FoodTruck() {
		
	}

	public FoodTruck(String name, String foodType, int rating) {
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
		count++;
		idNum = count;
		
	}

	public int getIdNum() {
		return idNum;
	}

	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getFoodType(String foodType) {
		return foodType;
	}
	
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	


}
