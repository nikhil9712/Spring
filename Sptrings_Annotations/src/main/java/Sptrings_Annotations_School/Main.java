package Sptrings_Annotations_School;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SchoolConfi.class);
	    
		School school=applicationContext.getBean("school",School.class);
		school.teach();
	}
}
