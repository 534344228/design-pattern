/**
 * 
 */
package builderPattern.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 套餐
 * 
 * @author S5343
 * @date 2018年4月11日下午4:29:36
 */
public class Meal {
	private List<Item> items = new ArrayList<>();

	/**
	 * 添加套餐
	 * 
	 * @param item
	 */
	public void addItem(Item item) {
		items.add(item);
	}

	/**
	 * 套餐结算
	 * 
	 * @return
	 */
	public float getCost() {
		float cost = 0.0f;
		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}

	/**
	 * 打印小票
	 */
	public void showItems() {
		for (Item item : items) {
			System.out.print("成分 : " + item.name());
			System.out.print(", 打包 : " + item.packing().pack());
			System.out.println(", 价格 : " + item.price());
		}
	}
}
