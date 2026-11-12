package crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class InsertOperation {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit1");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Employee emp1 = new Employee(1,"Max",10000.6,"Cuttack");
		
		et.begin();
		em.persist(emp1);
		et.commit();
		emf.close();
		
		System.out.println("Data Saved");
	}
}
