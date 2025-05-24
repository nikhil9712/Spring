package com.telusko.SpringXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BagMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Bag.xml");
		Bag b1=(Bag)applicationContext.getBean("skybag");
		b1.waranty();
		
		Bag b2=applicationContext.getBean("american",AmericanT.class);
		b2.waranty();
	}
	
	
}
