package Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Spring_Hibernate2_Dao.FatherDao;
import Spring_Hibernate2_Dto.Father;

public class MainController {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Father.xml");
	    Father father =applicationContext.getBean("f1",Father.class);
	    
	    FatherDao fatherDao=applicationContext.getBean("fdao",FatherDao.class);
	    
	    //applicationContext object will have all the object created inside xml file get it by getBean() method
	    fatherDao.saveFather(father);
	    
	   // fatherDao.fethcFather(1);
	   // fatherDao.fethchAllFather();
	    //fatherDao.deleteFather(4);
	    fatherDao.updatefather(5, father);
	    
	}
}
