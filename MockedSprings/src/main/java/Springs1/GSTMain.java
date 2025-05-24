package Springs1;

import java.applet.AppletContext;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GSTMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("GST.xml");
		GST gst=applicationContext.getBean("P",Punjab.class);
		gst.calculate();
		
		BeanFactory beanFactory=new ClassPathXmlApplicationContext("GST.xml");
		Punjab punjab=beanFactory.getBean("P",Punjab.class);
		punjab.calculate();
		
		
		Harayana harayana=beanFactory.getBean("H",Harayana.class);
		harayana.calculate();
	}
}
