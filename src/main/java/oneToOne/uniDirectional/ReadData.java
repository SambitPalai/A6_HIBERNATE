//package oneToOne.uniDirectional;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.Persistence;
//
//public class ReadData {
//	public static void main(String[] args) throws InterruptedException {
//		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit1");
//		EntityManager em = emf.createEntityManager();
//		
//		Pan pan = em.find(Pan.class, 1);
//		System.out.println("\n"+pan+"\n");
//		Thread.sleep(3000);
//		
//		Aadhar aadhar = pan.getAadhar();
//
//		System.out.println("getter method of Aadhar gets called .");
//		System.out.println("\n"+aadhar+"\n");
//		emf.close();
//		
//	}
//}



