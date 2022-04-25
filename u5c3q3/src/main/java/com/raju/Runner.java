package com.raju;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		CalculateArea ca = ctx.getBean("circleA", CalculateArea.class);
		ca.calculateArea();
		CalculateArea sa = ctx.getBean("squareA", CalculateArea.class);
		sa.calculateArea();
		CalculateArea ra = ctx.getBean("recA", CalculateArea.class);
		ra.calculateArea();
	}
}
