package Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Spring_Hibernate1_Dao.Person_dao;
import Spring_Hibernate1_dto.Adhar;
import Spring_Hibernate1_dto.Person;

public class Controller {

	public static void main(String[] args) {
		
		ApplicationContext  applicationContext=new ClassPathXmlApplicationContext("MyPerson.xml");
		Person person=applicationContext.getBean("p1",Person.class);
		
		Person_dao pdao=applicationContext.getBean("pdao",Person_dao.class);
		pdao.insertPerson(person);
		
	}
}
