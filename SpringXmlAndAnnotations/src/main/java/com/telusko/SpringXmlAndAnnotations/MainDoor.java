package com.telusko.SpringXmlAndAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MainDoor {

	public void message()
	{
		System.out.println("The height of door should be 2.1 m for main door");
	}
	
}
