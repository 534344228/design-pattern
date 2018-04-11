package abstractFactoryPattern.factory;

import abstractFactoryPattern.model.Color;
import factoryPattern.model.Shape;

/**
 * 为 Color 和 Shape 对象创建抽象类来获取工厂
 * 
 * @author S5343
 * @date 2018年4月11日下午2:54:40
 */
public abstract class AbstractFactory {
	public abstract Color getColor(String color);

	public abstract Shape getShape(String shape);
}
