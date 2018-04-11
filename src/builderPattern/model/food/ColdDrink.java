package builderPattern.model.food;

import builderPattern.model.Item;
import builderPattern.model.packing.Packing;
import builderPattern.model.packing.impl.Bottle;

public abstract class ColdDrink implements Item {
	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();
}
