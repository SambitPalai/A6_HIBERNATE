package crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateOperation {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit1");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Employee e = em.find(Employee.class, 1);
		
		if(e != null) {
			et.begin();
			e.setName("Rahul");
			et.commit();
			emf.close();
		}
		else {
			System.out.println("Employee not found");
		}
		
	}
}
