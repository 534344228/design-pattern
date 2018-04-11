package builderPattern;

import builderPattern.model.Meal;
import builderPattern.model.food.burger.ChickenBurger;
import builderPattern.model.food.burger.VegBurger;
import builderPattern.model.food.drink.Coke;
import builderPattern.model.food.drink.Pepsi;

/**
 * 创建一个 MealBuilder 类，实际的 builder 类负责创建 Meal 对象。
 * 
 * @author S5343
 * @date 2018年4月11日下午4:33:10
 */
public class MealBuilder {
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
