package Springs_Hibernate_H1.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Springs_Hibernate_H1_Dto.Adhar;
import Springs_Hibernate_H1_Dto.Student;


public class StudentDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Nikhil");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void insertPerson(Student s )
	{
	 	Adhar adhar=s.getAdhar();
	 	
	 	entityTransaction.begin();
	 	entityManager.persist(adhar);
	 	entityManager.persist(s);
	 	entityTransaction.commit();
	}
	public void fetch(int id)
	{
	Student s=entityManager.find(Student.class, id);
	if (s!=null) {
		System.out.println(s);
	} else {
       System.out.println("Student with id "+s+" does not exists");
	}
	}
	
	public void fetchAll()
	{
	//	Query query=entityManager.createNamedQuery("SELECT s FROM Student s");
		Query query=entityManager.createQuery("SELECT s FROM Student s");
		List<Student> list=query.getResultList();
		System.out.println(list);
	}
	public void delete(int id)
	{
		Student s=entityManager.find(Student.class, id);
		if (s!=null) {
			entityTransaction.begin();
			entityManager.remove(s);
			entityTransaction.commit();
		} else {
	       System.out.println("Student with id "+s+" does not exists");
		}
	}
	public void update(int id,Student s)
	{
		Student dbs=entityManager.find(Student.class, id);
		if (s!=null) {
			s.setId(dbs.getId());
			s.getAdhar().setId(dbs.getAdhar().getId());
			entityTransaction.begin();
			entityManager.merge(s.getAdhar());
			entityManager.merge(s);
			entityTransaction.commit();
		} else {
	       System.out.println("Student with id "+s+" does not exists");
		}
		
	}
	
}
