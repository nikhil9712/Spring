package Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Pack1.Ac;
import Pack1.Electronics;
import Pack1.Freeze;

public class ElectronicMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Electronics.xml");
	    Electronics electronics1=applicationContext.getBean("freeze",Freeze.class);
	    Electronics electronics2=applicationContext.getBean("ac",Ac.class);
	    electronics1.device();
	    electronics2.device();
	}
}
