package Spring_Annotations.dao;

import java.util.ArrayList;
import java.util.List;
import Spring_Annotations.dto.Item;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Spring_Annotations.dto.Cart;
@Component
public class CartDao {

    @Autowired
    private EntityManager entityManager;
    
	public void saveCart(Cart cart)
	{
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(cart);
		entityTransaction.commit();
	}
	
	public void fetch(int cid)
	{
		Cart cart=entityManager.find(Cart.class, cid);
		 
		if (cart!=null) {
			System.out.println(cart);
		} else {
            System.out.println("No cart found with id: "+cid);
		}
	}
	
	public void fetchAll()
	{
		Query query=entityManager.createQuery("SELECT c FROM Cart c");
		List<Cart> list=query.getResultList();
		
		System.out.println(list);
	}
	
	public void deleteCart(int cid)
	{  
		Cart cart=entityManager.find(Cart.class, cid);
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(cart);
		entityTransaction.commit();
	}
/*
	public void update(int cid, Cart ucart) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Cart dbcart=entityManager.find(Cart.class, cid);
		List<Item> dblist=dbcart.getItems();
		
		ucart.setId(cid);
		entityTransaction.begin();
		entityManager.merge(ucart);
		entityTransaction.commit();
	} manual Method 
	*/
	public void update(int cid, Cart ucart) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Cart dbcart=entityManager.find(Cart.class, cid);
		
		ucart.setId(cid);
		List<Item> dblist=dbcart.getItems();
		List<Item> ulist=ucart.getItems();
		
        for (int i = 0; i < ulist.size(); i++) {
			ulist.get(i).setId(dblist.get(i).getId());
		}
        
        for (int i = 0; i < ulist.size(); i++) {
			ulist.add(dblist.get(i));
		}
         
        entityTransaction.begin();
		entityManager.merge(ucart);
		entityTransaction.commit();
			
	}
	
	public void update2(int cid, Cart ucart) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Cart dbcart=entityManager.find(Cart.class, cid);
		
		ucart.setId(cid);
		List<Item> dblist=dbcart.getItems();
		List<Item> ulist=ucart.getItems();
		
		ulist.addAll(dblist);
         
        entityTransaction.begin();
		entityManager.merge(ucart);
		entityTransaction.commit();
			
	}
}
