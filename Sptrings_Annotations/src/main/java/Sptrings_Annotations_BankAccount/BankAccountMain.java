package Sptrings_Annotations_BankAccount;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankAccountMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(BankAccountConfi.class);
		
		Employee employee=applicationContext.getBean("employee",Employee.class);
		employee.check();
	}
}
