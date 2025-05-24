package Springs_Hibernate_H1.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Springs_Hibernate_H1.Dao.StudentDao;
import Springs_Hibernate_H1_Dto.Student;


public class Controller {

	public static void main(String[] args) {
		

		ApplicationContext  applicationContext=new ClassPathXmlApplicationContext("Student.xml");
		Student student=applicationContext.getBean("p1",Student.class);
		
		StudentDao sdao=applicationContext.getBean("pdao",StudentDao.class);
		//sdao.insertPerson(student);
		//sdao.fetch(1);
		//sdao.fetch(2);
		//sdao.fetchAll();
		//sdao.delete(3);
		sdao.update(2, student);
	}
}
