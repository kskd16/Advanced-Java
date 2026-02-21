/*package com.viom.iocdi;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class CarDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	
	public Car saveCar(Car car) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		if(car != null) {
			et.begin();
			em.persist(car);
			et.commit();
			em.close();
		}
		return car;
	}
	
	public void updateCarName(int id, String newName) {
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Car car = em.find(Car.class, id);
		if(car!= null) {
			et.begin();
			car.setName(newName);
			em.merge(car);
			et.commit();
			em.close();
		}
	}
	
	public void findCarById(int id) {
		EntityManager em = emf.createEntityManager();
		Car car = em.find(Car.class, id);
		
		System.out.println("Car id : "+car.getId()+" | brand : "+car.getBrand()+" | name : "+car.getName());
		em.close();
	}
	
	public void findAll() {
		EntityManager em = emf.createEntityManager();
		List<Car> cars = em.createQuery("select car from Car car").getResultList();
		for(Car car : cars) {
			System.out.println("Car id : "+car.getId()+" | brand : "+car.getBrand()+" | name : "+car.getName());
			
		}
		
	}
	
	public void removeCarById(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Car car = em.find(Car.class, id);
		
		if(car != null) {
			et.begin();
			em.remove(car);
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
public class CarDao {

    @PersistenceContext
    private EntityManager em;

    public void save(Car car) {
        em.persist(car);
    }

    public Car findById(int id) {
        return em.find(Car.class, id);
    }

    public List<Car> findAll() {
        return em.createQuery("from Car", Car.class).getResultList();
    }

    public void delete(int id) {
        Car car = em.find(Car.class, id);
        if (car != null) {
            em.remove(car);
        }
    }
}
*/