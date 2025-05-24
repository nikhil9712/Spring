package Spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class GSTMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("GST.xml");
        
//		MaharashtraGST m= applicationContext.getBean("M",MaharashtraGST.class);
//		KarnatakaGST k= applicationContext.getBean("K",KarnatakaGST.class);
//		GujaratGST g= applicationContext.getBean("M",GujaratGST.class);
		
		GST g1= applicationContext.getBean("M",MaharashtraGST.class);
		g1.calculate();
		GST g2= applicationContext.getBean("K",KarnatakaGST.class);
		g2.calculate();
		GST g3= applicationContext.getBean("G",GujaratGST.class);
		g3.calculate();
		
	}
}
