package com.telusko.SpringsAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GadgetMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(GadgetConfi.class);
		Gadget gadget = applicationContext.getBean("gadget", Gadget.class);
		gadget.message();
	}
}
