package com.raju;

public class Square implements Shape{
	private int length;
	@Override
	public int area() {
		return length*length;
	}
	public Square(int length) {
		this.length = length;
	}

}
