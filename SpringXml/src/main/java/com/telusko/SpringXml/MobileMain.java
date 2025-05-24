package com.telusko.SpringXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Mobile.xml");
		Battery b=applicationContext.getBean("b",Battery.class);
		System.out.println(b.capacity);
		System.out.println(b.company);
		System.out.println(b.price);
		System.out.println("*******");
		Mobile m=applicationContext.getBean("m",Mobile.class);
		m.config();
		((AbstractApplicationContext) applicationContext).close();
	}
}
