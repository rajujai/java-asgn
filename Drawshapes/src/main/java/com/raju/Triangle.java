package com.raju;

public class Triangle implements Shape{
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("You have drawn "+this.getClass().getSimpleName());
		
	}
}