package com.raju;

public class CalculateArea {
	//presentation layer
	Shape shape;

	public void setShape(Shape shape) {
		this.shape = shape;
	}
	void calculateArea() {
		System.out.println(shape.area());
	}
}
