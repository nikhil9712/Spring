package Spring.A;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import Spring_Annotations.dao.CartConfi;

@Component
public class A {

	public void a()
	{
		System.out.println("A!!");
	}
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(CartConfi.class);
		A o=applicationContext.getBean("a",A.class);
		o.a();
	}
}
