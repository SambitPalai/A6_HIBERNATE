package compositekey;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class InsertData {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit1");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		BankId id1 = new BankId(14321, "ddda21d" );
		BankId id2 = new BankId(21355, "ddaw11f");
		
		Bank b1 = new Bank(id1, "HDFC", "BBSR", "Sonu");
		Bank b2 = new Bank(id2, "SBI", "DELHI", "Daya");
		
		et.begin();
		em.persist(b1);
		em.persist(b2);
		et.commit();
		
		emf.close();
	}
}
