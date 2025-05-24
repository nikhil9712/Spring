package Sptrings_AnnotationsScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(personConfi.class);
	    Person person=applicationContext.getBean("person",Person.class);
	    person.walk();
	    
	    ((AbstractApplicationContext) applicationContext).close();
	}
}
