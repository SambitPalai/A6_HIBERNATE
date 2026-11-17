package auto_ID_Generation.timeStampID;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class ReadData {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit1");
		EntityManager em = emf.createEntityManager();

		Query readSql = em.createQuery("Select s from spacecraft s");
		
		List<Spacecraft> spacecrafts= readSql.getResultList();
		for(Spacecraft s: spacecrafts) {
			System.out.println(s);
		}
		
		
	}
}
