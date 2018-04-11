package builderPattern.model.packing.impl;

import builderPattern.model.packing.Packing;

public class Bottle implements Packing {

	@Override
	public String pack() {
		return "瓶装";
	}

}
