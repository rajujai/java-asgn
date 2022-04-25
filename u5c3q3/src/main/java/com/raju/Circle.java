package com.raju;

public class Circle implements Shape{
	private int radius;

	@Override
	public int area() {
		return (22/7)*radius*radius;
	}

	public Circle(int radius) {
		this.radius = radius;
	}
}
