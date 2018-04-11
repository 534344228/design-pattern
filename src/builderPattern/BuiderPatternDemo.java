package builderPattern;

import builderPattern.model.Meal;

public class BuiderPatternDemo {
	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("蔬菜套餐-----");
		vegMeal.showItems();
		System.out.println("总计: " + vegMeal.getCost());

		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("肉类套餐-----");
		nonVegMeal.showItems();
		System.out.println("总计: " + nonVegMeal.getCost());
	}
}
