package factoryPattern.model.impl;

import factoryPattern.model.Shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}

}
