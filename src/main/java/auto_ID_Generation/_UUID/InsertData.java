package auto_ID_Generation._UUID;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class InsertData {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit1");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Tanks t1 = new Tanks(null,"M1 Abrams","United States","Heavy Weight");
		Tanks t2 = new Tanks(null, "Arjun Mk-1A","India","Heavy Weight");
		Tanks t3 = new Tanks(null, "Leopard 2", "Germany", "Heavu Weight");
		Tanks t4 = new Tanks(null, "T-54/55", "Soviet Union", "Light Weight");
		Tanks t5 = new Tanks(null, "Renault FT", "France", "Light Weight");
		
		et.begin();
		em.persist(t1);
		em.persist(t2);
		em.persist(t3);
		em.persist(t4);
		em.persist(t5);
		et.commit();
		emf.close();
		
		System.out.println("Data Saved");
		
	}
}
