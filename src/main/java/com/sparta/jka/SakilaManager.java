package com.sparta.jka;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.time.LocalDateTime;

public class SakilaManager {

    public void setActorDetails(EntityManager entityManager){
        entityManager.getTransaction().begin();
        Actor newActor = new Actor();
        newActor.setFirstName("Jan");
        newActor.setLastName("Andrzejczyk");
        newActor.setLastUpdate(LocalDateTime.now());
        entityManager.persist(newActor);
        entityManager.getTransaction().commit();
    }

    public void getActorDetails(EntityManager entityManager, long id){
        Query query = entityManager.createNamedQuery("actorById");
        query.setParameter("id", id);
        Actor actor = (Actor) query.getSingleResult();
        System.out.println(actor.getFirstName() + " " + actor.getLastName());
    }
}
