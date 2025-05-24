 package Spring_Hibernate_XML_Annotations.Controller;

import javax.persistence.Persistence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Spring_Hibernate_XML_Annotations.Dao.EmployeeDao;
import Spring_Hibernate_XML_Annotations.Dto.Employee;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Account.xml");
	    Employee employee=applicationContext.getBean("employee",Employee.class);
	    EmployeeDao dao=applicationContext.getBean("employeeDao",EmployeeDao.class);
	    
	   // dao.saveEmployee(employee);
	   // dao.fetchEmployee(1);
	   // dao.fetchEmployee(2);
	   // dao.fetchAllEmployee();
	   // dao.deleteEmployee(5);
	     dao.update(3, employee);
	}
}
