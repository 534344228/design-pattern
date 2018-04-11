package abstractFactoryPattern.factory;

import abstractFactoryPattern.model.Color;
import abstractFactoryPattern.model.impl.Blue;
import abstractFactoryPattern.model.impl.Green;
import abstractFactoryPattern.model.impl.Red;
import factoryPattern.model.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();
		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		return null;
	}

}
