package builderPattern.model.food.burger;

import builderPattern.model.food.Burger;

public class VegBurger extends Burger {

	@Override
	public String name() {
		return "蔬菜汉堡";
	}

	@Override
	public float price() {
		return 25.0f;
	}

}
