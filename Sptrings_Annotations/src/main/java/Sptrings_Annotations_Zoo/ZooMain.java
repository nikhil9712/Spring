package Sptrings_Annotations_Zoo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ZooMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ZooConfi.class);
	    Animal animal=(Animal) applicationContext.getBean("animal");
	    animal.sound();
	    
//	    Animal animal=applicationContext.getBean("cat",Cat.class);
//	    animal.sound();
	}
}
