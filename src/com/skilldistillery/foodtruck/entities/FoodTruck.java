package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	//fields
	private static int COUNTER = 0;
	private int nextTruckId;
	private String name;
	private String foodType;
	private int scale;
	
	//ctors
	public FoodTruck() {

	}

	public FoodTruck(String name, String foodType, int scale) {
		this.name = name;
		this.foodType = foodType;
		this.scale = scale;
		COUNTER++;
		nextTruckId = COUNTER;
	}

	// getters and setters
	public int getNextTruckId() {
		return nextTruckId;
	}

	public void setNextTruckId(int inputTruckId) {
		this.nextTruckId = inputTruckId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getScale() {
		return scale;
	}

	public void setScale(int scale) {
		this.scale = scale;
	}
	
	//toString
	@Override
	public String toString() {
		return "FoodTruck " + nextTruckId + ": " + name + ", Food-Type: " + foodType + ", Rating :" + scale;
	}

}
