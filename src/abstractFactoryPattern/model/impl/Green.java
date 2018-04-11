package abstractFactoryPattern.model.impl;

import abstractFactoryPattern.model.Color;

public class Green implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Green::fill() method.");
	}

}
