package Spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Laptop.xml");
			//configuration file name should be given as fully qualified class name if it is present in the src 
		    // package write the file name directly otherwise write name with the package name
		
		Laptop laptop1=applicationContext.getBean("asus",Asus.class);
		laptop1.company();
		
		Laptop laptop2=applicationContext.getBean("dell",Dell.class);
		laptop2.company();
		
	}
}
