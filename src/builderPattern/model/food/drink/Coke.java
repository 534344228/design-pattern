package builderPattern.model.food.drink;

import builderPattern.model.food.ColdDrink;

public class Coke extends ColdDrink {

	@Override
	public String name() {
		return "咖啡";
	}

	@Override
	public float price() {
		return 30.0f;
	}

}
