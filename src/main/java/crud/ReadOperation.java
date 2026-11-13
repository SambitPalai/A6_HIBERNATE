package crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ReadOperation {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit1");
		EntityManager em = emf.createEntityManager();
		
		Employee e = em.find(Employee.class, 1); // find(Entity.class, primary key)
		System.out.println("\n"+e+"\n");
		emf.close();
		
	}
}
