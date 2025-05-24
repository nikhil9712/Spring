package Springs_Xml_Annotations_h1.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import Springs_Xml_Annotations_h1.dto.Adhar;
import Springs_Xml_Annotations_h1.dto.Person;



@Component
public class PersonDao {
	  
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Nikhil");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		public void insertPerson(Person p)
		{
		 	Adhar adhar=p.getAdhar();
		 	
		 	entityTransaction.begin();
		 	//entityManager.persist(adhar);
		 	entityManager.persist(p);
		 	entityTransaction.commit();
		}
		
		public void display(int pid)
		{
			Person p=entityManager.find(Person.class, pid);
			System.out.println(p);
		}
		
		public void displayAll()
		{
			Query query=entityManager.createQuery("SELECT p FROM Person p");
			List<Person> list=query.getResultList();
			System.out.println(list);
		}
		
		public void update(int oldpid,Person newperson)
		{
			Person oldperson=entityManager.find(Person.class, oldpid);
			
			if (oldperson!=null) {
				newperson.setId(oldperson.getId());
				newperson.setAdhar(oldperson.getAdhar());
				entityTransaction.begin();
				entityManager.merge(newperson);
				entityTransaction.commit();
			} else {
	            System.out.println("Person does not exist with given id");
			}
		}
		
		public void update(int pid,int aid )
		{
		    Person person=entityManager.find(Person.class, pid);
			Adhar adhar=entityManager.find(Adhar.class, aid);
			person.setId(aid);
			
			entityTransaction.begin();
			entityManager.merge(person);
			entityTransaction.commit();
		}
	    public void print()
	    {
	    	System.out.println("print");
	    }
}
