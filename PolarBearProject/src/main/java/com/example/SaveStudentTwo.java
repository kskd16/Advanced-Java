package com.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;


public class SaveStudentTwo {
	public static void main(String[] args) {
		
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();//CRUD methods
	EntityTransaction et = em.getTransaction();//DML methods,handling transactions
	
	StudentTwo obj = new StudentTwo();
	obj.setStudentId(13);
	obj.setName("SD");
	
	StudentTwo obj1 = new StudentTwo();
	obj1.setStudentId(11);
	obj1.setName("AD");
	
	StudentTwo obj2 = new StudentTwo();
	obj2.setStudentId(12);
	obj2.setName("BS");
	
	et.begin();
	em.persist(obj);
	em.persist(obj1);
	em.persist(obj2);
	et.commit();
	
	}

}
