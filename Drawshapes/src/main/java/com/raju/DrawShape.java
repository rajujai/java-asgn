package com.raju;

public class DrawShape {
	private Shape shape;

	public void setShape(Shape shape) {
		this.shape = shape;
	}
	public void draw() {
		shape.draw();
	}
}
