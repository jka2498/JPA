package com.sparta.jka;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class SakilaManager {

    public void setActorDetails(EntityManager entityManager){
        entityManager.getTransaction().begin();
        Actor actor = new Actor();
    }

    public void getActorDetails(EntityManager entityManager, long id){
        Query query = entityManager.createNamedQuery("actorById");
        query.setParameter("id", id);
        Actor actor = (Actor) query.getSingleResult();
        System.out.println(actor.getFirstName() + " " + actor.getLastName());
    }
}
