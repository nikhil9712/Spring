package Sptrings_Annotations_Sim;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MobileConfi.class);
	    Mobile mobile=applicationContext.getBean("mobile",Mobile.class);
	    
	    mobile.network();
	    
	    Sim sim=applicationContext.getBean("sim",Sim.class);
	    sim.serviceProvider();
	    ((AbstractApplicationContext) applicationContext).close();
	}
}
