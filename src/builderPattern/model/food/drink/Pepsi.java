package builderPattern.model.food.drink;

import builderPattern.model.food.ColdDrink;

public class Pepsi extends ColdDrink {
	@Override
	public float price() {
		return 35.0f;
	}

	@Override
	public String name() {
		return "百事可乐";
	}
}
