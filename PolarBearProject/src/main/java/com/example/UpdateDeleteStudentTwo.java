package com.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateDeleteStudentTwo {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		/*StudentTwo obj = new StudentTwo();
		
		obj = em.find(StudentTwo.class, 10);// fetch from DB by id
		obj.setName("Khushi Dixit"); //assign new value
		et.begin();
		em.merge(obj);//call update method
		et.commit();
		*/
		
		StudentTwo obj = em.find(StudentTwo.class, 12);
		
		et.begin();
		em.remove(obj);
		et.commit();

	}

}
