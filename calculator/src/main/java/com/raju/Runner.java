package com.raju;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		CalculatorImpl csi = ctx.getBean("csi", CalculatorImpl.class);
		int res = csi.calculate(89, 2, "substract");
		System.out.println(res);
	}
}