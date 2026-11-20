package oneToMany.biDirectional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ReadData {
	public static void main(String[] args) throws InterruptedException {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit1");
		EntityManager em = emf.createEntityManager();
		
		Branches branches = em.find(Branches.class, 1);
		System.out.println("\n"+branches+"\n");

		Thread.sleep(3000);
		
		Hospital hospital= branches.getHospital();
		
		System.out.println("getter method of Branches gets called .");
		System.out.println("\n"+hospital+"\n");
		emf.close();
		
	}
}
