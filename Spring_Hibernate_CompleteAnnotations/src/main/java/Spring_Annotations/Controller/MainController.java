package Spring_Annotations.Controller;

import Spring_Annotations.dao.CartConfi;
import Spring_Annotations.dao.CartDao;
import Spring_Annotations.dto.Cart;
import Spring_Annotations.dto.Item;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainController {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(CartConfi.class);
		//Because we have not used value so set by item object 
		
		Item item1=applicationContext.getBean("item",Item.class);
		item1.setId(1);
		item1.setName("Car");
		item1.setPrice(77000);
		
		Item item2=applicationContext.getBean("item",Item.class);
		item2.setId(2);
		item2.setName("Board");
		item2.setPrice(1000);
		
		List<Item> list=new ArrayList<Item>();
		list.add(item1);
		list.add(item2);
		
		Cart cart=applicationContext.getBean("cart",Cart.class);
		cart.setName("amazon");
		cart.setEmail("amz@123");
		
		cart.setItems(list);
		
		CartDao dao=applicationContext.getBean("cartDao",CartDao.class);
		//dao.saveCart(cart);
		//dao.fetch(2);
		//dao.fetchAll();
		//dao.deleteCart(2);
		//dao.update(1,cart);
	}
}
