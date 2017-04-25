package com.design.builder;

public class BuilderPatternDemo {
	public static void main(String[] args) {
		MealBuilder mealbuilder = new MealBuilder();
		
		Meal vegMeal = mealbuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());
		
		Meal nonVegMeal = mealbuilder.prepareNonVegMeal();
		System.out.println("\n\nNon-veg Meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost: " + nonVegMeal.getCost());
	}
}
