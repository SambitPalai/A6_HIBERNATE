package compositekey;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ReadData {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit1");
		EntityManager em = emf.createEntityManager();
		
		BankId id1 = new BankId(14321, "ddda21d" );
		Bank bank = em.find(Bank.class, id1);
		System.out.println(bank);
		
		emf.close();
	}
}
