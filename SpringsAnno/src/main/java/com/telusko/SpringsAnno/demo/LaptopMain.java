package com.telusko.SpringsAnno.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LaptopMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(LaptopConfi.class);
		Laptop laptop=applicationContext.getBean("laptop",Laptop.class);
	    laptop.Confi();
	    
	}
}
