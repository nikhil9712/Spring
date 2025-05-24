package Spring_Hibernate2_Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Spring_Hibernate2_Dto.Child;
import Spring_Hibernate2_Dto.Father;

public class FatherDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Nikhil");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void saveFather(Father father)
	{
		entityTransaction.begin();
		entityManager.persist(father);
		entityTransaction.commit();
	}
/*if cascade is not used	
	public void fetchFather(Father father)
	{
		List<Child> childs=father.getList();
		
		entityTransaction.begin();
		for (Child child : childs) {
			entityManager.persist(child);
		}
		entityManager.persist(father);
		entityTransaction.commit();
		
		
	}
	*/
	
	public void fethcFather(int fid)
	{
		Father father=entityManager.find(Father.class, fid);
		System.out.println(father);
	}
	
	public void fethchAllFather()
	{
		Query query=entityManager.createQuery("SELECT f FROM Father f");
		List<Father> list=query.getResultList();
		
		for (Father father : list) {
			System.out.println(father);
		}
	}
	
	public void deleteFather(int fid)
	{
		Father father=entityManager.find(Father.class, fid);
		if (father!=null) {
			entityTransaction.begin();
			entityManager.remove(father);
			entityTransaction.commit();
		} else {
           System.out.println("Father does not exists with id: "+fid);
		}
		
	}
	
	public void updatefather(int fid,Father ufather)
	{
		Father dbFather=entityManager.find(Father.class, fid);
		ufather.setId(dbFather.getId());
		entityTransaction.begin();
		entityManager.merge(ufather);
		entityTransaction.commit();
	}
}
