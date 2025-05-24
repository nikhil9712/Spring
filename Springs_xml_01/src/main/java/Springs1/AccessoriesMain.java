package Springs1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AccessoriesMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Accessories.xml");
		Accessories a1=applicationContext.getBean(Charger.class,"C");
		a1.product();
		
//		Resource resource=new ClassPathResource("Accessories.xml");
//		BeanFactory beanFactory=new XmlBeanFactory(resource);
//		Accessories a2=beanFactory.getBean(Earphones.class,"Springs1.Earphones");
//		a2.product();
		
		BeanFactory beanFactory=new ClassPathXmlApplicationContext("Accessories.xml");
		Accessories accessories=beanFactory.getBean(Pendrive.class,"P");
		accessories.product();
	}
}
