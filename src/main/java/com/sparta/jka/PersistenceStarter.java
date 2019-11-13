package com.sparta.jka;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceStarter {

    public void runPersistence(){

        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("SakilaPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        SakilaManager sakilamanager = new SakilaManager();
        sakilamanager.getActorDetails(entityManager,10);
        System.out.println();
    }
}
