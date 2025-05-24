package com.telusko.SpringXmlAndAnnotations.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Laptop.xml");
		Laptop laptop=applicationContext.getBean("laptop",Laptop.class);
        System.out.println(laptop);
        Laptop laptop2=applicationContext.getBean("laptop",Laptop.class);
        System.out.println(laptop);
        System.out.println(laptop==laptop2);
	}
}
