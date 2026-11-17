package crud2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class InsertOperation {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit1");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student s1 = new Student(null,"Max",23,86,true);
		Student s2 = new Student(null,"Ram",21,82,true);
		Student s3 = new Student(null,"Sam",24,95,true);
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		et.commit();
		emf.close();
		
		System.out.println("Data Saved");
	}
}
