package com.telusko.SpringXmlAndAnnotations.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClothMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("/com/telusko/SpringXmlAndAnnotations/demo/Cloth.xml");
		Cloth jeans=applicationContext.getBean("jeans",Jeans.class);
		jeans.price();
		
		Cloth shirt=applicationContext.getBean("shirt",Shirt.class);
		shirt.price();
		
		((AbstractApplicationContext) applicationContext).close();
	}
}
