package com.raju;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Life life = ctx.getBean("life", Life.class);
		life.livingLife();
		((ClassPathXmlApplicationContext)ctx).close();
	}
}
