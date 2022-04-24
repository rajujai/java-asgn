package com.raju;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import org.springframework.;
public class Runner {
	public static void main(String[] args) {
         ApplicationContext actx = new ClassPathXmlApplicationContext("applicationContext.xml");
         DrawShape ds = actx.getBean("draw", DrawShape.class);
         ds.draw();
	}

}