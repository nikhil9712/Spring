package Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Springs_Xml_Annotations_h1.dao.PersonDao;
import Springs_Xml_Annotations_h1.dto.Person;

public class PersonMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Person.xml");
		Person person=applicationContext.getBean("person",Person.class);
		PersonDao dao=applicationContext.getBean("personDao",PersonDao.class);
		//dao.insertPerson(person);
		dao.insertPerson(person);
	}
}
