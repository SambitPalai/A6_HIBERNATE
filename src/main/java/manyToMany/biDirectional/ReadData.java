package manyToMany.biDirectional;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import oneToMany.biDirectional.Branches;
import oneToMany.biDirectional.Hospital;

public class ReadData {
	
	public static void main(String[] args) throws InterruptedException {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit1");
		EntityManager em = emf.createEntityManager();
		
		Subject subject = em.find(Subject.class, 1);
		System.out.println("\n"+subject+"\n");

		Thread.sleep(3000);
		
		List<Trainer> trainer = subject.getTrainers();
		
		System.out.println("getter method of Branches gets called .");
		System.out.println("\n"+trainer+"\n");
		emf.close();
		
	}
	
}
