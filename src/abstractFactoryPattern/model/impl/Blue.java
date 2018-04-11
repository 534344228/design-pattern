package abstractFactoryPattern.model.impl;

import abstractFactoryPattern.model.Color;

public class Blue implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Blue::fill() method.");
	}

}
