package Sptrings_Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	
	public static void main(String[] args) {
		
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Personconfi.class);
	Person person=(Person)applicationContext.getBean("person");
	person.walk();
	}
}
