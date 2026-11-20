package oneToMany.biDirectional;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class InsertData {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit1");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Hospital h1 = new Hospital(null,"AIIMS","Delhi","xyz",null);
		Branches b1 = new Branches(null,"A01","BBSR","dwa221dda",h1);
		Branches b2 = new Branches(null,"B02","Cuttak","dwadwa12",h1);
		Branches b3 = new Branches(null,"C03","Balasore","daw121d21",h1);
		
		h1.setBranches(List.of(b1,b2,b3));
		
		et.begin();
		em.persist(h1);
		et.commit();
		emf.close();
		
		System.out.println("....... Table Created & Data Saved .......");
		
	}
}
