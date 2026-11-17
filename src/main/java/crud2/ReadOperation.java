package crud2;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class ReadOperation {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit1");
		EntityManager em = emf.createEntityManager();

		Query readSql = em.createQuery("Select s from Student s");
		
//		In JPA query * is not allowed 
//		Therefore "Select s from student s" instead of * we write s .
		
		List<Student> students = readSql.getResultList();
		for(Student s: students) {
			s.setPass(s.getMarks() > 90); // ?????
			System.out.println(s);
		}
		
	}
}
