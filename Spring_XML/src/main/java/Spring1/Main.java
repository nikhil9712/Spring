package Spring1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		
/*		//BeanFactory beanFactory=new ClassPathXmlApplicationContext("Cart.xml"); //Earlier 
	    Resource resource=new ClassPathResource("cart.xml");
	    BeanFactory beanFactory=new XmlBeanFactory(resource);
	    
	    Cart cart=beanFactory.getBean("c",Cart.class);
	    
	   // System.out.println(cart.name);
	   // System.out.println(cart.size);
	    System.out.println(cart);
	    
	    Item item=cart.item;
	    System.out.println(item);
	   // System.out.println(item.name);
	   // System.out.println(item.cost);
	    
	    */
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Cart.xml");
	    Cart cart=applicationContext.getBean("c",Cart.class);
	    System.out.println(cart);
	}
}
