package com.example.oto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class CRUDEngineCarImp {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
    EntityManager em = emf.createEntityManager();
    EntityTransaction et = em.getTransaction();

    public void saveCar(Car car) {
        et.begin();
        em.persist(car);
        et.commit();
    }

 
    public void updateEngineCC(long carId, float cc) {
        Car car = em.find(Car.class, carId);
        Engine engine = car.getEngine();
        engine.setCc(cc);
       
            et.begin();
            em.merge(engine);
            et.commit();
           
    }


    public void updateCarBrand(long carId, String brand) {
        Car car = em.find(Car.class, carId);
        car.setBrand(brand);
       
            et.begin();
            em.merge(car);
            
            
            et.commit();
            
    }


    public void deleteCar(long carId) {
        Car car = em.find(Car.class, carId);
        Engine engine  = car.getEngine();
       
            et.begin();
            em.remove(car);
            em.remove(engine);
            et.commit();
           
    }


    public void findCar(long carId) {
        Car car = em.find(Car.class, carId);
            System.out.println("Car ID: " + car.getId());
            System.out.println("Brand: " + car.getBrand());
            System.out.println("Engine CC: " + car.getEngine().getCc());
       
    }


    public void findAll() {
        Query qu = em.createQuery("Select car from Car car");
        List<Car> cars = qu.getResultList();
        
        for (Car car : cars) {
            System.out.println("Car ID: " + car.getId());
            System.out.println("Brand: " + car.getBrand());
            System.out.println("Engine CC: " + car.getEngine().getCc());
            System.out.println("-------------------");
        }
    }
}

