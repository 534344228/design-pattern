package factoryPattern.factory;

import factoryPattern.model.Shape;
import factoryPattern.model.impl.Circle;
import factoryPattern.model.impl.Rectangle;
import factoryPattern.model.impl.Square;

/**
 * 创建一个工厂，生成基于给定信息的实体类的对象
 * 
 * @author S5343
 * @date 2018年4月11日下午1:54:46
 */
public class ShapeFactory {
	// 使用 getShape 方法获取形状类型的对象
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}
}
