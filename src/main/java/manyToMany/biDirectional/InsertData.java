package manyToMany.biDirectional;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class InsertData {
	public static void main(String[] args) throws InterruptedException {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit1");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Trainer t1 = new Trainer(null,"Rama",12,null);
		Trainer t2 = new Trainer(null,"Godzilla",8,null);
		Trainer t3 = new Trainer(null,"Yash",5,null);
		
		Subject s1 = new Subject(null,"Java",3,null);
		Subject s2 = new Subject(null,"DBMS",2,null);
		Subject s3 = new Subject(null,"Web",5,null);
		
		t1.setSubjects(List.of(s1,s3));
		t2.setSubjects(List.of(s2));
		t3.setSubjects(List.of(s2,s3));
		
		s1.setTrainers(List.of(t1));
		s2.setTrainers(List.of(t2,t3));
		s3.setTrainers(List.of(t1,t3));
		
		et.begin();
		em.persist(t1);
		em.persist(t2);
		em.persist(t3);
		et.commit();
		emf.close();
		
		System.out.println("....... Table Created & Data Saved .......");
		
		
	}
}
