package com.telusko.SpringXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GovernmanetMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(UniversityConfi.class);
		University university=applicationContext.getBean("university",University.class);
		university.myIntro();
	}
}
