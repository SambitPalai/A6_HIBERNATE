package auto_ID_Generation.timeStampID;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class InsertData {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit1");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Spacecraft s1 = new Spacecraft (null, "Chandrayaan-3", "India", "Lunar Exploration", null, null, null, null, null, "Uncrewed");
        Spacecraft s2 = new Spacecraft (null, "Voyager 1", "United States", "Interstellar Exploration", null, null, null, null, null, "Uncrewed");
        Spacecraft s3 = new Spacecraft (null, "Hubble", "United States", "Space Observation", null, null, null, null, null, "Uncrewed");
        Spacecraft s4 = new Spacecraft (null, "Mangalyaan", "India", "Mars Exploration", null, null, null, null, null,"Uncrewed");
        Spacecraft s5 = new Spacecraft (null, "Rosetta", "European Space Agency", "Comet Exploration", null ,null, null, null, null, "Uncrewed");

        et.begin();
        em.persist(s1);
        em.persist(s2);
        em.persist(s3);
        em.persist(s4);
        em.persist(s5);
        et.commit();
        em.close();
        emf.close();

        System.out.println("Data Saved");
    }
}
