//package oneToOne.uniDirectional;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.EntityTransaction;
//import jakarta.persistence.Persistence;
//
//public class MainClass {
//	public static void main(String[] args) {
//		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit1");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction et = em.getTransaction();
//
//		Aadhar a1 = new Aadhar(null,"Max",25,"PMax","4131414242");
//		Aadhar a2 = new Aadhar(null,"Ram",23,"PRam","7131412411");
//		
//		Pan p1 = new Pan(null,"Software Engineer",62423131,a1);
//		Pan p2 = new Pan(null,"Banker",52341141,a2);
//		
//		et.begin();
//		em.persist(a1);
//		em.persist(a2);
//		em.persist(p1);
//		em.persist(p2);
//		et.commit();
//		emf.close();
//		
//		System.out.println("....... Table Created & Data Saved .......");
//		
//	}
//}


