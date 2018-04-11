package builderPattern.model.food;

import builderPattern.model.Item;
import builderPattern.model.packing.Packing;
import builderPattern.model.packing.impl.Wrapper;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
