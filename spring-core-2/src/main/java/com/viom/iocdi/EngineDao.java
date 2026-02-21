/*package com.viom.iocdi;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EngineDao {
EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	
	public Engine saveEngine(Engine engine) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		if(engine != null) {
			et.begin();
			em.persist(engine);
			et.commit();
			em.close();
		}
		return engine;
	}
	
	public void updateEngineCc(int id, double cc) {
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Engine engine = em.find(Engine.class, id);
		if(engine!= null) {
			et.begin();
			engine.setCc(cc);
			em.merge(engine);
			et.commit();
			em.close();
		}
	}
	
	public void findEngineById(int id) {
		EntityManager em = emf.createEntityManager();
		Engine engine = em.find(Engine.class, id);
		
		System.out.println("Engine id : "+engine.getId()+" | cc : "+engine.getCc());
		em.close();
	}
	
	public void findAll() {
		EntityManager em = emf.createEntityManager();
		List<Engine> engines = em.createQuery("select engine from Engine engine").getResultList();
		for(Engine engine: engines) {
			System.out.println("Engine id : "+engine.getId()+" | cc : "+engine.getCc());
			
		}
		
	}
	
	public void removeEngineById(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Engine engine = em.find(Engine.class, id);
		
		if(engine != null) {
			et.begin();
			em.remove(engine);
			et.commit();
			em.close();
		}
		
	}

}

package com.viom.iocdi;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class EngineDao {

    @PersistenceContext
    private EntityManager em;

    public void save(Engine engine) {
        em.persist(engine);
    }

    public Engine findById(int id) {
        return em.find(Engine.class, id);
    }

    public List<Engine> findAll() {
        return em.createQuery("from Engine", Engine.class).getResultList();
    }
}
*/