package builderPattern.model;

import builderPattern.model.packing.Packing;

/**
 * 创建一个表示食物条目和食物包装
 * 
 * @author S5343
 * @date 2018年4月11日下午4:15:49
 */
public interface Item {
	// 名字
	String name();

	// 包装类型
	Packing packing();

	// 价格
	float price();
}
