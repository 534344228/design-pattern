package builderPattern.model.packing.impl;

import builderPattern.model.packing.Packing;

public class Wrapper implements Packing {

	@Override
	public String pack() {
		return "纸质包装";
	}

}
