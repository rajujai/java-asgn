package com.raju;

public class Rectangle implements Shape{
	private int length;
	private int width;
	@Override
	public int area() {
		return length*width;
	}
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
}
