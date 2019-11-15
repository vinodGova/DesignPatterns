package com.designpatter.withflyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapFactory {
	private volatile static Map<String, Ishape> shapes;

	static {
		shapes = new HashMap<String, Ishape>();
	}

	public synchronized static Ishape getShape(String type) {
		Ishape shape = null;
		if (shapes.containsKey(type)) {
			shape = shapes.get(type);
		} else {
			if (type.equalsIgnoreCase("circle")) {
				shape = new Circle();

			}
			if (type.equalsIgnoreCase("rectangle")) {
				shape = new Rectangle();
			}
			shapes.put(type, shape);
		}
		return shape;
	}
}
