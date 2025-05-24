package Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Pakc1.Action;

public class Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Action.xml");

		Action action = applicationContext.getBean("action", Action.class);
		action.takl();

		// close is abstract method present in AbstractApplicationContext which is
		// downcast
	}
}
