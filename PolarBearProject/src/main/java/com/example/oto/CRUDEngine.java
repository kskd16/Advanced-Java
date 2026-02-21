package com.example.oto;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class CRUDEngine {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
    EntityManager em = emf.createEntityManager();
    EntityTransaction et = em.getTransaction();

    public void saveCar(Engine engine) {
        et.begin();
        em.persist(engine);
        et.commit();
    }
    public void updateCC(long id, float cc) {
    	Engine engine = em.find(Engine.class,id);
    	engine.setCc(cc);
    	et.begin();
    	em.merge(engine);
    	et.commit();
    }
    public void deleteEngine(long id) {
    	Engine engine = em.find(Engine.class,id);
    	et.begin();
    	em.remove(engine);
    	et.commit();
    }
    public void findEngine(long id) {
        Engine engine = em.find(Engine.class, id);
            System.out.println("Engine ID: " + engine.getId());
            System.out.println("Engine CC: " + engine.getCc());
       
    }


    public void findAll() {
        Query qu = em.createQuery("Select engine from Engine engine");
        List<Engine> engines = qu.getResultList();
        
        for (Engine engine : engines) {
            System.out.println("Engine ID: " + engine.getId());
            System.out.println("Engine CC: " + engine.getCc());
            System.out.println("-------------------");
        }
    }

}
