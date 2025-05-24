package com.telusko.SpringXmlAndAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Door.xml");
		MainDoor d = (MainDoor) applicationContext.getBean("mainDoor");
		d.message();
	}
}
