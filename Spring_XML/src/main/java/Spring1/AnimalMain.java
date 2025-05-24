package Spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Animal.xml");//resource is only for xml
	 
//	  Cow cow= applicationContext.getBean("c1",Cow.class);
//	  cow.sound();
//	  Lion lion= applicationContext.getBean("l1",Lion.class);
//	  lion.sound();
		
		//By single Object we can access both child class methods 0
		Animal anima1=applicationContext.getBean("c1",Cow.class); //Generalization 
		anima1.sound();
		
		Animal anima2=applicationContext.getBean("l1",Lion.class);
		anima2.sound();
	}
}
